package mod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class GlowingColourBlock extends ColourBlock {

	public GlowingColourBlock(Material material, SoundType stepSound, String tool, int toolLevel, MapColor mapColour) {
		super(material, stepSound, tool, toolLevel, mapColour);
		this.setLightLevel(1F);
	}

}
