
package net.mcreator.moreoresandtools.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.moreoresandtools.item.ItemGreenCopperOreAxe;
import net.mcreator.moreoresandtools.ElementsMoreOresAndToolsMod;

@ElementsMoreOresAndToolsMod.ModElement.Tag
public class TabGreenCopperTools extends ElementsMoreOresAndToolsMod.ModElement {
	public TabGreenCopperTools(ElementsMoreOresAndToolsMod instance) {
		super(instance, 91);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabgreen_copper_tools") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemGreenCopperOreAxe.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
