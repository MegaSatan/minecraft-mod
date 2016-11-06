package mod.blocks;

import java.util.Random;

import net.minecraft.block.BlockDoor;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Door extends BlockDoor {

	public Item doorItem;

	public Door(Material material, SoundType stepSound, String tool, int toolLevel, Item doorItem) {
		super(material);
		this.setSoundType(stepSound);
		this.setHarvestLevel(tool, toolLevel);
		this.doorItem = doorItem;
	}

}
