package mod.gui;

import mod.container.ContainerIronChest;
import mod.tileentitys.TileEntityIronChest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandlerIronChest implements IGuiHandler {

	public static int iron_chest_gui = 0;

	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
		if (id == iron_chest_gui) {
			return new ContainerIronChest(player.inventory,
					((TileEntityIronChest) world.getTileEntity(new BlockPos(x, y, z))));
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
		if (id == iron_chest_gui) {
			return new ContainerIronChest(player.inventory,
					((TileEntityIronChest) world.getTileEntity(new BlockPos(x, y, z))));
		}
		return null;
	}

}
