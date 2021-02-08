
package net.mcreator.moreoresandtools.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.mcreator.moreoresandtools.creativetab.TabQuartzGemItems;
import net.mcreator.moreoresandtools.ElementsMoreOresAndToolsMod;

@ElementsMoreOresAndToolsMod.ModElement.Tag
public class BlockQuartz_GemBlock extends ElementsMoreOresAndToolsMod.ModElement {
	@GameRegistry.ObjectHolder("more_ores_and_tools:quartz_gem_block")
	public static final Block block = null;
	public BlockQuartz_GemBlock(ElementsMoreOresAndToolsMod instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("quartz_gem_block"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("more_ores_and_tools:quartz_gem_block", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.IRON);
			setUnlocalizedName("quartz_gem_block");
			setSoundType(SoundType.METAL);
			setHarvestLevel("pickaxe", 3);
			setHardness(6F);
			setResistance(12F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabQuartzGemItems.tab);
		}
	}
}
