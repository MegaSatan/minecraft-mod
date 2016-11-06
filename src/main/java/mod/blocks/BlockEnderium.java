package mod.blocks;

import mod.fluids.FluidEnderium;
import mod.materials.MaterialEnderium;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLiquid;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.network.play.server.SPacketPlayerPosLook;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.BlockFluidFinite;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockEnderium extends BlockFluidClassic {

	public static final BlockEnderium instance = new BlockEnderium();

	public BlockEnderium() {
		super(FluidEnderium.instance, MaterialEnderium.enderium);
		displacements.put(Blocks.PORTAL, true);
		displacements.put(Blocks.END_PORTAL, true);
	}

	@Override
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
		float x = worldIn.getSpawnPoint().getX();
		float y = worldIn.getSpawnPoint().getY();
		float z = worldIn.getSpawnPoint().getZ();
		if (!worldIn.isRemote) {
			if (entityIn instanceof EntityPlayerMP) {
				EntityPlayerMP player = (EntityPlayerMP) entityIn;
				BlockPos spawnPoint = player.getBedLocation(player.worldObj.provider.getDimension());
				if (spawnPoint != null) {
					if (player.timeUntilPortal == 0) {
						player.connection.setPlayerLocation(spawnPoint.getX(), spawnPoint.getY(), spawnPoint.getZ(),
								player.cameraYaw, player.cameraPitch);
						player.timeUntilPortal = 3;
					}
				} else {
					if (player.timeUntilPortal == 0) {
						player.connection.setPlayerLocation(x, y, z, player.cameraYaw, player.cameraPitch);
						player.timeUntilPortal = 3;
					}
				}
			} else {
				entityIn.setPosition(x, y, z);
			}
		}
		entityIn.worldObj.playSound((EntityPlayer) null, x, y, z, SoundEvents.ENTITY_ENDERPEARL_THROW,
				SoundCategory.AMBIENT, 1, 1);
		worldIn.spawnParticle(EnumParticleTypes.PORTAL, x, y, z, 0, 7, 0, 0);
		worldIn.spawnParticle(EnumParticleTypes.PORTAL, x + 0.25f, y, z, 0, 7, 0, 0);
		worldIn.spawnParticle(EnumParticleTypes.PORTAL, x - 0.25f, y, z, 0, 7, 0, 0);
		worldIn.spawnParticle(EnumParticleTypes.PORTAL, x, y, z + 0.25f, 0, 7, 0, 0);
		worldIn.spawnParticle(EnumParticleTypes.PORTAL, x, y, z - 0.25f, 0, 7, 0, 0);
	}

	@Override
	public EnumBlockRenderType getRenderType(IBlockState state) {
		return EnumBlockRenderType.MODEL;
	}

}
