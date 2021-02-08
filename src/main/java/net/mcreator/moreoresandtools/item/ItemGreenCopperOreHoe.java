
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

import net.mcreator.moreoresandtools.creativetab.TabGreenCopperTools;
import net.mcreator.moreoresandtools.ElementsMoreOresAndToolsMod;

import java.util.Set;
import java.util.HashMap;

@ElementsMoreOresAndToolsMod.ModElement.Tag
public class ItemGreenCopperOreHoe extends ElementsMoreOresAndToolsMod.ModElement {
	@GameRegistry.ObjectHolder("more_ores_and_tools:green_copper_ore_hoe")
	public static final Item block = null;
	public ItemGreenCopperOreHoe(ElementsMoreOresAndToolsMod instance) {
		super(instance, 59);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemHoe(EnumHelper.addToolMaterial("GREEN_COPPER_ORE_HOE", 4, 1706, 9f, 0f, 29)) {
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("hoe", 4);
				return ret.keySet();
			}
		}.setUnlocalizedName("green_copper_ore_hoe").setRegistryName("green_copper_ore_hoe").setCreativeTab(TabGreenCopperTools.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("more_ores_and_tools:green_copper_ore_hoe", "inventory"));
	}
}
