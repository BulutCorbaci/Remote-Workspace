
package net.mcreator.moreoresandtools.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.moreoresandtools.item.ItemGreenCopperOreIngot;
import net.mcreator.moreoresandtools.block.BlockGreenCopperOreOre;
import net.mcreator.moreoresandtools.ElementsMoreOresAndToolsMod;

@ElementsMoreOresAndToolsMod.ModElement.Tag
public class RecipeGreenCopperOreOreSmelting extends ElementsMoreOresAndToolsMod.ModElement {
	public RecipeGreenCopperOreOreSmelting(ElementsMoreOresAndToolsMod instance) {
		super(instance, 54);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockGreenCopperOreOre.block, (int) (1)), new ItemStack(ItemGreenCopperOreIngot.block, (int) (1)),
				1.47F);
	}
}
