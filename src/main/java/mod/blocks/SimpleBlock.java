package mod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SimpleBlock extends Block {

	public boolean transparent;

	public SimpleBlock(Material material, SoundType stepSound, String tool, int toolLevel, MapColor mapColour) {
		super(material, mapColour);
		this.setSoundType(stepSound);
		this.setHarvestLevel(tool, toolLevel);
	}

	public SimpleBlock(Material material, SoundType stepSound, String tool, int toolLevel, boolean unbreakeble) {
		super(material);
		this.setSoundType(stepSound);
		this.setHarvestLevel(tool, toolLevel);
		if (unbreakeble == true) {
			this.setBlockUnbreakable();
		}
	}

	public SimpleBlock(Material material, SoundType stepSound, String tool, int toolLevel, boolean transparent, MapColor mapColour) {
		super(material, mapColour);
		this.setSoundType(stepSound);
		this.setHarvestLevel(tool, toolLevel);
		this.setLightOpacity(1);
		this.transparent = transparent;
	}
	
	public SimpleBlock(Material material, SoundType stepSound, boolean transparent, MapColor mapColour) {
		super(material, mapColour);
		this.setSoundType(stepSound);
		this.setLightOpacity(1);
		this.transparent = transparent;
	}

	public SimpleBlock(Material material, SoundType stepSound, String tool, int toolLevel, boolean unbreakeble,
			float glowing, boolean transparent) {
		super(material);
		this.setSoundType(stepSound);
		this.setHarvestLevel(tool, toolLevel);
		this.setLightOpacity(1);
		if (unbreakeble == true) {
			this.setBlockUnbreakable();
		}
		this.setLightLevel(glowing);
		this.transparent = transparent;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() {
		if (transparent == true) {
			return BlockRenderLayer.CUTOUT;
		} else {
			return BlockRenderLayer.SOLID;
		}
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		if (transparent == true) {
			return false;
		} else {
			return true;
		}
	}

}
