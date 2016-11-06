package mod.worldgen;

import java.util.Random;

import mod.config.Config;
import mod.elements.ModElements;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockFlower.EnumFlowerColor;
import net.minecraft.block.BlockFlowerPot.EnumFlowerType;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenBush;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModFlowerGenerator implements IWorldGenerator {

	public WorldGenerator yellow_tulip;
	public WorldGenerator green_tulip;
	public WorldGenerator blue_tulip;
	public WorldGenerator black_tulip;

	public ModFlowerGenerator() {
		yellow_tulip = new ModWorldGeneratorFlowers(ModElements.yellow_tulip);
		green_tulip = new ModWorldGeneratorFlowers(ModElements.green_tulip);
		blue_tulip = new ModWorldGeneratorFlowers(ModElements.blue_tulip);
		black_tulip = new ModWorldGeneratorFlowers(ModElements.black_tulip);
	}

	public void runGenerator(WorldGenerator generator, World world, Random random, int chunk_x, int chunk_z,
			int minChanceToSpawn, int maxChanceToSpawn, int chanceToSpawn) {
		int x = chunk_x * 16;
		int z = chunk_z * 16;
		Biome biome = world.getBiomeGenForCoords(new BlockPos(x, 64, z));
		if (biome != Biomes.DEEP_OCEAN && biome != Biomes.OCEAN && biome != Biomes.FROZEN_OCEAN
				&& biome != Biomes.DESERT && biome != Biomes.DESERT_HILLS && biome != Biomes.MUSHROOM_ISLAND
				&& biome != Biomes.MUSHROOM_ISLAND_SHORE) {
			if (random.nextInt(chanceToSpawn) == 1) {
				int numberOfFlowers = minChanceToSpawn + random.nextInt(maxChanceToSpawn - minChanceToSpawn);
				for (int i = 0; i < numberOfFlowers; i++) {
					int randomX = x + random.nextInt(16);
					int randomZ = z + random.nextInt(16);
					generator.generate(world, random, new BlockPos(randomX, 24, randomZ));
				}
			}
		}
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		if (Config.spawn_flowers) {
			this.runGenerator(yellow_tulip, world, random, chunkX, chunkZ, 3, 15, 16);
			this.runGenerator(green_tulip, world, random, chunkX, chunkZ, 3, 15, 16);
			this.runGenerator(blue_tulip, world, random, chunkX, chunkZ, 3, 15, 16);
			this.runGenerator(black_tulip, world, random, chunkX, chunkZ, 3, 15, 16);
		}
	}

	public static int getGroundFromAbove(World world, int x, int z) {
		int y = 255;
		boolean foundGround = false;
		while (!foundGround && y-- >= 0) {
			Block blockAt = world.getBlockState(new BlockPos(x, y, z)).getBlock();
			foundGround = blockAt == Blocks.DIRT || blockAt == Blocks.GRASS;
		}

		return y;
	}
}
