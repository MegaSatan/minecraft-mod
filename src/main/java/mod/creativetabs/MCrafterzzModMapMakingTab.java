package mod.creativetabs;

import mod.elements.ModElements;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class MCrafterzzModMapMakingTab extends CreativeTabs {

	public MCrafterzzModMapMakingTab(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(ModElements.invisible_pressure_plate);
	}

}
