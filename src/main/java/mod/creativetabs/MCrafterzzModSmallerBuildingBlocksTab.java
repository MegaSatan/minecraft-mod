package mod.creativetabs;

import mod.elements.ModElements;
import mod.elements.ModElementsSmallerBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MCrafterzzModSmallerBuildingBlocksTab extends CreativeTabs {

	public MCrafterzzModSmallerBuildingBlocksTab(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(ModElementsSmallerBlocks.sandy_stone_bricks_wall);
	}

}
