package mod.creativetabs;

import mod.elements.ModElements;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MCrafterzzModBuildingTab extends CreativeTabs {

	public MCrafterzzModBuildingTab(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(ModElements.colour_changing_glass);
	}

}
