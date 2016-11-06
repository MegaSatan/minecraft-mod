package mod.items;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class Axe extends ItemAxe {

	public Item repairItem;

	public Axe(ToolMaterial material, Item repairItem) {
		super(material, material.getDamageVsEntity(), -3);
		this.repairItem = repairItem;
	}

	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		return repair.getItem() == repairItem ? true : super.getIsRepairable(toRepair, repair);
	}

}
