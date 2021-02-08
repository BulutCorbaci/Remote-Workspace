
package net.mcreator.moreoresandtools.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.moreoresandtools.block.BlockGlowingOilBlock;
import net.mcreator.moreoresandtools.ElementsMoreOresAndToolsMod;

@ElementsMoreOresAndToolsMod.ModElement.Tag
public class TabOthers extends ElementsMoreOresAndToolsMod.ModElement {
	public TabOthers(ElementsMoreOresAndToolsMod instance) {
		super(instance, 48);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabothers") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockGlowingOilBlock.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
