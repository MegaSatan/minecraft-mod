package mod.gui;

import mod.container.ContainerCrusher;
import mod.tileentitys.TileEntityCrusher;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandlerCrusher implements IGuiHandler {

	public static int gui = 34;

	public static int getGuiId() {
		return gui;
	}

	@Override
	public Object getServerGuiElement(int Id, EntityPlayer player, World world, int x, int y, int z) {
		if (Id == gui)
			return new ContainerCrusher(player.inventory,
					(TileEntityCrusher) world.getTileEntity(new BlockPos(x, y, z)));
		return null;
	}

	@Override
	public Object getClientGuiElement(int Id, EntityPlayer player, World world, int x, int y, int z) {
		if (Id == gui)
			return new GuiCrusher(player.inventory, (TileEntityCrusher) world.getTileEntity(new BlockPos(x, y, z)));
		return null;
	}

}
