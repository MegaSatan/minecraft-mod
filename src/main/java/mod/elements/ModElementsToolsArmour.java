package mod.elements;

import mod.Registry;
import mod.config.Config;
import mod.items.Armour;
import mod.items.Axe;
import mod.items.Bow;
import mod.items.FlintAndIngot;
import mod.items.Hammer;
import mod.items.Hoe;
import mod.items.Multitool;
import mod.items.Pickaxe;
import mod.items.Scythe;
import mod.items.Shears;
import mod.items.Shield;
import mod.items.Shovel;
import mod.items.Sword;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModElementsToolsArmour {

	// Tool materials
	public static ToolMaterial opTool = EnumHelper.addToolMaterial("op", 4, 0, 100, 96, 100);
	public static ToolMaterial amethystTool = EnumHelper.addToolMaterial("amethyst", 4, 2000, 9, 4, 15);
	public static ToolMaterial jadeTool = EnumHelper.addToolMaterial("jade", 4, 2000, 9, 4, 15);
	public static ToolMaterial copperTool = EnumHelper.addToolMaterial("copper", 1, 170, 5.0F, 1, 15);
	public static ToolMaterial bronzeTool = EnumHelper.addToolMaterial("bronze", 2, 250, 6.5F, 2, 15);

	// Armour materials
	public static ArmorMaterial amethystArmour = EnumHelper.addArmorMaterial("amethyst", "mm:amethyst", 42,
			new int[] { 4, 9, 5, 4 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0);
	public static ArmorMaterial jadeArmour = EnumHelper.addArmorMaterial("jade", "mm:jade", 42,
			new int[] { 4, 9, 5, 4 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0);
	public static ArmorMaterial copperArmour = EnumHelper.addArmorMaterial("copper", "mm:copper", 13,
			new int[] { 2, 7, 4, 1 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0);
	public static ArmorMaterial bronzeArmour = EnumHelper.addArmorMaterial("bronze", "mm:bronze", 16,
			new int[] { 3, 6, 4, 2 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0);

	// Swords
	public static Item copper_sword;
	public static Item bronze_sword;
	public static Item jade_sword;
	public static Item amethyst_sword;

	// Bows
	public static Item stone_bow;
	public static Item iron_bow;
	public static Item gold_bow;
	public static Item diamond_bow;
	public static Item copper_bow;
	public static Item bronze_bow;
	public static Item jade_bow;
	public static Item amethyst_bow;
	public static Item op_bow;

	// Shields
	public static Item stone_shield;
	public static Item iron_shield;
	public static Item gold_shield;
	public static Item diamond_shield;
	public static Item copper_shield;
	public static Item bronze_shield;
	public static Item jade_shield;
	public static Item amethyst_shield;

	// Pickaxes
	public static Item copper_pickaxe;
	public static Item bronze_pickaxe;
	public static Item jade_pickaxe;
	public static Item amethyst_pickaxe;

	// Axes
	public static Item copper_axe;
	public static Item bronze_axe;
	public static Item jade_axe;
	public static Item amethyst_axe;

	// Shovels
	public static Item copper_shovel;
	public static Item bronze_shovel;
	public static Item jade_shovel;
	public static Item amethyst_shovel;

	// Hoes
	public static Item copper_hoe;
	public static Item bronze_hoe;
	public static Item jade_hoe;
	public static Item amethyst_hoe;

	// Multitools
	public static Item diamond_multitool;
	public static Item copper_multitool;
	public static Item bronze_multitool;
	public static Item jade_multitool;
	public static Item amethyst_multitool;
	public static Item op_multitool;

	// Hammers
	public static Item wooden_hammer;
	public static Item stone_hammer;
	public static Item iron_hammer;
	public static Item gold_hammer;
	public static Item diamond_hammer;
	public static Item copper_hammer;
	public static Item bronze_hammer;
	public static Item jade_hammer;
	public static Item amethyst_hammer;

	// Scythes
	public static Item wooden_scythe;
	public static Item stone_scythe;
	public static Item iron_scythe;
	public static Item gold_scythe;
	public static Item diamond_scythe;
	public static Item copper_scythe;
	public static Item bronze_scythe;
	public static Item jade_scythe;
	public static Item amethyst_scythe;

	// Shears
	public static Item wooden_shears;
	public static Item stone_shears;
	public static Item iron_shears;
	public static Item gold_shears;
	public static Item diamond_shears;
	public static Item copper_shears;
	public static Item bronze_shears;
	public static Item jade_shears;
	public static Item amethyst_shears;

	// Flint and ingots
	public static Item flint_and_wood;
	public static Item flint_and_stone;
	public static Item flint_and_iron;
	public static Item flint_and_gold;
	public static Item flint_and_diamond;
	public static Item flint_and_copper;
	public static Item flint_and_bronze;
	public static Item flint_and_jade;
	public static Item flint_and_amethyst;

	// Armour
	public static Item copper_helmet;
	public static Item copper_chestplate;
	public static Item copper_leggings;
	public static Item copper_boots;
	public static Item bronze_helmet;
	public static Item bronze_chestplate;
	public static Item bronze_leggings;
	public static Item bronze_boots;
	public static Item jade_helmet;
	public static Item jade_chestplate;
	public static Item jade_leggings;
	public static Item jade_boots;
	public static Item amethyst_helmet;
	public static Item amethyst_chestplate;
	public static Item amethyst_leggings;
	public static Item amethyst_boots;

	public static void createBlocksAndItems() {

		// Swords
		copper_sword = new Sword(copperTool, ModElements.copper_ingot).setUnlocalizedName("copper_sword")
				.setCreativeTab(ModElements.creativeTabTools);
		bronze_sword = new Sword(bronzeTool, ModElements.bronze_ingot).setUnlocalizedName("bronze_sword")
				.setCreativeTab(ModElements.creativeTabTools);
		jade_sword = new Sword(jadeTool, ModElements.jade).setUnlocalizedName("jade_sword")
				.setCreativeTab(ModElements.creativeTabTools);
		amethyst_sword = new Sword(amethystTool, ModElements.amethyst).setUnlocalizedName("amethyst_sword")
				.setCreativeTab(ModElements.creativeTabTools);

		// Bows
		stone_bow = new Bow(132, Item.getItemFromBlock(Blocks.STONE)).setUnlocalizedName("stone_bow")
				.setCreativeTab(ModElements.creativeTabTools);
		iron_bow = new Bow(238, Items.IRON_INGOT).setUnlocalizedName("iron_bow")
				.setCreativeTab(ModElements.creativeTabTools);
		gold_bow = new Bow(275, Items.GOLD_INGOT).setUnlocalizedName("gold_bow")
				.setCreativeTab(ModElements.creativeTabTools);
		diamond_bow = new Bow(1562, Items.DIAMOND).setUnlocalizedName("diamond_bow")
				.setCreativeTab(ModElements.creativeTabTools);
		copper_bow = new Bow(170, ModElements.copper_ingot).setUnlocalizedName("copper_bow")
				.setCreativeTab(ModElements.creativeTabTools);
		bronze_bow = new Bow(250, ModElements.bronze_ingot).setUnlocalizedName("bronze_bow")
				.setCreativeTab(ModElements.creativeTabTools);
		jade_bow = new Bow(2000, ModElements.jade).setUnlocalizedName("jade_bow")
				.setCreativeTab(ModElements.creativeTabTools);
		amethyst_bow = new Bow(2000, ModElements.amethyst).setUnlocalizedName("amethyst_bow")
				.setCreativeTab(ModElements.creativeTabTools);
		op_bow = new Bow(0, ModElements.amethyst).setUnlocalizedName("op_bow")
				.setCreativeTab(ModElements.creativeTabTools);

		// Shields
		stone_shield = new Shield(132, "stone_shield", ModElements.creativeTabTools).setUnlocalizedName("stone_shield");
		iron_shield = new Shield(238, "iron_shield", ModElements.creativeTabTools).setUnlocalizedName("iron_shield");
		gold_shield = new Shield(275, "gold_shield", ModElements.creativeTabTools).setUnlocalizedName("gold_shield");
		diamond_shield = new Shield(1562, "diamond_shield", ModElements.creativeTabTools)
				.setUnlocalizedName("diamond_shield");
		copper_shield = new Shield(170, "copper_shield", ModElements.creativeTabTools)
				.setUnlocalizedName("copper_shield");
		bronze_shield = new Shield(250, "bronze_shield", ModElements.creativeTabTools)
				.setUnlocalizedName("bronze_shield");
		jade_shield = new Shield(2000, "jade_shield", ModElements.creativeTabTools).setUnlocalizedName("jade_shield");
		amethyst_shield = new Shield(2000, "amethyst_shield", ModElements.creativeTabTools)
				.setUnlocalizedName("amethyst_shield");

		// Pickaxes
		copper_pickaxe = new Pickaxe(copperTool, ModElements.copper_ingot).setUnlocalizedName("copper_pickaxe")
				.setCreativeTab(ModElements.creativeTabTools);
		bronze_pickaxe = new Pickaxe(bronzeTool, ModElements.bronze_ingot).setUnlocalizedName("bronze_pickaxe")
				.setCreativeTab(ModElements.creativeTabTools);
		jade_pickaxe = new Pickaxe(jadeTool, ModElements.jade).setUnlocalizedName("jade_pickaxe")
				.setCreativeTab(ModElements.creativeTabTools);
		amethyst_pickaxe = new Pickaxe(amethystTool, ModElements.amethyst).setUnlocalizedName("amethyst_pickaxe")
				.setCreativeTab(ModElements.creativeTabTools);

		// Axes
		copper_axe = new Axe(copperTool, ModElements.copper_ingot).setUnlocalizedName("copper_axe")
				.setCreativeTab(ModElements.creativeTabTools);
		bronze_axe = new Axe(bronzeTool, ModElements.bronze_ingot).setUnlocalizedName("bronze_axe")
				.setCreativeTab(ModElements.creativeTabTools);
		jade_axe = new Axe(jadeTool, ModElements.jade).setUnlocalizedName("jade_axe")
				.setCreativeTab(ModElements.creativeTabTools);
		amethyst_axe = new Axe(amethystTool, ModElements.amethyst).setUnlocalizedName("amethyst_axe")
				.setCreativeTab(ModElements.creativeTabTools);

		// Shovels
		copper_shovel = new Shovel(copperTool, ModElements.copper_ingot).setUnlocalizedName("copper_shovel")
				.setCreativeTab(ModElements.creativeTabTools);
		bronze_shovel = new Shovel(bronzeTool, ModElements.bronze_ingot).setUnlocalizedName("bronze_shovel")
				.setCreativeTab(ModElements.creativeTabTools);
		jade_shovel = new Shovel(jadeTool, ModElements.jade).setUnlocalizedName("jade_shovel")
				.setCreativeTab(ModElements.creativeTabTools);
		amethyst_shovel = new Shovel(amethystTool, ModElements.amethyst).setUnlocalizedName("amethyst_shovel")
				.setCreativeTab(ModElements.creativeTabTools);

		// Hoes
		copper_hoe = new Hoe(copperTool, ModElements.copper_ingot).setUnlocalizedName("copper_hoe")
				.setCreativeTab(ModElements.creativeTabTools);
		bronze_hoe = new Hoe(bronzeTool, ModElements.bronze_ingot).setUnlocalizedName("bronze_hoe")
				.setCreativeTab(ModElements.creativeTabTools);
		jade_hoe = new Hoe(jadeTool, ModElements.jade).setUnlocalizedName("jade_hoe")
				.setCreativeTab(ModElements.creativeTabTools);
		amethyst_hoe = new Hoe(amethystTool, ModElements.amethyst).setUnlocalizedName("amethyst_hoe")
				.setCreativeTab(ModElements.creativeTabTools);

		// Multitools
		diamond_multitool = new Multitool(ToolMaterial.DIAMOND, Items.DIAMOND).setUnlocalizedName("diamond_multitool")
				.setCreativeTab(ModElements.creativeTabTools);
		copper_multitool = new Multitool(copperTool, ModElements.copper_ingot).setUnlocalizedName("copper_multitool")
				.setCreativeTab(ModElements.creativeTabTools);
		bronze_multitool = new Multitool(bronzeTool, ModElements.bronze_ingot).setUnlocalizedName("bronze_multitool")
				.setCreativeTab(ModElements.creativeTabTools);
		jade_multitool = new Multitool(jadeTool, ModElements.jade).setUnlocalizedName("jade_multitool")
				.setCreativeTab(ModElements.creativeTabTools);
		amethyst_multitool = new Multitool(amethystTool, ModElements.amethyst).setUnlocalizedName("amethyst_multitool")
				.setCreativeTab(ModElements.creativeTabTools);
		op_multitool = new Multitool(opTool, ModElements.amethyst).setUnlocalizedName("op_multitool")
				.setCreativeTab(ModElements.creativeTabTools);

		// Hammers
		wooden_hammer = new Hammer(ToolMaterial.WOOD, 59).setCreativeTab(ModElements.creativeTabTools)
				.setUnlocalizedName("wooden_hammer");
		stone_hammer = new Hammer(ToolMaterial.STONE, 132).setCreativeTab(ModElements.creativeTabTools)
				.setUnlocalizedName("stone_hammer");
		iron_hammer = new Hammer(ToolMaterial.IRON, 238).setCreativeTab(ModElements.creativeTabTools)
				.setUnlocalizedName("iron_hammer");
		gold_hammer = new Hammer(ToolMaterial.GOLD, 275).setCreativeTab(ModElements.creativeTabTools)
				.setUnlocalizedName("gold_hammer");
		diamond_hammer = new Hammer(ToolMaterial.DIAMOND, 1562).setCreativeTab(ModElements.creativeTabTools)
				.setUnlocalizedName("diamond_hammer");
		copper_hammer = new Hammer(copperTool, 170).setCreativeTab(ModElements.creativeTabTools)
				.setUnlocalizedName("copper_hammer");
		bronze_hammer = new Hammer(bronzeTool, 250).setCreativeTab(ModElements.creativeTabTools)
				.setUnlocalizedName("bronze_hammer");
		jade_hammer = new Hammer(bronzeTool, 2000).setCreativeTab(ModElements.creativeTabTools)
				.setUnlocalizedName("jade_hammer");
		amethyst_hammer = new Hammer(bronzeTool, 2000).setCreativeTab(ModElements.creativeTabTools)
				.setUnlocalizedName("amethyst_hammer");

		// Scythes
		wooden_scythe = new Scythe(ToolMaterial.WOOD, 59).setCreativeTab(ModElements.creativeTabTools)
				.setUnlocalizedName("wooden_scythe");
		stone_scythe = new Scythe(ToolMaterial.STONE, 132).setCreativeTab(ModElements.creativeTabTools)
				.setUnlocalizedName("stone_scythe");
		iron_scythe = new Scythe(ToolMaterial.IRON, 238).setCreativeTab(ModElements.creativeTabTools)
				.setUnlocalizedName("iron_scythe");
		gold_scythe = new Scythe(ToolMaterial.GOLD, 275).setCreativeTab(ModElements.creativeTabTools)
				.setUnlocalizedName("gold_scythe");
		diamond_scythe = new Scythe(ToolMaterial.DIAMOND, 1562).setCreativeTab(ModElements.creativeTabTools)
				.setUnlocalizedName("diamond_scythe");
		copper_scythe = new Scythe(copperTool, 170).setCreativeTab(ModElements.creativeTabTools)
				.setUnlocalizedName("copper_scythe");
		bronze_scythe = new Scythe(bronzeTool, 250).setCreativeTab(ModElements.creativeTabTools)
				.setUnlocalizedName("bronze_scythe");
		jade_scythe = new Scythe(bronzeTool, 2000).setCreativeTab(ModElements.creativeTabTools)
				.setUnlocalizedName("jade_scythe");
		amethyst_scythe = new Scythe(bronzeTool, 2000).setCreativeTab(ModElements.creativeTabTools)
				.setUnlocalizedName("amethyst_scythe");

		// Shears
		wooden_shears = new Shears(0, 59, Item.getItemFromBlock(Blocks.PLANKS)).setUnlocalizedName("wooden_shears")
				.setCreativeTab(ModElements.creativeTabTools);
		stone_shears = new Shears(0, 132, Item.getItemFromBlock(Blocks.STONE)).setUnlocalizedName("stone_shears")
				.setCreativeTab(ModElements.creativeTabTools);
		gold_shears = new Shears(1, 275, Items.GOLD_INGOT).setUnlocalizedName("gold_shears")
				.setCreativeTab(ModElements.creativeTabTools);
		diamond_shears = new Shears(2, 1562, Items.DIAMOND).setUnlocalizedName("diamond_shears")
				.setCreativeTab(ModElements.creativeTabTools);
		copper_shears = new Shears(1, 170, ModElements.copper_ingot).setUnlocalizedName("copper_shears")
				.setCreativeTab(ModElements.creativeTabTools);
		bronze_shears = new Shears(1, 250, ModElements.bronze_ingot).setUnlocalizedName("bronze_shears")
				.setCreativeTab(ModElements.creativeTabTools);
		jade_shears = new Shears(3, 2000, ModElements.jade).setUnlocalizedName("jade_shears")
				.setCreativeTab(ModElements.creativeTabTools);
		amethyst_shears = new Shears(3, 2000, ModElements.amethyst).setUnlocalizedName("amethyst_shears")
				.setCreativeTab(ModElements.creativeTabTools);

		// Flint and ingots
		flint_and_wood = new FlintAndIngot(59).setCreativeTab(ModElements.creativeTabTools)
				.setUnlocalizedName("flint_and_wood");
		flint_and_stone = new FlintAndIngot(132).setCreativeTab(ModElements.creativeTabTools)
				.setUnlocalizedName("flint_and_stone");
		flint_and_gold = new FlintAndIngot(275).setCreativeTab(ModElements.creativeTabTools)
				.setUnlocalizedName("flint_and_gold");
		flint_and_diamond = new FlintAndIngot(1562).setCreativeTab(ModElements.creativeTabTools)
				.setUnlocalizedName("flint_and_diamond");
		flint_and_copper = new FlintAndIngot(170).setCreativeTab(ModElements.creativeTabTools)
				.setUnlocalizedName("flint_and_copper");
		flint_and_bronze = new FlintAndIngot(250).setCreativeTab(ModElements.creativeTabTools)
				.setUnlocalizedName("flint_and_bronze");
		flint_and_jade = new FlintAndIngot(2000).setCreativeTab(ModElements.creativeTabTools)
				.setUnlocalizedName("flint_and_jade");
		flint_and_amethyst = new FlintAndIngot(2000).setCreativeTab(ModElements.creativeTabTools)
				.setUnlocalizedName("flint_and_amethyst");

		// Armour
		copper_helmet = new Armour(copperArmour, 1, EntityEquipmentSlot.HEAD, ModElements.copper_ingot)
				.setUnlocalizedName("copper_helmet").setCreativeTab(ModElements.creativeTabTools);
		copper_chestplate = new Armour(copperArmour, 1, EntityEquipmentSlot.CHEST, ModElements.copper_ingot)
				.setUnlocalizedName("copper_chestplate").setCreativeTab(ModElements.creativeTabTools);
		copper_leggings = new Armour(copperArmour, 2, EntityEquipmentSlot.LEGS, ModElements.copper_ingot)
				.setUnlocalizedName("copper_leggings").setCreativeTab(ModElements.creativeTabTools);
		copper_boots = new Armour(copperArmour, 1, EntityEquipmentSlot.FEET, ModElements.copper_ingot)
				.setUnlocalizedName("copper_boots").setCreativeTab(ModElements.creativeTabTools);
		bronze_helmet = new Armour(bronzeArmour, 1, EntityEquipmentSlot.HEAD, ModElements.bronze_ingot)
				.setUnlocalizedName("bronze_helmet").setCreativeTab(ModElements.creativeTabTools);
		bronze_chestplate = new Armour(bronzeArmour, 1, EntityEquipmentSlot.CHEST, ModElements.bronze_ingot)
				.setUnlocalizedName("bronze_chestplate").setCreativeTab(ModElements.creativeTabTools);
		bronze_leggings = new Armour(bronzeArmour, 2, EntityEquipmentSlot.LEGS, ModElements.bronze_ingot)
				.setUnlocalizedName("bronze_leggings").setCreativeTab(ModElements.creativeTabTools);
		bronze_boots = new Armour(bronzeArmour, 1, EntityEquipmentSlot.FEET, ModElements.bronze_ingot)
				.setUnlocalizedName("bronze_boots").setCreativeTab(ModElements.creativeTabTools);
		jade_helmet = new Armour(jadeArmour, 1, EntityEquipmentSlot.HEAD, ModElements.jade)
				.setUnlocalizedName("jade_helmet").setCreativeTab(ModElements.creativeTabTools);
		jade_chestplate = new Armour(jadeArmour, 1, EntityEquipmentSlot.CHEST, ModElements.jade)
				.setUnlocalizedName("jade_chestplate").setCreativeTab(ModElements.creativeTabTools);
		jade_leggings = new Armour(jadeArmour, 2, EntityEquipmentSlot.LEGS, ModElements.jade)
				.setUnlocalizedName("jade_leggings").setCreativeTab(ModElements.creativeTabTools);
		jade_boots = new Armour(jadeArmour, 1, EntityEquipmentSlot.FEET, ModElements.jade)
				.setUnlocalizedName("jade_boots").setCreativeTab(ModElements.creativeTabTools);
		amethyst_helmet = new Armour(amethystArmour, 1, EntityEquipmentSlot.HEAD, ModElements.amethyst)
				.setUnlocalizedName("amethyst_helmet").setCreativeTab(ModElements.creativeTabTools);
		amethyst_chestplate = new Armour(amethystArmour, 1, EntityEquipmentSlot.CHEST, ModElements.amethyst)
				.setUnlocalizedName("amethyst_chestplate").setCreativeTab(ModElements.creativeTabTools);
		amethyst_leggings = new Armour(amethystArmour, 2, EntityEquipmentSlot.LEGS, ModElements.amethyst)
				.setUnlocalizedName("amethyst_leggings").setCreativeTab(ModElements.creativeTabTools);
		amethyst_boots = new Armour(amethystArmour, 1, EntityEquipmentSlot.FEET, ModElements.amethyst)
				.setUnlocalizedName("amethyst_boots").setCreativeTab(ModElements.creativeTabTools);
	}

	public static void registerItemsAndBlocks() {

		// Swords
		Registry.registerItem(copper_sword);
		Registry.registerItem(bronze_sword);
		Registry.registerItem(jade_sword);
		Registry.registerItem(amethyst_sword);

		// Bows
		Registry.registerItem(stone_bow);
		Registry.registerItem(iron_bow);
		Registry.registerItem(gold_bow);
		Registry.registerItem(diamond_bow);
		Registry.registerItem(copper_bow);
		Registry.registerItem(bronze_bow);
		Registry.registerItem(jade_bow);
		Registry.registerItem(amethyst_bow);
		Registry.registerItem(op_bow);

		// Shields
		Registry.registerItem(stone_shield);
		Registry.registerItem(iron_shield);
		Registry.registerItem(gold_shield);
		Registry.registerItem(diamond_shield);
		Registry.registerItem(copper_shield);
		Registry.registerItem(bronze_shield);
		Registry.registerItem(jade_shield);
		Registry.registerItem(amethyst_shield);

		// Pickaxes
		Registry.registerItem(copper_pickaxe);
		Registry.registerItem(bronze_pickaxe);
		Registry.registerItem(jade_pickaxe);
		Registry.registerItem(amethyst_pickaxe);

		// Axes
		Registry.registerItem(copper_axe);
		Registry.registerItem(bronze_axe);
		Registry.registerItem(jade_axe);
		Registry.registerItem(amethyst_axe);

		// Shovels
		Registry.registerItem(copper_shovel);
		Registry.registerItem(bronze_shovel);
		Registry.registerItem(jade_shovel);
		Registry.registerItem(amethyst_shovel);

		// Hoes
		Registry.registerItem(copper_hoe);
		Registry.registerItem(bronze_hoe);
		Registry.registerItem(jade_hoe);
		Registry.registerItem(amethyst_hoe);

		// Multitools
		Registry.registerItem(diamond_multitool);
		Registry.registerItem(copper_multitool);
		Registry.registerItem(bronze_multitool);
		Registry.registerItem(jade_multitool);
		Registry.registerItem(amethyst_multitool);
		Registry.registerItem(op_multitool);

		// Hammers
		Registry.registerItem(wooden_hammer);
		Registry.registerItem(stone_hammer);
		Registry.registerItem(iron_hammer);
		Registry.registerItem(gold_hammer);
		Registry.registerItem(diamond_hammer);
		Registry.registerItem(copper_hammer);
		Registry.registerItem(bronze_hammer);
		Registry.registerItem(jade_hammer);
		Registry.registerItem(amethyst_hammer);

		// Scythes
		Registry.registerItem(wooden_scythe);
		Registry.registerItem(stone_scythe);
		Registry.registerItem(iron_scythe);
		Registry.registerItem(gold_scythe);
		Registry.registerItem(diamond_scythe);
		Registry.registerItem(copper_scythe);
		Registry.registerItem(bronze_scythe);
		Registry.registerItem(jade_scythe);
		Registry.registerItem(amethyst_scythe);

		// Shears
		Registry.registerItem(wooden_shears);
		Registry.registerItem(stone_shears);
		Registry.registerItem(gold_shears);
		Registry.registerItem(diamond_shears);
		Registry.registerItem(copper_shears);
		Registry.registerItem(bronze_shears);
		Registry.registerItem(jade_shears);
		Registry.registerItem(amethyst_shears);

		// Flint and ingots
		Registry.registerItem(flint_and_wood);
		Registry.registerItem(flint_and_stone);
		Registry.registerItem(flint_and_gold);
		Registry.registerItem(flint_and_diamond);
		Registry.registerItem(flint_and_copper);
		Registry.registerItem(flint_and_bronze);
		Registry.registerItem(flint_and_jade);
		Registry.registerItem(flint_and_amethyst);

		// Armour
		Registry.registerItem(copper_helmet);
		Registry.registerItem(copper_chestplate);
		Registry.registerItem(copper_leggings);
		Registry.registerItem(copper_boots);
		Registry.registerItem(bronze_helmet);
		Registry.registerItem(bronze_chestplate);
		Registry.registerItem(bronze_leggings);
		Registry.registerItem(bronze_boots);
		Registry.registerItem(jade_helmet);
		Registry.registerItem(jade_chestplate);
		Registry.registerItem(jade_leggings);
		Registry.registerItem(jade_boots);
		Registry.registerItem(amethyst_helmet);
		Registry.registerItem(amethyst_chestplate);
		Registry.registerItem(amethyst_leggings);
		Registry.registerItem(amethyst_boots);
	}

	public static void registerRenders() {

		// Swords
		Registry.registerRenderItem(copper_sword);
		Registry.registerRenderItem(bronze_sword);
		Registry.registerRenderItem(jade_sword);
		Registry.registerRenderItem(amethyst_sword);

		// Bows
		Registry.registerRenderItem(stone_bow);
		Registry.registerRenderItem(iron_bow);
		Registry.registerRenderItem(gold_bow);
		Registry.registerRenderItem(diamond_bow);
		Registry.registerRenderItem(copper_bow);
		Registry.registerRenderItem(bronze_bow);
		Registry.registerRenderItem(jade_bow);
		Registry.registerRenderItem(amethyst_bow);
		Registry.registerRenderItem(op_bow);

		// Shields
		Registry.registerRenderItem(stone_shield);
		Registry.registerRenderItem(iron_shield);
		Registry.registerRenderItem(gold_shield);
		Registry.registerRenderItem(diamond_shield);
		Registry.registerRenderItem(copper_shield);
		Registry.registerRenderItem(bronze_shield);
		Registry.registerRenderItem(jade_shield);
		Registry.registerRenderItem(amethyst_shield);

		// Pickaxes
		Registry.registerRenderItem(copper_pickaxe);
		Registry.registerRenderItem(bronze_pickaxe);
		Registry.registerRenderItem(jade_pickaxe);
		Registry.registerRenderItem(amethyst_pickaxe);

		// Axes
		Registry.registerRenderItem(copper_axe);
		Registry.registerRenderItem(bronze_axe);
		Registry.registerRenderItem(jade_axe);
		Registry.registerRenderItem(amethyst_axe);

		// Shovels
		Registry.registerRenderItem(copper_shovel);
		Registry.registerRenderItem(bronze_shovel);
		Registry.registerRenderItem(jade_shovel);
		Registry.registerRenderItem(amethyst_shovel);

		// Hoes
		Registry.registerRenderItem(copper_hoe);
		Registry.registerRenderItem(bronze_hoe);
		Registry.registerRenderItem(jade_hoe);
		Registry.registerRenderItem(amethyst_hoe);

		// Multitools
		Registry.registerRenderItem(diamond_multitool);
		Registry.registerRenderItem(copper_multitool);
		Registry.registerRenderItem(bronze_multitool);
		Registry.registerRenderItem(jade_multitool);
		Registry.registerRenderItem(amethyst_multitool);
		Registry.registerRenderItem(op_multitool);

		// Hammers
		Registry.registerRenderItem(wooden_hammer);
		Registry.registerRenderItem(stone_hammer);
		Registry.registerRenderItem(iron_hammer);
		Registry.registerRenderItem(gold_hammer);
		Registry.registerRenderItem(diamond_hammer);
		Registry.registerRenderItem(copper_hammer);
		Registry.registerRenderItem(bronze_hammer);
		Registry.registerRenderItem(jade_hammer);
		Registry.registerRenderItem(amethyst_hammer);

		// Scythes
		Registry.registerRenderItem(wooden_scythe);
		Registry.registerRenderItem(stone_scythe);
		Registry.registerRenderItem(iron_scythe);
		Registry.registerRenderItem(gold_scythe);
		Registry.registerRenderItem(diamond_scythe);
		Registry.registerRenderItem(copper_scythe);
		Registry.registerRenderItem(bronze_scythe);
		Registry.registerRenderItem(jade_scythe);
		Registry.registerRenderItem(amethyst_scythe);

		// Shears
		Registry.registerRenderItem(wooden_shears);
		Registry.registerRenderItem(stone_shears);
		Registry.registerRenderItem(gold_shears);
		Registry.registerRenderItem(diamond_shears);
		Registry.registerRenderItem(copper_shears);
		Registry.registerRenderItem(bronze_shears);
		Registry.registerRenderItem(jade_shears);
		Registry.registerRenderItem(amethyst_shears);

		// Flint and ingots
		Registry.registerRenderItem(flint_and_wood);
		Registry.registerRenderItem(flint_and_stone);
		Registry.registerRenderItem(flint_and_gold);
		Registry.registerRenderItem(flint_and_diamond);
		Registry.registerRenderItem(flint_and_copper);
		Registry.registerRenderItem(flint_and_bronze);
		Registry.registerRenderItem(flint_and_jade);
		Registry.registerRenderItem(flint_and_amethyst);

		// Armour
		Registry.registerRenderItem(copper_helmet);
		Registry.registerRenderItem(copper_chestplate);
		Registry.registerRenderItem(copper_leggings);
		Registry.registerRenderItem(copper_boots);
		Registry.registerRenderItem(bronze_helmet);
		Registry.registerRenderItem(bronze_chestplate);
		Registry.registerRenderItem(bronze_leggings);
		Registry.registerRenderItem(bronze_boots);
		Registry.registerRenderItem(jade_helmet);
		Registry.registerRenderItem(jade_chestplate);
		Registry.registerRenderItem(jade_leggings);
		Registry.registerRenderItem(jade_boots);
		Registry.registerRenderItem(amethyst_helmet);
		Registry.registerRenderItem(amethyst_chestplate);
		Registry.registerRenderItem(amethyst_leggings);
		Registry.registerRenderItem(amethyst_boots);
	}

	public static void setupRepairItemForToolsAndArmour() {
		copperTool.setRepairItem(new ItemStack(ModElements.copper_ingot));
		copperArmour.customCraftingMaterial = ModElements.copper_ingot;
		bronzeTool.setRepairItem(new ItemStack(ModElements.bronze_ingot));
		bronzeArmour.customCraftingMaterial = ModElements.bronze_ingot;
		jadeTool.setRepairItem(new ItemStack(ModElements.jade));
		jadeArmour.customCraftingMaterial = ModElements.jade;
		amethystTool.setRepairItem(new ItemStack(ModElements.amethyst));
		amethystArmour.customCraftingMaterial = ModElements.amethyst;
	}

	public static void crafting() {
		if (Config.crafting == true) {

			// Swords
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.copper_sword), " C ", " C ", " S ", 'C',
					ModElements.copper_ingot, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.copper_sword), "C  ", "C  ", "S  ", 'C',
					ModElements.copper_ingot, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.copper_sword), "  C", "  C", "  S", 'C',
					ModElements.copper_ingot, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.bronze_sword), " B ", " B ", " S ", 'B',
					ModElements.bronze_ingot, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.bronze_sword), "B  ", "B  ", "S  ", 'B',
					ModElements.bronze_ingot, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.bronze_sword), "  B", "  B", "  S", 'B',
					ModElements.bronze_ingot, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.jade_sword), " J ", " J ", " S ", 'J',
					ModElements.jade, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.jade_sword), "J  ", "J  ", "S  ", 'J',
					ModElements.jade, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.jade_sword), "  J", "  J", "  S", 'J',
					ModElements.jade, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.amethyst_sword), " A ", " A ", " S ", 'A',
					ModElements.amethyst, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.amethyst_sword), "A  ", "A  ", "S  ", 'A',
					ModElements.amethyst, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.amethyst_sword), "  A", "  A", "  S", 'A',
					ModElements.amethyst, 'S', Items.STICK);

			// Bows
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsToolsArmour.stone_bow, 1),
					new Object[] { Blocks.STONE, Items.BOW });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsToolsArmour.iron_bow, 1),
					new Object[] { Items.IRON_INGOT, Items.BOW });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsToolsArmour.gold_bow, 1),
					new Object[] { Items.GOLD_INGOT, Items.BOW });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsToolsArmour.diamond_bow, 1),
					new Object[] { Items.DIAMOND, Items.BOW });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsToolsArmour.copper_bow, 1),
					new Object[] { ModElements.copper_ingot, Items.BOW });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsToolsArmour.bronze_bow, 1),
					new Object[] { ModElements.bronze_ingot, Items.BOW });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsToolsArmour.jade_bow, 1),
					new Object[] { ModElements.jade, Items.BOW });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsToolsArmour.amethyst_bow, 1),
					new Object[] { ModElements.amethyst, Items.BOW });
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.op_bow), "AAA", "ABA", "AAA", 'A',
					ModElements.amethyst_block, 'B', Items.BOW);

			// Shields
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.stone_shield), "SSS", "SSS", " S ", 'S',
					Blocks.STONE);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.iron_shield), "III", "III", " I ", 'I',
					Items.IRON_INGOT);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.gold_shield), "GGG", "GGG", " G ", 'G',
					Items.GOLD_INGOT);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.diamond_shield), "DDD", "DDD", " D ", 'D',
					Items.DIAMOND);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.copper_shield), "CCC", "CCC", " C ", 'C',
					ModElements.copper_ingot);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.bronze_shield), "BBB", "BBB", " B ", 'B',
					ModElements.bronze_ingot);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.jade_shield), "JJJ", "JJJ", " J ", 'J',
					ModElements.jade);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.amethyst_shield), "AAA", "AAA", " A ", 'A',
					ModElements.amethyst);

			// Pickaxes
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.copper_pickaxe), "CCC", " S ", " S ", 'C',
					ModElements.copper_ingot, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.bronze_pickaxe), "BBB", " S ", " S ", 'B',
					ModElements.bronze_ingot, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.jade_pickaxe), "JJJ", " S ", " S ", 'J',
					ModElements.jade, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.amethyst_pickaxe), "AAA", " S ", " S ", 'A',
					ModElements.amethyst, 'S', Items.STICK);

			// Axes
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.copper_axe), "CC ", "CS ", " S ", 'C',
					ModElements.copper_ingot, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.copper_axe), " CC", " SC", " S ", 'C',
					ModElements.copper_ingot, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.copper_axe), " CC", " CS", "  S", 'C',
					ModElements.copper_ingot, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.copper_axe), "CC ", "SC ", "S  ", 'C',
					ModElements.copper_ingot, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.bronze_axe), "BB ", "BS ", " S ", 'B',
					ModElements.bronze_ingot, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.bronze_axe), " BB", " SB", " S ", 'B',
					ModElements.bronze_ingot, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.bronze_axe), " BB", " BS", "  S", 'B',
					ModElements.bronze_ingot, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.bronze_axe), "BB ", "SB ", "S  ", 'B',
					ModElements.bronze_ingot, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.jade_axe), "JJ ", "JS ", " S ", 'J',
					ModElements.jade, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.jade_axe), " JJ", " SJ", " S ", 'J',
					ModElements.jade, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.jade_axe), " JJ", " JS", "  S", 'J',
					ModElements.jade, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.jade_axe), "JJ ", "SJ ", "S  ", 'J',
					ModElements.jade, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.amethyst_axe), "AA ", "AS ", " S ", 'A',
					ModElements.amethyst, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.amethyst_axe), " AA", " SA", " S ", 'A',
					ModElements.amethyst, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.amethyst_axe), " AA", " AS", "  S", 'A',
					ModElements.amethyst, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.amethyst_axe), "AA ", "SA ", "S  ", 'A',
					ModElements.amethyst, 'S', Items.STICK);

			// Shovels
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.copper_shovel), " C ", " S ", " S ", 'C',
					ModElements.copper_ingot, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.copper_shovel), "C  ", "S  ", "S  ", 'C',
					ModElements.copper_ingot, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.copper_shovel), "  C", "  S", "  S", 'C',
					ModElements.copper_ingot, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.bronze_shovel), " B ", " S ", " S ", 'B',
					ModElements.bronze_ingot, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.bronze_shovel), "B  ", "S  ", "S  ", 'B',
					ModElements.bronze_ingot, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.bronze_shovel), "  B", "  S", "  S", 'B',
					ModElements.bronze_ingot, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.jade_shovel), " J ", " S ", " S ", 'J',
					ModElements.jade, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.jade_shovel), "J  ", "S  ", "S  ", 'J',
					ModElements.jade, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.jade_shovel), "  J", "  S", "  S", 'J',
					ModElements.jade, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.amethyst_shovel), " A ", " S ", " S ", 'A',
					ModElements.amethyst, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.amethyst_shovel), "A  ", "S  ", "S  ", 'A',
					ModElements.amethyst, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.amethyst_shovel), "  A", "  S", "  S", 'A',
					ModElements.amethyst, 'S', Items.STICK);

			// Hoes
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.copper_hoe), "CC ", " S ", " S ", 'C',
					ModElements.copper_ingot, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.copper_hoe), " CC", " S ", " S ", 'C',
					ModElements.copper_ingot, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.copper_hoe), "CC ", "S  ", "S  ", 'C',
					ModElements.copper_ingot, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.copper_hoe), " CC", "  S", "  S", 'C',
					ModElements.copper_ingot, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.bronze_hoe), "BB ", " S ", " S ", 'B',
					ModElements.bronze_ingot, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.bronze_hoe), " BB", " S ", " S ", 'B',
					ModElements.bronze_ingot, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.bronze_hoe), "BB ", "S  ", "S  ", 'B',
					ModElements.bronze_ingot, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.bronze_hoe), " BB", "  S", "  S", 'B',
					ModElements.bronze_ingot, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.jade_hoe), "JJ ", " S ", " S ", 'J',
					ModElements.jade, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.jade_hoe), " JJ", " S ", " S ", 'J',
					ModElements.jade, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.jade_hoe), "JJ ", "S  ", "S  ", 'J',
					ModElements.jade, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.jade_hoe), " JJ", "  S", "  S", 'J',
					ModElements.jade, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.amethyst_hoe), "AA ", " S ", " S ", 'A',
					ModElements.amethyst, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.amethyst_hoe), " AA", " S ", " S ", 'A',
					ModElements.amethyst, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.amethyst_hoe), "AA ", "S  ", "S  ", 'A',
					ModElements.amethyst, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.amethyst_hoe), " AA", "  S", "  S", 'A',
					ModElements.amethyst, 'S', Items.STICK);

			// Multitools
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsToolsArmour.diamond_multitool, 1),
					new Object[] { Items.DIAMOND_SWORD, Items.DIAMOND_PICKAXE, Items.DIAMOND_AXE, Items.DIAMOND_SHOVEL,
							Items.DIAMOND_HOE });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsToolsArmour.copper_multitool, 1),
					new Object[] { ModElementsToolsArmour.copper_sword, ModElementsToolsArmour.copper_pickaxe,
							ModElementsToolsArmour.copper_axe, ModElementsToolsArmour.copper_shovel,
							ModElementsToolsArmour.copper_hoe });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsToolsArmour.bronze_multitool, 1),
					new Object[] { ModElementsToolsArmour.bronze_sword, ModElementsToolsArmour.bronze_pickaxe,
							ModElementsToolsArmour.bronze_axe, ModElementsToolsArmour.bronze_shovel,
							ModElementsToolsArmour.bronze_hoe });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsToolsArmour.jade_multitool, 1),
					new Object[] { ModElementsToolsArmour.jade_sword, ModElementsToolsArmour.jade_pickaxe,
							ModElementsToolsArmour.jade_axe, ModElementsToolsArmour.jade_shovel,
							ModElementsToolsArmour.jade_hoe });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsToolsArmour.amethyst_multitool, 1),
					new Object[] { ModElementsToolsArmour.amethyst_sword, ModElementsToolsArmour.amethyst_pickaxe,
							ModElementsToolsArmour.amethyst_axe, ModElementsToolsArmour.amethyst_shovel,
							ModElementsToolsArmour.amethyst_hoe });
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.op_multitool), "AMA", "MNM", "AMA", 'A',
					ModElements.amethyst_block, 'M', ModElementsToolsArmour.amethyst_multitool, 'N', Items.NETHER_STAR);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.op_multitool), "MAM", "ANA", "MAM", 'A',
					ModElements.amethyst_block, 'M', ModElementsToolsArmour.amethyst_multitool, 'N', Items.NETHER_STAR);

			// Hammers
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.wooden_hammer), "WWW", "WWW", " S ", 'W',
					Blocks.PLANKS, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.stone_hammer), "BBB", "BBB", " S ", 'B',
					Blocks.STONE, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.iron_hammer), "III", "III", " S ", 'I',
					Items.IRON_INGOT, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.gold_hammer), "GGG", "GGG", " S ", 'G',
					Items.GOLD_INGOT, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.diamond_hammer), "DDD", "DDD", " S ", 'D',
					Items.DIAMOND, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.copper_hammer), "CCC", "CCC", " S ", 'C',
					ModElements.copper_ingot, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.bronze_hammer), "BBB", "BBB", " S ", 'B',
					ModElements.bronze_ingot, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.jade_hammer), "JJJ", "JJJ", " S ", 'J',
					ModElements.jade, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.amethyst_hammer), "AAA", "AAA", " S ", 'A',
					ModElements.amethyst, 'S', Items.STICK);

			// Scythes
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.wooden_scythe), "WWW", "WS ", " S ", 'W',
					Blocks.PLANKS, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.wooden_scythe), "WWW", " SW", " S ", 'W',
					Blocks.PLANKS, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.stone_scythe), "BBB", "BS ", " S ", 'B',
					Blocks.STONE, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.stone_scythe), "BBB", " SB", " S ", 'B',
					Blocks.STONE, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.iron_scythe), "III", "IS ", " S ", 'I',
					Items.IRON_INGOT, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.iron_scythe), "III", " SI", " S ", 'I',
					Items.IRON_INGOT, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.gold_scythe), "GGG", "GS ", " S ", 'G',
					Items.GOLD_INGOT, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.gold_scythe), "GGG", " SG", " S ", 'G',
					Items.GOLD_INGOT, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.diamond_scythe), "DDD", "DS ", " S ", 'D',
					Items.DIAMOND, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.diamond_scythe), "DDD", " SD", " S ", 'D',
					Items.DIAMOND, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.copper_scythe), "CCC", "CS ", " S ", 'C',
					ModElements.copper_ingot, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.copper_scythe), "CCC", " SC", " S ", 'C',
					ModElements.copper_ingot, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.bronze_scythe), "BBB", "BS ", " S ", 'B',
					ModElements.bronze_ingot, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.bronze_scythe), "BBB", " SB", " S ", 'B',
					ModElements.bronze_ingot, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.jade_scythe), "JJJ", "JS ", " S ", 'J',
					ModElements.jade, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.jade_scythe), "JJJ", " SJ", " S ", 'J',
					ModElements.jade, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.amethyst_scythe), "AAA", "AS ", " S ", 'A',
					ModElements.amethyst, 'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.amethyst_scythe), "AAA", " SA", " S ", 'A',
					ModElements.amethyst, 'S', Items.STICK);

			// Shears
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.wooden_shears), "W  ", " W ", "   ", 'W',
					Blocks.PLANKS);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.wooden_shears), " W ", "  W", "   ", 'W',
					Blocks.PLANKS);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.wooden_shears), " W ", "  W", "   ", 'W',
					Blocks.PLANKS);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.wooden_shears), "W  ", " W ", "   ", 'W',
					Blocks.PLANKS);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.wooden_shears), "   ", "W  ", " W ", 'W',
					Blocks.PLANKS);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.wooden_shears), "   ", " W ", "  W", 'W',
					Blocks.PLANKS);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.wooden_shears), "   ", " W ", "  W", 'W',
					Blocks.PLANKS);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.wooden_shears), "   ", "W  ", " W ", 'W',
					Blocks.PLANKS);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.stone_shears), "S  ", " S ", "   ", 'S',
					Blocks.STONE);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.stone_shears), " S ", "  S", "   ", 'S',
					Blocks.STONE);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.stone_shears), " S ", "  S", "   ", 'S',
					Blocks.STONE);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.stone_shears), "S  ", " S ", "   ", 'S',
					Blocks.STONE);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.stone_shears), "   ", "S  ", " S ", 'S',
					Blocks.STONE);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.stone_shears), "   ", " S ", "  S", 'S',
					Blocks.STONE);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.stone_shears), "   ", " S ", "  S", 'S',
					Blocks.STONE);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.stone_shears), "   ", "S  ", " S ", 'S',
					Blocks.STONE);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.gold_shears), "G  ", " G ", "   ", 'G',
					Items.GOLD_INGOT);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.gold_shears), " G ", "  G", "   ", 'G',
					Items.GOLD_INGOT);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.gold_shears), " G ", "  G", "   ", 'G',
					Items.GOLD_INGOT);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.gold_shears), "G  ", " G ", "   ", 'G',
					Items.GOLD_INGOT);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.gold_shears), "   ", "G  ", " G ", 'G',
					Items.GOLD_INGOT);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.gold_shears), "   ", " G ", "  G", 'G',
					Items.GOLD_INGOT);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.gold_shears), "   ", " G ", "  G", 'G',
					Items.GOLD_INGOT);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.gold_shears), "   ", "G  ", " G ", 'G',
					Items.GOLD_INGOT);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.gold_shears), "G  ", " G ", "   ", 'G',
					Items.GOLD_INGOT);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.diamond_shears), " D ", "  D", "   ", 'D',
					Items.DIAMOND);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.diamond_shears), " D ", "  D", "   ", 'D',
					Items.DIAMOND);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.diamond_shears), "D  ", " D ", "   ", 'D',
					Items.DIAMOND);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.diamond_shears), "   ", "D  ", " D ", 'D',
					Items.DIAMOND);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.diamond_shears), "   ", " D ", "  D", 'D',
					Items.DIAMOND);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.diamond_shears), "   ", " D ", "  D", 'D',
					Items.DIAMOND);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.diamond_shears), "   ", "D  ", " D ", 'D',
					Items.DIAMOND);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.copper_shears), " C ", "  C", "   ", 'C',
					ModElements.copper_ingot);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.copper_shears), " C ", "  C", "   ", 'C',
					ModElements.copper_ingot);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.copper_shears), "C  ", " C ", "   ", 'C',
					ModElements.copper_ingot);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.copper_shears), "   ", "C  ", " C ", 'C',
					ModElements.copper_ingot);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.copper_shears), "   ", " C ", "  C", 'C',
					ModElements.copper_ingot);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.copper_shears), "   ", " C ", "  C", 'C',
					ModElements.copper_ingot);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.copper_shears), "   ", "C  ", " C ", 'C',
					ModElements.copper_ingot);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.bronze_shears), " B ", "  B", "   ", 'B',
					ModElements.bronze_ingot);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.bronze_shears), " B ", "  B", "   ", 'B',
					ModElements.bronze_ingot);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.bronze_shears), "B  ", " B ", "   ", 'B',
					ModElements.bronze_ingot);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.bronze_shears), "   ", "B  ", " B ", 'B',
					ModElements.bronze_ingot);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.bronze_shears), "   ", " B ", "  B", 'B',
					ModElements.bronze_ingot);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.bronze_shears), "   ", " B ", "  B", 'B',
					ModElements.bronze_ingot);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.bronze_shears), "   ", "B  ", " B ", 'B',
					ModElements.bronze_ingot);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.jade_shears), " J ", "  J", "   ", 'J',
					ModElements.jade);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.jade_shears), " J ", "  J", "   ", 'J',
					ModElements.jade);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.jade_shears), "J  ", " J ", "   ", 'J',
					ModElements.jade);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.jade_shears), "   ", "J  ", " J ", 'J',
					ModElements.jade);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.jade_shears), "   ", " J ", "  J", 'J',
					ModElements.jade);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.jade_shears), "   ", " J ", "  J", 'J',
					ModElements.jade);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.jade_shears), "   ", "J  ", " J ", 'J',
					ModElements.jade);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.amethyst_shears), " A ", "  A", "   ", 'A',
					ModElements.amethyst);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.amethyst_shears), " A ", "  A", "   ", 'A',
					ModElements.amethyst);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.amethyst_shears), "A  ", " A ", "   ", 'A',
					ModElements.amethyst);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.amethyst_shears), "   ", "A  ", " A ", 'A',
					ModElements.amethyst);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.amethyst_shears), "   ", " A ", "  A", 'A',
					ModElements.amethyst);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.amethyst_shears), "   ", " A ", "  A", 'A',
					ModElements.amethyst);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.amethyst_shears), "   ", "A  ", " A ", 'A',
					ModElements.amethyst);

			// Flint and ingots
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsToolsArmour.flint_and_wood, 1),
					new Object[] { new ItemStack(Blocks.PLANKS, 1), new ItemStack(Items.FLINT, 1) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsToolsArmour.flint_and_stone, 1),
					new Object[] { new ItemStack(Blocks.STONE, 1), new ItemStack(Items.FLINT, 1) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsToolsArmour.flint_and_gold, 1),
					new Object[] { new ItemStack(Items.GOLD_INGOT, 1), new ItemStack(Items.FLINT, 1) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsToolsArmour.flint_and_diamond, 1),
					new Object[] { new ItemStack(Items.DIAMOND, 1), new ItemStack(Items.FLINT, 1) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsToolsArmour.flint_and_copper, 1),
					new Object[] { new ItemStack(ModElements.copper_ingot, 1), new ItemStack(Items.FLINT, 1) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsToolsArmour.flint_and_bronze, 1),
					new Object[] { new ItemStack(ModElements.bronze_ingot, 1), new ItemStack(Items.FLINT, 1) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsToolsArmour.flint_and_jade, 1),
					new Object[] { new ItemStack(ModElements.jade, 1), new ItemStack(Items.FLINT, 1) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsToolsArmour.flint_and_amethyst, 1),
					new Object[] { new ItemStack(ModElements.amethyst, 1), new ItemStack(Items.FLINT, 1) });

			// Armour
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.amethyst_helmet), "AAA", "A A", "   ", 'A',
					ModElements.amethyst);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.amethyst_helmet), "   ", "AAA", "A A", 'A',
					ModElements.amethyst);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.amethyst_chestplate), "A A", "AAA", "AAA", 'A',
					ModElements.amethyst);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.amethyst_leggings), "AAA", "A A", "A A", 'A',
					ModElements.amethyst);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.amethyst_boots), "   ", "A A", "A A", 'A',
					ModElements.amethyst);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.amethyst_boots), "A A", "A A", "   ", 'A',
					ModElements.amethyst);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.jade_helmet), "JJJ", "J J", "   ", 'J',
					ModElements.jade);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.jade_helmet), "   ", "JJJ", "J J", 'J',
					ModElements.jade);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.jade_chestplate), "J J", "JJJ", "JJJ", 'J',
					ModElements.jade);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.jade_leggings), "JJJ", "J J", "J J", 'J',
					ModElements.jade);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.jade_boots), "   ", "J J", "J J", 'J',
					ModElements.jade);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.jade_boots), "J J", "J J", "   ", 'J',
					ModElements.jade);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.copper_helmet), "CCC", "C C", "   ", 'C',
					ModElements.copper_ingot);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.copper_helmet), "   ", "CCC", "C C", 'C',
					ModElements.copper_ingot);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.copper_chestplate), "C C", "CCC", "CCC", 'C',
					ModElements.copper_ingot);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.copper_leggings), "CCC", "C C", "C C", 'C',
					ModElements.copper_ingot);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.copper_boots), "   ", "C C", "C C", 'C',
					ModElements.copper_ingot);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.copper_boots), "C C", "C C", "   ", 'C',
					ModElements.copper_ingot);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.bronze_helmet), "BBB", "B B", "   ", 'B',
					ModElements.bronze_ingot);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.bronze_helmet), "   ", "BBB", "B B", 'B',
					ModElements.bronze_ingot);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.bronze_chestplate), "B B", "BBB", "BBB", 'B',
					ModElements.bronze_ingot);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.bronze_leggings), "BBB", "B B", "B B", 'B',
					ModElements.bronze_ingot);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.bronze_boots), "   ", "B B", "B B", 'B',
					ModElements.bronze_ingot);
			GameRegistry.addRecipe(new ItemStack(ModElementsToolsArmour.bronze_boots), "B B", "B B", "   ", 'B',
					ModElements.bronze_ingot);
		}
	}

}
