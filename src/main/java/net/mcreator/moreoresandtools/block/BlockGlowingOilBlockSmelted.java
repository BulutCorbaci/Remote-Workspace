
package net.mcreator.moreoresandtools.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.IBlockAccess;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.Block;

import net.mcreator.moreoresandtools.creativetab.TabOthers;
import net.mcreator.moreoresandtools.ElementsMoreOresAndToolsMod;

@ElementsMoreOresAndToolsMod.ModElement.Tag
public class BlockGlowingOilBlockSmelted extends ElementsMoreOresAndToolsMod.ModElement {
	@GameRegistry.ObjectHolder("more_ores_and_tools:glowing_oil_block_smelted")
	public static final Block block = null;
	public BlockGlowingOilBlockSmelted(ElementsMoreOresAndToolsMod instance) {
		super(instance, 47);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("glowing_oil_block_smelted"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("more_ores_and_tools:glowing_oil_block_smelted", "inventory"));
	}
	public static class BlockCustom extends BlockFalling {
		public BlockCustom() {
			super(Material.ROCK);
			setUnlocalizedName("glowing_oil_block_smelted");
			setSoundType(SoundType.SNOW);
			setHardness(1F);
			setResistance(1F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabOthers.tab);
		}

		@Override
		@javax.annotation.Nullable
		public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
			return NULL_AABB;
		}

		@Override
		public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
			return true;
		}

		@Override
		public boolean isFullCube(IBlockState state) {
			return false;
		}
	}
}
