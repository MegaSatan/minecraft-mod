package mod.gui;

import mod.Reference;
import mod.container.ContainerIronChest;
import mod.tileentitys.TileEntityIronChest;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

public class GuiIronChest extends GuiContainer {

	public IInventory playerInventory;
	public TileEntityIronChest tileEntity;

	public GuiIronChest(IInventory playerInventory, TileEntityIronChest tileEntity) {
		super(new ContainerIronChest(playerInventory, tileEntity));

		this.playerInventory = playerInventory;
		this.tileEntity = tileEntity;

		this.xSize = 176;
		this.ySize = 166;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		GlStateManager.color(1, 1, 1, 1);
		this.mc.getTextureManager()
				.bindTexture(new ResourceLocation(Reference.modid + ":" + "textures/gui/container/iron_chest"));
		this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		String string = this.tileEntity.getDisplayName().getUnformattedText();
		this.fontRendererObj.drawString(string, 88 - this.fontRendererObj.getStringWidth(string) / 2, 6, 4210752);
		this.fontRendererObj.drawString(this.playerInventory.getDisplayName().getUnformattedText(), 8, 72, 42107);
	}

}
