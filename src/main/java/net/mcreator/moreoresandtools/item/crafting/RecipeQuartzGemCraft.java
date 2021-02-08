
package net.mcreator.moreoresandtools.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.moreoresandtools.item.ItemQuartz_Gem;
import net.mcreator.moreoresandtools.ElementsMoreOresAndToolsMod;

@ElementsMoreOresAndToolsMod.ModElement.Tag
public class RecipeQuartzGemCraft extends ElementsMoreOresAndToolsMod.ModElement {
	public RecipeQuartzGemCraft(ElementsMoreOresAndToolsMod instance) {
		super(instance, 22);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(Items.QUARTZ, (int) (1)), new ItemStack(ItemQuartz_Gem.block, (int) (1)), 25F);
	}
}
