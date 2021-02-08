
package net.mcreator.moreoresandtools.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.moreoresandtools.item.ItemQuartz_GemSword;
import net.mcreator.moreoresandtools.ElementsMoreOresAndToolsMod;

@ElementsMoreOresAndToolsMod.ModElement.Tag
public class TabQuartzGemItems extends ElementsMoreOresAndToolsMod.ModElement {
	public TabQuartzGemItems(ElementsMoreOresAndToolsMod instance) {
		super(instance, 23);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabquartz_gem_items") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemQuartz_GemSword.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
