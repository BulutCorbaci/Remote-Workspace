
package net.mcreator.moreoresandtools.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.moreoresandtools.block.BlockGlowingOilBlockSmelted;
import net.mcreator.moreoresandtools.ElementsMoreOresAndToolsMod;

@ElementsMoreOresAndToolsMod.ModElement.Tag
public class FuelGlowingOil extends ElementsMoreOresAndToolsMod.ModElement {
	public FuelGlowingOil(ElementsMoreOresAndToolsMod instance) {
		super(instance, 46);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(BlockGlowingOilBlockSmelted.block, (int) (1)).getItem())
			return 72000;
		return 0;
	}
}
