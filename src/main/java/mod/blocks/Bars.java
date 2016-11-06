package mod.blocks;

import net.minecraft.block.BlockPane;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Bars extends BlockPane {

	public Bars(Material material, SoundType stepSound, String tool, int toolLevel, boolean canDrop) {
		super(material, canDrop);
		this.setSoundType(stepSound);
		this.setHarvestLevel(tool, toolLevel);
	}
}
