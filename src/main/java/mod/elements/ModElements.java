package mod.elements;

import mod.AchievementEvents;
import mod.RecipeRemover;
import mod.Reference;
import mod.Registry;
import mod.blocks.Bars;
import mod.blocks.Button;
import mod.blocks.ColourBlock;
import mod.blocks.ColourChangingClass;
import mod.blocks.Crusher;
import mod.blocks.DeathBlock;
import mod.blocks.Flower;
import mod.blocks.GlowingAir;
import mod.blocks.GlowingColourBlock;
import mod.blocks.IronChest;
import mod.blocks.ModTrapDoor;
import mod.blocks.Pressureplate;
import mod.blocks.SimpleBlock;
import mod.config.Config;
import mod.creativetabs.MCrafterzzModBuildingTab;
import mod.creativetabs.MCrafterzzModMapMakingTab;
import mod.creativetabs.MCrafterzzModSmallerBuildingBlocksTab;
import mod.creativetabs.MCrafterzzModTab;
import mod.creativetabs.MCrafterzzModToolsTab;
import mod.creativetabs.MCrafterzzModWorkInProgressTab;
import mod.creativetabs.MCrafterzzModWorldTab;
import mod.gui.GuiHandlerCrusher;
import mod.gui.GuiHandlerIronChest;
import mod.items.BucketOfEnderium;
import mod.items.Shield;
import mod.tileentitys.TileEntityIronChest;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.StatBase;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModElements {

	// Creative tabs
	public static MCrafterzzModTab creativeTab = new MCrafterzzModTab("creativeTab");
	public static MCrafterzzModToolsTab creativeTabTools = new MCrafterzzModToolsTab("creativeTabTools");
	public static MCrafterzzModBuildingTab creativeTabBuilding = new MCrafterzzModBuildingTab("creativeTabBuilding");
	public static MCrafterzzModMapMakingTab creativeTabMapMaking = new MCrafterzzModMapMakingTab(
			"creativeTabMapMaking");
	public static MCrafterzzModWorkInProgressTab creativeTabWorkInProgress = new MCrafterzzModWorkInProgressTab(
			"creativeTabWorkInProgress");
	public static MCrafterzzModWorldTab creativeTabWorld = new MCrafterzzModWorldTab("creativeTabWorld");
	public static MCrafterzzModSmallerBuildingBlocksTab creativeTabSmallerBuildingBlocks = new MCrafterzzModSmallerBuildingBlocksTab(
			"creativeTabSmallerBuildingBlocks");
	// Achievements
	public static Achievement copperMiner;
	public static Achievement tinMiner;
	public static Achievement amethystMiner;
	public static Achievement bronzeCreator;
	public static Achievement diamondUpgrade;
	public static Achievement amethystUpgrade;
	public static Achievement theOpTool;
	public static Achievement moreFlowers;
	// Stats
	public static StatBase open_crusher_gui;
	// Damage sources
	public static DamageSource death_block;
	// Mineral ores
	public static Block amethyst_ore;
	public static Block jade_ore;
	public static Block copper_ore;
	public static Block tin_ore;
	// Mineral blocks
	public static Block amethyst_block;
	public static Block jade_block;
	public static Block copper_block;
	public static Block tin_block;
	public static Block bronze_block;
	// Minerals
	public static Item amethyst;
	public static Item jade;
	public static Item copper_ingot;
	public static Item tin_ingot;
	public static Item bronze_ingot;
	// Chests
	public static Block iron_chest;
	// public static Block gold_chest;
	// public static Block diamond_chest;
	// public static Block amethyst_chest;
	// Doors
	public static Block copper_door;
	public static Block tin_door;
	public static Block bronze_door;
	public static Block amethyst_door;
	public static Item copper_door_item;
	public static Item tin_door_item;
	public static Item bronze_door_item;
	public static Item amethyst_door_item;
	// Presureplates
	public static Block diamond_pressure_plate;
	public static Block copper_pressure_plate;
	public static Block tin_pressure_plate;
	public static Block bronze_pressure_plate;
	public static Block amethyst_pressure_plate;
	public static Block jade_pressure_plate;
	public static Block emerald_pressure_plate;
	public static Block quartz_pressure_plate;
	// Bars
	public static Block stone_bars;
	public static Block gold_bars;
	public static Block diamond_bars;
	public static Block copper_bars;
	public static Block tin_bars;
	public static Block bronze_bars;
	public static Block amethyst_bars;
	public static Block jade_bars;
	public static Block emerald_bars;
	public static Block quartz_bars;
	// Trap doors
	public static Block stone_trapdoor;
	public static Block gold_trapdoor;
	public static Block diamond_trapdoor;
	public static Block copper_trapdoor;
	public static Block tin_trapdoor;
	public static Block bronze_trapdoor;
	public static Block amethyst_trapdoor;
	public static Block jade_trapdoor;
	public static Block emerald_trapdoor;
	public static Block quartz_trapdoor;
	// Buttons
	public static Block iron_button;
	public static Block gold_button;
	public static Block diamond_button;
	public static Block copper_button;
	public static Block tin_button;
	public static Block bronze_button;
	public static Block amethyst_button;
	public static Block jade_button;
	public static Block emerald_button;
	public static Block quartz_button;
	// Colour blocks
	public static Block colour_block_white;
	public static Block colour_block_light_gray;
	public static Block colour_block_gray;
	public static Block colour_block_black;
	public static Block colour_block_light_blue;
	public static Block colour_block_cyan;
	public static Block colour_block_blue;
	public static Block colour_block_light_green;
	public static Block colour_block_green;
	public static Block colour_block_yellow;
	public static Block colour_block_orange;
	public static Block colour_block_brown;
	public static Block colour_block_magenta;
	public static Block colour_block_purple;
	public static Block colour_block_red;
	public static Block colour_block_pink;
	public static Block colour_changing_block;
	public static Block glowing_colour_block_white;
	public static Block glowing_colour_block_light_gray;
	public static Block glowing_colour_block_gray;
	public static Block glowing_colour_block_black;
	public static Block glowing_colour_block_light_blue;
	public static Block glowing_colour_block_cyan;
	public static Block glowing_colour_block_blue;
	public static Block glowing_colour_block_light_green;
	public static Block glowing_colour_block_green;
	public static Block glowing_colour_block_yellow;
	public static Block glowing_colour_block_orange;
	public static Block glowing_colour_block_brown;
	public static Block glowing_colour_block_magenta;
	public static Block glowing_colour_block_purple;
	public static Block glowing_colour_block_red;
	public static Block glowing_colour_block_pink;
	public static Block glowing_colour_changing_block;
	// Coloured stone bricks
	public static Block coloured_stone_bricks_white;
	public static Block coloured_stone_bricks_light_gray;
	public static Block coloured_stone_bricks_gray;
	public static Block coloured_stone_bricks_black;
	public static Block coloured_stone_bricks_light_blue;
	public static Block coloured_stone_bricks_cyan;
	public static Block coloured_stone_bricks_blue;
	public static Block coloured_stone_bricks_light_green;
	public static Block coloured_stone_bricks_green;
	public static Block coloured_stone_bricks_yellow;
	public static Block coloured_stone_bricks_orange;
	public static Block coloured_stone_bricks_brown;
	public static Block coloured_stone_bricks_magenta;
	public static Block coloured_stone_bricks_purple;
	public static Block coloured_stone_bricks_red;
	public static Block coloured_stone_bricks_pink;
	public static Block colour_changing_stone_bricks;
	public static Block glowing_coloured_stone_bricks_white;
	public static Block glowing_coloured_stone_bricks_light_gray;
	public static Block glowing_coloured_stone_bricks_gray;
	public static Block glowing_coloured_stone_bricks_black;
	public static Block glowing_coloured_stone_bricks_light_blue;
	public static Block glowing_coloured_stone_bricks_cyan;
	public static Block glowing_coloured_stone_bricks_blue;
	public static Block glowing_coloured_stone_bricks_light_green;
	public static Block glowing_coloured_stone_bricks_green;
	public static Block glowing_coloured_stone_bricks_yellow;
	public static Block glowing_coloured_stone_bricks_orange;
	public static Block glowing_coloured_stone_bricks_brown;
	public static Block glowing_coloured_stone_bricks_magenta;
	public static Block glowing_coloured_stone_bricks_purple;
	public static Block glowing_coloured_stone_bricks_red;
	public static Block glowing_coloured_stone_bricks_pink;
	public static Block glowing_colour_changing_stone_bricks;
	// Coloured stone
	public static Block coloured_stone_white;
	public static Block coloured_stone_light_gray;
	public static Block coloured_stone_gray;
	public static Block coloured_stone_black;
	public static Block coloured_stone_light_blue;
	public static Block coloured_stone_cyan;
	public static Block coloured_stone_blue;
	public static Block coloured_stone_light_green;
	public static Block coloured_stone_green;
	public static Block coloured_stone_yellow;
	public static Block coloured_stone_orange;
	public static Block coloured_stone_brown;
	public static Block coloured_stone_magenta;
	public static Block coloured_stone_purple;
	public static Block coloured_stone_red;
	public static Block coloured_stone_pink;
	public static Block colour_changing_stone;
	public static Block glowing_coloured_stone_white;
	public static Block glowing_coloured_stone_light_gray;
	public static Block glowing_coloured_stone_gray;
	public static Block glowing_coloured_stone_black;
	public static Block glowing_coloured_stone_light_blue;
	public static Block glowing_coloured_stone_cyan;
	public static Block glowing_coloured_stone_blue;
	public static Block glowing_coloured_stone_light_green;
	public static Block glowing_coloured_stone_green;
	public static Block glowing_coloured_stone_yellow;
	public static Block glowing_coloured_stone_orange;
	public static Block glowing_coloured_stone_brown;
	public static Block glowing_coloured_stone_magenta;
	public static Block glowing_coloured_stone_purple;
	public static Block glowing_coloured_stone_red;
	public static Block glowing_coloured_stone_pink;
	public static Block glowing_colour_changing_stone;
	// Coloured cobblestone
	public static Block coloured_cobblestone_white;
	public static Block coloured_cobblestone_light_gray;
	public static Block coloured_cobblestone_gray;
	public static Block coloured_cobblestone_black;
	public static Block coloured_cobblestone_light_blue;
	public static Block coloured_cobblestone_cyan;
	public static Block coloured_cobblestone_blue;
	public static Block coloured_cobblestone_light_green;
	public static Block coloured_cobblestone_green;
	public static Block coloured_cobblestone_yellow;
	public static Block coloured_cobblestone_orange;
	public static Block coloured_cobblestone_brown;
	public static Block coloured_cobblestone_magenta;
	public static Block coloured_cobblestone_purple;
	public static Block coloured_cobblestone_red;
	public static Block coloured_cobblestone_pink;
	public static Block colour_changing_cobblestone;
	public static Block glowing_coloured_cobblestone_white;
	public static Block glowing_coloured_cobblestone_light_gray;
	public static Block glowing_coloured_cobblestone_gray;
	public static Block glowing_coloured_cobblestone_black;
	public static Block glowing_coloured_cobblestone_light_blue;
	public static Block glowing_coloured_cobblestone_cyan;
	public static Block glowing_coloured_cobblestone_blue;
	public static Block glowing_coloured_cobblestone_light_green;
	public static Block glowing_coloured_cobblestone_green;
	public static Block glowing_coloured_cobblestone_yellow;
	public static Block glowing_coloured_cobblestone_orange;
	public static Block glowing_coloured_cobblestone_brown;
	public static Block glowing_coloured_cobblestone_magenta;
	public static Block glowing_coloured_cobblestone_purple;
	public static Block glowing_coloured_cobblestone_red;
	public static Block glowing_coloured_cobblestone_pink;
	public static Block glowing_colour_changing_cobblestone;
	// Seamless blocks
	public static Block seamless_stone_slab;
	public static Block seamless_oak_log;
	public static Block seamless_birch_log;
	public static Block seamless_spruce_log;
	public static Block seamless_jungle_log;
	public static Block seamless_acacia_log;
	public static Block seamless_dark_oak_log;
	public static Block seamless_smooth_sandstone;
	public static Block seamless_smooth_red_sandstone;
	// Map making
	public static Block invisible_pressure_plate;
	public static Block glowing_barrier;
	public static Block glowing_air;
	public static Block block_of_death;
	// Machines
	public static Block crusher;
	// Flowers
	public static BlockBush yellow_tulip;
	public static BlockBush blue_tulip;
	public static BlockBush black_tulip;
	public static BlockBush green_tulip;
	public static BlockBush purple_tulip;
	// Misc blocks
	public static Block null_block;
	public static Block scaffolding_block;
	public static Block colour_changing_wool;
	public static Block colour_changing_clay;
	public static Block colour_changing_glass;
	// Stone blocks
	public static Block basalt;
	public static Block basalt_bricks;
	public static Block polished_basalt;
	public static Block polished_stone;
	public static Block granite_bricks;
	public static Block andesite_bricks;
	public static Block diorite_bricks;
	public static Block sandy_bricks;
	public static Block sandy_stone_bricks;
	// Nether blocks
	public static Block dark_nether_bricks;
	// Patterns
	public static Item wooden_pattern;
	public static Item wooden_pattern_bars;
	public static Item wooden_pattern_trapdoor;
	public static Item wooden_pattern_button;
	public static Item wooden_pattern_pressure_plate;
	public static Item wooden_pattern_wall;
	public static Item wooden_pattern_fence;
	public static Item wooden_pattern_fence_gate;
	public static Item wooden_pattern_stairs;
	// Buckets
	public static Item bucket_of_enderium;

	public static void createBlocksAndItems() {
		// Damage sources
		death_block = new DamageSource("deathBlock").setDamageBypassesArmor().setDamageIsAbsolute();
		// Create blocks
		// Mineral ores
		amethyst_ore = new SimpleBlock(Material.ROCK, SoundType.METAL, "pickaxe", 3, MapColor.STONE)
				.setUnlocalizedName("amethyst_ore").setCreativeTab(creativeTabWorld).setHardness(5.5F)
				.setResistance(30F);
		jade_ore = new SimpleBlock(Material.ROCK, SoundType.METAL, "pickaxe", 3, MapColor.STONE)
				.setUnlocalizedName("jade_ore").setCreativeTab(creativeTabWorld).setHardness(5.5F).setResistance(30F);
		copper_ore = new SimpleBlock(Material.ROCK, SoundType.METAL, "pickaxe", 1, MapColor.STONE)
				.setUnlocalizedName("copper_ore").setCreativeTab(creativeTabWorld).setHardness(4.5F).setResistance(25F);
		tin_ore = new SimpleBlock(Material.ROCK, SoundType.METAL, "pickaxe", 1, MapColor.STONE)
				.setUnlocalizedName("tin_ore").setCreativeTab(creativeTabWorld).setHardness(4.5F).setResistance(25F);
		// Mineral blocks
		amethyst_block = new SimpleBlock(Material.ROCK, SoundType.METAL, "pickaxe", 3, MapColor.PURPLE)
				.setUnlocalizedName("amethyst_block").setCreativeTab(creativeTabBuilding).setHardness(6F)
				.setResistance(35F);
		jade_block = new SimpleBlock(Material.ROCK, SoundType.METAL, "pickaxe", 3, MapColor.EMERALD)
				.setUnlocalizedName("jade_block").setCreativeTab(creativeTabBuilding).setHardness(6F)
				.setResistance(35F);
		copper_block = new SimpleBlock(Material.ROCK, SoundType.METAL, "pickaxe", 1, MapColor.RED)
				.setUnlocalizedName("copper_block").setCreativeTab(creativeTabBuilding).setHardness(5F)
				.setResistance(30F);
		tin_block = new SimpleBlock(Material.ROCK, SoundType.METAL, "pickaxe", 1, MapColor.IRON)
				.setUnlocalizedName("tin_block").setCreativeTab(creativeTabBuilding).setHardness(5F).setResistance(30F);
		bronze_block = new SimpleBlock(Material.ROCK, SoundType.METAL, "pickaxe", 2, MapColor.RED)
				.setUnlocalizedName("bronze_block").setCreativeTab(creativeTabBuilding).setHardness(5F)
				.setResistance(30F);
		// Minerals
		amethyst = new Item().setUnlocalizedName("amethyst").setCreativeTab(creativeTab);
		jade = new Item().setUnlocalizedName("jade").setCreativeTab(creativeTab);
		copper_ingot = new Item().setUnlocalizedName("copper_ingot").setCreativeTab(creativeTab);
		tin_ingot = new Item().setUnlocalizedName("tin_ingot").setCreativeTab(creativeTab);
		bronze_ingot = new Item().setUnlocalizedName("bronze_ingot").setCreativeTab(creativeTab);

		// Chests
		iron_chest = new IronChest(Material.IRON).setUnlocalizedName("iron_chest")
				.setCreativeTab(creativeTabWorkInProgress);
		// gold_chest = new
		// ModIronChest(Material.iron).setUnlocalizedName("gold_chest")
		// .setCreativeTab(creativeTab);
		// Items.DIAMOND_chest = new
		// ModIronChest(Material.iron).setUnlocalizedName("Items.DIAMOND_chest")
		// .setCreativeTab(creativeTab);
		// amethyst_chest = new
		// ModIronChest(Material.iron).setUnlocalizedName("amethyst_chest")
		// .setCreativeTab(creativeTab);
		// Doors
		copper_door = new SimpleBlock(Material.ROCK, SoundType.METAL, "pickaxe", 1, MapColor.RED)
				.setUnlocalizedName("copper_door").setHardness(5F).setResistance(30F);
		tin_door = new SimpleBlock(Material.ROCK, SoundType.METAL, "pickaxe", 1, MapColor.IRON)
				.setUnlocalizedName("tin_door").setHardness(5F).setResistance(30F);
		bronze_door = new SimpleBlock(Material.ROCK, SoundType.METAL, "pickaxe", 2, MapColor.RED)
				.setUnlocalizedName("bronze_door").setHardness(5F).setResistance(30F);
		amethyst_door = new SimpleBlock(Material.ROCK, SoundType.METAL, "pickaxe", 3, MapColor.PURPLE)
				.setUnlocalizedName("amethyst_door").setHardness(6F).setResistance(35F);
		copper_door_item = new Item().setUnlocalizedName("copper_door_item").setCreativeTab(creativeTabBuilding);
		tin_door_item = new Item().setUnlocalizedName("tin_door_item").setCreativeTab(creativeTabBuilding);
		bronze_door_item = new Item().setUnlocalizedName("bronze_door_item").setCreativeTab(creativeTabBuilding);
		amethyst_door_item = new Item().setUnlocalizedName("amethyst_door_item").setCreativeTab(creativeTabBuilding);
		// Pressure plates
		diamond_pressure_plate = new Pressureplate(Material.ROCK, SoundType.METAL, "pickaxe", 2)
				.setUnlocalizedName("diamond_pressure_plate").setHardness(5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		copper_pressure_plate = new Pressureplate(Material.ROCK, SoundType.METAL, "pickaxe", 1)
				.setUnlocalizedName("copper_pressure_plate").setHardness(5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		tin_pressure_plate = new Pressureplate(Material.ROCK, SoundType.METAL, "pickaxe", 1)
				.setUnlocalizedName("tin_pressure_plate").setHardness(5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		bronze_pressure_plate = new Pressureplate(Material.ROCK, SoundType.METAL, "pickaxe", 2)
				.setUnlocalizedName("bronze_pressure_plate").setHardness(5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		jade_pressure_plate = new Pressureplate(Material.ROCK, SoundType.METAL, "pickaxe", 3)
				.setUnlocalizedName("jade_pressure_plate").setHardness(6F).setResistance(35F)
				.setCreativeTab(creativeTabBuilding);
		amethyst_pressure_plate = new Pressureplate(Material.ROCK, SoundType.METAL, "pickaxe", 3)
				.setUnlocalizedName("amethyst_pressure_plate").setHardness(6F).setResistance(35F)
				.setCreativeTab(creativeTabBuilding);
		emerald_pressure_plate = new Pressureplate(Material.ROCK, SoundType.METAL, "pickaxe", 2)
				.setUnlocalizedName("emerald_pressure_plate").setHardness(5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		quartz_pressure_plate = new Pressureplate(Material.ROCK, SoundType.METAL, "pickaxe", 0)
				.setUnlocalizedName("quartz_pressure_plate").setHardness(0.8F).setResistance(4F)
				.setCreativeTab(creativeTabBuilding);
		// Bars
		stone_bars = new Bars(Material.ROCK, SoundType.STONE, "pickaxe", 0, true).setUnlocalizedName("stone_bars")
				.setHardness(1.5F).setResistance(30F).setCreativeTab(creativeTabBuilding);
		gold_bars = new Bars(Material.ROCK, SoundType.METAL, "pickaxe", 1, true).setUnlocalizedName("gold_bars")
				.setHardness(5F).setResistance(30F).setCreativeTab(creativeTabBuilding);
		diamond_bars = new Bars(Material.ROCK, SoundType.METAL, "pickaxe", 2, true).setUnlocalizedName("diamond_bars")
				.setHardness(5F).setResistance(30F).setCreativeTab(creativeTabBuilding);
		copper_bars = new Bars(Material.ROCK, SoundType.METAL, "pickaxe", 1, true).setUnlocalizedName("copper_bars")
				.setHardness(5F).setResistance(30F).setCreativeTab(creativeTabBuilding);
		tin_bars = new Bars(Material.ROCK, SoundType.METAL, "pickaxe", 1, true).setUnlocalizedName("tin_bars")
				.setHardness(5F).setResistance(30F).setCreativeTab(creativeTabBuilding);
		bronze_bars = new Bars(Material.ROCK, SoundType.METAL, "pickaxe", 2, true).setUnlocalizedName("bronze_bars")
				.setHardness(5F).setResistance(30F).setCreativeTab(creativeTabBuilding);
		jade_bars = new Bars(Material.ROCK, SoundType.METAL, "pickaxe", 3, true).setUnlocalizedName("jade_bars")
				.setHardness(6F).setResistance(35F).setCreativeTab(creativeTabBuilding);
		amethyst_bars = new Bars(Material.ROCK, SoundType.METAL, "pickaxe", 3, true).setUnlocalizedName("amethyst_bars")
				.setHardness(6F).setResistance(35F).setCreativeTab(creativeTabBuilding);
		emerald_bars = new Bars(Material.ROCK, SoundType.METAL, "pickaxe", 2, true).setUnlocalizedName("emerald_bars")
				.setHardness(5F).setResistance(30F).setCreativeTab(creativeTabBuilding);
		quartz_bars = new Bars(Material.ROCK, SoundType.METAL, "pickaxe", 0, true).setUnlocalizedName("quartz_bars")
				.setHardness(0.8F).setResistance(4F).setCreativeTab(creativeTabBuilding);
		// Trap doors
		stone_trapdoor = new ModTrapDoor(Material.ROCK, SoundType.STONE, "pickaxe", 0)
				.setUnlocalizedName("stone_trapdoor").setHardness(1.5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		gold_trapdoor = new ModTrapDoor(Material.ROCK, SoundType.METAL, "pickaxe", 1)
				.setUnlocalizedName("gold_trapdoor").setHardness(5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		diamond_trapdoor = new ModTrapDoor(Material.ROCK, SoundType.METAL, "pickaxe", 2)
				.setUnlocalizedName("diamond_trapdoor").setHardness(5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		copper_trapdoor = new ModTrapDoor(Material.ROCK, SoundType.METAL, "pickaxe", 1)
				.setUnlocalizedName("copper_trapdoor").setHardness(5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		tin_trapdoor = new ModTrapDoor(Material.ROCK, SoundType.METAL, "pickaxe", 1).setUnlocalizedName("tin_trapdoor")
				.setHardness(5F).setResistance(30F).setCreativeTab(creativeTabBuilding);
		bronze_trapdoor = new ModTrapDoor(Material.ROCK, SoundType.METAL, "pickaxe", 2)
				.setUnlocalizedName("bronze_trapdoor").setHardness(5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		jade_trapdoor = new ModTrapDoor(Material.ROCK, SoundType.METAL, "pickaxe", 3)
				.setUnlocalizedName("jade_trapdoor").setHardness(6F).setResistance(35F)
				.setCreativeTab(creativeTabBuilding);
		amethyst_trapdoor = new ModTrapDoor(Material.ROCK, SoundType.METAL, "pickaxe", 3)
				.setUnlocalizedName("amethyst_trapdoor").setHardness(6F).setResistance(35F)
				.setCreativeTab(creativeTabBuilding);
		emerald_trapdoor = new ModTrapDoor(Material.ROCK, SoundType.METAL, "pickaxe", 2)
				.setUnlocalizedName("emerald_trapdoor").setHardness(5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		quartz_trapdoor = new ModTrapDoor(Material.ROCK, SoundType.METAL, "pickaxe", 0)
				.setUnlocalizedName("quartz_trapdoor").setHardness(0.8F).setResistance(4F)
				.setCreativeTab(creativeTabBuilding);
		// Buttons
		iron_button = new Button(false, SoundType.METAL, "pickaxe", 1).setUnlocalizedName("iron_button").setHardness(5F)
				.setResistance(30F).setCreativeTab(creativeTabBuilding);
		gold_button = new Button(false, SoundType.METAL, "pickaxe", 1).setUnlocalizedName("gold_button").setHardness(5F)
				.setResistance(30F).setCreativeTab(creativeTabBuilding);
		diamond_button = new Button(false, SoundType.METAL, "pickaxe", 2).setUnlocalizedName("diamond_button")
				.setHardness(5F).setResistance(30F).setCreativeTab(creativeTabBuilding);
		copper_button = new Button(false, SoundType.METAL, "pickaxe", 1).setUnlocalizedName("copper_button")
				.setHardness(5F).setResistance(30F).setCreativeTab(creativeTabBuilding);
		tin_button = new Button(false, SoundType.METAL, "pickaxe", 1).setUnlocalizedName("tin_button").setHardness(5F)
				.setResistance(30F).setCreativeTab(creativeTabBuilding);
		bronze_button = new Button(false, SoundType.METAL, "pickaxe", 2).setUnlocalizedName("bronze_button")
				.setHardness(5F).setResistance(30F).setCreativeTab(creativeTabBuilding);
		jade_button = new Button(false, SoundType.METAL, "pickaxe", 3).setUnlocalizedName("jade_button").setHardness(6F)
				.setResistance(35F).setCreativeTab(creativeTabBuilding);
		amethyst_button = new Button(false, SoundType.METAL, "pickaxe", 3).setUnlocalizedName("amethyst_button")
				.setHardness(6F).setResistance(35F).setCreativeTab(creativeTabBuilding);
		emerald_button = new Button(false, SoundType.METAL, "pickaxe", 2).setUnlocalizedName("emerald_button")
				.setHardness(5F).setResistance(30F).setCreativeTab(creativeTabBuilding);
		quartz_button = new Button(false, SoundType.METAL, "pickaxe", 0).setUnlocalizedName("quartz_button")
				.setHardness(0.8F).setResistance(4F).setCreativeTab(creativeTabBuilding);
		// Colour blocks
		colour_block_white = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.IRON)
				.setUnlocalizedName("colour_block_white").setHardness(5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		colour_block_light_gray = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.GRAY)
				.setUnlocalizedName("colour_block_light_gray").setHardness(5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		colour_block_gray = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.GRAY)
				.setUnlocalizedName("colour_block_gray").setHardness(5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		colour_block_black = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.BLACK)
				.setUnlocalizedName("colour_block_black").setHardness(5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		colour_block_light_blue = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.LIGHT_BLUE)
				.setUnlocalizedName("colour_block_light_blue").setHardness(5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		colour_block_cyan = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.CYAN)
				.setUnlocalizedName("colour_block_cyan").setHardness(5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		colour_block_blue = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.BLUE)
				.setUnlocalizedName("colour_block_blue").setHardness(5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		colour_block_light_green = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.GREEN)
				.setUnlocalizedName("colour_block_light_green").setHardness(5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		colour_block_green = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.GREEN)
				.setUnlocalizedName("colour_block_green").setHardness(5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		colour_block_yellow = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.YELLOW)
				.setUnlocalizedName("colour_block_yellow").setHardness(5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		colour_block_orange = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.RED)
				.setUnlocalizedName("colour_block_orange").setHardness(5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		colour_block_brown = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.BROWN)
				.setUnlocalizedName("colour_block_brown").setHardness(5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		colour_block_magenta = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.MAGENTA)
				.setUnlocalizedName("colour_block_magenta").setHardness(5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		colour_block_purple = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.PURPLE)
				.setUnlocalizedName("colour_block_purple").setHardness(5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		colour_block_red = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.RED)
				.setUnlocalizedName("colour_block_red").setHardness(5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		colour_block_pink = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.PINK)
				.setUnlocalizedName("colour_block_pink").setHardness(5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		colour_changing_block = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.BLACK)
				.setUnlocalizedName("colour_changing_block").setHardness(5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		glowing_colour_block_white = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.IRON)
				.setUnlocalizedName("glowing_colour_block_white").setHardness(5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		glowing_colour_block_light_gray = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 2,
				MapColor.GRAY).setUnlocalizedName("glowing_colour_block_light_gray").setHardness(5F).setResistance(30F)
						.setCreativeTab(creativeTabBuilding);
		glowing_colour_block_gray = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.GRAY)
				.setUnlocalizedName("glowing_colour_block_gray").setHardness(5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		glowing_colour_block_black = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 2,
				MapColor.BLACK).setUnlocalizedName("glowing_colour_block_black").setHardness(5F).setResistance(30F)
						.setCreativeTab(creativeTabBuilding);
		glowing_colour_block_light_blue = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 2,
				MapColor.LIGHT_BLUE).setUnlocalizedName("glowing_colour_block_light_blue").setHardness(5F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		glowing_colour_block_cyan = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.CYAN)
				.setUnlocalizedName("glowing_colour_block_cyan").setHardness(5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		glowing_colour_block_blue = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.BLUE)
				.setUnlocalizedName("glowing_colour_block_blue").setHardness(5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		glowing_colour_block_light_green = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 2,
				MapColor.GREEN).setUnlocalizedName("glowing_colour_block_light_green").setHardness(5F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		glowing_colour_block_green = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 2,
				MapColor.GREEN).setUnlocalizedName("glowing_colour_block_green").setHardness(5F).setResistance(30F)
						.setCreativeTab(creativeTabBuilding);
		glowing_colour_block_yellow = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 2,
				MapColor.YELLOW).setUnlocalizedName("glowing_colour_block_yellow").setHardness(5F).setResistance(30F)
						.setCreativeTab(creativeTabBuilding);
		glowing_colour_block_orange = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.RED)
				.setUnlocalizedName("glowing_colour_block_orange").setHardness(5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		glowing_colour_block_brown = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 2,
				MapColor.BROWN).setUnlocalizedName("glowing_colour_block_brown").setHardness(5F).setResistance(30F)
						.setCreativeTab(creativeTabBuilding);
		glowing_colour_block_magenta = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 2,
				MapColor.MAGENTA).setUnlocalizedName("glowing_colour_block_magenta").setHardness(5F).setResistance(30F)
						.setCreativeTab(creativeTabBuilding);
		glowing_colour_block_purple = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 2,
				MapColor.PURPLE).setUnlocalizedName("glowing_colour_block_purple").setHardness(5F).setResistance(30F)
						.setCreativeTab(creativeTabBuilding);
		glowing_colour_block_red = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.RED)
				.setUnlocalizedName("glowing_colour_block_red").setHardness(5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		glowing_colour_block_pink = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.PINK)
				.setUnlocalizedName("glowing_colour_block_pink").setHardness(5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		glowing_colour_changing_block = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 2,
				MapColor.BLACK).setUnlocalizedName("glowing_colour_changing_block").setHardness(5F).setResistance(30F)
						.setCreativeTab(creativeTabBuilding);
		// Coloured stone bricks
		coloured_stone_bricks_white = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.IRON)
				.setUnlocalizedName("coloured_stone_bricks_white").setHardness(1.5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		coloured_stone_bricks_light_gray = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.GRAY)
				.setUnlocalizedName("coloured_stone_bricks_light_gray").setHardness(1.5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		coloured_stone_bricks_gray = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.GRAY)
				.setUnlocalizedName("coloured_stone_bricks_gray").setHardness(1.5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		coloured_stone_bricks_black = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLACK)
				.setUnlocalizedName("coloured_stone_bricks_black").setHardness(1.5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		coloured_stone_bricks_light_blue = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.LIGHT_BLUE).setUnlocalizedName("coloured_stone_bricks_light_blue").setHardness(1.5F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		coloured_stone_bricks_cyan = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.CYAN)
				.setUnlocalizedName("coloured_stone_bricks_cyan").setHardness(1.5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		coloured_stone_bricks_blue = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLUE)
				.setUnlocalizedName("coloured_stone_bricks_blue").setHardness(1.5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		coloured_stone_bricks_light_green = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.GREEN).setUnlocalizedName("coloured_stone_bricks_light_green").setHardness(1.5F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		coloured_stone_bricks_green = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.GREEN)
				.setUnlocalizedName("coloured_stone_bricks_green").setHardness(1.5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		coloured_stone_bricks_yellow = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.YELLOW)
				.setUnlocalizedName("coloured_stone_bricks_yellow").setHardness(1.5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		coloured_stone_bricks_orange = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.RED)
				.setUnlocalizedName("coloured_stone_bricks_orange").setHardness(1.5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		coloured_stone_bricks_brown = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BROWN)
				.setUnlocalizedName("coloured_stone_bricks_brown").setHardness(1.5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		coloured_stone_bricks_magenta = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.MAGENTA)
				.setUnlocalizedName("coloured_stone_bricks_magenta").setHardness(1.5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		coloured_stone_bricks_purple = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.PURPLE)
				.setUnlocalizedName("coloured_stone_bricks_purple").setHardness(1.5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		coloured_stone_bricks_red = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.RED)
				.setUnlocalizedName("coloured_stone_bricks_red").setHardness(1.5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		coloured_stone_bricks_pink = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.PINK)
				.setUnlocalizedName("coloured_stone_bricks_pink").setHardness(1.5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		colour_changing_stone_bricks = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLACK)
				.setUnlocalizedName("colour_changing_stone_bricks").setHardness(1.5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		glowing_coloured_stone_bricks_white = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.IRON).setUnlocalizedName("glowing_coloured_stone_bricks_white").setHardness(1.5F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		glowing_coloured_stone_bricks_light_gray = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.GRAY).setUnlocalizedName("glowing_coloured_stone_bricks_light_gray").setHardness(1.5F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		glowing_coloured_stone_bricks_gray = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.GRAY).setUnlocalizedName("glowing_coloured_stone_bricks_gray").setHardness(1.5F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		glowing_coloured_stone_bricks_black = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.BLACK).setUnlocalizedName("glowing_coloured_stone_bricks_black").setHardness(1.5F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		glowing_coloured_stone_bricks_light_blue = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.LIGHT_BLUE).setUnlocalizedName("glowing_coloured_stone_bricks_light_blue").setHardness(1.5F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		glowing_coloured_stone_bricks_cyan = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.CYAN).setUnlocalizedName("glowing_coloured_stone_bricks_cyan").setHardness(1.5F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		glowing_coloured_stone_bricks_blue = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.BLUE).setUnlocalizedName("glowing_coloured_stone_bricks_blue").setHardness(1.5F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		glowing_coloured_stone_bricks_light_green = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.GREEN).setUnlocalizedName("glowing_coloured_stone_bricks_light_green").setHardness(1.5F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		glowing_coloured_stone_bricks_green = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.GREEN).setUnlocalizedName("glowing_coloured_stone_bricks_green").setHardness(1.5F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		glowing_coloured_stone_bricks_yellow = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.YELLOW).setUnlocalizedName("glowing_coloured_stone_bricks_yellow").setHardness(1.5F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		glowing_coloured_stone_bricks_orange = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.RED).setUnlocalizedName("glowing_coloured_stone_bricks_orange").setHardness(1.5F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		glowing_coloured_stone_bricks_brown = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.BROWN).setUnlocalizedName("glowing_coloured_stone_bricks_brown").setHardness(1.5F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		glowing_coloured_stone_bricks_magenta = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.MAGENTA).setUnlocalizedName("glowing_coloured_stone_bricks_magenta").setHardness(1.5F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		glowing_coloured_stone_bricks_purple = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.PURPLE).setUnlocalizedName("glowing_coloured_stone_bricks_purple").setHardness(1.5F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		glowing_coloured_stone_bricks_red = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.RED).setUnlocalizedName("glowing_coloured_stone_bricks_red").setHardness(1.5F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		glowing_coloured_stone_bricks_pink = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.PINK).setUnlocalizedName("glowing_coloured_stone_bricks_pink").setHardness(1.5F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		glowing_colour_changing_stone_bricks = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.BLACK).setUnlocalizedName("glowing_colour_changing_stone_bricks").setHardness(1.5F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		// Coloured stone
		coloured_stone_white = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.IRON)
				.setUnlocalizedName("coloured_stone_white").setHardness(1.5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		coloured_stone_light_gray = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.GRAY)
				.setUnlocalizedName("coloured_stone_light_gray").setHardness(1.5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		coloured_stone_gray = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.GRAY)
				.setUnlocalizedName("coloured_stone_gray").setHardness(1.5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		coloured_stone_black = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLACK)
				.setUnlocalizedName("coloured_stone_black").setHardness(1.5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		coloured_stone_light_blue = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.LIGHT_BLUE)
				.setUnlocalizedName("coloured_stone_light_blue").setHardness(1.5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		coloured_stone_cyan = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.CYAN)
				.setUnlocalizedName("coloured_stone_cyan").setHardness(1.5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		coloured_stone_blue = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLUE)
				.setUnlocalizedName("coloured_stone_blue").setHardness(1.5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		coloured_stone_light_green = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.GREEN)
				.setUnlocalizedName("coloured_stone_light_green").setHardness(1.5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		coloured_stone_green = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.GREEN)
				.setUnlocalizedName("coloured_stone_green").setHardness(1.5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		coloured_stone_yellow = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.YELLOW)
				.setUnlocalizedName("coloured_stone_yellow").setHardness(1.5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		coloured_stone_orange = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.RED)
				.setUnlocalizedName("coloured_stone_orange").setHardness(1.5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		coloured_stone_brown = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BROWN)
				.setUnlocalizedName("coloured_stone_brown").setHardness(1.5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		coloured_stone_magenta = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.MAGENTA)
				.setUnlocalizedName("coloured_stone_magenta").setHardness(1.5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		coloured_stone_purple = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.PURPLE)
				.setUnlocalizedName("coloured_stone_purple").setHardness(1.5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		coloured_stone_red = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.RED)
				.setUnlocalizedName("coloured_stone_red").setHardness(1.5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		coloured_stone_pink = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.PINK)
				.setUnlocalizedName("coloured_stone_pink").setHardness(1.5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		colour_changing_stone = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLACK)
				.setUnlocalizedName("colour_changing_stone").setHardness(1.5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		glowing_coloured_stone_white = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.IRON).setUnlocalizedName("glowing_coloured_stone_white").setHardness(1.5F).setResistance(30F)
						.setCreativeTab(creativeTabBuilding);
		glowing_coloured_stone_light_gray = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.GRAY).setUnlocalizedName("glowing_coloured_stone_light_gray").setHardness(1.5F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		glowing_coloured_stone_gray = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.GRAY).setUnlocalizedName("glowing_coloured_stone_gray").setHardness(1.5F).setResistance(30F)
						.setCreativeTab(creativeTabBuilding);
		glowing_coloured_stone_black = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.BLACK).setUnlocalizedName("glowing_coloured_stone_black").setHardness(1.5F).setResistance(30F)
						.setCreativeTab(creativeTabBuilding);
		glowing_coloured_stone_light_blue = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.LIGHT_BLUE).setUnlocalizedName("glowing_coloured_stone_light_blue").setHardness(1.5F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		glowing_coloured_stone_cyan = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.CYAN).setUnlocalizedName("glowing_coloured_stone_cyan").setHardness(1.5F).setResistance(30F)
						.setCreativeTab(creativeTabBuilding);
		glowing_coloured_stone_blue = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.BLUE).setUnlocalizedName("glowing_coloured_stone_blue").setHardness(1.5F).setResistance(30F)
						.setCreativeTab(creativeTabBuilding);
		glowing_coloured_stone_light_green = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.GREEN).setUnlocalizedName("glowing_coloured_stone_light_green").setHardness(1.5F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		glowing_coloured_stone_green = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.GREEN).setUnlocalizedName("glowing_coloured_stone_green").setHardness(1.5F).setResistance(30F)
						.setCreativeTab(creativeTabBuilding);
		glowing_coloured_stone_yellow = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.YELLOW).setUnlocalizedName("glowing_coloured_stone_yellow").setHardness(1.5F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		glowing_coloured_stone_orange = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.RED).setUnlocalizedName("glowing_coloured_stone_orange").setHardness(1.5F).setResistance(30F)
						.setCreativeTab(creativeTabBuilding);
		glowing_coloured_stone_brown = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.BROWN).setUnlocalizedName("glowing_coloured_stone_brown").setHardness(1.5F).setResistance(30F)
						.setCreativeTab(creativeTabBuilding);
		glowing_coloured_stone_magenta = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.MAGENTA).setUnlocalizedName("glowing_coloured_stone_magenta").setHardness(1.5F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		glowing_coloured_stone_purple = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.PURPLE).setUnlocalizedName("glowing_coloured_stone_purple").setHardness(1.5F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		glowing_coloured_stone_red = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.RED)
				.setUnlocalizedName("glowing_coloured_stone_red").setHardness(1.5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		glowing_coloured_stone_pink = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.PINK).setUnlocalizedName("glowing_coloured_stone_pink").setHardness(1.5F).setResistance(30F)
						.setCreativeTab(creativeTabBuilding);
		glowing_colour_changing_stone = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.BLACK).setUnlocalizedName("glowing_colour_changing_stone").setHardness(1.5F).setResistance(30F)
						.setCreativeTab(creativeTabBuilding);
		// Coloured cobblestone
		coloured_cobblestone_white = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.IRON)
				.setUnlocalizedName("coloured_cobblestone_white").setHardness(2F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		coloured_cobblestone_light_gray = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.GRAY)
				.setUnlocalizedName("coloured_cobblestone_light_gray").setHardness(2F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		coloured_cobblestone_gray = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.GRAY)
				.setUnlocalizedName("coloured_cobblestone_gray").setHardness(2F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		coloured_cobblestone_black = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLACK)
				.setUnlocalizedName("coloured_cobblestone_black").setHardness(2F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		coloured_cobblestone_light_blue = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.LIGHT_BLUE).setUnlocalizedName("coloured_cobblestone_light_blue").setHardness(2F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		coloured_cobblestone_cyan = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.CYAN)
				.setUnlocalizedName("coloured_cobblestone_cyan").setHardness(2F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		coloured_cobblestone_blue = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLUE)
				.setUnlocalizedName("coloured_cobblestone_blue").setHardness(2F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		coloured_cobblestone_light_green = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.GREEN)
				.setUnlocalizedName("coloured_cobblestone_light_green").setHardness(2F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		coloured_cobblestone_green = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.GREEN)
				.setUnlocalizedName("coloured_cobblestone_green").setHardness(2F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		coloured_cobblestone_yellow = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.YELLOW)
				.setUnlocalizedName("coloured_cobblestone_yellow").setHardness(2F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		coloured_cobblestone_orange = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.RED)
				.setUnlocalizedName("coloured_cobblestone_orange").setHardness(2F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		coloured_cobblestone_brown = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BROWN)
				.setUnlocalizedName("coloured_cobblestone_brown").setHardness(2F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		coloured_cobblestone_magenta = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.MAGENTA)
				.setUnlocalizedName("coloured_cobblestone_magenta").setHardness(2F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		coloured_cobblestone_purple = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.PURPLE)
				.setUnlocalizedName("coloured_cobblestone_purple").setHardness(2F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		coloured_cobblestone_red = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.RED)
				.setUnlocalizedName("coloured_cobblestone_red").setHardness(2F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		coloured_cobblestone_pink = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.PINK)
				.setUnlocalizedName("coloured_cobblestone_pink").setHardness(2F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		colour_changing_cobblestone = new ColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLACK)
				.setUnlocalizedName("colour_changing_cobblestone").setHardness(2F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		glowing_coloured_cobblestone_white = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.IRON).setUnlocalizedName("glowing_coloured_cobblestone_white").setHardness(2F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		glowing_coloured_cobblestone_light_gray = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.GRAY).setUnlocalizedName("glowing_coloured_cobblestone_light_gray").setHardness(2F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		glowing_coloured_cobblestone_gray = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.GRAY).setUnlocalizedName("glowing_coloured_cobblestone_gray").setHardness(2F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		glowing_coloured_cobblestone_black = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.BLACK).setUnlocalizedName("glowing_coloured_cobblestone_black").setHardness(2F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		glowing_coloured_cobblestone_light_blue = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.LIGHT_BLUE).setUnlocalizedName("glowing_coloured_cobblestone_light_blue").setHardness(2F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		glowing_coloured_cobblestone_cyan = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.CYAN).setUnlocalizedName("glowing_coloured_cobblestone_cyan").setHardness(2F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		glowing_coloured_cobblestone_blue = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.BLUE).setUnlocalizedName("glowing_coloured_cobblestone_blue").setHardness(2F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		glowing_coloured_cobblestone_light_green = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.GREEN).setUnlocalizedName("glowing_coloured_cobblestone_light_green").setHardness(2F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		glowing_coloured_cobblestone_green = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.GREEN).setUnlocalizedName("glowing_coloured_cobblestone_green").setHardness(2F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		glowing_coloured_cobblestone_yellow = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.YELLOW).setUnlocalizedName("glowing_coloured_cobblestone_yellow").setHardness(2F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		glowing_coloured_cobblestone_orange = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.RED).setUnlocalizedName("glowing_coloured_cobblestone_orange").setHardness(2F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		glowing_coloured_cobblestone_brown = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.BROWN).setUnlocalizedName("glowing_coloured_cobblestone_brown").setHardness(2F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		glowing_coloured_cobblestone_magenta = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.MAGENTA).setUnlocalizedName("glowing_coloured_cobblestone_magenta").setHardness(2F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		glowing_coloured_cobblestone_purple = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.PURPLE).setUnlocalizedName("glowing_coloured_cobblestone_purple").setHardness(2F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		glowing_coloured_cobblestone_red = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.RED).setUnlocalizedName("glowing_coloured_cobblestone_red").setHardness(2F).setResistance(30F)
						.setCreativeTab(creativeTabBuilding);
		glowing_coloured_cobblestone_pink = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.PINK).setUnlocalizedName("glowing_coloured_cobblestone_pink").setHardness(2F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		glowing_colour_changing_cobblestone = new GlowingColourBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0,
				MapColor.BLACK).setUnlocalizedName("glowing_colour_changing_cobblestone").setHardness(2F)
						.setResistance(30F).setCreativeTab(creativeTabBuilding);
		// Seamless blocks
		seamless_stone_slab = new SimpleBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.STONE)
				.setUnlocalizedName("seamless_stone_slab").setCreativeTab(creativeTabBuilding).setResistance(30)
				.setHardness(2);
		seamless_oak_log = new SimpleBlock(Material.WOOD, SoundType.WOOD, "axe", 0, MapColor.WOOD)
				.setUnlocalizedName("seamless_oak_log").setCreativeTab(creativeTabBuilding).setResistance(10)
				.setHardness(2);
		seamless_birch_log = new SimpleBlock(Material.WOOD, SoundType.WOOD, "axe", 0, MapColor.WOOD)
				.setUnlocalizedName("seamless_birch_log").setCreativeTab(creativeTabBuilding).setResistance(10)
				.setHardness(2);
		seamless_spruce_log = new SimpleBlock(Material.WOOD, SoundType.WOOD, "axe", 0, MapColor.WOOD)
				.setUnlocalizedName("seamless_spruce_log").setCreativeTab(creativeTabBuilding).setResistance(10)
				.setHardness(2);
		seamless_jungle_log = new SimpleBlock(Material.WOOD, SoundType.WOOD, "axe", 0, MapColor.WOOD)
				.setUnlocalizedName("seamless_jungle_log").setCreativeTab(creativeTabBuilding).setResistance(10)
				.setHardness(2);
		seamless_acacia_log = new SimpleBlock(Material.WOOD, SoundType.WOOD, "axe", 0, MapColor.WOOD)
				.setUnlocalizedName("seamless_acacia_log").setCreativeTab(creativeTabBuilding).setResistance(10)
				.setHardness(2);
		seamless_dark_oak_log = new SimpleBlock(Material.WOOD, SoundType.WOOD, "axe", 0, MapColor.WOOD)
				.setUnlocalizedName("seamless_dark_oak_log").setCreativeTab(creativeTabBuilding).setResistance(10)
				.setHardness(2);
		seamless_smooth_sandstone = new SimpleBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.SAND)
				.setUnlocalizedName("seamless_smooth_sandstone").setCreativeTab(creativeTabBuilding).setResistance(4)
				.setHardness(0.8F);
		seamless_smooth_red_sandstone = new SimpleBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.RED)
				.setUnlocalizedName("seamless_smooth_red_sandstone").setCreativeTab(creativeTabBuilding)
				.setResistance(4).setHardness(0.8F);
		// Map making blocks
		invisible_pressure_plate = new Pressureplate(Material.BARRIER, true, true).setCreativeTab(creativeTabMapMaking)
				.setResistance(18000000).setUnlocalizedName("invisible_pressure_plate");
		glowing_barrier = new SimpleBlock(Material.BARRIER, SoundType.GLASS, "pickaxe", 0, true, 1, true)
				.setResistance(18000000).setCreativeTab(creativeTabMapMaking).setUnlocalizedName("glowing_barrier");
		glowing_air = new GlowingAir(Material.BARRIER).setResistance(18000000).setCreativeTab(creativeTabMapMaking)
				.setUnlocalizedName("glowing_air");
		block_of_death = new DeathBlock(Material.ROCK).setCreativeTab(creativeTabMapMaking)
				.setUnlocalizedName("block_of_death").setResistance(10).setHardness(5);
		// Machines
		crusher = new Crusher().setUnlocalizedName("crusher").setCreativeTab(creativeTabWorkInProgress)
				.setResistance(30).setHardness(5);
		// Flowers
		yellow_tulip = (BlockBush) new Flower().setUnlocalizedName("yellow_tulip").setCreativeTab(creativeTabWorld);
		blue_tulip = (BlockBush) new Flower().setUnlocalizedName("blue_tulip").setCreativeTab(creativeTabWorld);
		black_tulip = (BlockBush) new Flower().setUnlocalizedName("black_tulip").setCreativeTab(creativeTabWorld);
		green_tulip = (BlockBush) new Flower().setUnlocalizedName("green_tulip").setCreativeTab(creativeTabWorld);
		purple_tulip = (BlockBush) new Flower().setUnlocalizedName("purple_tulip").setCreativeTab(creativeTabWorld);
		// Misc blocks
		null_block = new Block(Material.BARRIER).setBlockUnbreakable().setUnlocalizedName("null_block")
				.setResistance(1000000F).setCreativeTab(creativeTabBuilding);
		scaffolding_block = new SimpleBlock(Material.GROUND, SoundType.WOOD, true, MapColor.WOOD)
				.setUnlocalizedName("scaffolding_block").setCreativeTab(creativeTabBuilding);
		colour_changing_wool = new ColourBlock(Material.CLOTH, SoundType.CLOTH, null, 0, MapColor.CLOTH)
				.setUnlocalizedName("colour_changing_wool").setHardness(0.8F).setResistance(4F)
				.setCreativeTab(creativeTabBuilding);
		colour_changing_clay = new ColourBlock(Material.CLAY, SoundType.STONE, "pickaxe", 0, MapColor.CLAY)
				.setUnlocalizedName("colour_changing_clay").setHardness(1.25F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		colour_changing_glass = new ColourChangingClass(Material.GLASS, SoundType.GLASS, MapColor.AIR)
				.setUnlocalizedName("colour_changing_glass").setHardness(0.3F).setResistance(1.5F)
				.setCreativeTab(creativeTabBuilding);
		// Stone blocks
		basalt = new SimpleBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLACK)
				.setUnlocalizedName("basalt").setHardness(1.5F).setResistance(30F).setCreativeTab(creativeTabBuilding);
		basalt_bricks = new SimpleBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLACK)
				.setUnlocalizedName("basalt_bricks").setHardness(1.5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		polished_basalt = new SimpleBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLACK)
				.setUnlocalizedName("polished_basalt").setHardness(1.5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		polished_stone = new SimpleBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.STONE)
				.setUnlocalizedName("polished_stone").setHardness(1.5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		granite_bricks = new SimpleBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.RED)
				.setUnlocalizedName("granite_bricks").setHardness(1.5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		andesite_bricks = new SimpleBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.STONE)
				.setUnlocalizedName("andesite_bricks").setHardness(1.5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		diorite_bricks = new SimpleBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.IRON)
				.setUnlocalizedName("diorite_bricks").setHardness(1.5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		sandy_bricks = new SimpleBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.SAND)
				.setUnlocalizedName("sandy_bricks").setHardness(2F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		sandy_stone_bricks = new SimpleBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.SAND)
				.setUnlocalizedName("sandy_stone_bricks").setHardness(1.5F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		// Nether bricks
		dark_nether_bricks = new SimpleBlock(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLACK)
				.setUnlocalizedName("dark_nether_bricks").setHardness(2F).setResistance(30F)
				.setCreativeTab(creativeTabBuilding);
		// Patterns
		wooden_pattern = new Item().setUnlocalizedName("wooden_pattern").setCreativeTab(creativeTab);
		wooden_pattern_bars = new Item().setUnlocalizedName("wooden_pattern_bars").setCreativeTab(creativeTab);
		wooden_pattern_button = new Item().setUnlocalizedName("wooden_pattern_button").setCreativeTab(creativeTab);
		wooden_pattern_pressure_plate = new Item().setUnlocalizedName("wooden_pattern_pressure_plate")
				.setCreativeTab(creativeTab);
		wooden_pattern_trapdoor = new Item().setUnlocalizedName("wooden_pattern_trapdoor").setCreativeTab(creativeTab);
		wooden_pattern_wall = new Item().setUnlocalizedName("wooden_pattern_wall").setCreativeTab(creativeTab);
		wooden_pattern_fence = new Item().setUnlocalizedName("wooden_pattern_fence").setCreativeTab(creativeTab);
		wooden_pattern_fence_gate = new Item().setUnlocalizedName("wooden_pattern_fence_gate")
				.setCreativeTab(creativeTab);
		wooden_pattern_stairs = new Item().setUnlocalizedName("wooden_pattern_stairs").setCreativeTab(creativeTab);
		// Buckets
		bucket_of_enderium = new BucketOfEnderium().setUnlocalizedName("bucket_of_enderium")
				.setCreativeTab(creativeTab);
	}

	public static void registerItemsAndBlocks() {
		// Register blocks
		// Mineral ores
		Registry.registerBlock(amethyst_ore);
		Registry.registerBlock(jade_ore);
		Registry.registerBlock(copper_ore);
		Registry.registerBlock(tin_ore);
		// Mineral blocks
		Registry.registerBlock(amethyst_block);
		Registry.registerBlock(jade_block);
		Registry.registerBlock(copper_block);
		Registry.registerBlock(tin_block);
		Registry.registerBlock(bronze_block);
		// Minerals
		Registry.registerItem(amethyst);
		Registry.registerItem(jade);
		Registry.registerItem(copper_ingot);
		Registry.registerItem(tin_ingot);
		Registry.registerItem(bronze_ingot);
		// Chests
		Registry.registerBlock(iron_chest);
		GameRegistry.registerTileEntity(TileEntityIronChest.class, "tile_enity_iron_chest");
		// Registry.registerBlock(gold_chest,
		// gold_chest.getUnlocalizedName().substring(5));
		// Registry.registerBlock(Items.DIAMOND_chest,
		// Items.DIAMOND_chest.getUnlocalizedName().substring(5));
		// Registry.registerBlock(amethyst_chest,
		// amethyst_chest.getUnlocalizedName().substring(5));
		// Presureplates
		Registry.registerBlock(diamond_pressure_plate);
		Registry.registerBlock(copper_pressure_plate);
		Registry.registerBlock(tin_pressure_plate);
		Registry.registerBlock(bronze_pressure_plate);
		Registry.registerBlock(amethyst_pressure_plate);
		Registry.registerBlock(jade_pressure_plate);
		Registry.registerBlock(emerald_pressure_plate);
		Registry.registerBlock(quartz_pressure_plate);
		// Bars
		Registry.registerBlock(stone_bars);
		Registry.registerBlock(gold_bars);
		Registry.registerBlock(diamond_bars);
		Registry.registerBlock(copper_bars);
		Registry.registerBlock(tin_bars);
		Registry.registerBlock(bronze_bars);
		Registry.registerBlock(amethyst_bars);
		Registry.registerBlock(jade_bars);
		Registry.registerBlock(emerald_bars);
		Registry.registerBlock(quartz_bars);
		// Trap doors
		Registry.registerBlock(stone_trapdoor);
		Registry.registerBlock(gold_trapdoor);
		Registry.registerBlock(diamond_trapdoor);
		Registry.registerBlock(copper_trapdoor);
		Registry.registerBlock(tin_trapdoor);
		Registry.registerBlock(bronze_trapdoor);
		Registry.registerBlock(amethyst_trapdoor);
		Registry.registerBlock(jade_trapdoor);
		Registry.registerBlock(emerald_trapdoor);
		Registry.registerBlock(quartz_trapdoor);
		// Buttons
		Registry.registerBlock(iron_button);
		Registry.registerBlock(gold_button);
		Registry.registerBlock(diamond_button);
		Registry.registerBlock(copper_button);
		Registry.registerBlock(tin_button);
		Registry.registerBlock(bronze_button);
		Registry.registerBlock(amethyst_button);
		Registry.registerBlock(jade_button);
		Registry.registerBlock(emerald_button);
		Registry.registerBlock(quartz_button);
		// Colour blocks
		Registry.registerBlock(colour_block_white, colour_block_white.getUnlocalizedName().substring(5));
		Registry.registerBlock(colour_block_light_gray, colour_block_light_gray.getUnlocalizedName().substring(5));
		Registry.registerBlock(colour_block_gray, colour_block_gray.getUnlocalizedName().substring(5));
		Registry.registerBlock(colour_block_black, colour_block_black.getUnlocalizedName().substring(5));
		Registry.registerBlock(colour_block_light_blue, colour_block_light_blue.getUnlocalizedName().substring(5));
		Registry.registerBlock(colour_block_cyan, colour_block_cyan.getUnlocalizedName().substring(5));
		Registry.registerBlock(colour_block_blue, colour_block_blue.getUnlocalizedName().substring(5));
		Registry.registerBlock(colour_block_light_green, colour_block_light_green.getUnlocalizedName().substring(5));
		Registry.registerBlock(colour_block_yellow, colour_block_yellow.getUnlocalizedName().substring(5));
		Registry.registerBlock(colour_block_orange, colour_block_orange.getUnlocalizedName().substring(5));
		Registry.registerBlock(colour_block_brown, colour_block_brown.getUnlocalizedName().substring(5));
		Registry.registerBlock(colour_block_magenta, colour_block_magenta.getUnlocalizedName().substring(5));
		Registry.registerBlock(colour_block_purple, colour_block_purple.getUnlocalizedName().substring(5));
		Registry.registerBlock(colour_block_red, colour_block_red.getUnlocalizedName().substring(5));
		Registry.registerBlock(colour_block_pink, colour_block_pink.getUnlocalizedName().substring(5));
		Registry.registerBlock(colour_block_green, colour_block_green.getUnlocalizedName().substring(5));
		Registry.registerBlock(colour_changing_block, colour_changing_block.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_colour_block_white,
				glowing_colour_block_white.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_colour_block_light_gray,
				glowing_colour_block_light_gray.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_colour_block_gray, glowing_colour_block_gray.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_colour_block_black,
				glowing_colour_block_black.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_colour_block_light_blue,
				glowing_colour_block_light_blue.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_colour_block_cyan, glowing_colour_block_cyan.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_colour_block_blue, glowing_colour_block_blue.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_colour_block_light_green,
				glowing_colour_block_light_green.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_colour_block_yellow,
				glowing_colour_block_yellow.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_colour_block_orange,
				glowing_colour_block_orange.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_colour_block_brown,
				glowing_colour_block_brown.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_colour_block_magenta,
				glowing_colour_block_magenta.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_colour_block_purple,
				glowing_colour_block_purple.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_colour_block_red, glowing_colour_block_red.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_colour_block_pink, glowing_colour_block_pink.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_colour_block_green,
				glowing_colour_block_green.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_colour_changing_block,
				glowing_colour_changing_block.getUnlocalizedName().substring(5));
		// Coloured stone bricks
		Registry.registerBlock(coloured_stone_bricks_white,
				coloured_stone_bricks_white.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_stone_bricks_light_gray,
				coloured_stone_bricks_light_gray.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_stone_bricks_gray,
				coloured_stone_bricks_gray.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_stone_bricks_black,
				coloured_stone_bricks_black.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_stone_bricks_light_blue,
				coloured_stone_bricks_light_blue.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_stone_bricks_cyan,
				coloured_stone_bricks_cyan.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_stone_bricks_blue,
				coloured_stone_bricks_blue.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_stone_bricks_light_green,
				coloured_stone_bricks_light_green.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_stone_bricks_yellow,
				coloured_stone_bricks_yellow.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_stone_bricks_orange,
				coloured_stone_bricks_orange.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_stone_bricks_brown,
				coloured_stone_bricks_brown.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_stone_bricks_magenta,
				coloured_stone_bricks_magenta.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_stone_bricks_purple,
				coloured_stone_bricks_purple.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_stone_bricks_red, coloured_stone_bricks_red.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_stone_bricks_pink,
				coloured_stone_bricks_pink.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_stone_bricks_green,
				coloured_stone_bricks_green.getUnlocalizedName().substring(5));
		Registry.registerBlock(colour_changing_stone_bricks,
				colour_changing_stone_bricks.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_stone_bricks_white,
				glowing_coloured_stone_bricks_white.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_stone_bricks_light_gray,
				glowing_coloured_stone_bricks_light_gray.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_stone_bricks_gray,
				glowing_coloured_stone_bricks_gray.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_stone_bricks_black,
				glowing_coloured_stone_bricks_black.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_stone_bricks_light_blue,
				glowing_coloured_stone_bricks_light_blue.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_stone_bricks_cyan,
				glowing_coloured_stone_bricks_cyan.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_stone_bricks_blue,
				glowing_coloured_stone_bricks_blue.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_stone_bricks_light_green,
				glowing_coloured_stone_bricks_light_green.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_stone_bricks_yellow,
				glowing_coloured_stone_bricks_yellow.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_stone_bricks_orange,
				glowing_coloured_stone_bricks_orange.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_stone_bricks_brown,
				glowing_coloured_stone_bricks_brown.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_stone_bricks_magenta,
				glowing_coloured_stone_bricks_magenta.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_stone_bricks_purple,
				glowing_coloured_stone_bricks_purple.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_stone_bricks_red,
				glowing_coloured_stone_bricks_red.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_stone_bricks_pink,
				glowing_coloured_stone_bricks_pink.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_stone_bricks_green,
				glowing_coloured_stone_bricks_green.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_colour_changing_stone_bricks,
				glowing_colour_changing_stone_bricks.getUnlocalizedName().substring(5));
		// Coloured stone
		Registry.registerBlock(coloured_stone_white, coloured_stone_white.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_stone_light_gray, coloured_stone_light_gray.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_stone_gray, coloured_stone_gray.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_stone_black, coloured_stone_black.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_stone_light_blue, coloured_stone_light_blue.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_stone_cyan, coloured_stone_cyan.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_stone_blue, coloured_stone_blue.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_stone_light_green,
				coloured_stone_light_green.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_stone_yellow, coloured_stone_yellow.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_stone_orange, coloured_stone_orange.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_stone_brown, coloured_stone_brown.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_stone_magenta, coloured_stone_magenta.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_stone_purple, coloured_stone_purple.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_stone_red, coloured_stone_red.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_stone_pink, coloured_stone_pink.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_stone_green, coloured_stone_green.getUnlocalizedName().substring(5));
		Registry.registerBlock(colour_changing_stone, colour_changing_stone.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_stone_white,
				glowing_coloured_stone_white.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_stone_light_gray,
				glowing_coloured_stone_light_gray.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_stone_gray,
				glowing_coloured_stone_gray.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_stone_black,
				glowing_coloured_stone_black.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_stone_light_blue,
				glowing_coloured_stone_light_blue.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_stone_cyan,
				glowing_coloured_stone_cyan.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_stone_blue,
				glowing_coloured_stone_blue.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_stone_light_green,
				glowing_coloured_stone_light_green.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_stone_yellow,
				glowing_coloured_stone_yellow.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_stone_orange,
				glowing_coloured_stone_orange.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_stone_brown,
				glowing_coloured_stone_brown.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_stone_magenta,
				glowing_coloured_stone_magenta.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_stone_purple,
				glowing_coloured_stone_purple.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_stone_red,
				glowing_coloured_stone_red.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_stone_pink,
				glowing_coloured_stone_pink.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_stone_green,
				glowing_coloured_stone_green.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_colour_changing_stone,
				glowing_colour_changing_stone.getUnlocalizedName().substring(5));
		// Coloured cobblestone
		Registry.registerBlock(coloured_cobblestone_white,
				coloured_cobblestone_white.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_cobblestone_light_gray,
				coloured_cobblestone_light_gray.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_cobblestone_gray, coloured_cobblestone_gray.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_cobblestone_black,
				coloured_cobblestone_black.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_cobblestone_light_blue,
				coloured_cobblestone_light_blue.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_cobblestone_cyan, coloured_cobblestone_cyan.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_cobblestone_blue, coloured_cobblestone_blue.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_cobblestone_light_green,
				coloured_cobblestone_light_green.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_cobblestone_yellow,
				coloured_cobblestone_yellow.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_cobblestone_orange,
				coloured_cobblestone_orange.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_cobblestone_brown,
				coloured_cobblestone_brown.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_cobblestone_magenta,
				coloured_cobblestone_magenta.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_cobblestone_purple,
				coloured_cobblestone_purple.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_cobblestone_red, coloured_cobblestone_red.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_cobblestone_pink, coloured_cobblestone_pink.getUnlocalizedName().substring(5));
		Registry.registerBlock(coloured_cobblestone_green,
				coloured_cobblestone_green.getUnlocalizedName().substring(5));
		Registry.registerBlock(colour_changing_cobblestone,
				colour_changing_cobblestone.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_cobblestone_white,
				glowing_coloured_cobblestone_white.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_cobblestone_light_gray,
				glowing_coloured_cobblestone_light_gray.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_cobblestone_gray,
				glowing_coloured_cobblestone_gray.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_cobblestone_black,
				glowing_coloured_cobblestone_black.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_cobblestone_light_blue,
				glowing_coloured_cobblestone_light_blue.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_cobblestone_cyan,
				glowing_coloured_cobblestone_cyan.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_cobblestone_blue,
				glowing_coloured_cobblestone_blue.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_cobblestone_light_green,
				glowing_coloured_cobblestone_light_green.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_cobblestone_yellow,
				glowing_coloured_cobblestone_yellow.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_cobblestone_orange,
				glowing_coloured_cobblestone_orange.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_cobblestone_brown,
				glowing_coloured_cobblestone_brown.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_cobblestone_magenta,
				glowing_coloured_cobblestone_magenta.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_cobblestone_purple,
				glowing_coloured_cobblestone_purple.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_cobblestone_red,
				glowing_coloured_cobblestone_red.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_cobblestone_pink,
				glowing_coloured_cobblestone_pink.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_coloured_cobblestone_green,
				glowing_coloured_cobblestone_green.getUnlocalizedName().substring(5));
		Registry.registerBlock(glowing_colour_changing_cobblestone,
				glowing_colour_changing_cobblestone.getUnlocalizedName().substring(5));
		// Seamless blocks
		Registry.registerBlock(seamless_stone_slab);
		Registry.registerBlock(seamless_oak_log);
		Registry.registerBlock(seamless_birch_log);
		Registry.registerBlock(seamless_spruce_log);
		Registry.registerBlock(seamless_jungle_log);
		Registry.registerBlock(seamless_acacia_log);
		Registry.registerBlock(seamless_dark_oak_log);
		Registry.registerBlock(seamless_smooth_sandstone);
		Registry.registerBlock(seamless_smooth_red_sandstone);
		// Map making blocks
		Registry.registerBlock(invisible_pressure_plate);
		Registry.registerBlock(glowing_barrier);
		Registry.registerBlock(glowing_air);
		Registry.registerBlock(block_of_death);
		// Machines
		Registry.registerBlock(crusher);
		// Flowers
		Registry.registerBlock(yellow_tulip);
		Registry.registerBlock(blue_tulip);
		Registry.registerBlock(black_tulip);
		Registry.registerBlock(green_tulip);
		Registry.registerBlock(purple_tulip);
		// Misc blocks
		Registry.registerBlock(null_block);
		Registry.registerBlock(scaffolding_block);
		Registry.registerBlock(colour_changing_wool);
		Registry.registerBlock(colour_changing_clay);
		Registry.registerBlock(colour_changing_glass);
		// Stone blocks
		Registry.registerBlock(basalt);
		Registry.registerBlock(basalt_bricks);
		Registry.registerBlock(polished_basalt);
		Registry.registerBlock(polished_stone);
		Registry.registerBlock(granite_bricks);
		Registry.registerBlock(andesite_bricks);
		Registry.registerBlock(diorite_bricks);
		Registry.registerBlock(sandy_bricks);
		Registry.registerBlock(sandy_stone_bricks);
		// Nether blocks
		Registry.registerBlock(dark_nether_bricks);
		// Patterns
		Registry.registerItem(wooden_pattern);
		Registry.registerItem(wooden_pattern_bars);
		Registry.registerItem(wooden_pattern_button);
		Registry.registerItem(wooden_pattern_pressure_plate);
		Registry.registerItem(wooden_pattern_trapdoor);
		Registry.registerItem(wooden_pattern_wall);
		Registry.registerItem(wooden_pattern_fence);
		Registry.registerItem(wooden_pattern_fence_gate);
		Registry.registerItem(wooden_pattern_stairs);
		// Buckets
		Registry.registerItem(bucket_of_enderium);
	}

	public static void registerRenders() {
		// Mineral ores
		Registry.registerRenderBlock(amethyst_ore);
		Registry.registerRenderBlock(jade_ore);
		Registry.registerRenderBlock(copper_ore);
		Registry.registerRenderBlock(tin_ore);
		// Mineral blocks
		Registry.registerRenderBlock(amethyst_block);
		Registry.registerRenderBlock(jade_block);
		Registry.registerRenderBlock(copper_block);
		Registry.registerRenderBlock(tin_block);
		Registry.registerRenderBlock(bronze_block);
		// Minerals
		Registry.registerRenderItem(amethyst);
		Registry.registerRenderItem(jade);
		Registry.registerRenderItem(copper_ingot);
		Registry.registerRenderItem(tin_ingot);
		Registry.registerRenderItem(bronze_ingot);

		// Chests
		// Registry.registerRenderBlock(iron_chest);
		// Registry.registerRenderBlock(gold_chest);
		// Registry.registerRenderBlock(Items.DIAMOND_chest);
		// Registry.registerRenderBlock(amethyst_chest);
		// Doors

		// Presureplates
		Registry.registerRenderBlock(diamond_pressure_plate);
		Registry.registerRenderBlock(copper_pressure_plate);
		Registry.registerRenderBlock(tin_pressure_plate);
		Registry.registerRenderBlock(bronze_pressure_plate);
		Registry.registerRenderBlock(amethyst_pressure_plate);
		Registry.registerRenderBlock(jade_pressure_plate);
		Registry.registerRenderBlock(emerald_pressure_plate);
		Registry.registerRenderBlock(quartz_pressure_plate);
		// Bars
		Registry.registerRenderBlock(stone_bars);
		Registry.registerRenderBlock(gold_bars);
		Registry.registerRenderBlock(diamond_bars);
		Registry.registerRenderBlock(copper_bars);
		Registry.registerRenderBlock(tin_bars);
		Registry.registerRenderBlock(bronze_bars);
		Registry.registerRenderBlock(amethyst_bars);
		Registry.registerRenderBlock(jade_bars);
		Registry.registerRenderBlock(emerald_bars);
		Registry.registerRenderBlock(quartz_bars);
		// Trap doors
		Registry.registerRenderBlock(stone_trapdoor);
		Registry.registerRenderBlock(gold_trapdoor);
		Registry.registerRenderBlock(diamond_trapdoor);
		Registry.registerRenderBlock(copper_trapdoor);
		Registry.registerRenderBlock(tin_trapdoor);
		Registry.registerRenderBlock(bronze_trapdoor);
		Registry.registerRenderBlock(amethyst_trapdoor);
		Registry.registerRenderBlock(jade_trapdoor);
		Registry.registerRenderBlock(emerald_trapdoor);
		Registry.registerRenderBlock(quartz_trapdoor);
		// Buttons
		Registry.registerRenderBlock(iron_button);
		Registry.registerRenderBlock(gold_button);
		Registry.registerRenderBlock(diamond_button);
		Registry.registerRenderBlock(copper_button);
		Registry.registerRenderBlock(tin_button);
		Registry.registerRenderBlock(bronze_button);
		Registry.registerRenderBlock(amethyst_button);
		Registry.registerRenderBlock(jade_button);
		Registry.registerRenderBlock(emerald_button);
		Registry.registerRenderBlock(quartz_button);
		// Colour blocks
		Registry.registerRenderBlock(colour_block_white);
		Registry.registerRenderBlock(colour_block_light_gray);
		Registry.registerRenderBlock(colour_block_gray);
		Registry.registerRenderBlock(colour_block_black);
		Registry.registerRenderBlock(colour_block_light_blue);
		Registry.registerRenderBlock(colour_block_cyan);
		Registry.registerRenderBlock(colour_block_blue);
		Registry.registerRenderBlock(colour_block_light_green);
		Registry.registerRenderBlock(colour_block_green);
		Registry.registerRenderBlock(colour_block_yellow);
		Registry.registerRenderBlock(colour_block_orange);
		Registry.registerRenderBlock(colour_block_brown);
		Registry.registerRenderBlock(colour_block_magenta);
		Registry.registerRenderBlock(colour_block_purple);
		Registry.registerRenderBlock(colour_block_red);
		Registry.registerRenderBlock(colour_block_pink);
		Registry.registerRenderBlock(colour_changing_block);
		Registry.registerRenderBlock(glowing_colour_block_white);
		Registry.registerRenderBlock(glowing_colour_block_light_gray);
		Registry.registerRenderBlock(glowing_colour_block_gray);
		Registry.registerRenderBlock(glowing_colour_block_black);
		Registry.registerRenderBlock(glowing_colour_block_light_blue);
		Registry.registerRenderBlock(glowing_colour_block_cyan);
		Registry.registerRenderBlock(glowing_colour_block_blue);
		Registry.registerRenderBlock(glowing_colour_block_light_green);
		Registry.registerRenderBlock(glowing_colour_block_green);
		Registry.registerRenderBlock(glowing_colour_block_yellow);
		Registry.registerRenderBlock(glowing_colour_block_orange);
		Registry.registerRenderBlock(glowing_colour_block_brown);
		Registry.registerRenderBlock(glowing_colour_block_magenta);
		Registry.registerRenderBlock(glowing_colour_block_purple);
		Registry.registerRenderBlock(glowing_colour_block_red);
		Registry.registerRenderBlock(glowing_colour_block_pink);
		Registry.registerRenderBlock(glowing_colour_changing_block);
		// Coloured stone bricks
		Registry.registerRenderBlock(coloured_stone_bricks_white);
		Registry.registerRenderBlock(coloured_stone_bricks_light_gray);
		Registry.registerRenderBlock(coloured_stone_bricks_gray);
		Registry.registerRenderBlock(coloured_stone_bricks_black);
		Registry.registerRenderBlock(coloured_stone_bricks_light_blue);
		Registry.registerRenderBlock(coloured_stone_bricks_cyan);
		Registry.registerRenderBlock(coloured_stone_bricks_blue);
		Registry.registerRenderBlock(coloured_stone_bricks_light_green);
		Registry.registerRenderBlock(coloured_stone_bricks_green);
		Registry.registerRenderBlock(coloured_stone_bricks_yellow);
		Registry.registerRenderBlock(coloured_stone_bricks_orange);
		Registry.registerRenderBlock(coloured_stone_bricks_brown);
		Registry.registerRenderBlock(coloured_stone_bricks_magenta);
		Registry.registerRenderBlock(coloured_stone_bricks_purple);
		Registry.registerRenderBlock(coloured_stone_bricks_red);
		Registry.registerRenderBlock(coloured_stone_bricks_pink);
		Registry.registerRenderBlock(colour_changing_stone_bricks);
		Registry.registerRenderBlock(glowing_coloured_stone_bricks_white);
		Registry.registerRenderBlock(glowing_coloured_stone_bricks_light_gray);
		Registry.registerRenderBlock(glowing_coloured_stone_bricks_gray);
		Registry.registerRenderBlock(glowing_coloured_stone_bricks_black);
		Registry.registerRenderBlock(glowing_coloured_stone_bricks_light_blue);
		Registry.registerRenderBlock(glowing_coloured_stone_bricks_cyan);
		Registry.registerRenderBlock(glowing_coloured_stone_bricks_blue);
		Registry.registerRenderBlock(glowing_coloured_stone_bricks_light_green);
		Registry.registerRenderBlock(glowing_coloured_stone_bricks_green);
		Registry.registerRenderBlock(glowing_coloured_stone_bricks_yellow);
		Registry.registerRenderBlock(glowing_coloured_stone_bricks_orange);
		Registry.registerRenderBlock(glowing_coloured_stone_bricks_brown);
		Registry.registerRenderBlock(glowing_coloured_stone_bricks_magenta);
		Registry.registerRenderBlock(glowing_coloured_stone_bricks_purple);
		Registry.registerRenderBlock(glowing_coloured_stone_bricks_red);
		Registry.registerRenderBlock(glowing_coloured_stone_bricks_pink);
		Registry.registerRenderBlock(glowing_colour_changing_stone_bricks);
		// Coloured stone
		Registry.registerRenderBlock(coloured_stone_white);
		Registry.registerRenderBlock(coloured_stone_light_gray);
		Registry.registerRenderBlock(coloured_stone_gray);
		Registry.registerRenderBlock(coloured_stone_black);
		Registry.registerRenderBlock(coloured_stone_light_blue);
		Registry.registerRenderBlock(coloured_stone_cyan);
		Registry.registerRenderBlock(coloured_stone_blue);
		Registry.registerRenderBlock(coloured_stone_light_green);
		Registry.registerRenderBlock(coloured_stone_green);
		Registry.registerRenderBlock(coloured_stone_yellow);
		Registry.registerRenderBlock(coloured_stone_orange);
		Registry.registerRenderBlock(coloured_stone_brown);
		Registry.registerRenderBlock(coloured_stone_magenta);
		Registry.registerRenderBlock(coloured_stone_purple);
		Registry.registerRenderBlock(coloured_stone_red);
		Registry.registerRenderBlock(coloured_stone_pink);
		Registry.registerRenderBlock(colour_changing_stone);
		Registry.registerRenderBlock(glowing_coloured_stone_white);
		Registry.registerRenderBlock(glowing_coloured_stone_light_gray);
		Registry.registerRenderBlock(glowing_coloured_stone_gray);
		Registry.registerRenderBlock(glowing_coloured_stone_black);
		Registry.registerRenderBlock(glowing_coloured_stone_light_blue);
		Registry.registerRenderBlock(glowing_coloured_stone_cyan);
		Registry.registerRenderBlock(glowing_coloured_stone_blue);
		Registry.registerRenderBlock(glowing_coloured_stone_light_green);
		Registry.registerRenderBlock(glowing_coloured_stone_green);
		Registry.registerRenderBlock(glowing_coloured_stone_yellow);
		Registry.registerRenderBlock(glowing_coloured_stone_orange);
		Registry.registerRenderBlock(glowing_coloured_stone_brown);
		Registry.registerRenderBlock(glowing_coloured_stone_magenta);
		Registry.registerRenderBlock(glowing_coloured_stone_purple);
		Registry.registerRenderBlock(glowing_coloured_stone_red);
		Registry.registerRenderBlock(glowing_coloured_stone_pink);
		Registry.registerRenderBlock(glowing_colour_changing_stone);
		// Coloured cobblestone
		Registry.registerRenderBlock(coloured_cobblestone_white);
		Registry.registerRenderBlock(coloured_cobblestone_light_gray);
		Registry.registerRenderBlock(coloured_cobblestone_gray);
		Registry.registerRenderBlock(coloured_cobblestone_black);
		Registry.registerRenderBlock(coloured_cobblestone_light_blue);
		Registry.registerRenderBlock(coloured_cobblestone_cyan);
		Registry.registerRenderBlock(coloured_cobblestone_blue);
		Registry.registerRenderBlock(coloured_cobblestone_light_green);
		Registry.registerRenderBlock(coloured_cobblestone_green);
		Registry.registerRenderBlock(coloured_cobblestone_yellow);
		Registry.registerRenderBlock(coloured_cobblestone_orange);
		Registry.registerRenderBlock(coloured_cobblestone_brown);
		Registry.registerRenderBlock(coloured_cobblestone_magenta);
		Registry.registerRenderBlock(coloured_cobblestone_purple);
		Registry.registerRenderBlock(coloured_cobblestone_red);
		Registry.registerRenderBlock(coloured_cobblestone_pink);
		Registry.registerRenderBlock(colour_changing_cobblestone);
		Registry.registerRenderBlock(glowing_coloured_cobblestone_white);
		Registry.registerRenderBlock(glowing_coloured_cobblestone_light_gray);
		Registry.registerRenderBlock(glowing_coloured_cobblestone_gray);
		Registry.registerRenderBlock(glowing_coloured_cobblestone_black);
		Registry.registerRenderBlock(glowing_coloured_cobblestone_light_blue);
		Registry.registerRenderBlock(glowing_coloured_cobblestone_cyan);
		Registry.registerRenderBlock(glowing_coloured_cobblestone_blue);
		Registry.registerRenderBlock(glowing_coloured_cobblestone_light_green);
		Registry.registerRenderBlock(glowing_coloured_cobblestone_green);
		Registry.registerRenderBlock(glowing_coloured_cobblestone_yellow);
		Registry.registerRenderBlock(glowing_coloured_cobblestone_orange);
		Registry.registerRenderBlock(glowing_coloured_cobblestone_brown);
		Registry.registerRenderBlock(glowing_coloured_cobblestone_magenta);
		Registry.registerRenderBlock(glowing_coloured_cobblestone_purple);
		Registry.registerRenderBlock(glowing_coloured_cobblestone_red);
		Registry.registerRenderBlock(glowing_coloured_cobblestone_pink);
		Registry.registerRenderBlock(glowing_colour_changing_cobblestone);
		// Seamless blocks
		Registry.registerRenderBlock(seamless_stone_slab);
		Registry.registerRenderBlock(seamless_oak_log);
		Registry.registerRenderBlock(seamless_birch_log);
		Registry.registerRenderBlock(seamless_spruce_log);
		Registry.registerRenderBlock(seamless_jungle_log);
		Registry.registerRenderBlock(seamless_acacia_log);
		Registry.registerRenderBlock(seamless_dark_oak_log);
		Registry.registerRenderBlock(seamless_smooth_sandstone);
		Registry.registerRenderBlock(seamless_smooth_red_sandstone);
		// Map making blocks
		Registry.registerRenderBlock(invisible_pressure_plate);
		Registry.registerRenderBlock(glowing_barrier);
		Registry.registerRenderBlock(glowing_air);
		Registry.registerRenderBlock(block_of_death);
		// Chest
		Registry.registerRenderBlock(iron_chest);
		// Machines
		Registry.registerRenderBlock(crusher);
		// Flowers
		Registry.registerRenderBlock(yellow_tulip);
		Registry.registerRenderBlock(blue_tulip);
		Registry.registerRenderBlock(black_tulip);
		Registry.registerRenderBlock(green_tulip);
		Registry.registerRenderBlock(purple_tulip);
		// Misc blocks
		Registry.registerRenderBlock(null_block);
		Registry.registerRenderBlock(scaffolding_block);
		Registry.registerRenderBlock(colour_changing_wool);
		Registry.registerRenderBlock(colour_changing_clay);
		Registry.registerRenderBlock(colour_changing_glass);
		// Stone blocks
		Registry.registerRenderBlock(basalt);
		Registry.registerRenderBlock(basalt_bricks);
		Registry.registerRenderBlock(polished_basalt);
		Registry.registerRenderBlock(polished_stone);
		Registry.registerRenderBlock(granite_bricks);
		Registry.registerRenderBlock(andesite_bricks);
		Registry.registerRenderBlock(diorite_bricks);
		Registry.registerRenderBlock(sandy_bricks);
		Registry.registerRenderBlock(sandy_stone_bricks);
		// Nether blocks
		Registry.registerRenderBlock(dark_nether_bricks);
		// Patterns
		Registry.registerRenderItem(wooden_pattern);
		Registry.registerRenderItem(wooden_pattern_bars);
		Registry.registerRenderItem(wooden_pattern_button);
		Registry.registerRenderItem(wooden_pattern_pressure_plate);
		Registry.registerRenderItem(wooden_pattern_trapdoor);
		Registry.registerRenderItem(wooden_pattern_wall);
		Registry.registerRenderItem(wooden_pattern_fence);
		Registry.registerRenderItem(wooden_pattern_fence_gate);
		Registry.registerRenderItem(wooden_pattern_stairs);
		// Buckets
		Registry.registerRenderItem(bucket_of_enderium);
	}

	public static void removeCrafting() {
		if (Config.crafting == true) {
			RecipeRemover.removeCraftingRecipeBlockWithMetadata(Blocks.STONE, 2);
			RecipeRemover.removeCraftingRecipeBlockWithMetadata(Blocks.STONE, 4);
			RecipeRemover.removeCraftingRecipeBlockWithMetadata(Blocks.STONE, 6);
		}
	}

	public static void registerGuiHandlers() {
		NetworkRegistry.INSTANCE.registerGuiHandler(Reference.modid, new GuiHandlerIronChest());
		NetworkRegistry.INSTANCE.registerGuiHandler(Reference.modid, new GuiHandlerCrusher());
	}

	public static void registerEventHandlers() {
		MinecraftForge.EVENT_BUS.register(new Shield(0, null, creativeTab));
	}

	public static void crafting() {
		if (Config.crafting == true) {
			// Mineral blocks
			GameRegistry.addRecipe(new ItemStack(ModElements.amethyst_block), "AAA", "AAA", "AAA", 'A',
					ModElements.amethyst);
			GameRegistry.addRecipe(new ItemStack(ModElements.jade_block), "JJJ", "JJJ", "JJJ", 'J', ModElements.jade);
			GameRegistry.addRecipe(new ItemStack(ModElements.copper_block), "CCC", "CCC", "CCC", 'C',
					ModElements.copper_ingot);
			GameRegistry.addRecipe(new ItemStack(ModElements.tin_block), "TTT", "TTT", "TTT", 'T',
					ModElements.tin_ingot);
			GameRegistry.addRecipe(new ItemStack(ModElements.bronze_block), "BBB", "BBB", "BBB", 'B',
					ModElements.bronze_ingot);
			// Minerals
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.amethyst, 9),
					new ItemStack(ModElements.amethyst_block));
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.jade, 9), new ItemStack(ModElements.jade_block));
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.copper_ingot, 9),
					new ItemStack(ModElements.copper_block));
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.tin_ingot, 9),
					new ItemStack(ModElements.tin_block));
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.bronze_ingot, 9),
					new ItemStack(ModElements.bronze_block));
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.bronze_ingot, 1),
					new Object[] { ModElements.tin_ingot, ModElements.copper_ingot, ModElements.copper_ingot,
							ModElements.copper_ingot });
			GameRegistry.addSmelting(ModElements.amethyst_ore, new ItemStack(ModElements.amethyst), 1.2F);
			GameRegistry.addSmelting(ModElements.jade_ore, new ItemStack(ModElements.jade), 1.2F);
			GameRegistry.addSmelting(ModElements.copper_ore, new ItemStack(ModElements.copper_ingot), 0.7F);
			GameRegistry.addSmelting(ModElements.tin_ore, new ItemStack(ModElements.tin_ingot), 0.7F);

			// Pressure plates
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.diamond_pressure_plate),
					new Object[] { ModElements.wooden_pattern_pressure_plate, Items.DIAMOND });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.copper_pressure_plate),
					new Object[] { ModElements.wooden_pattern_pressure_plate, ModElements.copper_ingot });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.tin_pressure_plate),
					new Object[] { ModElements.wooden_pattern_pressure_plate, ModElements.tin_ingot });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.bronze_pressure_plate),
					new Object[] { ModElements.wooden_pattern_pressure_plate, ModElements.bronze_ingot });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.amethyst_pressure_plate),
					new Object[] { ModElements.wooden_pattern_pressure_plate, ModElements.amethyst });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.jade_pressure_plate),
					new Object[] { ModElements.wooden_pattern_pressure_plate, ModElements.jade });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.emerald_pressure_plate),
					new Object[] { ModElements.wooden_pattern_pressure_plate, Items.EMERALD });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.bronze_pressure_plate),
					new Object[] { ModElements.wooden_pattern_pressure_plate, Items.QUARTZ });
			// Bars
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.stone_bars),
					new Object[] { ModElements.wooden_pattern_bars, Blocks.STONE });
			if (Config.craft_vanilla_blocks_with_patterns == true) {
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.IRON_BARS),
						new Object[] { ModElements.wooden_pattern_bars, Items.IRON_INGOT });
			}
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.gold_bars),
					new Object[] { ModElements.wooden_pattern_bars, Items.GOLD_INGOT });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.diamond_bars),
					new Object[] { ModElements.wooden_pattern_bars, Items.DIAMOND });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.copper_bars),
					new Object[] { ModElements.wooden_pattern_bars, ModElements.copper_ingot });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.tin_bars),
					new Object[] { ModElements.wooden_pattern_bars, ModElements.tin_ingot });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.bronze_bars),
					new Object[] { ModElements.wooden_pattern_bars, ModElements.bronze_ingot });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.amethyst_bars),
					new Object[] { ModElements.wooden_pattern_bars, ModElements.amethyst });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.jade_bars),
					new Object[] { ModElements.wooden_pattern_bars, ModElements.jade });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.emerald_bars),
					new Object[] { ModElements.wooden_pattern_bars, Items.EMERALD });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.quartz_bars),
					new Object[] { ModElements.wooden_pattern_bars, Items.QUARTZ });
			// Trap doors
			if (Config.craft_vanilla_blocks_with_patterns == true) {
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.TRAPDOOR),
						new Object[] { ModElements.wooden_pattern_trapdoor, Blocks.PLANKS });
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.IRON_TRAPDOOR),
						new Object[] { ModElements.wooden_pattern_trapdoor, Items.IRON_INGOT });
			}
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.stone_trapdoor),
					new Object[] { ModElements.wooden_pattern_trapdoor, Blocks.STONE });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.gold_trapdoor),
					new Object[] { ModElements.wooden_pattern_trapdoor, Items.GOLD_INGOT });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.diamond_trapdoor),
					new Object[] { ModElements.wooden_pattern_trapdoor, Items.DIAMOND });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.emerald_trapdoor),
					new Object[] { ModElements.wooden_pattern_trapdoor, Items.EMERALD });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.quartz_trapdoor),
					new Object[] { ModElements.wooden_pattern_trapdoor, Items.QUARTZ });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.copper_trapdoor),
					new Object[] { ModElements.wooden_pattern_trapdoor, ModElements.copper_ingot });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.tin_trapdoor),
					new Object[] { ModElements.wooden_pattern_trapdoor, ModElements.tin_ingot });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.bronze_trapdoor),
					new Object[] { ModElements.wooden_pattern_trapdoor, ModElements.bronze_ingot });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.amethyst_trapdoor),
					new Object[] { ModElements.wooden_pattern_trapdoor, ModElements.amethyst });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.jade_trapdoor),
					new Object[] { ModElements.wooden_pattern_trapdoor, ModElements.jade });
			// Buttons
			if (Config.craft_vanilla_blocks_with_patterns == true) {
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOODEN_BUTTON),
						new Object[] { ModElements.wooden_pattern_button, Blocks.PLANKS });
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE_BUTTON),
						new Object[] { ModElements.wooden_pattern_button, Blocks.STONE });
			}
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.iron_button),
					new Object[] { ModElements.wooden_pattern_button, Items.IRON_INGOT });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.gold_button),
					new Object[] { ModElements.wooden_pattern_button, Items.GOLD_INGOT });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.diamond_button),
					new Object[] { ModElements.wooden_pattern_button, Items.DIAMOND });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.copper_button),
					new Object[] { ModElements.wooden_pattern_button, ModElements.copper_ingot });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.tin_button),
					new Object[] { ModElements.wooden_pattern_button, ModElements.tin_ingot });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.bronze_button),
					new Object[] { ModElements.wooden_pattern_button, ModElements.bronze_ingot });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.amethyst_button),
					new Object[] { ModElements.wooden_pattern_button, ModElements.amethyst });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.jade_button),
					new Object[] { ModElements.wooden_pattern_button, ModElements.jade });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.emerald_button),
					new Object[] { ModElements.wooden_pattern_button, Items.EMERALD });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.quartz_button),
					new Object[] { ModElements.wooden_pattern_button, Items.QUARTZ });
			// Fence
			if (Config.craft_vanilla_blocks_with_patterns == true) {
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.OAK_FENCE),
						new Object[] { ModElements.wooden_pattern_fence, new ItemStack(Blocks.PLANKS, 1, 0) });
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SPRUCE_FENCE),
						new Object[] { ModElements.wooden_pattern_fence, new ItemStack(Blocks.PLANKS, 1, 1) });
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.BIRCH_FENCE),
						new Object[] { ModElements.wooden_pattern_fence, new ItemStack(Blocks.PLANKS, 1, 2) });
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.JUNGLE_FENCE),
						new Object[] { ModElements.wooden_pattern_fence, new ItemStack(Blocks.PLANKS, 1, 3) });
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.ACACIA_FENCE),
						new Object[] { ModElements.wooden_pattern_fence, new ItemStack(Blocks.PLANKS, 1, 4) });
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.DARK_OAK_FENCE),
						new Object[] { ModElements.wooden_pattern_fence, new ItemStack(Blocks.PLANKS, 1, 5) });
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.NETHER_BRICK_FENCE),
						new Object[] { ModElements.wooden_pattern_fence, Blocks.NETHER_BRICK });
			}

			// Colour blocks
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.colour_block_white, 4),
					new Object[] { new ItemStack(ModElements.tin_ingot), new ItemStack(ModElements.tin_ingot),
							new ItemStack(Items.IRON_INGOT), new ItemStack(Items.IRON_INGOT) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.colour_block_black, 1),
					new Object[] { new ItemStack(ModElements.colour_block_white), new ItemStack(Items.DYE, 1, 0) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.colour_block_light_gray, 1),
					new Object[] { new ItemStack(ModElements.colour_block_white), new ItemStack(Items.DYE, 1, 7) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.colour_block_gray, 1),
					new Object[] { new ItemStack(ModElements.colour_block_white), new ItemStack(Items.DYE, 1, 8) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.colour_block_light_blue, 1),
					new Object[] { new ItemStack(ModElements.colour_block_white), new ItemStack(Items.DYE, 1, 12) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.colour_block_cyan, 1),
					new Object[] { new ItemStack(ModElements.colour_block_white), new ItemStack(Items.DYE, 1, 6) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.colour_block_blue, 1),
					new Object[] { new ItemStack(ModElements.colour_block_white), new ItemStack(Items.DYE, 1, 4) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.colour_block_light_green, 1),
					new Object[] { new ItemStack(ModElements.colour_block_white), new ItemStack(Items.DYE, 1, 10) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.colour_block_green, 1),
					new Object[] { new ItemStack(ModElements.colour_block_white), new ItemStack(Items.DYE, 1, 2) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.colour_block_red, 1),
					new Object[] { new ItemStack(ModElements.colour_block_white), new ItemStack(Items.DYE, 1, 1) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.colour_block_orange, 1),
					new Object[] { new ItemStack(ModElements.colour_block_white), new ItemStack(Items.DYE, 1, 14) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.colour_block_brown, 1),
					new Object[] { new ItemStack(ModElements.colour_block_white), new ItemStack(Items.DYE, 1, 3) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.colour_block_magenta, 1),
					new Object[] { new ItemStack(ModElements.colour_block_white), new ItemStack(Items.DYE, 1, 13) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.colour_block_purple, 1),
					new Object[] { new ItemStack(ModElements.colour_block_white), new ItemStack(Items.DYE, 1, 5) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.colour_block_yellow, 1),
					new Object[] { new ItemStack(ModElements.colour_block_white), new ItemStack(Items.DYE, 1, 11) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.colour_block_pink, 1),
					new Object[] { new ItemStack(ModElements.colour_block_white), new ItemStack(Items.DYE, 1, 9) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.colour_block_white, 1),
					new Object[] { new ItemStack(ModElements.colour_block_black) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.colour_block_white, 1),
					new Object[] { new ItemStack(ModElements.colour_block_light_gray) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.colour_block_white, 1),
					new Object[] { new ItemStack(ModElements.colour_block_gray) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.colour_block_white, 1),
					new Object[] { new ItemStack(ModElements.colour_block_light_blue) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.colour_block_white, 1),
					new Object[] { new ItemStack(ModElements.colour_block_cyan) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.colour_block_white, 1),
					new Object[] { new ItemStack(ModElements.colour_block_blue) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.colour_block_white, 1),
					new Object[] { new ItemStack(ModElements.colour_block_light_green) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.colour_block_white, 1),
					new Object[] { new ItemStack(ModElements.colour_block_green) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.colour_block_white, 1),
					new Object[] { new ItemStack(ModElements.colour_block_red) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.colour_block_white, 1),
					new Object[] { new ItemStack(ModElements.colour_block_orange) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.colour_block_white, 1),
					new Object[] { new ItemStack(ModElements.colour_block_brown) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.colour_block_white, 1),
					new Object[] { new ItemStack(ModElements.colour_block_magenta) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.colour_block_white, 1),
					new Object[] { new ItemStack(ModElements.colour_block_purple) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.colour_block_white, 1),
					new Object[] { new ItemStack(ModElements.colour_block_yellow) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.colour_block_white, 1),
					new Object[] { new ItemStack(ModElements.colour_block_pink) });
			GameRegistry.addRecipe(new ItemStack(ModElements.colour_changing_block), " D ", "DCD", " D ", 'D',
					Items.DYE, 'C', ModElements.colour_block_white);
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_colour_block_white, 1),
					new Object[] { new ItemStack(ModElements.colour_block_white), new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_colour_block_black, 1), new Object[] {
					new ItemStack(ModElements.glowing_colour_block_white), new ItemStack(Items.DYE, 1, 0) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_colour_block_light_gray, 1),
					new Object[] { new ItemStack(ModElements.glowing_colour_block_white),
							new ItemStack(Items.DYE, 1, 7) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_colour_block_gray, 1), new Object[] {
					new ItemStack(ModElements.glowing_colour_block_white), new ItemStack(Items.DYE, 1, 8) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_colour_block_light_blue, 1),
					new Object[] { new ItemStack(ModElements.glowing_colour_block_white),
							new ItemStack(Items.DYE, 1, 12) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_colour_block_cyan, 1), new Object[] {
					new ItemStack(ModElements.glowing_colour_block_white), new ItemStack(Items.DYE, 1, 6) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_colour_block_blue, 1), new Object[] {
					new ItemStack(ModElements.glowing_colour_block_white), new ItemStack(Items.DYE, 1, 4) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_colour_block_light_green, 1),
					new Object[] { new ItemStack(ModElements.glowing_colour_block_white),
							new ItemStack(Items.DYE, 1, 10) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_colour_block_green, 1), new Object[] {
					new ItemStack(ModElements.glowing_colour_block_white), new ItemStack(Items.DYE, 1, 2) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_colour_block_red, 1), new Object[] {
					new ItemStack(ModElements.glowing_colour_block_white), new ItemStack(Items.DYE, 1, 1) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_colour_block_orange, 1), new Object[] {
					new ItemStack(ModElements.glowing_colour_block_white), new ItemStack(Items.DYE, 1, 14) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_colour_block_brown, 1), new Object[] {
					new ItemStack(ModElements.glowing_colour_block_white), new ItemStack(Items.DYE, 1, 3) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_colour_block_magenta, 1), new Object[] {
					new ItemStack(ModElements.glowing_colour_block_white), new ItemStack(Items.DYE, 1, 13) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_colour_block_purple, 1), new Object[] {
					new ItemStack(ModElements.glowing_colour_block_white), new ItemStack(Items.DYE, 1, 5) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_colour_block_yellow, 1), new Object[] {
					new ItemStack(ModElements.glowing_colour_block_white), new ItemStack(Items.DYE, 1, 11) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_colour_block_pink, 1), new Object[] {
					new ItemStack(ModElements.glowing_colour_block_white), new ItemStack(Items.DYE, 1, 9) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_colour_block_white, 1),
					new Object[] { new ItemStack(ModElements.glowing_colour_block_black) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_colour_block_white, 1),
					new Object[] { new ItemStack(ModElements.glowing_colour_block_light_gray) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_colour_block_white, 1),
					new Object[] { new ItemStack(ModElements.glowing_colour_block_gray) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_colour_block_white, 1),
					new Object[] { new ItemStack(ModElements.glowing_colour_block_light_blue) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_colour_block_white, 1),
					new Object[] { new ItemStack(ModElements.glowing_colour_block_cyan) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_colour_block_white, 1),
					new Object[] { new ItemStack(ModElements.glowing_colour_block_blue) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_colour_block_white, 1),
					new Object[] { new ItemStack(ModElements.glowing_colour_block_light_green) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_colour_block_white, 1),
					new Object[] { new ItemStack(ModElements.glowing_colour_block_green) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_colour_block_white, 1),
					new Object[] { new ItemStack(ModElements.glowing_colour_block_red) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_colour_block_white, 1),
					new Object[] { new ItemStack(ModElements.glowing_colour_block_orange) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_colour_block_white, 1),
					new Object[] { new ItemStack(ModElements.glowing_colour_block_brown) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_colour_block_white, 1),
					new Object[] { new ItemStack(ModElements.glowing_colour_block_magenta) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_colour_block_white, 1),
					new Object[] { new ItemStack(ModElements.glowing_colour_block_purple) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_colour_block_white, 1),
					new Object[] { new ItemStack(ModElements.glowing_colour_block_yellow) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_colour_block_white, 1),
					new Object[] { new ItemStack(ModElements.glowing_colour_block_pink) });
			GameRegistry.addRecipe(new ItemStack(ModElements.glowing_colour_changing_block), " D ", "DCD", " D ", 'D',
					Items.DYE, 'C', ModElements.glowing_colour_block_white);
			// Coloured stone bricks
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_stone_bricks_white, 1),
					new Object[] { new ItemStack(Blocks.STONEBRICK), new ItemStack(Items.DYE, 1, 15) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_stone_bricks_black, 1),
					new Object[] { new ItemStack(Blocks.STONEBRICK), new ItemStack(Items.DYE, 1, 0) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_stone_bricks_light_gray, 1),
					new Object[] { new ItemStack(Blocks.STONEBRICK), new ItemStack(Items.DYE, 1, 7) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_stone_bricks_gray, 1),
					new Object[] { new ItemStack(Blocks.STONEBRICK), new ItemStack(Items.DYE, 1, 8) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_stone_bricks_light_blue, 1),
					new Object[] { new ItemStack(Blocks.STONEBRICK), new ItemStack(Items.DYE, 1, 12) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_stone_bricks_cyan, 1),
					new Object[] { new ItemStack(Blocks.STONEBRICK), new ItemStack(Items.DYE, 1, 6) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_stone_bricks_blue, 1),
					new Object[] { new ItemStack(Blocks.STONEBRICK), new ItemStack(Items.DYE, 1, 4) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_stone_bricks_light_green, 1),
					new Object[] { new ItemStack(Blocks.STONEBRICK), new ItemStack(Items.DYE, 1, 10) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_stone_bricks_green, 1),
					new Object[] { new ItemStack(Blocks.STONEBRICK), new ItemStack(Items.DYE, 1, 2) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_stone_bricks_red, 1),
					new Object[] { new ItemStack(Blocks.STONEBRICK), new ItemStack(Items.DYE, 1, 1) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_stone_bricks_orange, 1),
					new Object[] { new ItemStack(Blocks.STONEBRICK), new ItemStack(Items.DYE, 1, 14) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_stone_bricks_brown, 1),
					new Object[] { new ItemStack(Blocks.STONEBRICK), new ItemStack(Items.DYE, 1, 3) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_stone_bricks_magenta, 1),
					new Object[] { new ItemStack(Blocks.STONEBRICK), new ItemStack(Items.DYE, 1, 13) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_stone_bricks_purple, 1),
					new Object[] { new ItemStack(Blocks.STONEBRICK), new ItemStack(Items.DYE, 1, 5) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_stone_bricks_yellow, 1),
					new Object[] { new ItemStack(Blocks.STONEBRICK), new ItemStack(Items.DYE, 1, 11) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_stone_bricks_pink, 1),
					new Object[] { new ItemStack(Blocks.STONEBRICK), new ItemStack(Items.DYE, 1, 9) });
			GameRegistry.addRecipe(new ItemStack(ModElements.colour_changing_stone_bricks), " D ", "DSD", " D ", 'D',
					Items.DYE, 'S', Blocks.STONEBRICK);
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_stone_bricks_white, 1),
					new Object[] { new ItemStack(Blocks.STONEBRICK), new ItemStack(Items.DYE, 1, 15),
							new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_stone_bricks_black, 1),
					new Object[] { new ItemStack(Blocks.STONEBRICK), new ItemStack(Items.DYE, 1, 0),
							new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_stone_bricks_light_gray, 1),
					new Object[] { new ItemStack(Blocks.STONEBRICK), new ItemStack(Items.DYE, 1, 7),
							new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_stone_bricks_gray, 1),
					new Object[] { new ItemStack(Blocks.STONEBRICK), new ItemStack(Items.DYE, 1, 8),
							new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_stone_bricks_light_blue, 1),
					new Object[] { new ItemStack(Blocks.STONEBRICK), new ItemStack(Items.DYE, 1, 12),
							new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_stone_bricks_cyan, 1),
					new Object[] { new ItemStack(Blocks.STONEBRICK), new ItemStack(Items.DYE, 1, 6),
							new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_stone_bricks_blue, 1),
					new Object[] { new ItemStack(Blocks.STONEBRICK), new ItemStack(Items.DYE, 1, 4),
							new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_stone_bricks_light_green, 1),
					new Object[] { new ItemStack(Blocks.STONEBRICK), new ItemStack(Items.DYE, 1, 10),
							new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_stone_bricks_green, 1),
					new Object[] { new ItemStack(Blocks.STONEBRICK), new ItemStack(Items.DYE, 1, 2),
							new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_stone_bricks_red, 1),
					new Object[] { new ItemStack(Blocks.STONEBRICK), new ItemStack(Items.DYE, 1, 1),
							new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_stone_bricks_orange, 1),
					new Object[] { new ItemStack(Blocks.STONEBRICK), new ItemStack(Items.DYE, 1, 14),
							new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_stone_bricks_brown, 1),
					new Object[] { new ItemStack(Blocks.STONEBRICK), new ItemStack(Items.DYE, 1, 3),
							new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_stone_bricks_magenta, 1),
					new Object[] { new ItemStack(Blocks.STONEBRICK), new ItemStack(Items.DYE, 1, 13),
							new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_stone_bricks_purple, 1),
					new Object[] { new ItemStack(Blocks.STONEBRICK), new ItemStack(Items.DYE, 1, 5),
							new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_stone_bricks_yellow, 1),
					new Object[] { new ItemStack(Blocks.STONEBRICK), new ItemStack(Items.DYE, 1, 11),
							new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_stone_bricks_pink, 1),
					new Object[] { new ItemStack(Blocks.STONEBRICK), new ItemStack(Items.DYE, 1, 9),
							new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addRecipe(new ItemStack(ModElements.glowing_colour_changing_stone_bricks), "GDG", "DSD", "GDG",
					'D', Items.DYE, 'S', Blocks.STONEBRICK, 'G', Blocks.GLOWSTONE);
			GameRegistry.addRecipe(new ItemStack(ModElements.glowing_colour_changing_stone_bricks), "DGD", "GSG", "DGD",
					'D', Items.DYE, 'S', Blocks.STONEBRICK, 'G', Blocks.GLOWSTONE);
			// Coloured stone
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_stone_white, 1),
					new Object[] { new ItemStack(Blocks.STONE), new ItemStack(Items.DYE, 1, 15) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_stone_black, 1),
					new Object[] { new ItemStack(Blocks.STONE), new ItemStack(Items.DYE, 1, 0) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_stone_light_gray, 1),
					new Object[] { new ItemStack(Blocks.STONE), new ItemStack(Items.DYE, 1, 7) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_stone_gray, 1),
					new Object[] { new ItemStack(Blocks.STONE), new ItemStack(Items.DYE, 1, 8) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_stone_light_blue, 1),
					new Object[] { new ItemStack(Blocks.STONE), new ItemStack(Items.DYE, 1, 12) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_stone_cyan, 1),
					new Object[] { new ItemStack(Blocks.STONE), new ItemStack(Items.DYE, 1, 6) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_stone_blue, 1),
					new Object[] { new ItemStack(Blocks.STONE), new ItemStack(Items.DYE, 1, 4) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_stone_light_green, 1),
					new Object[] { new ItemStack(Blocks.STONE), new ItemStack(Items.DYE, 1, 10) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_stone_green, 1),
					new Object[] { new ItemStack(Blocks.STONE), new ItemStack(Items.DYE, 1, 2) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_stone_red, 1),
					new Object[] { new ItemStack(Blocks.STONE), new ItemStack(Items.DYE, 1, 1) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_stone_orange, 1),
					new Object[] { new ItemStack(Blocks.STONE), new ItemStack(Items.DYE, 1, 14) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_stone_brown, 1),
					new Object[] { new ItemStack(Blocks.STONE), new ItemStack(Items.DYE, 1, 3) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_stone_magenta, 1),
					new Object[] { new ItemStack(Blocks.STONE), new ItemStack(Items.DYE, 1, 13) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_stone_purple, 1),
					new Object[] { new ItemStack(Blocks.STONE), new ItemStack(Items.DYE, 1, 5) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_stone_yellow, 1),
					new Object[] { new ItemStack(Blocks.STONE), new ItemStack(Items.DYE, 1, 11) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_stone_pink, 1),
					new Object[] { new ItemStack(Blocks.STONE), new ItemStack(Items.DYE, 1, 9) });
			GameRegistry.addRecipe(new ItemStack(ModElements.colour_changing_stone), " D ", "DSD", " D ", 'D',
					Items.DYE, 'S', Blocks.STONE);
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_stone_white, 1), new Object[] {
					new ItemStack(Blocks.STONE), new ItemStack(Items.DYE, 1, 15), new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_stone_black, 1), new Object[] {
					new ItemStack(Blocks.STONE), new ItemStack(Items.DYE, 1, 0), new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_stone_light_gray, 1),
					new Object[] { new ItemStack(Blocks.STONE), new ItemStack(Items.DYE, 1, 7),
							new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_stone_gray, 1), new Object[] {
					new ItemStack(Blocks.STONE), new ItemStack(Items.DYE, 1, 8), new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_stone_light_blue, 1),
					new Object[] { new ItemStack(Blocks.STONE), new ItemStack(Items.DYE, 1, 12),
							new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_stone_cyan, 1), new Object[] {
					new ItemStack(Blocks.STONE), new ItemStack(Items.DYE, 1, 6), new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_stone_blue, 1), new Object[] {
					new ItemStack(Blocks.STONE), new ItemStack(Items.DYE, 1, 4), new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_stone_light_green, 1),
					new Object[] { new ItemStack(Blocks.STONE), new ItemStack(Items.DYE, 1, 10),
							new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_stone_green, 1), new Object[] {
					new ItemStack(Blocks.STONE), new ItemStack(Items.DYE, 1, 2), new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_stone_red, 1), new Object[] {
					new ItemStack(Blocks.STONE), new ItemStack(Items.DYE, 1, 1), new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_stone_orange, 1), new Object[] {
					new ItemStack(Blocks.STONE), new ItemStack(Items.DYE, 1, 14), new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_stone_brown, 1), new Object[] {
					new ItemStack(Blocks.STONE), new ItemStack(Items.DYE, 1, 3), new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_stone_magenta, 1), new Object[] {
					new ItemStack(Blocks.STONE), new ItemStack(Items.DYE, 1, 13), new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_stone_purple, 1), new Object[] {
					new ItemStack(Blocks.STONE), new ItemStack(Items.DYE, 1, 5), new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_stone_yellow, 1), new Object[] {
					new ItemStack(Blocks.STONE), new ItemStack(Items.DYE, 1, 11), new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_stone_pink, 1), new Object[] {
					new ItemStack(Blocks.STONE), new ItemStack(Items.DYE, 1, 9), new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addRecipe(new ItemStack(ModElements.glowing_colour_changing_stone), "GDG", "DSD", "GDG", 'D',
					Items.DYE, 'S', Blocks.STONE, 'G', Blocks.GLOWSTONE);
			GameRegistry.addRecipe(new ItemStack(ModElements.glowing_colour_changing_stone), "DGD", "GSG", "DGD", 'D',
					Items.DYE, 'S', Blocks.STONE, 'G', Blocks.GLOWSTONE);
			// Coloured cobblestone
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_cobblestone_white, 1),
					new Object[] { new ItemStack(Blocks.COBBLESTONE), new ItemStack(Items.DYE, 1, 15) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_cobblestone_black, 1),
					new Object[] { new ItemStack(Blocks.COBBLESTONE), new ItemStack(Items.DYE, 1, 0) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_cobblestone_light_gray, 1),
					new Object[] { new ItemStack(Blocks.COBBLESTONE), new ItemStack(Items.DYE, 1, 7) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_cobblestone_gray, 1),
					new Object[] { new ItemStack(Blocks.COBBLESTONE), new ItemStack(Items.DYE, 1, 8) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_cobblestone_light_blue, 1),
					new Object[] { new ItemStack(Blocks.COBBLESTONE), new ItemStack(Items.DYE, 1, 12) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_cobblestone_cyan, 1),
					new Object[] { new ItemStack(Blocks.COBBLESTONE), new ItemStack(Items.DYE, 1, 6) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_cobblestone_blue, 1),
					new Object[] { new ItemStack(Blocks.COBBLESTONE), new ItemStack(Items.DYE, 1, 4) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_cobblestone_light_green, 1),
					new Object[] { new ItemStack(Blocks.COBBLESTONE), new ItemStack(Items.DYE, 1, 10) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_cobblestone_green, 1),
					new Object[] { new ItemStack(Blocks.COBBLESTONE), new ItemStack(Items.DYE, 1, 2) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_cobblestone_red, 1),
					new Object[] { new ItemStack(Blocks.COBBLESTONE), new ItemStack(Items.DYE, 1, 1) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_cobblestone_orange, 1),
					new Object[] { new ItemStack(Blocks.COBBLESTONE), new ItemStack(Items.DYE, 1, 14) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_cobblestone_brown, 1),
					new Object[] { new ItemStack(Blocks.COBBLESTONE), new ItemStack(Items.DYE, 1, 3) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_cobblestone_magenta, 1),
					new Object[] { new ItemStack(Blocks.COBBLESTONE), new ItemStack(Items.DYE, 1, 13) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_cobblestone_purple, 1),
					new Object[] { new ItemStack(Blocks.COBBLESTONE), new ItemStack(Items.DYE, 1, 5) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_cobblestone_yellow, 1),
					new Object[] { new ItemStack(Blocks.COBBLESTONE), new ItemStack(Items.DYE, 1, 11) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.coloured_cobblestone_pink, 1),
					new Object[] { new ItemStack(Blocks.COBBLESTONE), new ItemStack(Items.DYE, 1, 9) });
			GameRegistry.addRecipe(new ItemStack(ModElements.colour_changing_cobblestone), " D ", "DCD", " D ", 'D',
					Items.DYE, 'C', Blocks.COBBLESTONE);
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_cobblestone_white, 1),
					new Object[] { new ItemStack(Blocks.COBBLESTONE), new ItemStack(Items.DYE, 1, 15),
							new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_cobblestone_black, 1),
					new Object[] { new ItemStack(Blocks.COBBLESTONE), new ItemStack(Items.DYE, 1, 0),
							new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_cobblestone_light_gray, 1),
					new Object[] { new ItemStack(Blocks.COBBLESTONE), new ItemStack(Items.DYE, 1, 7),
							new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_cobblestone_gray, 1),
					new Object[] { new ItemStack(Blocks.COBBLESTONE), new ItemStack(Items.DYE, 1, 8),
							new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_cobblestone_light_blue, 1),
					new Object[] { new ItemStack(Blocks.COBBLESTONE), new ItemStack(Items.DYE, 1, 12),
							new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_cobblestone_cyan, 1),
					new Object[] { new ItemStack(Blocks.COBBLESTONE), new ItemStack(Items.DYE, 1, 6),
							new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_cobblestone_blue, 1),
					new Object[] { new ItemStack(Blocks.COBBLESTONE), new ItemStack(Items.DYE, 1, 4),
							new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_cobblestone_light_green, 1),
					new Object[] { new ItemStack(Blocks.COBBLESTONE), new ItemStack(Items.DYE, 1, 10),
							new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_cobblestone_green, 1),
					new Object[] { new ItemStack(Blocks.COBBLESTONE), new ItemStack(Items.DYE, 1, 2),
							new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_cobblestone_red, 1),
					new Object[] { new ItemStack(Blocks.COBBLESTONE), new ItemStack(Items.DYE, 1, 1),
							new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_cobblestone_orange, 1),
					new Object[] { new ItemStack(Blocks.COBBLESTONE), new ItemStack(Items.DYE, 1, 14),
							new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_cobblestone_brown, 1),
					new Object[] { new ItemStack(Blocks.COBBLESTONE), new ItemStack(Items.DYE, 1, 3),
							new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_cobblestone_magenta, 1),
					new Object[] { new ItemStack(Blocks.COBBLESTONE), new ItemStack(Items.DYE, 1, 13),
							new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_cobblestone_purple, 1),
					new Object[] { new ItemStack(Blocks.COBBLESTONE), new ItemStack(Items.DYE, 1, 5),
							new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_cobblestone_yellow, 1),
					new Object[] { new ItemStack(Blocks.COBBLESTONE), new ItemStack(Items.DYE, 1, 11),
							new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.glowing_coloured_cobblestone_pink, 1),
					new Object[] { new ItemStack(Blocks.COBBLESTONE), new ItemStack(Items.DYE, 1, 9),
							new ItemStack(Blocks.GLOWSTONE) });
			GameRegistry.addRecipe(new ItemStack(ModElements.glowing_colour_changing_cobblestone), "GDG", "DCD", "GDG",
					'D', Items.DYE, 'C', Blocks.COBBLESTONE, 'G', Blocks.GLOWSTONE);
			GameRegistry.addRecipe(new ItemStack(ModElements.glowing_colour_changing_cobblestone), "DGD", "GCG", "DGD",
					'D', Items.DYE, 'C', Blocks.COBBLESTONE, 'G', Blocks.GLOWSTONE);
			// Seamless blocks
			GameRegistry.addRecipe(new ItemStack(ModElements.seamless_stone_slab, 4), "SS ", "SS ", "   ", 'S',
					new ItemStack(Blocks.STONE_SLAB, 1, 2));
			GameRegistry.addRecipe(new ItemStack(ModElements.seamless_stone_slab, 4), " SS", " SS", "   ", 'S',
					new ItemStack(Blocks.STONE_SLAB, 1, 2));
			GameRegistry.addRecipe(new ItemStack(ModElements.seamless_stone_slab, 4), "   ", "SS ", "SS ", 'S',
					new ItemStack(Blocks.STONE_SLAB, 1, 2));
			GameRegistry.addRecipe(new ItemStack(ModElements.seamless_stone_slab, 4), "   ", " SS", " SS", 'S',
					new ItemStack(Blocks.STONE_SLAB, 1, 2));
			GameRegistry.addRecipe(new ItemStack(ModElements.seamless_oak_log, 4), "LL ", "LL ", "   ", 'L',
					new ItemStack(Blocks.LOG, 1, 0));
			GameRegistry.addRecipe(new ItemStack(ModElements.seamless_oak_log, 4), " LL", " LL", "   ", 'L',
					new ItemStack(Blocks.LOG, 1, 0));
			GameRegistry.addRecipe(new ItemStack(ModElements.seamless_oak_log, 4), "   ", "LL ", "LL ", 'L',
					new ItemStack(Blocks.LOG, 1, 0));
			GameRegistry.addRecipe(new ItemStack(ModElements.seamless_oak_log, 4), "   ", " LL", " LL", 'L',
					new ItemStack(Blocks.LOG, 1, 0));
			GameRegistry.addRecipe(new ItemStack(ModElements.seamless_birch_log, 4), "LL ", "LL ", "   ", 'L',
					new ItemStack(Blocks.LOG, 1, 2));
			GameRegistry.addRecipe(new ItemStack(ModElements.seamless_birch_log, 4), " LL", " LL", "   ", 'L',
					new ItemStack(Blocks.LOG, 1, 2));
			GameRegistry.addRecipe(new ItemStack(ModElements.seamless_birch_log, 4), "   ", "LL ", "LL ", 'L',
					new ItemStack(Blocks.LOG, 1, 2));
			GameRegistry.addRecipe(new ItemStack(ModElements.seamless_birch_log, 4), "   ", " LL", " LL", 'L',
					new ItemStack(Blocks.LOG, 1, 2));
			GameRegistry.addRecipe(new ItemStack(ModElements.seamless_spruce_log, 4), "LL ", "LL ", "   ", 'L',
					new ItemStack(Blocks.LOG, 1, 1));
			GameRegistry.addRecipe(new ItemStack(ModElements.seamless_spruce_log, 4), " LL", " LL", "   ", 'L',
					new ItemStack(Blocks.LOG, 1, 1));
			GameRegistry.addRecipe(new ItemStack(ModElements.seamless_spruce_log, 4), "   ", "LL ", "LL ", 'L',
					new ItemStack(Blocks.LOG, 1, 1));
			GameRegistry.addRecipe(new ItemStack(ModElements.seamless_spruce_log, 4), "   ", " LL", " LL", 'L',
					new ItemStack(Blocks.LOG, 1, 1));
			GameRegistry.addRecipe(new ItemStack(ModElements.seamless_jungle_log, 4), "LL ", "LL ", "   ", 'L',
					new ItemStack(Blocks.LOG, 1, 3));
			GameRegistry.addRecipe(new ItemStack(ModElements.seamless_jungle_log, 4), " LL", " LL", "   ", 'L',
					new ItemStack(Blocks.LOG, 1, 3));
			GameRegistry.addRecipe(new ItemStack(ModElements.seamless_jungle_log, 4), "   ", "LL ", "LL ", 'L',
					new ItemStack(Blocks.LOG, 1, 3));
			GameRegistry.addRecipe(new ItemStack(ModElements.seamless_jungle_log, 4), "   ", " LL", " LL", 'L',
					new ItemStack(Blocks.LOG, 1, 3));
			GameRegistry.addRecipe(new ItemStack(ModElements.seamless_acacia_log, 4), "LL ", "LL ", "   ", 'L',
					new ItemStack(Blocks.LOG2, 1, 0));
			GameRegistry.addRecipe(new ItemStack(ModElements.seamless_acacia_log, 4), " LL", " LL", "   ", 'L',
					new ItemStack(Blocks.LOG2, 1, 0));
			GameRegistry.addRecipe(new ItemStack(ModElements.seamless_acacia_log, 4), "   ", "LL ", "LL ", 'L',
					new ItemStack(Blocks.LOG2, 1, 0));
			GameRegistry.addRecipe(new ItemStack(ModElements.seamless_acacia_log, 4), "   ", " LL", " LL", 'L',
					new ItemStack(Blocks.LOG2, 1, 0));
			GameRegistry.addRecipe(new ItemStack(ModElements.seamless_dark_oak_log, 4), "LL ", "LL ", "   ", 'L',
					new ItemStack(Blocks.LOG2, 1, 1));
			GameRegistry.addRecipe(new ItemStack(ModElements.seamless_dark_oak_log, 4), " LL", " LL", "   ", 'L',
					new ItemStack(Blocks.LOG2, 1, 1));
			GameRegistry.addRecipe(new ItemStack(ModElements.seamless_dark_oak_log, 4), "   ", "LL ", "LL ", 'L',
					new ItemStack(Blocks.LOG2, 1, 1));
			GameRegistry.addRecipe(new ItemStack(ModElements.seamless_dark_oak_log, 4), "   ", " LL", " LL", 'L',
					new ItemStack(Blocks.LOG2, 1, 1));
			GameRegistry.addRecipe(new ItemStack(ModElements.seamless_smooth_sandstone, 4), "SS ", "SS ", "   ", 'S',
					new ItemStack(Blocks.SANDSTONE, 1, 2));
			GameRegistry.addRecipe(new ItemStack(ModElements.seamless_smooth_sandstone, 4), " SS", " SS", "   ", 'S',
					new ItemStack(Blocks.SANDSTONE, 1, 2));
			GameRegistry.addRecipe(new ItemStack(ModElements.seamless_smooth_sandstone, 4), "   ", "SS ", "SS ", 'S',
					new ItemStack(Blocks.SANDSTONE, 1, 2));
			GameRegistry.addRecipe(new ItemStack(ModElements.seamless_smooth_sandstone, 4), "   ", " SS", " SS", 'S',
					new ItemStack(Blocks.SANDSTONE, 1, 2));
			GameRegistry.addRecipe(new ItemStack(ModElements.seamless_smooth_red_sandstone, 4), "SS ", "SS ", "   ",
					'S', new ItemStack(Blocks.RED_SANDSTONE, 1, 2));
			GameRegistry.addRecipe(new ItemStack(ModElements.seamless_smooth_red_sandstone, 4), " SS", " SS", "   ",
					'S', new ItemStack(Blocks.RED_SANDSTONE, 1, 2));
			GameRegistry.addRecipe(new ItemStack(ModElements.seamless_smooth_red_sandstone, 4), "   ", "SS ", "SS ",
					'S', new ItemStack(Blocks.RED_SANDSTONE, 1, 2));
			GameRegistry.addRecipe(new ItemStack(ModElements.seamless_smooth_red_sandstone, 4), "   ", " SS", " SS",
					'S', new ItemStack(Blocks.RED_SANDSTONE, 1, 2));
			// Flowers to dyes
			GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 1, 4), ModElements.blue_tulip);
			GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 1, 0), ModElements.black_tulip);
			GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 1, 2), ModElements.green_tulip);
			GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 1, 11), ModElements.yellow_tulip);
			GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 1, 5), ModElements.purple_tulip);
			// Colour changing blocks
			GameRegistry.addRecipe(new ItemStack(ModElements.colour_changing_wool), " D ", "DWD", " D ", 'D', Items.DYE,
					'W', Blocks.WOOL);
			GameRegistry.addRecipe(new ItemStack(ModElements.colour_changing_clay), " D ", "DCD", " D ", 'D', Items.DYE,
					'C', Blocks.STAINED_HARDENED_CLAY);
			GameRegistry.addRecipe(new ItemStack(ModElements.colour_changing_glass), " D ", "DGD", " D ", 'D',
					Items.DYE, 'G', Blocks.STAINED_GLASS);
			// Machines
			GameRegistry.addRecipe(new ItemStack(ModElements.crusher), "SPS", "RTR", "SPS", 'S', Blocks.STONE, 'P',
					Blocks.STICKY_PISTON, 'R', Items.REDSTONE, 'T', ModElements.tin_block);
			GameRegistry.addRecipe(new ItemStack(ModElements.crusher), "SRS", "PTP", "SRS", 'S', Blocks.STONE, 'P',
					Blocks.STICKY_PISTON, 'R', Items.REDSTONE, 'T', ModElements.tin_block);
			// Stone blocks
			GameRegistry.addRecipe(new ItemStack(ModElements.basalt_bricks, 4), "BB ", "BB ", "   ", 'B',
					ModElements.basalt);
			GameRegistry.addRecipe(new ItemStack(ModElements.basalt_bricks, 4), " BB", " BB", "   ", 'B',
					ModElements.basalt);
			GameRegistry.addRecipe(new ItemStack(ModElements.basalt_bricks, 4), "   ", "BB ", "BB ", 'B',
					ModElements.basalt);
			GameRegistry.addRecipe(new ItemStack(ModElements.basalt_bricks, 4), "   ", " BB", " BB", 'B',
					ModElements.basalt);
			GameRegistry.addRecipe(new ItemStack(ModElements.polished_basalt, 9), "BBB", "BBB", "BBB", 'B',
					ModElements.basalt);
			GameRegistry.addRecipe(new ItemStack(ModElements.polished_stone, 9), "SSS", "SSS", "SSS", 'S',
					new ItemStack(Blocks.STONE, 1, 0));
			GameRegistry.addRecipe(new ItemStack(Blocks.STONE, 9, 2), "GGG", "GGG", "GGG", 'G',
					new ItemStack(Blocks.STONE, 1, 1));
			GameRegistry.addRecipe(new ItemStack(Blocks.STONE, 9, 4), "DDD", "DDD", "DDD", 'D',
					new ItemStack(Blocks.STONE, 1, 3));
			GameRegistry.addRecipe(new ItemStack(Blocks.STONE, 9, 6), "AAA", "AAA", "AAA", 'A',
					new ItemStack(Blocks.STONE, 1, 5));
			GameRegistry.addRecipe(new ItemStack(ModElements.granite_bricks, 4), "GG ", "GG ", "   ", 'G',
					new ItemStack(Blocks.STONE, 1, 1));
			GameRegistry.addRecipe(new ItemStack(ModElements.granite_bricks, 4), " GG", " GG", "   ", 'G',
					new ItemStack(Blocks.STONE, 1, 1));
			GameRegistry.addRecipe(new ItemStack(ModElements.granite_bricks, 4), "   ", "GG ", "GG ", 'G',
					new ItemStack(Blocks.STONE, 1, 1));
			GameRegistry.addRecipe(new ItemStack(ModElements.granite_bricks, 4), "   ", " GG", " GG", 'G',
					new ItemStack(Blocks.STONE, 1, 1));
			GameRegistry.addRecipe(new ItemStack(ModElements.diorite_bricks, 4), "DD ", "DD ", "   ", 'D',
					new ItemStack(Blocks.STONE, 1, 3));
			GameRegistry.addRecipe(new ItemStack(ModElements.diorite_bricks, 4), " DD", " DD", "   ", 'D',
					new ItemStack(Blocks.STONE, 1, 3));
			GameRegistry.addRecipe(new ItemStack(ModElements.diorite_bricks, 4), "   ", "DD ", "DD ", 'D',
					new ItemStack(Blocks.STONE, 1, 3));
			GameRegistry.addRecipe(new ItemStack(ModElements.diorite_bricks, 4), "   ", " DD", " DD", 'D',
					new ItemStack(Blocks.STONE, 1, 3));
			GameRegistry.addRecipe(new ItemStack(ModElements.andesite_bricks, 4), "AA ", "AA ", "   ", 'A',
					new ItemStack(Blocks.STONE, 1, 5));
			GameRegistry.addRecipe(new ItemStack(ModElements.andesite_bricks, 4), " AA", " AA", "   ", 'A',
					new ItemStack(Blocks.STONE, 1, 5));
			GameRegistry.addRecipe(new ItemStack(ModElements.andesite_bricks, 4), "   ", "AA ", "AA ", 'A',
					new ItemStack(Blocks.STONE, 1, 5));
			GameRegistry.addRecipe(new ItemStack(ModElements.andesite_bricks, 4), "   ", " AA", " AA", 'A',
					new ItemStack(Blocks.STONE, 1, 5));
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.sandy_bricks),
					new Object[] { Blocks.SAND, Blocks.BRICK_BLOCK });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.sandy_stone_bricks),
					new Object[] { Blocks.SAND, Blocks.STONEBRICK });
			// Nether blocks
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.dark_nether_bricks),
					new Object[] { new ItemStack(Blocks.NETHER_BRICK), new ItemStack(Items.DYE, 1, 0) });
			// Wooden pattern
			GameRegistry.addRecipe(new ItemStack(ModElements.wooden_pattern, 16), "WS ", "SW ", "   ", 'S',
					new ItemStack(Items.STICK), 'W', Blocks.PLANKS);
			GameRegistry.addRecipe(new ItemStack(ModElements.wooden_pattern, 16), " WS", " SW", "   ", 'S',
					new ItemStack(Items.STICK), 'W', Blocks.PLANKS);
			GameRegistry.addRecipe(new ItemStack(ModElements.wooden_pattern, 16), "   ", "WS ", "SW ", 'S',
					new ItemStack(Items.STICK), 'W', Blocks.PLANKS);
			GameRegistry.addRecipe(new ItemStack(ModElements.wooden_pattern, 16), "   ", " WS", " SW", 'S',
					new ItemStack(Items.STICK), 'W', Blocks.PLANKS);
			GameRegistry.addRecipe(new ItemStack(ModElements.wooden_pattern, 16), "SW ", "WS ", "   ", 'S',
					new ItemStack(Items.STICK), 'W', Blocks.PLANKS);
			GameRegistry.addRecipe(new ItemStack(ModElements.wooden_pattern, 16), " SW", " WS", "   ", 'S',
					new ItemStack(Items.STICK), 'W', Blocks.PLANKS);
			GameRegistry.addRecipe(new ItemStack(ModElements.wooden_pattern, 16), "   ", "SW ", "WS ", 'S',
					new ItemStack(Items.STICK), 'W', Blocks.PLANKS);
			GameRegistry.addRecipe(new ItemStack(ModElements.wooden_pattern, 16), "   ", " SW", " WS", 'S',
					new ItemStack(Items.STICK), 'W', Blocks.PLANKS);
			// Wooden pattern bars
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_bars),
					new Object[] { ModElements.wooden_pattern, Blocks.IRON_BARS });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_bars),
					new Object[] { ModElements.wooden_pattern, ModElements.gold_bars });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_bars),
					new Object[] { ModElements.wooden_pattern, ModElements.diamond_bars });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_bars),
					new Object[] { ModElements.wooden_pattern, ModElements.copper_bars });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_bars),
					new Object[] { ModElements.wooden_pattern, ModElements.tin_bars });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_bars),
					new Object[] { ModElements.wooden_pattern, ModElements.bronze_bars });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_bars),
					new Object[] { ModElements.wooden_pattern, ModElements.amethyst_bars });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_bars),
					new Object[] { ModElements.wooden_pattern, ModElements.quartz_bars });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_bars),
					new Object[] { ModElements.wooden_pattern, ModElements.emerald_bars });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_bars),
					new Object[] { ModElements.wooden_pattern, ModElements.jade_bars });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_bars),
					new Object[] { ModElements.wooden_pattern, ModElements.stone_bars });
			// Wooden pattern button
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_button),
					new Object[] { ModElements.wooden_pattern, Blocks.WOODEN_BUTTON });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_button),
					new Object[] { ModElements.wooden_pattern, Blocks.STONE_BUTTON });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_button),
					new Object[] { ModElements.wooden_pattern, ModElements.gold_button });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_button),
					new Object[] { ModElements.wooden_pattern, ModElements.diamond_button });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_button),
					new Object[] { ModElements.wooden_pattern, ModElements.copper_button });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_button),
					new Object[] { ModElements.wooden_pattern, ModElements.tin_button });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_button),
					new Object[] { ModElements.wooden_pattern, ModElements.bronze_button });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_button),
					new Object[] { ModElements.wooden_pattern, ModElements.amethyst_button });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_button),
					new Object[] { ModElements.wooden_pattern, ModElements.jade_button });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_button),
					new Object[] { ModElements.wooden_pattern, ModElements.emerald_button });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_button),
					new Object[] { ModElements.wooden_pattern, ModElements.quartz_button });
			// Wooden pattern pressure plate
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_pressure_plate),
					new Object[] { ModElements.wooden_pattern, Blocks.WOODEN_PRESSURE_PLATE });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_pressure_plate),
					new Object[] { ModElements.wooden_pattern, Blocks.STONE_PRESSURE_PLATE });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_pressure_plate),
					new Object[] { ModElements.wooden_pattern, Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_pressure_plate),
					new Object[] { ModElements.wooden_pattern, Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_pressure_plate),
					new Object[] { ModElements.wooden_pattern, ModElements.diamond_pressure_plate });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_pressure_plate),
					new Object[] { ModElements.wooden_pattern, ModElements.emerald_pressure_plate });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_pressure_plate),
					new Object[] { ModElements.wooden_pattern, ModElements.quartz_pressure_plate });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_pressure_plate),
					new Object[] { ModElements.wooden_pattern, ModElements.tin_pressure_plate });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_pressure_plate),
					new Object[] { ModElements.wooden_pattern, ModElements.copper_pressure_plate });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_pressure_plate),
					new Object[] { ModElements.wooden_pattern, ModElements.bronze_pressure_plate });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_pressure_plate),
					new Object[] { ModElements.wooden_pattern, ModElements.amethyst_pressure_plate });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_pressure_plate),
					new Object[] { ModElements.wooden_pattern, ModElements.jade_pressure_plate });
			// Wooden pattern trapdoor
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_trapdoor),
					new Object[] { ModElements.wooden_pattern, Blocks.TRAPDOOR });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_trapdoor),
					new Object[] { ModElements.wooden_pattern, Blocks.IRON_TRAPDOOR });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_trapdoor),
					new Object[] { ModElements.wooden_pattern, ModElements.gold_trapdoor });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_trapdoor),
					new Object[] { ModElements.wooden_pattern, ModElements.diamond_trapdoor });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_trapdoor),
					new Object[] { ModElements.wooden_pattern, ModElements.emerald_trapdoor });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_trapdoor),
					new Object[] { ModElements.wooden_pattern, ModElements.quartz_trapdoor });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_trapdoor),
					new Object[] { ModElements.wooden_pattern, ModElements.tin_trapdoor });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_trapdoor),
					new Object[] { ModElements.wooden_pattern, ModElements.copper_trapdoor });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_trapdoor),
					new Object[] { ModElements.wooden_pattern, ModElements.bronze_trapdoor });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_trapdoor),
					new Object[] { ModElements.wooden_pattern, ModElements.amethyst_trapdoor });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_trapdoor),
					new Object[] { ModElements.wooden_pattern, ModElements.jade_trapdoor });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_trapdoor),
					new Object[] { ModElements.wooden_pattern, ModElements.stone_trapdoor });
			// Wooden pattern wall
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_wall),
					new Object[] { ModElements.wooden_pattern, Blocks.COBBLESTONE_WALL });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_wall),
					new Object[] { ModElements.wooden_pattern, new ItemStack(Blocks.COBBLESTONE_WALL, 1, 1) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_wall),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.iron_wall });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_wall),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.stone_wall });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_wall),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.gold_wall });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_wall),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.diamond_wall });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_wall),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.emerald_wall });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_wall),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.quartz_wall });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_wall),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.copper_wall });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_wall),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.tin_wall });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_wall),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.bronze_wall });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_wall),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.amethyst_wall });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_wall),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.jade_wall });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_wall),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.brick_wall });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_wall),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.stonebrick_wall });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_wall),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.granite_bricks_wall });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_wall),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.diorite_bricks_wall });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_wall),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.andesite_bricks_wall });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_wall),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.basalt_bricks_wall });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_wall),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.sandy_stone_bricks_wall });
			// Wooden pattern fence
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_fence),
					new Object[] { ModElements.wooden_pattern, Blocks.ACACIA_FENCE });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_fence),
					new Object[] { ModElements.wooden_pattern, Blocks.OAK_FENCE });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_fence),
					new Object[] { ModElements.wooden_pattern, Blocks.BIRCH_FENCE });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_fence),
					new Object[] { ModElements.wooden_pattern, Blocks.DARK_OAK_FENCE });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_fence),
					new Object[] { ModElements.wooden_pattern, Blocks.JUNGLE_FENCE });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_fence),
					new Object[] { ModElements.wooden_pattern, Blocks.DARK_OAK_FENCE });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_fence),
					new Object[] { ModElements.wooden_pattern, Blocks.NETHER_BRICK_FENCE });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_fence),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.dark_nether_bricks_fence });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_fence),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.red_nether_bricks_fence });
			// Wooden pattern fence gate
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_fence_gate),
					new Object[] { ModElements.wooden_pattern, Blocks.ACACIA_FENCE_GATE });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_fence_gate),
					new Object[] { ModElements.wooden_pattern, Blocks.OAK_FENCE_GATE });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_fence_gate),
					new Object[] { ModElements.wooden_pattern, Blocks.BIRCH_FENCE_GATE });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_fence_gate),
					new Object[] { ModElements.wooden_pattern, Blocks.DARK_OAK_FENCE_GATE });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_fence_gate),
					new Object[] { ModElements.wooden_pattern, Blocks.JUNGLE_FENCE_GATE });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_fence_gate),
					new Object[] { ModElements.wooden_pattern, Blocks.DARK_OAK_FENCE_GATE });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_fence_gate),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.nether_bricks_fence_gate });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_fence_gate), new Object[] {
					ModElements.wooden_pattern, ModElementsSmallerBlocks.dark_nether_bricks_fence_gate });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_fence_gate),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.red_nether_bricks_fence_gate });
			// Wooden pattern stairs
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, Blocks.ACACIA_STAIRS });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, Blocks.BIRCH_STAIRS });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, Blocks.OAK_STAIRS });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, Blocks.SPRUCE_STAIRS });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, Blocks.DARK_OAK_STAIRS });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, Blocks.JUNGLE_STAIRS });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, Blocks.NETHER_BRICK_STAIRS });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, Blocks.PURPUR_STAIRS });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, Blocks.QUARTZ_STAIRS });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, Blocks.SANDSTONE_STAIRS });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, Blocks.RED_SANDSTONE_STAIRS });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, Blocks.STONE_BRICK_STAIRS });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, Blocks.STONE_STAIRS });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.oak_log_stairs });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.seamless_oak_log_stairs });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.birch_log_stairs });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.seamless_birch_log_stairs });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.spruce_log_stairs });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.seamless_spruce_log_stairs });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.jungle_log_stairs });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.seamless_jungle_log_stairs });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.acacia_log_stairs });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.seamless_acacia_log_stairs });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.dark_oak_log_stairs });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.seamless_dark_oak_log_stairs });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.coal_stairs });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.iron_stairs });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.gold_stairs });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.lapis_stairs });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.redstone_stairs });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.diamond_stairs });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.copper_stairs });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.bronze_stairs });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.tin_stairs });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.jade_stairs });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.amethyst_stairs });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.stone_stairs });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.granite_stairs });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.andesite_stairs });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.diorite_stairs });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.basalt_stairs });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.granite_bricks_stairs });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.andesite_bricks_stairs });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.diorite_bricks_stairs });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.basalt_bricks_stairs });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.sandy_stone_bricks_stairs });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs), new Object[] {
					ModElements.wooden_pattern, ModElementsSmallerBlocks.seamless_smooth_sandstone_stairs });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs), new Object[] {
					ModElements.wooden_pattern, ModElementsSmallerBlocks.seamless_smooth_red_sandstone_stairs });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.prismarine_stairs });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.prismarine_bricks_stairs });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.dark_prismarine_stairs });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.obsidian_stairs });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.bone_stairs });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.end_stone_bricks_stairs });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.red_nether_bricks_stairs });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs),
					new Object[] { ModElements.wooden_pattern, ModElementsSmallerBlocks.dark_nether_bricks_stairs });
			// Wooden pattern duplicate
			if (Config.duplicate_patterns == true) {
				GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_bars, 2), new Object[] {
						new ItemStack(ModElements.wooden_pattern), new ItemStack(ModElements.wooden_pattern_bars) });
				GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_button, 2), new Object[] {
						new ItemStack(ModElements.wooden_pattern), new ItemStack(ModElements.wooden_pattern_button) });
				GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_pressure_plate, 2),
						new Object[] { new ItemStack(ModElements.wooden_pattern),
								new ItemStack(ModElements.wooden_pattern_pressure_plate) });
				GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_trapdoor, 2),
						new Object[] { new ItemStack(ModElements.wooden_pattern),
								new ItemStack(ModElements.wooden_pattern_trapdoor) });
				GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_wall, 2), new Object[] {
						new ItemStack(ModElements.wooden_pattern), new ItemStack(ModElements.wooden_pattern_wall) });
				GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_fence, 2), new Object[] {
						new ItemStack(ModElements.wooden_pattern), new ItemStack(ModElements.wooden_pattern_fence) });
				GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_fence_gate, 2),
						new Object[] { new ItemStack(ModElements.wooden_pattern),
								new ItemStack(ModElements.wooden_pattern_fence_gate) });
				GameRegistry.addShapelessRecipe(new ItemStack(ModElements.wooden_pattern_stairs, 2), new Object[] {
						new ItemStack(ModElements.wooden_pattern), new ItemStack(ModElements.wooden_pattern_stairs) });
			}
			// Misc blocks
			GameRegistry.addRecipe(new ItemStack(ModElements.scaffolding_block, 16), "SSS", "S S", "SSS", 'S',
					Items.STICK);
			// Vanilla blocks
			GameRegistry.addShapelessRecipe(new ItemStack(Items.NETHER_WART, 9),
					new Object[] { Blocks.field_189878_dg });
			// Wool
			for (int metaData = 0; metaData < 16; metaData++) {
				GameRegistry.addShapelessRecipe(new ItemStack(Items.STRING, 4),
						new Object[] { new ItemStack(Blocks.WOOL, 1, metaData) });
			}
			GameRegistry.addShapelessRecipe(new ItemStack(Items.STRING, 4),
					new Object[] { new ItemStack(ModElements.colour_changing_wool) });
			// Furnace
			for (int metaData = 0; metaData < 7; metaData++) {
				GameRegistry.addRecipe(new ItemStack(Blocks.FURNACE), "SSS", "S S", "SSS", 'S',
						new ItemStack(Blocks.STONE, 1, metaData));
			}
			GameRegistry.addRecipe(new ItemStack(Blocks.FURNACE), "SSS", "S S", "SSS", 'S',
					new ItemStack(Blocks.MOSSY_COBBLESTONE));
			for (int metaData = 0; metaData < 4; metaData++) {
				GameRegistry.addRecipe(new ItemStack(Blocks.FURNACE), "SSS", "S S", "SSS", 'S',
						new ItemStack(Blocks.STONEBRICK, 1, metaData));
			}
			GameRegistry.addRecipe(new ItemStack(Blocks.FURNACE), "SSS", "S S", "SSS", 'S',
					new ItemStack(ModElements.basalt));
			GameRegistry.addRecipe(new ItemStack(Blocks.FURNACE), "SSS", "S S", "SSS", 'S',
					new ItemStack(ModElements.polished_basalt));
			GameRegistry.addRecipe(new ItemStack(Blocks.FURNACE), "SSS", "S S", "SSS", 'S',
					new ItemStack(ModElements.polished_stone));
			GameRegistry.addRecipe(new ItemStack(Blocks.FURNACE), "SSS", "S S", "SSS", 'S',
					new ItemStack(ModElements.basalt_bricks));
			GameRegistry.addRecipe(new ItemStack(Blocks.FURNACE), "SSS", "S S", "SSS", 'S',
					new ItemStack(ModElements.granite_bricks));
			GameRegistry.addRecipe(new ItemStack(Blocks.FURNACE), "SSS", "S S", "SSS", 'S',
					new ItemStack(ModElements.andesite_bricks));
			GameRegistry.addRecipe(new ItemStack(Blocks.FURNACE), "SSS", "S S", "SSS", 'S',
					new ItemStack(ModElements.diorite_bricks));
			GameRegistry.addRecipe(new ItemStack(Blocks.FURNACE), "SSS", "S S", "SSS", 'S',
					new ItemStack(Blocks.BRICK_BLOCK));
		}
	}

	public static void registerOreDictionary() {
		Registry.registerOreOreDictionary("copperIngot", copper_ingot);
		Registry.registerOreOreDictionary("tinIngot", tin_ingot);
		Registry.registerOreOreDictionary("bronzeIngot", bronze_ingot);
		Registry.registerOreOreDictionary("jade", jade);
		Registry.registerOreOreDictionary("copperOre", copper_ore);
		Registry.registerOreOreDictionary("tinOre", tin_ore);
		Registry.registerOreOreDictionary("jadeOre", jade_ore);
		Registry.registerOreOreDictionary("amethystOre", amethyst_ore);
	}

	public static void registerAchievements() {
		copperMiner = new Achievement("achievement.copperminer", "copperminer", 0, 2, ModElements.copper_ore, null)
				.registerStat();
		tinMiner = new Achievement("achievement.tinminer", "tinminer", 0, 0, ModElements.tin_ore, null).registerStat();
		bronzeCreator = new Achievement("achievement.bronzecreator", "bronzecreator", -1, 1, ModElements.bronze_ingot,
				copperMiner).registerStat();
		amethystMiner = new Achievement("achievement.amethystminer", "amethystminer", -3, 1, ModElements.amethyst_ore,
				null).registerStat();
		diamondUpgrade = new Achievement("achievement.diamondUpgrade", "diamondUpgrade", 0, 4,
				ModElementsToolsArmour.diamond_multitool, null).registerStat();
		amethystUpgrade = new Achievement("achievement.amethystUpgrade", "amethystUpgrade", -2, 4,
				ModElementsToolsArmour.amethyst_multitool, diamondUpgrade).registerStat();
		theOpTool = new Achievement("achievement.theOpTool", "theOpTool", -4, 4, ModElementsToolsArmour.op_multitool,
				amethystUpgrade).registerStat();
		moreFlowers = new Achievement("achievement.moreFlowers", "moreFlowers", 2, 0, ModElements.purple_tulip, null)
				.registerStat();

		AchievementPage.registerAchievementPage(new AchievementPage("MCrafterzz mod", new Achievement[] { copperMiner,
				tinMiner, bronzeCreator, amethystMiner, diamondUpgrade, amethystUpgrade, theOpTool, moreFlowers }));
		FMLCommonHandler.instance().bus().register(new AchievementEvents() {
		});
	}

	public static void registerStats() {
		open_crusher_gui = new StatBase("stats.open_crusher_gui",
				new TextComponentTranslation("stats.open_crusher_gui", new Object[0])).registerStat();
	}

}
