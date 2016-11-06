package mod.creativetabs;

import mod.elements.ModElements;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MCrafterzzModTab extends CreativeTabs {

	public MCrafterzzModTab(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return ModElements.bronze_ingot;
	}

}
