package mod;

import java.util.Iterator;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;

public class RecipeRemover {

	public static void removeCraftingRecipeItemWithoutMetadata(Item item) {
		List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
		Iterator<IRecipe> remover = recipes.iterator();

		while (remover.hasNext()) {
			ItemStack itemStack = remover.next().getRecipeOutput();

			if (itemStack != null && itemStack.getItem() == item) {
				remover.remove();
			}
		}
	}

	public static void removeCraftingRecipeItemWithMetadata(Item item, int metaData) {
		List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
		Iterator<IRecipe> remover = recipes.iterator();

		while (remover.hasNext()) {
			ItemStack itemStack = remover.next().getRecipeOutput();

			if (itemStack != null && itemStack.getItem() == item
					&& itemStack.getMetadata() == item.getMetadata(metaData)) {
				remover.remove();
			}
		}
	}

	public static void removeCraftingRecipeBlockWithoutMetadata(Block block) {
		List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
		Iterator<IRecipe> remover = recipes.iterator();

		while (remover.hasNext()) {
			ItemStack itemStack = remover.next().getRecipeOutput();

			if (itemStack != null && itemStack.getItem() == Item.getItemFromBlock(block)) {
				remover.remove();
			}
		}
	}

	public static void removeCraftingRecipeBlockWithMetadata(Block block, int metaData) {
		List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
		Iterator<IRecipe> remover = recipes.iterator();

		while (remover.hasNext()) {
			ItemStack itemStack = remover.next().getRecipeOutput();

			if (itemStack != null && itemStack.getItem() == Item.getItemFromBlock(block)
					&& itemStack.getMetadata() == Item.getItemFromBlock(block).getMetadata(metaData)) {
				remover.remove();
			}
		}
	}

}
