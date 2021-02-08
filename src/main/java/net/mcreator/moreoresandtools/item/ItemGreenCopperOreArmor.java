
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

import net.mcreator.moreoresandtools.creativetab.TabGreenCopperTools;
import net.mcreator.moreoresandtools.ElementsMoreOresAndToolsMod;

@ElementsMoreOresAndToolsMod.ModElement.Tag
public class ItemGreenCopperOreArmor extends ElementsMoreOresAndToolsMod.ModElement {
	@GameRegistry.ObjectHolder("more_ores_and_tools:green_copper_ore_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("more_ores_and_tools:green_copper_ore_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("more_ores_and_tools:green_copper_ore_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("more_ores_and_tools:green_copper_ore_armorboots")
	public static final Item boots = null;
	public ItemGreenCopperOreArmor(ElementsMoreOresAndToolsMod instance) {
		super(instance, 65);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("GREEN_COPPER_ORE_ARMOR", "more_ores_and_tools:greencopperore", 32,
				new int[]{6, 13, 11, 6}, 19,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 3f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("green_copper_ore_armorhelmet")
				.setRegistryName("green_copper_ore_armorhelmet").setCreativeTab(TabGreenCopperTools.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("green_copper_ore_armorbody")
				.setRegistryName("green_copper_ore_armorbody").setCreativeTab(TabGreenCopperTools.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("green_copper_ore_armorlegs")
				.setRegistryName("green_copper_ore_armorlegs").setCreativeTab(TabGreenCopperTools.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("green_copper_ore_armorboots")
				.setRegistryName("green_copper_ore_armorboots").setCreativeTab(TabGreenCopperTools.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0,
				new ModelResourceLocation("more_ores_and_tools:green_copper_ore_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("more_ores_and_tools:green_copper_ore_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("more_ores_and_tools:green_copper_ore_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0,
				new ModelResourceLocation("more_ores_and_tools:green_copper_ore_armorboots", "inventory"));
	}
}
