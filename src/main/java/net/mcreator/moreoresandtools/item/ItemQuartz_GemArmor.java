
package net.mcreator.moreoresandtools.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.moreoresandtools.creativetab.TabQuartzGemItems;
import net.mcreator.moreoresandtools.ElementsMoreOresAndToolsMod;

@ElementsMoreOresAndToolsMod.ModElement.Tag
public class ItemQuartz_GemArmor extends ElementsMoreOresAndToolsMod.ModElement {
	@GameRegistry.ObjectHolder("more_ores_and_tools:quartz_gem_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("more_ores_and_tools:quartz_gem_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("more_ores_and_tools:quartz_gem_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("more_ores_and_tools:quartz_gem_armorboots")
	public static final Item boots = null;
	public ItemQuartz_GemArmor(ElementsMoreOresAndToolsMod instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("QUARTZ_GEM_ARMOR", "more_ores_and_tools:quartz_gem", 19, new int[]{3, 4, 10, 4},
				12, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 4.1f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("quartz_gem_armorhelmet")
				.setRegistryName("quartz_gem_armorhelmet").setCreativeTab(TabQuartzGemItems.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("quartz_gem_armorbody")
				.setRegistryName("quartz_gem_armorbody").setCreativeTab(TabQuartzGemItems.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("quartz_gem_armorlegs")
				.setRegistryName("quartz_gem_armorlegs").setCreativeTab(TabQuartzGemItems.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("quartz_gem_armorboots")
				.setRegistryName("quartz_gem_armorboots").setCreativeTab(TabQuartzGemItems.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("more_ores_and_tools:quartz_gem_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("more_ores_and_tools:quartz_gem_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("more_ores_and_tools:quartz_gem_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("more_ores_and_tools:quartz_gem_armorboots", "inventory"));
	}
}
