package mod.blocks;

import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Pressureplate extends BlockPressurePlate {

	boolean transparent;

	public Pressureplate(Material material, SoundType stepSound, String tool, int toolLevel) {
		super(material, BlockPressurePlate.Sensitivity.MOBS);
		this.setSoundType(stepSound);
		this.setHarvestLevel(tool, toolLevel);
	}

	public Pressureplate(Material material, boolean unbreakeble, boolean transparent) {
		super(material, BlockPressurePlate.Sensitivity.MOBS);
		if (unbreakeble == true) {
			this.setBlockUnbreakable();
		}
		this.transparent = transparent;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() {
		if (transparent == true) {
			return BlockRenderLayer.CUTOUT_MIPPED;
		} else {
			return BlockRenderLayer.CUTOUT;
		}
	}

}
