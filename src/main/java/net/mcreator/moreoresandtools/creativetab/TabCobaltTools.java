
package net.mcreator.moreoresandtools.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.moreoresandtools.item.ItemCobaltPickaxe;
import net.mcreator.moreoresandtools.ElementsMoreOresAndToolsMod;

@ElementsMoreOresAndToolsMod.ModElement.Tag
public class TabCobaltTools extends ElementsMoreOresAndToolsMod.ModElement {
	public TabCobaltTools(ElementsMoreOresAndToolsMod instance) {
		super(instance, 92);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabcobalt_tools") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemCobaltPickaxe.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
