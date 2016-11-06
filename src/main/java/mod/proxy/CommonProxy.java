package mod.proxy;

import mod.Registry;
import mod.commands.CommandMCrafterzzMod;
import mod.commands.CommandMM;
import mod.commands.CommandSetBlocks;
import mod.commands.CommandTpDimension;
import mod.config.Config;
import mod.elements.ModElements;
import mod.elements.ModElementsSmallerBlocks;
import mod.elements.ModElementsToolsArmour;
import mod.fluids.FluidEnderium;
import mod.worldgen.ModFlowerGenerator;
import mod.worldgen.ModOreGenerator;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent event) {
		Registry.registerEnderium();
		FMLCommonHandler.instance().bus().register(Config.instance);
		Config.init(event.getSuggestedConfigurationFile());
		Config.syncConfig();
		ModElements.createBlocksAndItems();
		ModElements.registerItemsAndBlocks();
		ModElementsSmallerBlocks.createBlocksAndItems();
		ModElementsSmallerBlocks.registerItemsAndBlocks();
		ModElementsToolsArmour.createBlocksAndItems();
		ModElementsToolsArmour.registerItemsAndBlocks();
		ModElementsToolsArmour.setupRepairItemForToolsAndArmour();
		ModElements.removeCrafting();
		ModElements.crafting();
		ModElements.registerAchievements();
		ModElements.registerStats();
		ModElements.registerGuiHandlers();
		ModElements.registerEventHandlers();
		ModElementsSmallerBlocks.crafting();
		ModElementsToolsArmour.crafting();
	}

	public void init(FMLInitializationEvent event) {
		ModElements.registerRenders();
		ModElements.registerOreDictionary();
		ModElementsSmallerBlocks.registerRenders();
		ModElementsToolsArmour.registerRenders();
		GameRegistry.registerWorldGenerator(new ModOreGenerator(), 0);
		GameRegistry.registerWorldGenerator(new ModFlowerGenerator(), 100);
	}

	public void postInit(FMLPostInitializationEvent event) {
	}

	public void serverStart(FMLServerStartingEvent event) {
		event.registerServerCommand(new CommandMCrafterzzMod());
		event.registerServerCommand(new CommandMM());
		event.registerServerCommand(new CommandSetBlocks());
		event.registerServerCommand(new CommandTpDimension());
	}

}
