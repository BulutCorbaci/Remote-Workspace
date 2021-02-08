
package net.mcreator.moreoresandtools.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.moreoresandtools.item.ItemColoriumGem;
import net.mcreator.moreoresandtools.block.BlockColoriumGemOre;
import net.mcreator.moreoresandtools.ElementsMoreOresAndToolsMod;

@ElementsMoreOresAndToolsMod.ModElement.Tag
public class RecipeColoriumGemOreSmelting extends ElementsMoreOresAndToolsMod.ModElement {
	public RecipeColoriumGemOreSmelting(ElementsMoreOresAndToolsMod instance) {
		super(instance, 99);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockColoriumGemOre.block, (int) (1)), new ItemStack(ItemColoriumGem.block, (int) (1)), 7F);
	}
}
