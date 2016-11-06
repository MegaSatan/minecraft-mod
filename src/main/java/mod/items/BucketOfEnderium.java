package mod.items;

import javax.annotation.Nullable;

import mod.blocks.BlockEnderium;
import mod.elements.ModElements;
import mod.materials.MaterialEnderium;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import net.minecraftforge.fluids.FluidUtil;
import net.minecraftforge.fml.common.eventhandler.Event.Result;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BucketOfEnderium extends Item {

	public Block isFull;

	public BucketOfEnderium() {
		this.maxStackSize = 1;
		this.isFull = BlockEnderium.instance;
	}

	@SubscribeEvent(priority = EventPriority.LOW)
	public void onFillBucket(FillBucketEvent event) {
		if (event.getResult() != Event.Result.DEFAULT) {
			// event was already handled
			return;
		}

		// not for us to handle
		ItemStack emptyBucket = event.getEmptyBucket();
		if (emptyBucket == null) {
			return;
		}

		// needs to target a block
		RayTraceResult target = event.getTarget();
		if (target == null || target.typeOfHit != RayTraceResult.Type.BLOCK) {
			return;
		}

		World world = event.getWorld();
		BlockPos pos = target.getBlockPos();

		ItemStack singleBucket = emptyBucket.copy();
		singleBucket.stackSize = 1;
		event.setResult(Event.Result.ALLOW);
		event.setFilledBucket(new ItemStack(this));
	}

	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn,
			EnumHand hand) {
		boolean flag = this.isFull == Blocks.AIR;
		RayTraceResult raytraceresult = this.rayTrace(worldIn, playerIn, flag);
		ActionResult<ItemStack> ret = net.minecraftforge.event.ForgeEventFactory.onBucketUse(playerIn, worldIn,
				itemStackIn, raytraceresult);
		if (ret != null)
			return ret;

		if (raytraceresult == null) {
			return new ActionResult(EnumActionResult.PASS, itemStackIn);
		} else if (raytraceresult.typeOfHit != RayTraceResult.Type.BLOCK) {
			return new ActionResult(EnumActionResult.PASS, itemStackIn);
		} else {
			BlockPos blockpos = raytraceresult.getBlockPos();

			if (!worldIn.isBlockModifiable(playerIn, blockpos)) {
				return new ActionResult(EnumActionResult.FAIL, itemStackIn);
			} else if (flag) {
				if (!playerIn.canPlayerEdit(blockpos.offset(raytraceresult.sideHit), raytraceresult.sideHit,
						itemStackIn)) {
					return new ActionResult(EnumActionResult.FAIL, itemStackIn);
				} else {
					IBlockState iblockstate = worldIn.getBlockState(blockpos);
					Material material = iblockstate.getMaterial();

					if (material == MaterialEnderium.enderium
							&& ((Integer) iblockstate.getValue(BlockLiquid.LEVEL)).intValue() == 0) {
						worldIn.setBlockState(blockpos, Blocks.AIR.getDefaultState(), 11);
						playerIn.addStat(StatList.getObjectUseStats(this));
						playerIn.playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0F, 1.0F);
						return new ActionResult(EnumActionResult.SUCCESS,
								this.fillBucket(itemStackIn, playerIn, ModElements.bucket_of_enderium));
					} else {
						return new ActionResult(EnumActionResult.FAIL, itemStackIn);
					}
				}
			} else {
				boolean flag1 = worldIn.getBlockState(blockpos).getBlock().isReplaceable(worldIn, blockpos);
				BlockPos blockpos1 = flag1 && raytraceresult.sideHit == EnumFacing.UP ? blockpos
						: blockpos.offset(raytraceresult.sideHit);

				if (!playerIn.canPlayerEdit(blockpos1, raytraceresult.sideHit, itemStackIn)) {
					return new ActionResult(EnumActionResult.FAIL, itemStackIn);
				} else if (this.tryPlaceContainedLiquid(playerIn, worldIn, blockpos1)) {
					playerIn.addStat(StatList.getObjectUseStats(this));
					return !playerIn.capabilities.isCreativeMode
							? new ActionResult(EnumActionResult.SUCCESS, new ItemStack(Items.BUCKET))
							: new ActionResult(EnumActionResult.SUCCESS, itemStackIn);
				} else {
					return new ActionResult(EnumActionResult.FAIL, itemStackIn);
				}
			}
		}
	}

	private ItemStack fillBucket(ItemStack emptyBuckets, EntityPlayer player, Item fullBucket) {
		if (player.capabilities.isCreativeMode) {
			return emptyBuckets;
		} else if (--emptyBuckets.stackSize <= 0) {
			return new ItemStack(fullBucket);
		} else {
			if (!player.inventory.addItemStackToInventory(new ItemStack(fullBucket))) {
				player.dropItem(new ItemStack(fullBucket), false);
			}

			return emptyBuckets;
		}
	}

	public boolean tryPlaceContainedLiquid(@Nullable EntityPlayer worldIn, World pos, BlockPos posIn) {
		if (this.isFull == Blocks.AIR) {
			return false;
		} else {
			IBlockState iblockstate = pos.getBlockState(posIn);
			Material material = iblockstate.getMaterial();
			boolean flag = !material.isSolid();
			boolean flag1 = iblockstate.getBlock().isReplaceable(pos, posIn);

			if (!pos.isAirBlock(posIn) && !flag && !flag1) {
				return false;
			} else {
				if (pos.provider.doesWaterVaporize() && this.isFull == Blocks.FLOWING_WATER) {
					int l = posIn.getX();
					int i = posIn.getY();
					int j = posIn.getZ();
					pos.playSound(worldIn, posIn, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.BLOCKS, 0.5F,
							2.6F + (pos.rand.nextFloat() - pos.rand.nextFloat()) * 0.8F);

					for (int k = 0; k < 8; ++k) {
						pos.spawnParticle(EnumParticleTypes.SMOKE_LARGE, (double) l + Math.random(),
								(double) i + Math.random(), (double) j + Math.random(), 0.0D, 0.0D, 0.0D, new int[0]);
					}
				} else {
					if (!pos.isRemote && (flag || flag1) && !material.isLiquid()) {
						pos.destroyBlock(posIn, true);
					}

					SoundEvent soundevent = this.isFull == Blocks.FLOWING_LAVA ? SoundEvents.ITEM_BUCKET_EMPTY_LAVA
							: SoundEvents.ITEM_BUCKET_EMPTY;
					pos.playSound(worldIn, posIn, soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
					pos.setBlockState(posIn, this.isFull.getDefaultState(), 11);
				}

				return true;
			}
		}
	}

}
