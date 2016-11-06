package mod.config;

import java.io.File;

import mod.Reference;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Config {

	public static Config instance = new Config();
	public static Configuration config;
	// Settings world generation
	public static boolean spawn_flowers = true;
	public static boolean spawn_tin = true;
	public static boolean spawn_copper = true;
	public static boolean spawn_jade = true;
	public static boolean spawn_amethyst = true;
	public static boolean spawn_basalt = true;
	public static boolean spawn_clay = true;
	// Setting advanced world generation
	public static int tin_block_count;
	public static int tin_chance_to_spawn;
	public static int tin_chance_to_spawn_in_chunk;
	public static int tin_min_height;
	public static int tin_max_height;
	public static int copper_block_count;
	public static int copper_chance_to_spawn;
	public static int copper_chance_to_spawn_in_chunk;
	public static int copper_min_height;
	public static int copper_max_height;
	public static int jade_block_count;
	public static int jade_chance_to_spawn;
	public static int jade_chance_to_spawn_in_chunk;
	public static int jade_min_height;
	public static int jade_max_height;
	public static int amethyst_block_count;
	public static int amethyst_chance_to_spawn;
	public static int amethyst_chance_to_spawn_in_chunk;
	public static int amethyst_min_height;
	public static int amethyst_max_height;
	public static int flowers_chance_to_spawn;
	public static int min_flowers_to_spawn_in_chunk;
	public static int max_flowers_to_spawn_in_chunk;
	public static int basalt_block_count;
	public static int basalt_chance_to_spawn;
	public static int basalt_chance_to_spawn_in_chunk;
	public static int basalt_min_height;
	public static int basalt_max_height;
	public static int clay_block_count;
	public static int clay_chance_to_spawn;
	public static int clay_chance_to_spawn_in_chunk;
	public static int clay_min_height;
	public static int clay_max_height;
	// Setting crafting
	public static boolean crafting = true;
	public static boolean duplicate_patterns = true;
	public static boolean craft_vanilla_blocks_with_patterns = true;

	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent eventArgs) {
		if (eventArgs.getModID().equals(Reference.modid))
			Config.syncConfig();
	}

	public static void init(File file) {
		config = new Configuration(file);
		config.load();
		syncConfig();
	}

	public static void syncConfig() {
		String worldCategory = "worldgeneration";
		String craftingCategory = "crafting";
		String advancedWorldCategory = "advancedworldgeneration";

		config.setCategoryRequiresMcRestart(craftingCategory, true);
		config.addCustomCategoryComment(worldCategory, "World Generaration Settings");
		spawn_flowers = config.getBoolean("Spawn Flowers", worldCategory, true,
				"Turns on and off flower world generation (Only flowers from this mod)");
		spawn_copper = config.getBoolean("Spawn Copper", worldCategory, true,
				"Turns on and off copper world generation");
		spawn_tin = config.getBoolean("Spawn Tin", worldCategory, true, "Turns on and off tin world generation");
		spawn_jade = config.getBoolean("Spawn Jade", worldCategory, true, "Turns on and off jade world generation");
		spawn_amethyst = config.getBoolean("Spawn Amethyst", worldCategory, true,
				"Turns on and off amethyst world generation");
		spawn_basalt = config.getBoolean("Spawn Basalt", worldCategory, true,
				"Turns on and off basalt world generation");
		spawn_clay = config.getBoolean("Spawn Clay", worldCategory, true,
				"Turns on and off underground clay world generation");

		config.addCustomCategoryComment(advancedWorldCategory, "Advanced World Generaration Settings");
		tin_block_count = config.getInt("Tin Block Count", advancedWorldCategory, 7, 0, 10000,
				"Changes how many tin ores that generate in each cluster");
		tin_chance_to_spawn = config.getInt("Tin Chance To Spawn", advancedWorldCategory, 1, 1, 10000,
				"Changes how rare tin will spawn (Highter value is less chance for it to spawn)");
		tin_chance_to_spawn_in_chunk = config.getInt("Tin Chance To Spawn In Chunk", advancedWorldCategory, 16, 0,
				10000, "Changes how rare tin will spawn");
		tin_min_height = config.getInt("Tin minimum Height", advancedWorldCategory, 1, 0, 256,
				"Changes the minimum height where tin can spawn");
		tin_max_height = config.getInt("Tin Maximum Height", advancedWorldCategory, 255, 0, 256,
				"Changes the maximum height where tin can spawn");
		copper_block_count = config.getInt("Copper Block Count", advancedWorldCategory, 7, 0, 10000,
				"Changes how many copper ores that generate in each cluster");
		copper_chance_to_spawn = config.getInt("Copper Chance To Spawn", advancedWorldCategory, 1, 1, 10000,
				"Changes how rare copper will spawn (Highter value is less chance for it to spawn)");
		copper_chance_to_spawn_in_chunk = config.getInt("Copper Chance To Spawn In Chunk", advancedWorldCategory, 16, 0,
				10000, "Changes how rare copper will spawn");
		copper_min_height = config.getInt("Copper minimum Height", advancedWorldCategory, 1, 0, 256,
				"Changes the minimum height where copper can spawn");
		copper_max_height = config.getInt("Copper Maximum Height", advancedWorldCategory, 255, 0, 256,
				"Changes the maximum height where copper can spawn");
		jade_block_count = config.getInt("Jade Block Count", advancedWorldCategory, 3, 0, 10000,
				"Changes how many jade ores that generate in each cluster");
		jade_chance_to_spawn = config.getInt("Jade Chance To Spawn", advancedWorldCategory, 3, 0, 10000,
				"Changes how rare jade will spawn (Highter value is less chance for it to spawn)");
		jade_chance_to_spawn_in_chunk = config.getInt("Jade Chance To Spawn In Chunk", advancedWorldCategory, 1, 0,
				10000, "Changes how rare jade will spawn");
		jade_min_height = config.getInt("Jade minimum Height", advancedWorldCategory, 1, 0, 256,
				"Changes the minimum height where jade can spawn");
		jade_max_height = config.getInt("Jade Maximum Height", advancedWorldCategory, 16, 0, 256,
				"Changes the maximum height where jade can spawn");
		amethyst_block_count = config.getInt("Amethyst Block Count", advancedWorldCategory, 3, 0, 10000,
				"Changes how many amethyst ores that generate in each cluster");
		amethyst_chance_to_spawn = config.getInt("Amethyst Chance To Spawn", advancedWorldCategory, 3, 0, 10000,
				"Changes how rare amethyst will spawn (Highter value is less chance for it to spawn)");
		amethyst_chance_to_spawn_in_chunk = config.getInt("Amethyst Chance To Spawn In Chunk", advancedWorldCategory, 1,
				0, 10000, "Changes how rare amethyst will spawn");
		amethyst_min_height = config.getInt("Amethyst minimum Height", advancedWorldCategory, 1, 0, 256,
				"Changes the minimum height where amethyst can spawn");
		amethyst_max_height = config.getInt("Amethyst Maximum Height", advancedWorldCategory, 16, 0, 256,
				"Changes the maximum height where amethyst can spawn");
		basalt_block_count = config.getInt("Basalt Block Count", advancedWorldCategory, 30, 0, 10000,
				"Changes how many basalt blocks that generate in each cluster");
		basalt_chance_to_spawn = config.getInt("Basalt Chance To Spawn", advancedWorldCategory, 1, 1, 10000,
				"Changes how rare basalt will spawn (Highter value is less chance for it to spawn)");
		basalt_chance_to_spawn_in_chunk = config.getInt("Basalt Chance To Spawn In Chunk", advancedWorldCategory, 20, 0,
				10000, "Changes how rare basalt will spawn");
		basalt_min_height = config.getInt("Basalt minimum Height", advancedWorldCategory, 1, 0, 256,
				"Changes the minimum height where basalt can spawn");
		basalt_max_height = config.getInt("Basalt Maximum Height", advancedWorldCategory, 255, 0, 256,
				"Changes the maximum height where basalt can spawn");
		clay_block_count = config.getInt("Clay Block Count", advancedWorldCategory, 30, 0, 10000,
				"Changes how many clay blocks that generate in each cluster");
		clay_chance_to_spawn = config.getInt("Clay Chance To Spawn", advancedWorldCategory, 1, 1, 10000,
				"Changes how rare clay will spawn (Highter value is less chance for it to spawn)");
		clay_chance_to_spawn_in_chunk = config.getInt("Clay Chance To Spawn In Chunk", advancedWorldCategory, 20, 0,
				10000, "Changes how rare clay will spawn");
		clay_min_height = config.getInt("Clay minimum Height", advancedWorldCategory, 1, 0, 256,
				"Changes the minimum height where clay can spawn");
		clay_max_height = config.getInt("Clay Maximum Height", advancedWorldCategory, 40, 0, 256,
				"Changes the maximum height where clay can spawn");
		flowers_chance_to_spawn = config.getInt("Flowers Chance To Spawn", advancedWorldCategory, 16, 0, 10000,
				"Changes the chance for flowers to spawn (Highter value is less chance to spawn)");
		min_flowers_to_spawn_in_chunk = config.getInt("minimum Flowers To Spawn In Chunk", advancedWorldCategory, 3, 0,
				10000, "Changes the minimum flowers to spawn in a chunk (if they spawn)");
		max_flowers_to_spawn_in_chunk = config.getInt("Maximum Flowers To Spawn In Chunk", advancedWorldCategory, 15, 0,
				10000, "Changes the maximum flowers to spawn in a chunk (if they spawn)");

		config.addCustomCategoryComment(craftingCategory, "Crafting Settings");
		crafting = config.getBoolean("Crafting", craftingCategory, true,
				"Turns on and off crafting of all items and blocks added by this mod");
		duplicate_patterns = config.getBoolean("Duplicate Patterns", craftingCategory, true,
				"Turns on and off duplication of wooden patterns, for example a wooden pattern and a wooden pattern wall crafts 2 wooden pattern walls");
		craft_vanilla_blocks_with_patterns = config.getBoolean("Craft Vanilla Blocks With Patterns", craftingCategory,
				true, "Enables crafting of vanilla blocks(buttons, trapdoors etc) with wooden patterns");
		config.save();
	}

}
