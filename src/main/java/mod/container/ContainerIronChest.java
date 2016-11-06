package mod.container;

import mod.tileentitys.TileEntityIronChest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerIronChest extends Container {

	public TileEntityIronChest tileEntity;

	public ContainerIronChest(IInventory playerInventory, TileEntityIronChest tileEntity) {
		this.tileEntity = tileEntity;
		// Chest slots
		for (int y = 0; y < 4; ++y) {
			for (int x = 0; x < 9; ++x) {
				this.addSlotToContainer(new Slot(tileEntity, x + y * 9, 62 + x * 18, 17 + y * 18));
			}
		}
		// Inventory slots
		for (int y = 0; y < 3; ++y) {
			for (int x = 0; x < 9; ++x) {
				this.addSlotToContainer(new Slot(playerInventory, x + y * 9 + 9, 8 + x * 18, 84 + y * 18));
			}
		}
		// Hotbar slots
		for (int x = 0; x < 9; ++x) {
			this.addSlotToContainer(new Slot(playerInventory, x, 8 + x * 18, 142));
		}
	}

	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return this.tileEntity.isUseableByPlayer(player);
	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int fromSlot) {
		ItemStack previous = null;
		Slot slot = this.inventorySlots.get(fromSlot);

		if (slot != null && slot.getHasStack()) {
			ItemStack current = slot.getStack();
			previous = current.copy();

			if (fromSlot < 36) {
				if (!this.mergeItemStack(current, 36, 45, true)) {
					return null;
				} else {
					if (!this.mergeItemStack(current, 0, 36, false)) {
						return null;
					}
				}
			}

			if (current.stackSize == 0) {
				slot.putStack((ItemStack) null);
			} else {
				slot.onSlotChanged();
			}
			if (current.stackSize == previous.stackSize) {
				return null;
			}
			slot.onPickupFromSlot(player, current);
		}
		return previous;
	}

}
