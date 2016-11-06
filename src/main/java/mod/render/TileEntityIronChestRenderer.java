package mod.render;

import org.lwjgl.opengl.GL11;

import mod.Reference;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class TileEntityIronChestRenderer extends TileEntitySpecialRenderer {

	ResourceLocation texture = new ResourceLocation(Reference.modid + ":" + "textures/tileEntity/iron_chest.png");	

	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float partialTicks,
			int destroyStage) {
		GL11.glPushMatrix();
		GL11.glTranslatef((float) x + 0.5f, (float) y + 1.5f, (float) z + 0.5f);
		GL11.glRotatef(180, 0, 0, 1);
	}

}
