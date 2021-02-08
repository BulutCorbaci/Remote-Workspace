
package net.mcreator.moreoresandtools.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.moreoresandtools.item.ItemRuby;
import net.mcreator.moreoresandtools.block.BlockRubyOre;
import net.mcreator.moreoresandtools.ElementsMoreOresAndToolsMod;

@ElementsMoreOresAndToolsMod.ModElement.Tag
public class RecipeRubyOreSmelting extends ElementsMoreOresAndToolsMod.ModElement {
	public RecipeRubyOreSmelting(ElementsMoreOresAndToolsMod instance) {
		super(instance, 29);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockRubyOre.block, (int) (1)), new ItemStack(ItemRuby.block, (int) (1)), 2.6599999999999997F);
	}
}
