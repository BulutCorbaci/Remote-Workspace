
package net.mcreator.moreoresandtools.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.moreoresandtools.creativetab.TabCobaltTools;
import net.mcreator.moreoresandtools.ElementsMoreOresAndToolsMod;

import java.util.Set;
import java.util.HashMap;

@ElementsMoreOresAndToolsMod.ModElement.Tag
public class ItemCobaltHoe extends ElementsMoreOresAndToolsMod.ModElement {
	@GameRegistry.ObjectHolder("more_ores_and_tools:cobalt_hoe")
	public static final Item block = null;
	public ItemCobaltHoe(ElementsMoreOresAndToolsMod instance) {
		super(instance, 80);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemHoe(EnumHelper.addToolMaterial("COBALT_HOE", 5, 1852, 10f, 0f, 34)) {
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("hoe", 5);
				return ret.keySet();
			}
		}.setUnlocalizedName("cobalt_hoe").setRegistryName("cobalt_hoe").setCreativeTab(TabCobaltTools.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("more_ores_and_tools:cobalt_hoe", "inventory"));
	}
}
