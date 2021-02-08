
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

import net.mcreator.moreoresandtools.creativetab.TabRubyTools;
import net.mcreator.moreoresandtools.ElementsMoreOresAndToolsMod;

@ElementsMoreOresAndToolsMod.ModElement.Tag
public class ItemRubyArmor extends ElementsMoreOresAndToolsMod.ModElement {
	@GameRegistry.ObjectHolder("more_ores_and_tools:ruby_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("more_ores_and_tools:ruby_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("more_ores_and_tools:ruby_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("more_ores_and_tools:ruby_armorboots")
	public static final Item boots = null;
	public ItemRubyArmor(ElementsMoreOresAndToolsMod instance) {
		super(instance, 40);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("RUBY_ARMOR", "more_ores_and_tools:ruby", 57, new int[]{8, 23, 19, 8}, 34,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("ruby_armorhelmet")
				.setRegistryName("ruby_armorhelmet").setCreativeTab(TabRubyTools.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("ruby_armorbody")
				.setRegistryName("ruby_armorbody").setCreativeTab(TabRubyTools.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("ruby_armorlegs")
				.setRegistryName("ruby_armorlegs").setCreativeTab(TabRubyTools.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("ruby_armorboots")
				.setRegistryName("ruby_armorboots").setCreativeTab(TabRubyTools.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("more_ores_and_tools:ruby_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("more_ores_and_tools:ruby_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("more_ores_and_tools:ruby_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("more_ores_and_tools:ruby_armorboots", "inventory"));
	}
}
