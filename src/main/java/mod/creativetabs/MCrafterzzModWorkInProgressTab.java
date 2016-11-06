package mod.creativetabs;

import mod.elements.ModElements;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MCrafterzzModWorkInProgressTab extends CreativeTabs{

	public MCrafterzzModWorkInProgressTab(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(ModElements.crusher);
	}

}
