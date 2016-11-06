package mod.items;

import java.util.Collections;
import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent;

public class Hammer extends ItemTool {

	public static float attack_speed = -2.8F;
	public static float damage = 3.0F;

	public Hammer(ToolMaterial toolMaterial, int durabillity) {
		super(damage, attack_speed, toolMaterial, Collections.emptySet());
		this.setHarvestLevel("pickaxe", toolMaterial.getHarvestLevel());
		this.setMaxDamage(durabillity);
	}

	@Override
	// Break blocks on creative
	public boolean onBlockStartBreak(ItemStack itemStack, BlockPos pos, EntityPlayer player) {
		if (player.isCreative()) {
			World world = player.getEntityWorld();
			RayTraceResult sideHit = this.rayTrace(world, player, false);
			EnumFacing facing = sideHit.sideHit;
			EnumFacing facing1 = null, facing2 = null;
			for (EnumFacing.Axis axis : EnumFacing.Axis.values()) {
				if (axis == facing.getAxis()) {
					continue;
				}
				EnumFacing f = EnumFacing.getFacingFromAxis(EnumFacing.AxisDirection.POSITIVE, axis);
				if (facing1 == null) {
					facing1 = f;
				} else {
					facing2 = f;
				}
			}

			for (int i = -1; i <= 1; i++) {
				BlockPos offset1 = pos.offset(facing1, i);
				for (int j = -1; j <= 1; j++) {
					if (i == 0 && j == 0)
						continue;
					BlockPos offset2 = offset1.offset(facing2, j);
					world.destroyBlock(offset2, false);
				}
			}
		}
		return false;
	}

	@Override
	// Break blocks on survival
	public boolean onBlockDestroyed(ItemStack itemStack, World worldIn, IBlockState state, BlockPos pos,
			EntityLivingBase entityLiving) {
		EntityPlayer player = (EntityPlayer) entityLiving;
		RayTraceResult sideHit = this.rayTrace(worldIn, player, false);
		EnumFacing facing = sideHit.sideHit;
		EnumFacing facing1 = null, facing2 = null;
		for (EnumFacing.Axis axis : EnumFacing.Axis.values()) {
			if (axis == facing.getAxis()) {
				continue;
			}
			EnumFacing f = EnumFacing.getFacingFromAxis(EnumFacing.AxisDirection.POSITIVE, axis);
			if (facing1 == null) {
				facing1 = f;
			} else {
				facing2 = f;
			}
		}

		for (int i = -1; i <= 1; i++) {
			BlockPos offset1 = pos.offset(facing1, i);
			for (int j = -1; j <= 1; j++) {
				if (i == 0 && j == 0)
					continue;
				BlockPos offset2 = offset1.offset(facing2, j);
				IBlockState offsetState = worldIn.getBlockState(offset2);
				Block block = offsetState.getBlock();
				if (block.canHarvestBlock(worldIn, offset2, player)) {
					block.removedByPlayer(offsetState, worldIn, offset2, player, true);
					block.onBlockDestroyedByPlayer(worldIn, offset2, offsetState);
					block.harvestBlock(worldIn, player, offset2, offsetState, null, itemStack);
					if (block.isToolEffective("pickaxe", offsetState)) {
						if ((double) offsetState.getBlockHardness(worldIn, offset2) != 0.0D && block != Blocks.AIR) {
							itemStack.damageItem(1, player);
						}
					} else {
						if ((double) offsetState.getBlockHardness(worldIn, offset2) != 0.0D && block != Blocks.AIR) {
							itemStack.damageItem(3, player);
						}
					}
				} else {
					if (worldIn.isBlockModifiable(player, offset2)) {
						if (block.getBlockHardness(offsetState, worldIn, offset2) < 100
								&& block.getBlockHardness(offsetState, worldIn, offset2) != -1) {
							worldIn.setBlockToAir(offset2);
						}
					}
				}
			}
		}
		if ((double) state.getBlockHardness(worldIn, pos) != 0.0D) {
			if (state.getBlock().isToolEffective("pickaxe", state)) {
				itemStack.damageItem(1, entityLiving);
			} else {
				itemStack.damageItem(3, entityLiving);
			}
		}

		return true;
	}

	@Override
	public boolean hitEntity(ItemStack itemStack, EntityLivingBase target, EntityLivingBase attacker) {
		itemStack.damageItem(1, attacker);
		return true;
	}

}
