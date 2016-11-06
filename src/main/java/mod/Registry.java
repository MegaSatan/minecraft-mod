package mod;

import com.google.common.base.Strings;

import mod.blocks.BlockEnderium;
import mod.fluids.FluidEnderium;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class Registry {

	public static Block registerBlock(Block block) {
		String name = block.getUnlocalizedName().substring(5);
		if (block.getRegistryName() == null && Strings.isNullOrEmpty(name))
			throw new IllegalArgumentException("Attempted to register a Block with no name: " + block);
		if (block.getRegistryName() != null && !block.getRegistryName().toString().equals(name))
			throw new IllegalArgumentException("Attempted to register a Block with conflicting names. Old: "
					+ block.getRegistryName() + " New: " + name);
		return registerBlockAndItemBlock(block.getRegistryName() != null ? block : block.setRegistryName(name));
	}

	public static Block registerBlock(Block block, String name) {
		if (block.getRegistryName() == null && Strings.isNullOrEmpty(name))
			throw new IllegalArgumentException("Attempted to register a Block with no name: " + block);
		if (block.getRegistryName() != null && !block.getRegistryName().toString().equals(name))
			throw new IllegalArgumentException("Attempted to register a Block with conflicting names. Old: "
					+ block.getRegistryName() + " New: " + name);
		return registerBlockAndItemBlock(block.getRegistryName() != null ? block : block.setRegistryName(name));
	}

	public static Block registerBlockOnly(Block block, String name) {
		block.setRegistryName(name);
		if (block.getRegistryName() == null && Strings.isNullOrEmpty(name))
			throw new IllegalArgumentException("Attempted to register a Block with no name: " + block);
		if (block.getRegistryName() != null && !block.getRegistryName().toString().equals(name))
			throw new IllegalArgumentException("Attempted to register a Block with conflicting names. Old: "
					+ block.getRegistryName() + " New: " + name);
		GameRegistry.register(block);
		return block;
	}

	public static Block registerBlockAndItemBlock(Block block) {
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
		return block;
	}

	public static void registerItem(Item item) {
		String name = item.getUnlocalizedName().substring(5);
		if (item.getRegistryName() == null && Strings.isNullOrEmpty(name))
			throw new IllegalArgumentException("Attempted to register a item with no name: " + item);
		if (item.getRegistryName() != null && !item.getRegistryName().toString().equals(name))
			throw new IllegalArgumentException("Attempted to register a item with conflicting names. Old: "
					+ item.getRegistryName() + " New: " + name);
		GameRegistry.register(item.getRegistryName() == null ? item.setRegistryName(name) : item);
	}

	public static void registerRenderItem(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
				new ModelResourceLocation(Reference.modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

	public static void registerRenderBlock(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation(
						Reference.modid + ":" + Item.getItemFromBlock(block).getUnlocalizedName().substring(5),
						"inventory"));
	}

	public static void registerOreOreDictionary(String name, Item item) {
		OreDictionary.registerOre(name, item);
	}

	public static void registerOreOreDictionary(String name, Block block) {
		OreDictionary.registerOre(name, block);
	}

	public static void registerEnderium() {
		FluidRegistry.registerFluid(FluidEnderium.instance);
		registerBlockOnly(BlockEnderium.instance, "mm:enderium");
		//registerBlock(BlockEnderium.instance);
		ModelLoader.setCustomStateMapper(BlockEnderium.instance, new StateMapperBase() {
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
				return new ModelResourceLocation("mm:enderium");
			}
		});
	}

}
