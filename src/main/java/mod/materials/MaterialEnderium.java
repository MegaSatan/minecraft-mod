package mod.materials;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLiquid;

public class MaterialEnderium extends MaterialLiquid{

	public static Material enderium = new MaterialEnderium();
	
	public MaterialEnderium() {
		super(MapColor.PURPLE);
		this.setReplaceable();
        this.setNoPushMobility();
	}

}
