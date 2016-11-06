package mod.fluids;

import net.minecraft.init.SoundEvents;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

public class FluidEnderium extends Fluid {

	public static final FluidEnderium instance = new FluidEnderium();

	public FluidEnderium() {
		super("enderium", new ResourceLocation("mm:blocks/enderium_still"),
				new ResourceLocation("mm:blocks/enderium_flow"));
		this.setFillSound(SoundEvents.ITEM_BUCKET_FILL);
	}

}
