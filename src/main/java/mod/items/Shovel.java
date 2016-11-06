package mod.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class Shovel extends ItemSpade{

	public Item repairItem;
	
	public Shovel(ToolMaterial material, Item repairItem) {
		super(material);
		this.repairItem = repairItem;
	}
	
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		return repair.getItem() == repairItem ? true : super.getIsRepairable(toRepair, repair);
	}

}
