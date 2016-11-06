package mod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockColored;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;

public class ColourBlock extends Block {

	public ColourBlock(Material material, SoundType stepSound, String tool, int toolLevel, MapColor mapColour) {
		super(material, mapColour);
		this.setSoundType(stepSound);
		this.setHarvestLevel(tool, toolLevel);
	}

}
