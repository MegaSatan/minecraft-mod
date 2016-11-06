package mod;

import mod.elements.ModElements;
import mod.elements.ModElementsToolsArmour;
import net.minecraft.item.Item;
import net.minecraft.stats.AchievementList;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

public class AchievementEvents {
	@SubscribeEvent
	public void onBreakCopperOre(BlockEvent.BreakEvent event) {
		if (event.getState().getBlock() == (ModElements.copper_ore)) {
			event.getPlayer().addStat(ModElements.copperMiner, 1);
		}
	}

	@SubscribeEvent
	public void onBreakTinOre(BlockEvent.BreakEvent event) {
		if (event.getState().getBlock() == (ModElements.tin_ore)) {
			event.getPlayer().addStat(ModElements.tinMiner, 1);
		}
	}

	@SubscribeEvent
	public void onCraftBronzeIngot(PlayerEvent.ItemCraftedEvent event) {
		if (event.crafting.getItem().equals(ModElements.bronze_ingot)) {
			event.player.addStat(ModElements.bronzeCreator, 1);
		}
	}

	@SubscribeEvent
	public void onBreakAmethystOre(BlockEvent.BreakEvent event) {
		if (event.getState().getBlock() == (ModElements.amethyst_ore)) {
			event.getPlayer().addStat(ModElements.amethystMiner, 1);
		}
	}

	@SubscribeEvent
	public void onCraftDiamondMultitool(PlayerEvent.ItemCraftedEvent event) {
		if (event.crafting.getItem().equals(ModElementsToolsArmour.diamond_multitool)) {
			event.player.addStat(ModElements.diamondUpgrade, 1);
		}
	}

	@SubscribeEvent
	public void onCraftAmethystMultitool(PlayerEvent.ItemCraftedEvent event) {
		if (event.crafting.getItem().equals(ModElementsToolsArmour.amethyst_multitool)) {
			event.player.addStat(ModElements.amethystUpgrade, 1);
		}
	}

	@SubscribeEvent
	public void onCraftOpMultitool(PlayerEvent.ItemCraftedEvent event) {
		if (event.crafting.getItem().equals(ModElementsToolsArmour.op_multitool)) {
			event.player.addStat(ModElements.theOpTool, 1);
		}
	}

	@SubscribeEvent
	public void onBreakFlower(BlockEvent.BreakEvent event) {
		if (event.getState().getBlock() == (ModElements.yellow_tulip)
				|| event.getState().getBlock() == (ModElements.green_tulip)
				|| event.getState().getBlock() == (ModElements.black_tulip)
				|| event.getState().getBlock() == (ModElements.blue_tulip)
				|| event.getState().getBlock() == (ModElements.purple_tulip)) {
			event.getPlayer().addStat(ModElements.moreFlowers, 1);
		}
	}

}
