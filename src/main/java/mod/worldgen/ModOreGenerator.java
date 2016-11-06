package mod.worldgen;

import java.util.Random;

import mod.config.Config;
import mod.elements.ModElements;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModOreGenerator implements IWorldGenerator {

	public WorldGenerator copperOre;
	public WorldGenerator tinOre;
	public WorldGenerator amethystOre;
	public WorldGenerator jadeOre;
	public WorldGenerator basalt;
	public WorldGenerator clay;

	public ModOreGenerator() {
		copperOre = new WorldGenMinable(ModElements.copper_ore.getDefaultState(), Config.copper_block_count,
				BlockMatcher.forBlock(Blocks.STONE));
		tinOre = new WorldGenMinable(ModElements.tin_ore.getDefaultState(), Config.tin_block_count,
				BlockMatcher.forBlock(Blocks.STONE));
		amethystOre = new WorldGenMinable(ModElements.amethyst_ore.getDefaultState(), Config.amethyst_block_count,
				BlockMatcher.forBlock(Blocks.END_STONE));
		jadeOre = new WorldGenMinable(ModElements.jade_ore.getDefaultState(), Config.jade_block_count,
				BlockMatcher.forBlock(Blocks.STONE));
		basalt = new WorldGenMinable(ModElements.basalt.getDefaultState(), Config.basalt_block_count,
				BlockMatcher.forBlock(Blocks.STONE));
		clay = new WorldGenMinable(Blocks.CLAY.getDefaultState(), Config.clay_block_count,
				BlockMatcher.forBlock(Blocks.STONE));
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		if (Config.spawn_copper == true) {
			if (random.nextInt(Config.copper_chance_to_spawn) == 0) {
				this.runGenerator(copperOre, world, random, chunkX, chunkZ, Config.copper_chance_to_spawn_in_chunk,
						Config.copper_min_height, Config.copper_max_height);
			}
		}
		if (Config.spawn_tin == true) {
			if (random.nextInt(Config.tin_chance_to_spawn) == 0) {
				this.runGenerator(tinOre, world, random, chunkX, chunkZ, Config.tin_chance_to_spawn_in_chunk,
						Config.tin_min_height, Config.tin_max_height);
			}
		}
		if (Config.spawn_amethyst == true) {
			if (random.nextInt(Config.amethyst_chance_to_spawn) == 0) {
				this.runGenerator(amethystOre, world, random, chunkX, chunkZ, Config.amethyst_chance_to_spawn_in_chunk,
						Config.amethyst_min_height, Config.amethyst_max_height);
			}
		}
		if (Config.spawn_jade == true) {
			if (random.nextInt(Config.jade_chance_to_spawn) == 0) {
				this.runGenerator(jadeOre, world, random, chunkX, chunkZ, Config.jade_chance_to_spawn_in_chunk,
						Config.jade_min_height, Config.jade_max_height);
			}
		}
		if (Config.spawn_basalt == true) {
			if (random.nextInt(Config.basalt_chance_to_spawn) == 0) {
				this.runGenerator(basalt, world, random, chunkX, chunkZ, Config.basalt_chance_to_spawn_in_chunk,
						Config.amethyst_min_height, Config.basalt_max_height);
			}
		}
		if (Config.spawn_clay == true) {
			if (random.nextInt(Config.clay_chance_to_spawn) == 0) {
				this.runGenerator(clay, world, random, chunkX, chunkZ, Config.clay_chance_to_spawn_in_chunk,
						Config.clay_min_height, Config.clay_max_height);
			}
		}
	}

	public void runGenerator(WorldGenerator generator, World world, Random random, int chunk_x, int chunk_z,
			int chanceToSpawn, int minHeight, int maxHeight) {
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight) {
			throw new IllegalArgumentException("Illegal height varibles for world generator");
		}
		int heightDifferent = maxHeight - minHeight + 1;
		for (int i = 0; i < chanceToSpawn; i++) {
			int x = chunk_x * 16 + random.nextInt(16);
			int y = minHeight + random.nextInt(heightDifferent);
			int z = chunk_z * 16 + random.nextInt(16);
			generator.generate(world, random, new BlockPos(x, y, z));
		}
	}

}
