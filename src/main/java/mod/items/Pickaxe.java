package mod.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class Pickaxe extends ItemPickaxe {

	public Item repairItem;
	
	public Pickaxe(ToolMaterial material, Item repairItem) {
		super(material);
		this.repairItem = repairItem;
	}

	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		return repair.getItem() == repairItem ? true : super.getIsRepairable(toRepair, repair);
	}
	
}
