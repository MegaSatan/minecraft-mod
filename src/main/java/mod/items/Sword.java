package mod.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class Sword extends ItemSword {

	public Item repairItem;
	
	public Sword(ToolMaterial material, Item repairItem) {
		super(material);
		this.repairItem = repairItem;
	}
	
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		return repair.getItem() == repairItem ? true : super.getIsRepairable(toRepair, repair);
	}

}
