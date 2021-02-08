
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

import net.mcreator.moreoresandtools.creativetab.TabCobaltTools;
import net.mcreator.moreoresandtools.ElementsMoreOresAndToolsMod;

import java.util.Set;
import java.util.HashMap;

@ElementsMoreOresAndToolsMod.ModElement.Tag
public class ItemCobaltPickaxe extends ElementsMoreOresAndToolsMod.ModElement {
	@GameRegistry.ObjectHolder("more_ores_and_tools:cobalt_pickaxe")
	public static final Item block = null;
	public ItemCobaltPickaxe(ElementsMoreOresAndToolsMod instance) {
		super(instance, 76);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("COBALT_PICKAXE", 5, 1852, 10f, 1f, 34)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 5);
				return ret.keySet();
			}
		}.setUnlocalizedName("cobalt_pickaxe").setRegistryName("cobalt_pickaxe").setCreativeTab(TabCobaltTools.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("more_ores_and_tools:cobalt_pickaxe", "inventory"));
	}
}
