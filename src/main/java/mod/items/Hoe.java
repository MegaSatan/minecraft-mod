package mod.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class Hoe extends ItemHoe {

	public Item repairItem;
	
	public Hoe(ToolMaterial material, Item repairItem) {
		super(material);
		this.repairItem = repairItem;
	}
	
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		return repair.getItem() == repairItem ? true : super.getIsRepairable(toRepair, repair);
	}

}
