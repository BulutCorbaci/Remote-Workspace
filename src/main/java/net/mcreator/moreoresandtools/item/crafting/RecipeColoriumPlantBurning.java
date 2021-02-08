
package net.mcreator.moreoresandtools.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.moreoresandtools.item.ItemColoriumGem;
import net.mcreator.moreoresandtools.block.BlockColoriumPlant;
import net.mcreator.moreoresandtools.ElementsMoreOresAndToolsMod;

@ElementsMoreOresAndToolsMod.ModElement.Tag
public class RecipeColoriumPlantBurning extends ElementsMoreOresAndToolsMod.ModElement {
	public RecipeColoriumPlantBurning(ElementsMoreOresAndToolsMod instance) {
		super(instance, 118);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockColoriumPlant.block, (int) (1)), new ItemStack(ItemColoriumGem.block, (int) (1)), 200F);
	}
}
