package mod.elements;

import mod.Registry;
import mod.blocks.Fence;
import mod.blocks.FenceGate;
import mod.blocks.ModStairs;
import mod.blocks.ModWall;
import mod.config.Config;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModElementsSmallerBlocks {

	// Fence
	public static Block dark_nether_bricks_fence;
	public static Block red_nether_bricks_fence;

	// Fence gates
	public static Block nether_bricks_fence_gate;
	public static Block dark_nether_bricks_fence_gate;
	public static Block red_nether_bricks_fence_gate;

	// Metal walls
	public static Block iron_wall;
	public static Block gold_wall;
	public static Block diamond_wall;
	public static Block emerald_wall;
	public static Block quartz_wall;
	public static Block copper_wall;
	public static Block tin_wall;
	public static Block bronze_wall;
	public static Block jade_wall;
	public static Block amethyst_wall;

	// Stone walls
	public static Block stone_wall;
	public static Block granite_wall;
	public static Block andesite_wall;
	public static Block diorite_wall;
	public static Block basalt_wall;
	public static Block brick_wall;
	public static Block stonebrick_wall;
	public static Block granite_bricks_wall;
	public static Block andesite_bricks_wall;
	public static Block diorite_bricks_wall;
	public static Block basalt_bricks_wall;
	public static Block sandy_stone_bricks_wall;

	// Wood walls
	public static Block oak_log_wall;
	public static Block birch_log_wall;
	public static Block spruce_log_wall;
	public static Block jungle_log_wall;
	public static Block acacia_log_wall;
	public static Block dark_oak_log_wall;
	public static Block seamless_oak_log_wall;
	public static Block seamless_birch_log_wall;
	public static Block seamless_spruce_log_wall;
	public static Block seamless_jungle_log_wall;
	public static Block seamless_acacia_log_wall;
	public static Block seamless_dark_oak_log_wall;

	// Metal stairs
	public static Block coal_stairs;
	public static Block iron_stairs;
	public static Block gold_stairs;
	public static Block lapis_stairs;
	public static Block redstone_stairs;
	public static Block diamond_stairs;
	public static Block emerald_stairs;
	public static Block tin_stairs;
	public static Block copper_stairs;
	public static Block bronze_stairs;
	public static Block jade_stairs;
	public static Block amethyst_stairs;

	// Stone stairs
	public static Block stone_stairs;
	public static Block granite_stairs;
	public static Block andesite_stairs;
	public static Block diorite_stairs;
	public static Block basalt_stairs;
	public static Block granite_bricks_stairs;
	public static Block andesite_bricks_stairs;
	public static Block diorite_bricks_stairs;
	public static Block basalt_bricks_stairs;
	public static Block sandy_stone_bricks_stairs;

	// Wood stairs
	public static Block oak_log_stairs;
	public static Block birch_log_stairs;
	public static Block spruce_log_stairs;
	public static Block jungle_log_stairs;
	public static Block acacia_log_stairs;
	public static Block dark_oak_log_stairs;
	public static Block seamless_oak_log_stairs;
	public static Block seamless_birch_log_stairs;
	public static Block seamless_spruce_log_stairs;
	public static Block seamless_jungle_log_stairs;
	public static Block seamless_acacia_log_stairs;
	public static Block seamless_dark_oak_log_stairs;

	// Sandstone stairs
	public static Block seamless_smooth_sandstone_stairs;
	public static Block seamless_smooth_red_sandstone_stairs;

	// Prismarine stairs
	public static Block prismarine_stairs;
	public static Block prismarine_bricks_stairs;
	public static Block dark_prismarine_stairs;

	// Misc walls
	public static Block obsidian_stairs;
	public static Block end_stone_bricks_stairs;
	public static Block bone_stairs;
	public static Block red_nether_bricks_stairs;
	public static Block dark_nether_bricks_stairs;

	public static void createBlocksAndItems() {

		// Fence
		dark_nether_bricks_fence = new Fence(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLACK)
				.setUnlocalizedName("dark_nether_bricks_fence").setHardness(2F).setResistance(30F)
				.setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		red_nether_bricks_fence = new Fence(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.NETHERRACK)
				.setUnlocalizedName("red_nether_bricks_fence").setHardness(2F).setResistance(30F)
				.setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);

		// Fence gates
		nether_bricks_fence_gate = new FenceGate(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.RED)
				.setUnlocalizedName("nether_bricks_fence_gate").setHardness(2F).setResistance(30F)
				.setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		dark_nether_bricks_fence_gate = new FenceGate(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLACK)
				.setUnlocalizedName("dark_nether_bricks_fence_gate").setHardness(2F).setResistance(30F)
				.setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		red_nether_bricks_fence_gate = new FenceGate(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLACK)
				.setUnlocalizedName("red_nether_bricks_fence_gate").setHardness(2F).setResistance(30F)
				.setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);

		// Metal walls
		iron_wall = new ModWall(Blocks.IRON_BLOCK, 5, 30, MapColor.IRON).setUnlocalizedName("iron_wall")
				.setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		gold_wall = new ModWall(Blocks.GOLD_BLOCK, 5, 30, MapColor.GOLD).setUnlocalizedName("gold_wall")
				.setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		diamond_wall = new ModWall(Blocks.DIAMOND_BLOCK, 5, 30, MapColor.DIAMOND).setUnlocalizedName("diamond_wall")
				.setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		emerald_wall = new ModWall(Blocks.EMERALD_BLOCK, 5, 30, MapColor.EMERALD).setUnlocalizedName("emerald_wall")
				.setHardness(5F).setResistance(30F).setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		quartz_wall = new ModWall(Blocks.QUARTZ_BLOCK, 0.8F, 4, MapColor.QUARTZ).setUnlocalizedName("quartz_wall")
				.setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		copper_wall = new ModWall(ModElements.copper_block, 5, 30, MapColor.RED).setUnlocalizedName("copper_wall")
				.setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		tin_wall = new ModWall(ModElements.tin_block, 5, 30, MapColor.IRON).setUnlocalizedName("tin_wall")
				.setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		bronze_wall = new ModWall(ModElements.bronze_block, 5, 30, MapColor.RED).setUnlocalizedName("bronze_wall")
				.setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		jade_wall = new ModWall(ModElements.jade_block, 6, 35, MapColor.EMERALD).setUnlocalizedName("jade_wall")
				.setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		amethyst_wall = new ModWall(ModElements.amethyst_block, 6, 35, MapColor.PURPLE)
				.setUnlocalizedName("amethyst_wall").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);

		// Stone walls
		stone_wall = new ModWall(Blocks.STONE, 1.5F, 30, MapColor.STONE).setUnlocalizedName("stone_wall")
				.setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		granite_wall = new ModWall(Blocks.STONE, 1.5F, 30, MapColor.RED).setUnlocalizedName("granite_wall")
				.setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		andesite_wall = new ModWall(Blocks.STONE, 1.5F, 30, MapColor.STONE).setUnlocalizedName("andesite_wall")
				.setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		diorite_wall = new ModWall(Blocks.STONE, 1.5F, 30, MapColor.IRON).setUnlocalizedName("diorite_wall")
				.setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		basalt_wall = new ModWall(Blocks.STONE, 1.5F, 30, MapColor.BLACK).setUnlocalizedName("basalt_wall")
				.setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		brick_wall = new ModWall(Blocks.BRICK_BLOCK, 2F, 30, MapColor.RED).setUnlocalizedName("brick_wall")
				.setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		stonebrick_wall = new ModWall(Blocks.STONEBRICK, 1.5F, 30, MapColor.STONE).setUnlocalizedName("stonebrick_wall")
				.setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		granite_bricks_wall = new ModWall(ModElements.granite_bricks, 1.5F, 30, MapColor.RED)
				.setUnlocalizedName("granite_bricks_wall").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		andesite_bricks_wall = new ModWall(ModElements.andesite_bricks, 1.5F, 30, MapColor.STONE)
				.setUnlocalizedName("andesite_bricks_wall")
				.setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		diorite_bricks_wall = new ModWall(ModElements.diorite_bricks, 1.5F, 30, MapColor.IRON)
				.setUnlocalizedName("diorite_bricks_wall").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		basalt_bricks_wall = new ModWall(ModElements.basalt_bricks, 1.5F, 30, MapColor.BLACK)
				.setUnlocalizedName("basalt_bricks_wall").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		sandy_stone_bricks_wall = new ModWall(ModElements.basalt_bricks, 1.5F, 30, MapColor.SAND)
				.setUnlocalizedName("sandy_stone_bricks_wall")
				.setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);

		// Wood walls

		// Metal stairs
		coal_stairs = new ModStairs(Blocks.COAL_BLOCK.getDefaultState(), Material.ROCK)
				.setUnlocalizedName("coal_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		iron_stairs = new ModStairs(Blocks.IRON_BLOCK.getDefaultState(), Material.ROCK)
				.setUnlocalizedName("iron_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		gold_stairs = new ModStairs(Blocks.GOLD_BLOCK.getDefaultState(), Material.ROCK)
				.setUnlocalizedName("gold_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		lapis_stairs = new ModStairs(Blocks.LAPIS_BLOCK.getDefaultState(), Material.ROCK)
				.setUnlocalizedName("lapis_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		redstone_stairs = new ModStairs(Blocks.REDSTONE_BLOCK.getDefaultState(), Material.ROCK)
				.setUnlocalizedName("redstone_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		diamond_stairs = new ModStairs(Blocks.DIAMOND_BLOCK.getDefaultState(), Material.ROCK)
				.setUnlocalizedName("diamond_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		emerald_stairs = new ModStairs(Blocks.EMERALD_BLOCK.getDefaultState(), Material.ROCK)
				.setUnlocalizedName("emerald_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		tin_stairs = new ModStairs(ModElements.tin_block.getDefaultState(), Material.ROCK)
				.setUnlocalizedName("tin_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		copper_stairs = new ModStairs(ModElements.copper_block.getDefaultState(), Material.ROCK)
				.setUnlocalizedName("copper_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		bronze_stairs = new ModStairs(ModElements.bronze_block.getDefaultState(), Material.ROCK)
				.setUnlocalizedName("bronze_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		jade_stairs = new ModStairs(ModElements.jade_block.getDefaultState(), Material.ROCK)
				.setUnlocalizedName("jade_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		amethyst_stairs = new ModStairs(ModElements.amethyst_block.getDefaultState(), Material.ROCK)
				.setUnlocalizedName("amethyst_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);

		// Stone stairs
		stone_stairs = new ModStairs(Blocks.STONE.getDefaultState(), Material.ROCK).setUnlocalizedName("stone_stairs")
				.setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		granite_stairs = new ModStairs(Blocks.STONE.getDefaultState(), Material.ROCK)
				.setUnlocalizedName("granite_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		andesite_stairs = new ModStairs(Blocks.STONE.getDefaultState(), Material.ROCK)
				.setUnlocalizedName("andesite_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		diorite_stairs = new ModStairs(Blocks.STONE.getDefaultState(), Material.ROCK)
				.setUnlocalizedName("diorite_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		basalt_stairs = new ModStairs(ModElements.basalt.getDefaultState(), Material.ROCK)
				.setUnlocalizedName("basalt_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		granite_bricks_stairs = new ModStairs(ModElements.granite_bricks.getDefaultState(), Material.ROCK)
				.setUnlocalizedName("granite_bricks_stairs")
				.setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		andesite_bricks_stairs = new ModStairs(ModElements.andesite_bricks.getDefaultState(), Material.ROCK)
				.setUnlocalizedName("andesite_bricks_stairs")
				.setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		diorite_bricks_stairs = new ModStairs(ModElements.diorite_bricks.getDefaultState(), Material.ROCK)
				.setUnlocalizedName("diorite_bricks_stairs")
				.setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		basalt_bricks_stairs = new ModStairs(ModElements.basalt_bricks.getDefaultState(), Material.ROCK)
				.setUnlocalizedName("basalt_bricks_stairs")
				.setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		sandy_stone_bricks_stairs = new ModStairs(ModElements.sandy_stone_bricks.getDefaultState(), Material.ROCK)
				.setUnlocalizedName("sandy_stone_bricks_stairs")
				.setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);

		// Wood stairs
		oak_log_stairs = new ModStairs(Blocks.LOG.getDefaultState(), Material.ROCK).setUnlocalizedName("oak_log_stairs")
				.setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		birch_log_stairs = new ModStairs(Blocks.LOG.getDefaultState(), Material.ROCK)
				.setUnlocalizedName("birch_log_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		spruce_log_stairs = new ModStairs(Blocks.LOG.getDefaultState(), Material.ROCK)
				.setUnlocalizedName("spruce_log_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		jungle_log_stairs = new ModStairs(Blocks.LOG.getDefaultState(), Material.ROCK)
				.setUnlocalizedName("jungle_log_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		acacia_log_stairs = new ModStairs(Blocks.LOG2.getDefaultState(), Material.ROCK)
				.setUnlocalizedName("acacia_log_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		dark_oak_log_stairs = new ModStairs(Blocks.LOG2.getDefaultState(), Material.ROCK)
				.setUnlocalizedName("dark_oak_log_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		seamless_oak_log_stairs = new ModStairs(ModElements.seamless_oak_log.getDefaultState(), Material.WOOD)
				.setUnlocalizedName("seamless_oak_log_stairs")
				.setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		seamless_birch_log_stairs = new ModStairs(ModElements.seamless_birch_log.getDefaultState(), Material.WOOD)
				.setUnlocalizedName("seamless_birch_log_stairs")
				.setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		seamless_spruce_log_stairs = new ModStairs(ModElements.seamless_spruce_log.getDefaultState(), Material.WOOD)
				.setUnlocalizedName("seamless_spruce_log_stairs")
				.setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		seamless_jungle_log_stairs = new ModStairs(ModElements.seamless_jungle_log.getDefaultState(), Material.WOOD)
				.setUnlocalizedName("seamless_jungle_log_stairs")
				.setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		seamless_acacia_log_stairs = new ModStairs(ModElements.seamless_acacia_log.getDefaultState(), Material.WOOD)
				.setUnlocalizedName("seamless_acacia_log_stairs")
				.setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		seamless_dark_oak_log_stairs = new ModStairs(ModElements.seamless_dark_oak_log.getDefaultState(), Material.WOOD)
				.setUnlocalizedName("seamless_dark_oak_log_stairs")
				.setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);

		// Sandstone stairs
		seamless_smooth_sandstone_stairs = new ModStairs(ModElements.seamless_smooth_sandstone.getDefaultState(),
				Material.ROCK).setUnlocalizedName("seamless_smooth_sandstone_stairs")
						.setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		seamless_smooth_red_sandstone_stairs = new ModStairs(
				ModElements.seamless_smooth_red_sandstone.getDefaultState(), Material.ROCK)
						.setUnlocalizedName("seamless_smooth_red_sandstone_stairs")
						.setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);

		// Prismarine stairs
		prismarine_stairs = new ModStairs(Blocks.PRISMARINE.getDefaultState(), Material.ROCK)
				.setUnlocalizedName("prismarine_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		prismarine_bricks_stairs = new ModStairs(Blocks.PRISMARINE.getDefaultState(), Material.ROCK)
				.setUnlocalizedName("prismarine_bricks_stairs")
				.setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		dark_prismarine_stairs = new ModStairs(Blocks.PRISMARINE.getDefaultState(), Material.ROCK)
				.setUnlocalizedName("dark_prismarine_stairs")
				.setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);

		// Misc stairs
		obsidian_stairs = new ModStairs(Blocks.OBSIDIAN.getDefaultState(), Material.ROCK)
				.setUnlocalizedName("obsidian_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		end_stone_bricks_stairs = new ModStairs(Blocks.END_BRICKS.getDefaultState(), Material.ROCK)
				.setUnlocalizedName("end_stone_bricks_stairs")
				.setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		bone_stairs = new ModStairs(Blocks.field_189880_di.getDefaultState(), Material.ROCK)
				.setUnlocalizedName("bone_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		red_nether_bricks_stairs = new ModStairs(Blocks.field_189879_dh.getDefaultState(), Material.ROCK)
				.setUnlocalizedName("red_nether_bricks_stairs")
				.setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
		dark_nether_bricks_stairs = new ModStairs(ModElements.dark_nether_bricks.getDefaultState(), Material.ROCK)
				.setUnlocalizedName("dark_nether_bricks_stairs")
				.setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
	}

	public static void registerItemsAndBlocks() {

		// Fence
		Registry.registerBlock(dark_nether_bricks_fence);
		Registry.registerBlock(red_nether_bricks_fence);

		// Fence gates
		Registry.registerBlock(nether_bricks_fence_gate);
		Registry.registerBlock(dark_nether_bricks_fence_gate);
		Registry.registerBlock(red_nether_bricks_fence_gate);

		// Metal walls
		Registry.registerBlock(iron_wall);
		Registry.registerBlock(gold_wall);
		Registry.registerBlock(diamond_wall);
		Registry.registerBlock(emerald_wall);
		Registry.registerBlock(quartz_wall);
		Registry.registerBlock(copper_wall);
		Registry.registerBlock(tin_wall);
		Registry.registerBlock(bronze_wall);
		Registry.registerBlock(jade_wall);
		Registry.registerBlock(amethyst_wall);

		// Stone walls
		Registry.registerBlock(stone_wall);
		Registry.registerBlock(granite_wall);
		Registry.registerBlock(andesite_wall);
		Registry.registerBlock(diorite_wall);
		Registry.registerBlock(basalt_wall);
		Registry.registerBlock(brick_wall);
		Registry.registerBlock(stonebrick_wall);
		Registry.registerBlock(granite_bricks_wall);
		Registry.registerBlock(andesite_bricks_wall);
		Registry.registerBlock(diorite_bricks_wall);
		Registry.registerBlock(basalt_bricks_wall);
		Registry.registerBlock(sandy_stone_bricks_wall);

		// Metal stairs
		Registry.registerBlock(coal_stairs);
		Registry.registerBlock(iron_stairs);
		Registry.registerBlock(gold_stairs);
		Registry.registerBlock(lapis_stairs);
		Registry.registerBlock(redstone_stairs);
		Registry.registerBlock(diamond_stairs);
		Registry.registerBlock(emerald_stairs);
		Registry.registerBlock(tin_stairs);
		Registry.registerBlock(copper_stairs);
		Registry.registerBlock(bronze_stairs);
		Registry.registerBlock(jade_stairs);
		Registry.registerBlock(amethyst_stairs);

		// Stone stairs
		Registry.registerBlock(stone_stairs);
		Registry.registerBlock(granite_stairs);
		Registry.registerBlock(andesite_stairs);
		Registry.registerBlock(diorite_stairs);
		Registry.registerBlock(basalt_stairs);
		Registry.registerBlock(granite_bricks_stairs);
		Registry.registerBlock(andesite_bricks_stairs);
		Registry.registerBlock(diorite_bricks_stairs);
		Registry.registerBlock(basalt_bricks_stairs);
		Registry.registerBlock(sandy_stone_bricks_stairs);

		// Wood stairs
		Registry.registerBlock(oak_log_stairs);
		Registry.registerBlock(birch_log_stairs);
		Registry.registerBlock(spruce_log_stairs);
		Registry.registerBlock(jungle_log_stairs);
		Registry.registerBlock(acacia_log_stairs);
		Registry.registerBlock(dark_oak_log_stairs);
		Registry.registerBlock(seamless_oak_log_stairs);
		Registry.registerBlock(seamless_birch_log_stairs);
		Registry.registerBlock(seamless_spruce_log_stairs);
		Registry.registerBlock(seamless_jungle_log_stairs);
		Registry.registerBlock(seamless_acacia_log_stairs);
		Registry.registerBlock(seamless_dark_oak_log_stairs);

		// Sandstone stairs
		Registry.registerBlock(seamless_smooth_sandstone_stairs);
		Registry.registerBlock(seamless_smooth_red_sandstone_stairs);

		// Prismarine stairs
		Registry.registerBlock(prismarine_stairs);
		Registry.registerBlock(prismarine_bricks_stairs);
		Registry.registerBlock(dark_prismarine_stairs);

		// Misc stairs
		Registry.registerBlock(obsidian_stairs);
		Registry.registerBlock(end_stone_bricks_stairs);
		Registry.registerBlock(bone_stairs);
		Registry.registerBlock(red_nether_bricks_stairs);
		Registry.registerBlock(dark_nether_bricks_stairs);
	}

	public static void registerRenders() {

		// Fence
		Registry.registerRenderBlock(dark_nether_bricks_fence);
		Registry.registerRenderBlock(red_nether_bricks_fence);

		// Fence gates
		Registry.registerRenderBlock(nether_bricks_fence_gate);
		Registry.registerRenderBlock(dark_nether_bricks_fence_gate);
		Registry.registerRenderBlock(red_nether_bricks_fence_gate);

		// Metal walls
		Registry.registerRenderBlock(iron_wall);
		Registry.registerRenderBlock(gold_wall);
		Registry.registerRenderBlock(diamond_wall);
		Registry.registerRenderBlock(emerald_wall);
		Registry.registerRenderBlock(quartz_wall);
		Registry.registerRenderBlock(copper_wall);
		Registry.registerRenderBlock(tin_wall);
		Registry.registerRenderBlock(bronze_wall);
		Registry.registerRenderBlock(jade_wall);
		Registry.registerRenderBlock(amethyst_wall);

		// Stone walls
		Registry.registerRenderBlock(stone_wall);
		Registry.registerRenderBlock(granite_wall);
		Registry.registerRenderBlock(andesite_wall);
		Registry.registerRenderBlock(diorite_wall);
		Registry.registerRenderBlock(basalt_wall);
		Registry.registerRenderBlock(brick_wall);
		Registry.registerRenderBlock(stonebrick_wall);
		Registry.registerRenderBlock(granite_bricks_wall);
		Registry.registerRenderBlock(diorite_bricks_wall);
		Registry.registerRenderBlock(andesite_bricks_wall);
		Registry.registerRenderBlock(basalt_bricks_wall);
		Registry.registerRenderBlock(sandy_stone_bricks_wall);

		// Metal stairs
		Registry.registerRenderBlock(coal_stairs);
		Registry.registerRenderBlock(iron_stairs);
		Registry.registerRenderBlock(gold_stairs);
		Registry.registerRenderBlock(lapis_stairs);
		Registry.registerRenderBlock(redstone_stairs);
		Registry.registerRenderBlock(diamond_stairs);
		Registry.registerRenderBlock(emerald_stairs);
		Registry.registerRenderBlock(tin_stairs);
		Registry.registerRenderBlock(copper_stairs);
		Registry.registerRenderBlock(bronze_stairs);
		Registry.registerRenderBlock(jade_stairs);
		Registry.registerRenderBlock(amethyst_stairs);

		// Stone stairs
		Registry.registerRenderBlock(stone_stairs);
		Registry.registerRenderBlock(granite_stairs);
		Registry.registerRenderBlock(andesite_stairs);
		Registry.registerRenderBlock(diorite_stairs);
		Registry.registerRenderBlock(basalt_stairs);
		Registry.registerRenderBlock(granite_bricks_stairs);
		Registry.registerRenderBlock(andesite_bricks_stairs);
		Registry.registerRenderBlock(diorite_bricks_stairs);
		Registry.registerRenderBlock(basalt_bricks_stairs);
		Registry.registerRenderBlock(sandy_stone_bricks_stairs);

		// Wood stairs
		Registry.registerRenderBlock(oak_log_stairs);
		Registry.registerRenderBlock(birch_log_stairs);
		Registry.registerRenderBlock(spruce_log_stairs);
		Registry.registerRenderBlock(jungle_log_stairs);
		Registry.registerRenderBlock(acacia_log_stairs);
		Registry.registerRenderBlock(dark_oak_log_stairs);
		Registry.registerRenderBlock(seamless_oak_log_stairs);
		Registry.registerRenderBlock(seamless_birch_log_stairs);
		Registry.registerRenderBlock(seamless_spruce_log_stairs);
		Registry.registerRenderBlock(seamless_jungle_log_stairs);
		Registry.registerRenderBlock(seamless_acacia_log_stairs);
		Registry.registerRenderBlock(seamless_dark_oak_log_stairs);

		// Sandstone stairs
		Registry.registerRenderBlock(seamless_smooth_sandstone_stairs);
		Registry.registerRenderBlock(seamless_smooth_red_sandstone_stairs);

		// Prismarine stairs
		Registry.registerRenderBlock(prismarine_stairs);
		Registry.registerRenderBlock(prismarine_bricks_stairs);
		Registry.registerRenderBlock(dark_prismarine_stairs);

		// Misc stairs
		Registry.registerRenderBlock(obsidian_stairs);
		Registry.registerRenderBlock(end_stone_bricks_stairs);
		Registry.registerRenderBlock(bone_stairs);
		Registry.registerRenderBlock(red_nether_bricks_stairs);
		Registry.registerRenderBlock(dark_nether_bricks_stairs);
	}

	public static void crafting() {
		if (Config.crafting == true) {

			// Fence
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.dark_nether_bricks_fence),
					new Object[] { ModElements.wooden_pattern_fence, ModElements.dark_nether_bricks });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.red_nether_bricks_fence),
					new Object[] { ModElements.wooden_pattern_fence, Blocks.field_189879_dh });

			// Fence gates
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.nether_bricks_fence_gate),
					new Object[] { ModElements.wooden_pattern_fence_gate, Blocks.NETHER_BRICK });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.dark_nether_bricks_fence_gate),
					new Object[] { ModElements.wooden_pattern_fence_gate, ModElements.dark_nether_bricks });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.red_nether_bricks_fence_gate),
					new Object[] { ModElements.wooden_pattern_fence_gate, Blocks.field_189879_dh });

			// Vanilla walls
			if (Config.craft_vanilla_blocks_with_patterns == true) {
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.COBBLESTONE_WALL),
						new Object[] { ModElements.wooden_pattern_wall, Blocks.COBBLESTONE });
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.COBBLESTONE_WALL, 1, 1),
						new Object[] { ModElements.wooden_pattern_wall, Blocks.MOSSY_COBBLESTONE });
			}

			// Metal walls
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.iron_wall),
					new Object[] { ModElements.wooden_pattern_wall, Items.IRON_INGOT });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.gold_wall),
					new Object[] { ModElements.wooden_pattern_wall, Items.GOLD_INGOT });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.diamond_wall),
					new Object[] { ModElements.wooden_pattern_wall, Items.DIAMOND });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.emerald_wall),
					new Object[] { ModElements.wooden_pattern_wall, Items.EMERALD });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.quartz_wall),
					new Object[] { ModElements.wooden_pattern_wall, Items.QUARTZ });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.copper_wall),
					new Object[] { ModElements.wooden_pattern_wall, ModElements.copper_ingot });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.tin_wall),
					new Object[] { ModElements.wooden_pattern_wall, ModElements.tin_ingot });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.bronze_wall),
					new Object[] { ModElements.wooden_pattern_wall, ModElements.bronze_ingot });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.jade_wall),
					new Object[] { ModElements.wooden_pattern_wall, ModElements.jade });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.amethyst_wall),
					new Object[] { ModElements.wooden_pattern_wall, ModElements.amethyst });

			// Stone walls
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.stone_wall),
					new Object[] { ModElements.wooden_pattern_wall, Blocks.STONE });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.granite_wall),
					new Object[] { ModElements.wooden_pattern_wall, new ItemStack(Blocks.STONE, 1, 1) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.andesite_wall),
					new Object[] { ModElements.wooden_pattern_wall, new ItemStack(Blocks.STONE, 1, 5) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.diorite_wall),
					new Object[] { ModElements.wooden_pattern_wall, new ItemStack(Blocks.STONE, 1, 3) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.basalt_wall),
					new Object[] { ModElements.wooden_pattern_wall, ModElements.basalt });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.brick_wall),
					new Object[] { ModElements.wooden_pattern_wall, Blocks.BRICK_BLOCK });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.stonebrick_wall),
					new Object[] { ModElements.wooden_pattern_wall, Blocks.STONEBRICK });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.granite_bricks_wall),
					new Object[] { ModElements.wooden_pattern_wall, ModElements.granite_bricks });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.diorite_bricks_wall),
					new Object[] { ModElements.wooden_pattern_wall, ModElements.diorite_bricks });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.andesite_bricks_wall),
					new Object[] { ModElements.wooden_pattern_wall, ModElements.andesite_bricks });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.basalt_bricks_wall),
					new Object[] { ModElements.wooden_pattern_wall, ModElements.basalt_bricks });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.sandy_stone_bricks_wall),
					new Object[] { ModElements.wooden_pattern_wall, ModElements.sandy_stone_bricks });

			// Vanilla stairs
			if (Config.craft_vanilla_blocks_with_patterns == true) {
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.OAK_STAIRS),
						new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(Blocks.PLANKS, 1, 0) });
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SPRUCE_STAIRS),
						new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(Blocks.PLANKS, 1, 1) });
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.BIRCH_STAIRS),
						new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(Blocks.PLANKS, 1, 2) });
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.JUNGLE_STAIRS),
						new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(Blocks.PLANKS, 1, 3) });
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.ACACIA_STAIRS),
						new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(Blocks.PLANKS, 1, 4) });
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.DARK_OAK_STAIRS),
						new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(Blocks.PLANKS, 1, 5) });
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.NETHER_BRICK_STAIRS),
						new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(Blocks.NETHER_BRICK) });
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PURPUR_STAIRS),
						new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(Blocks.PURPUR_BLOCK) });
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.QUARTZ_STAIRS),
						new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(Blocks.QUARTZ_BLOCK) });
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.RED_SANDSTONE_STAIRS),
						new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(Blocks.RED_SANDSTONE) });
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SANDSTONE_STAIRS),
						new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(Blocks.SANDSTONE) });
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE_BRICK_STAIRS),
						new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(Blocks.STONEBRICK) });
				GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE_STAIRS),
						new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(Blocks.COBBLESTONE) });
			}

			// Metal stairs
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.coal_stairs),
					new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(Blocks.COAL_BLOCK) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.iron_stairs),
					new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(Blocks.IRON_BLOCK) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.gold_stairs),
					new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(Blocks.GOLD_BLOCK) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.lapis_stairs),
					new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(Blocks.LAPIS_BLOCK) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.redstone_stairs),
					new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(Blocks.REDSTONE_BLOCK) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.diamond_stairs),
					new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(Blocks.DIAMOND_BLOCK) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.tin_stairs),
					new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(ModElements.tin_block) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.copper_stairs),
					new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(ModElements.copper_block) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.bronze_stairs),
					new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(ModElements.bronze_block) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.jade_stairs),
					new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(ModElements.jade_block) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.amethyst_stairs),
					new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(ModElements.amethyst_block) });

			// Stone stairs
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.stone_stairs),
					new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(Blocks.STONE, 1, 0) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.granite_stairs),
					new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(Blocks.STONE, 1, 1) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.andesite_stairs),
					new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(Blocks.STONE, 1, 5) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.diorite_stairs),
					new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(Blocks.STONE, 1, 3) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.basalt_stairs),
					new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(ModElements.basalt) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.granite_bricks_stairs),
					new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(ModElements.granite_bricks) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.andesite_bricks_stairs),
					new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(ModElements.andesite_bricks) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.diorite_bricks_stairs),
					new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(ModElements.diorite_bricks) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.basalt_bricks_stairs),
					new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(ModElements.basalt_bricks) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.sandy_stone_bricks_stairs),
					new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(ModElements.sandy_stone_bricks) });

			// Wood stairs
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.oak_log_stairs),
					new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(Blocks.LOG, 1, 0) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.birch_log_stairs),
					new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(Blocks.LOG, 1, 2) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.spruce_log_stairs),
					new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(Blocks.LOG, 1, 1) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.jungle_log_stairs),
					new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(Blocks.LOG, 1, 4) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.acacia_log_stairs),
					new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(Blocks.LOG2, 1, 0) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.dark_oak_log_stairs),
					new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(Blocks.LOG2, 1, 1) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.seamless_oak_log_stairs),
					new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(ModElements.seamless_oak_log) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.seamless_birch_log_stairs),
					new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(ModElements.seamless_birch_log) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.seamless_spruce_log_stairs),
					new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(ModElements.seamless_spruce_log) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.seamless_jungle_log_stairs),
					new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(ModElements.seamless_jungle_log) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.seamless_acacia_log_stairs),
					new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(ModElements.seamless_acacia_log) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.seamless_dark_oak_log_stairs),
					new Object[] { ModElements.wooden_pattern_stairs,
							new ItemStack(ModElements.seamless_dark_oak_log) });

			// Sandstone stairs
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.seamless_smooth_sandstone_stairs),
					new Object[] { ModElements.wooden_pattern_stairs,
							new ItemStack(ModElements.seamless_smooth_sandstone) });
			GameRegistry.addShapelessRecipe(
					new ItemStack(ModElementsSmallerBlocks.seamless_smooth_red_sandstone_stairs),
					new Object[] { ModElements.wooden_pattern_stairs,
							new ItemStack(ModElements.seamless_smooth_red_sandstone) });

			// Prismarine stairs
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.prismarine_stairs),
					new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(Blocks.PRISMARINE, 1, 0) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.prismarine_bricks_stairs),
					new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(Blocks.PRISMARINE, 1, 1) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.dark_prismarine_stairs),
					new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(Blocks.PRISMARINE, 1, 2) });

			// Misc blocks
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.obsidian_stairs),
					new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(Blocks.OBSIDIAN) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.end_stone_bricks_stairs),
					new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(Blocks.END_BRICKS) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.bone_stairs),
					new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(Blocks.field_189880_di) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.red_nether_bricks_stairs),
					new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(Blocks.field_189879_dh) });
			GameRegistry.addShapelessRecipe(new ItemStack(ModElementsSmallerBlocks.dark_nether_bricks_stairs),
					new Object[] { ModElements.wooden_pattern_stairs, new ItemStack(ModElements.dark_nether_bricks) });
		}
	}

}
