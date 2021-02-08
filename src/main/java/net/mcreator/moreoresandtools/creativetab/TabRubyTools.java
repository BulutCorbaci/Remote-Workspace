
package net.mcreator.moreoresandtools.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.moreoresandtools.item.ItemRuby;
import net.mcreator.moreoresandtools.ElementsMoreOresAndToolsMod;

@ElementsMoreOresAndToolsMod.ModElement.Tag
public class TabRubyTools extends ElementsMoreOresAndToolsMod.ModElement {
	public TabRubyTools(ElementsMoreOresAndToolsMod instance) {
		super(instance, 45);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabruby_tools") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemRuby.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
