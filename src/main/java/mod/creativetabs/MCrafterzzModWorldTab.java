package mod.creativetabs;

import mod.elements.ModElements;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MCrafterzzModWorldTab extends CreativeTabs {

	public MCrafterzzModWorldTab(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(ModElements.purple_tulip);
	}

}
