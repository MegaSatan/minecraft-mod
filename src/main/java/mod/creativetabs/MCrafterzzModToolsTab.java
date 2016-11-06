package mod.creativetabs;

import mod.elements.ModElementsToolsArmour;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MCrafterzzModToolsTab extends CreativeTabs {

	public MCrafterzzModToolsTab(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return ModElementsToolsArmour.amethyst_pickaxe;
	}

}
