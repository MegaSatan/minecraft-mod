
package mod.container;

import javax.annotation.Nullable;
import mod.recipes.RecipesCrusher;
import mod.slot.SlotCrusherFuel;
import mod.slot.SlotCrusherOutput;
import mod.tileentitys.TileEntityCrusher;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IContainerListener;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ContainerCrusher extends Container {

	private TileEntityCrusher tileInventoryCrusher;
	private int[] cachedFields;
	private int hotbar_slot_count = 9;
	private int player_inventory_row_count = 3;
	private int player_inventory_column_count = 9;
	private int player_inventory_slot_count = player_inventory_column_count * player_inventory_row_count;
	private int vanilla_slot_count = hotbar_slot_count + player_inventory_slot_count;

	public int fuel_slots_count = 1;
	public int input_slots_count = 1;
	public int output_slots_count = 1;
	public int crusher_slots_count = fuel_slots_count + input_slots_count + output_slots_count;

	private int vanilla_first_slot_index = 0;
	private int first_fuel_slot_index = vanilla_first_slot_index + vanilla_slot_count;
	private int first_input_slot_index = first_fuel_slot_index + fuel_slots_count;
	private int first_output_slot_index = first_input_slot_index + input_slots_count;

	private int first_fuel_slot_number = 0;
	private int first_imput_slot_number = first_fuel_slot_number + fuel_slots_count;
	private int first_output_slot_number = first_imput_slot_number + input_slots_count;

	public ContainerCrusher(InventoryPlayer invPlayer, TileEntityCrusher tileInventoryCrusher) {
		this.tileInventoryCrusher = tileInventoryCrusher;

		int slot_x_spacing = 18;
		int slot_y_spacing = 18;
		int hotbar_xpos = 8;
		int hotbar_ypos = 142;
		for (int x = 0; x < hotbar_slot_count; x++) {
			int slotNumber = x;
			addSlotToContainer(new Slot(invPlayer, slotNumber, hotbar_xpos + slot_x_spacing * x, hotbar_ypos));
		}

		int player_inventory_xpos = 8;
		int player_inventory_ypos = 84;
		for (int y = 0; y < player_inventory_row_count; y++) {
			for (int x = 0; x < player_inventory_column_count; x++) {
				int slotNumber = hotbar_slot_count + y * player_inventory_column_count + x;
				int xpos = player_inventory_xpos + x * slot_x_spacing;
				int ypos = player_inventory_ypos + y * slot_y_spacing;
				addSlotToContainer(new Slot(invPlayer, slotNumber, xpos, ypos));
			}
		}

		int fuel_slots_xpos = 56;
		int fuel_slots_ypos = 53;
		for (int x = 0; x < fuel_slots_count; x++) {
			int slotNumber = x + first_fuel_slot_number;
			addSlotToContainer(new SlotFuel(tileInventoryCrusher, slotNumber, fuel_slots_xpos + slot_x_spacing * x,
					fuel_slots_ypos));
		}

		int input_slots_xpos = 56;
		int input_slots_ypos = 17;
		for (int y = 0; y < input_slots_count; y++) {
			int slotNumber = y + first_imput_slot_number;
			addSlotToContainer(new SlotSmeltableInput(tileInventoryCrusher, slotNumber, input_slots_xpos,
					input_slots_ypos + slot_y_spacing * y));
		}

		int output_slots_xpos = 116;
		int output_slots_ypos = 35;
		for (int y = 0; y < output_slots_count; y++) {
			int slotNumber = y + first_output_slot_number;
			addSlotToContainer(new SlotOutput(tileInventoryCrusher, slotNumber, output_slots_xpos,
					output_slots_ypos + slot_y_spacing * y));
		}
	}

	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return tileInventoryCrusher.isUseableByPlayer(player);
	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int sourceSlotIndex) {
		Slot sourceSlot = (Slot) inventorySlots.get(sourceSlotIndex);
		if (sourceSlot == null || !sourceSlot.getHasStack())
			return null;
		ItemStack sourceStack = sourceSlot.getStack();
		ItemStack copyOfSourceStack = sourceStack.copy();

		if (sourceSlotIndex >= vanilla_first_slot_index
				&& sourceSlotIndex < vanilla_first_slot_index + vanilla_slot_count) {
			if (TileEntityCrusher.getSmeltingResultForItem(sourceStack) != null) {
				if (!mergeItemStack(sourceStack, first_input_slot_index, first_input_slot_index + input_slots_count,
						false)) {
					return null;
				}
			} else if (TileEntityCrusher.getItemBurnTime(sourceStack) > 0) {
				if (!mergeItemStack(sourceStack, first_fuel_slot_index, first_fuel_slot_index + fuel_slots_count,
						true)) {
					return null;
				}
			} else {
				return null;
			}
		} else if (sourceSlotIndex >= first_fuel_slot_index
				&& sourceSlotIndex < first_fuel_slot_index + crusher_slots_count) {
			if (!mergeItemStack(sourceStack, vanilla_first_slot_index, vanilla_first_slot_index + vanilla_slot_count,
					false)) {
				return null;
			}
		} else {
			System.err.print("Invalid slotIndex:" + sourceSlotIndex);
			return null;
		}

		if (sourceStack.stackSize == 0) {
			sourceSlot.putStack(null);
		} else {
			sourceSlot.onSlotChanged();
		}

		sourceSlot.onPickupFromSlot(player, sourceStack);
		return copyOfSourceStack;
	}

	@Override
	public void detectAndSendChanges() {
		super.detectAndSendChanges();

		boolean allFieldsHaveChanged = false;
		boolean fieldHasChanged[] = new boolean[tileInventoryCrusher.getFieldCount()];
		if (cachedFields == null) {
			cachedFields = new int[tileInventoryCrusher.getFieldCount()];
			allFieldsHaveChanged = true;
		}
		for (int i = 0; i < cachedFields.length; ++i) {
			if (allFieldsHaveChanged || cachedFields[i] != tileInventoryCrusher.getField(i)) {
				cachedFields[i] = tileInventoryCrusher.getField(i);
				fieldHasChanged[i] = true;
			}
		}
		/*
		 * for (int i = 0; i < this.cr.size(); ++i) { IContainerListener
		 * icrafting = (IContainerListener) this.crafters.get(i); for (int
		 * fieldID = 0; fieldID < tileInventoryCrusher.getFieldCount();
		 * ++fieldID) { if (fieldHasChanged[fieldID]) {
		 * icrafting.sendProgressBarUpdate(this, fieldID,
		 * cachedFields[fieldID]); } } }
		 */
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void updateProgressBar(int id, int data) {
		tileInventoryCrusher.setField(id, data);
	}

	public class SlotFuel extends Slot {
		public SlotFuel(IInventory inventoryIn, int index, int xPosition, int yPosition) {
			super(inventoryIn, index, xPosition, yPosition);
		}

		@Override
		public boolean isItemValid(ItemStack stack) {
			return TileEntityCrusher.isItemValidForFuelSlot(stack);
		}
	}

	public class SlotSmeltableInput extends Slot {
		public SlotSmeltableInput(IInventory inventoryIn, int index, int xPosition, int yPosition) {
			super(inventoryIn, index, xPosition, yPosition);
		}

		@Override
		public boolean isItemValid(ItemStack stack) {
			return TileEntityCrusher.isItemValidForInputSlot(stack);
		}
	}

	public class SlotOutput extends Slot {
		public SlotOutput(IInventory inventoryIn, int index, int xPosition, int yPosition) {
			super(inventoryIn, index, xPosition, yPosition);
		}

		@Override
		public boolean isItemValid(ItemStack stack) {
			return TileEntityCrusher.isItemValidForOutputSlot(stack);
		}
	}

}