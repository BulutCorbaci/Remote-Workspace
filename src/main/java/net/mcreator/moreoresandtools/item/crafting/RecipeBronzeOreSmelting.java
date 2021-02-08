
package net.mcreator.moreoresandtools.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.moreoresandtools.item.ItemBronzeIngot;
import net.mcreator.moreoresandtools.block.BlockBronzeOre;
import net.mcreator.moreoresandtools.ElementsMoreOresAndToolsMod;

@ElementsMoreOresAndToolsMod.ModElement.Tag
public class RecipeBronzeOreSmelting extends ElementsMoreOresAndToolsMod.ModElement {
	public RecipeBronzeOreSmelting(ElementsMoreOresAndToolsMod instance) {
		super(instance, 124);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockBronzeOre.block, (int) (1)), new ItemStack(ItemBronzeIngot.block, (int) (1)), 1.68F);
	}
}
