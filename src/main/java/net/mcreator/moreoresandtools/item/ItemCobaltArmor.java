
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

import net.mcreator.moreoresandtools.creativetab.TabCobaltTools;
import net.mcreator.moreoresandtools.ElementsMoreOresAndToolsMod;

@ElementsMoreOresAndToolsMod.ModElement.Tag
public class ItemCobaltArmor extends ElementsMoreOresAndToolsMod.ModElement {
	@GameRegistry.ObjectHolder("more_ores_and_tools:cobalt_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("more_ores_and_tools:cobalt_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("more_ores_and_tools:cobalt_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("more_ores_and_tools:cobalt_armorboots")
	public static final Item boots = null;
	public ItemCobaltArmor(ElementsMoreOresAndToolsMod instance) {
		super(instance, 86);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("COBALT_ARMOR", "more_ores_and_tools:cobalt", 36, new int[]{7, 15, 14, 7}, 22,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("cobalt_armorhelmet")
				.setRegistryName("cobalt_armorhelmet").setCreativeTab(TabCobaltTools.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("cobalt_armorbody")
				.setRegistryName("cobalt_armorbody").setCreativeTab(TabCobaltTools.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("cobalt_armorlegs")
				.setRegistryName("cobalt_armorlegs").setCreativeTab(TabCobaltTools.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("cobalt_armorboots")
				.setRegistryName("cobalt_armorboots").setCreativeTab(TabCobaltTools.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("more_ores_and_tools:cobalt_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("more_ores_and_tools:cobalt_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("more_ores_and_tools:cobalt_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("more_ores_and_tools:cobalt_armorboots", "inventory"));
	}
}
