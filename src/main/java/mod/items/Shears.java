package mod.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;

public class Shears extends ItemShears {
	
	public Item repairItem;
	
	public Shears(int level, int durability, Item repairItem) {
		this.setHarvestLevel("shears", level);
		this.setMaxDamage(durability);
		this.repairItem = repairItem;
	}
	
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		return repair.getItem() == repairItem ? true : super.getIsRepairable(toRepair, repair);
	}
	
}
