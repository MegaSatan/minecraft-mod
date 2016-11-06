package mod.items;

import java.util.Collections;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class Scythe extends ItemTool {

	public static float attack_speed = -2.8F;
	public static float damage = 3.0F;

	public Scythe(ToolMaterial toolMaterial, int durabillity) {
		super(damage, attack_speed, toolMaterial, Collections.emptySet());
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
				if (block.getMaterial(offsetState) == Material.GOURD
						|| block.getMaterial(offsetState) == Material.LEAVES
						|| block.getMaterial(offsetState) == Material.PLANTS
						|| block.getMaterial(offsetState) == Material.CACTUS
						|| block.canHarvestBlock(worldIn, offset2, player)) {
					block.removedByPlayer(offsetState, worldIn, offset2, player, true);
					block.onBlockDestroyedByPlayer(worldIn, offset2, offsetState);
					block.harvestBlock(worldIn, player, offset2, offsetState, null, itemStack);
					if ((double) offsetState.getBlockHardness(worldIn, offset2) != 0.0D && block != Blocks.AIR) {
						if (block.getMaterial(offsetState) == Material.GOURD
								|| block.getMaterial(offsetState) == Material.LEAVES
								|| block.getMaterial(offsetState) == Material.PLANTS
								|| block.getMaterial(offsetState) == Material.CACTUS) {
							itemStack.damageItem(1, player);
						} else {
							itemStack.damageItem(3, player);
						}
					}
				} else {
					if ((double) offsetState.getBlockHardness(worldIn, offset2) != 0.0D && block != Blocks.AIR) {
						itemStack.damageItem(3, player);
					}
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
			Material material = state.getBlock().getMaterial(state);
			if (material == Material.GOURD || material == Material.LEAVES || material == Material.PLANTS
					|| material == Material.CACTUS) {
				itemStack.damageItem(1, entityLiving);
			} else {
				itemStack.damageItem(3, entityLiving);
			}
		}

		return true;
	}

}
