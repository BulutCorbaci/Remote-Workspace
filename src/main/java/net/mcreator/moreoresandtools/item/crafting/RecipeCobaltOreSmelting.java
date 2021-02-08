
package net.mcreator.moreoresandtools.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.moreoresandtools.item.ItemCobaltDust;
import net.mcreator.moreoresandtools.block.BlockCobaltOre;
import net.mcreator.moreoresandtools.ElementsMoreOresAndToolsMod;

@ElementsMoreOresAndToolsMod.ModElement.Tag
public class RecipeCobaltOreSmelting extends ElementsMoreOresAndToolsMod.ModElement {
	public RecipeCobaltOreSmelting(ElementsMoreOresAndToolsMod instance) {
		super(instance, 75);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockCobaltOre.block, (int) (1)), new ItemStack(ItemCobaltDust.block, (int) (1)), 1.68F);
	}
}
