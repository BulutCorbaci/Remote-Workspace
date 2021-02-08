
package net.mcreator.moreoresandtools.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.moreoresandtools.creativetab.TabRubyTools;
import net.mcreator.moreoresandtools.ElementsMoreOresAndToolsMod;

import java.util.Set;
import java.util.HashMap;

@ElementsMoreOresAndToolsMod.ModElement.Tag
public class ItemRubyPickaxe extends ElementsMoreOresAndToolsMod.ModElement {
	@GameRegistry.ObjectHolder("more_ores_and_tools:ruby_pickaxe")
	public static final Item block = null;
	public ItemRubyPickaxe(ElementsMoreOresAndToolsMod instance) {
		super(instance, 30);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("RUBY_PICKAXE", 8, 1620, 13f, 4f, 53)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 8);
				return ret.keySet();
			}
		}.setUnlocalizedName("ruby_pickaxe").setRegistryName("ruby_pickaxe").setCreativeTab(TabRubyTools.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("more_ores_and_tools:ruby_pickaxe", "inventory"));
	}
}
