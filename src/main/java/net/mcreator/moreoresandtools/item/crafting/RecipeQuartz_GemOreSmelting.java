
package net.mcreator.moreoresandtools.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.moreoresandtools.item.ItemQuartz_Gem;
import net.mcreator.moreoresandtools.block.BlockQuartz_GemOre;
import net.mcreator.moreoresandtools.ElementsMoreOresAndToolsMod;

@ElementsMoreOresAndToolsMod.ModElement.Tag
public class RecipeQuartz_GemOreSmelting extends ElementsMoreOresAndToolsMod.ModElement {
	public RecipeQuartz_GemOreSmelting(ElementsMoreOresAndToolsMod instance) {
		super(instance, 6);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockQuartz_GemOre.block, (int) (1)), new ItemStack(ItemQuartz_Gem.block, (int) (1)),
				0.9099999999999998F);
	}
}
