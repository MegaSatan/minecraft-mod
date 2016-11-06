package mod;

import mod.commands.CommandMCrafterzzMod;
import mod.commands.CommandMM;
import mod.commands.CommandSetBlocks;
import mod.config.Config;
import mod.proxy.CommonProxy;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Reference.modid, name = Reference.name, version = Reference.mcversion, updateJSON = "https://raw.githubusercontent.com/MCrafterzz/minecraft-mod/master/update.json", guiFactory = "mod.config.ModGuiFactory", acceptedMinecraftVersions = "1.9.4, 1.10, 1.10.2")
public class Main {

	@SidedProxy(clientSide = Reference.clientproxy, serverSide = Reference.commonproxy)
	public static CommonProxy proxy;

	@Instance
	public static Main instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}

	@EventHandler
	public void serverStart(FMLServerStartingEvent event) {
		proxy.serverStart(event);
	}	

}
