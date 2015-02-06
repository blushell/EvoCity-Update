package jigga.evocity.blocks;

import jigga.evocity.EvoCity;
import jigga.evocity.blocks.tiles.TileEntityGrowPot;
import jigga.evocity.lib.ModInfo;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;



public class GrowPotBlock extends BlockContainer {

	public GrowPotBlock(Material material) {
		super(material);
		
		this.setHardness(5.0F);
		this.setResistance(5.0F);
		this.setStepSound(soundTypeMetal);
		this.setCreativeTab(EvoCity.EvoTab);
		this.setBlockBounds(0F, 0F, 0F, 1F, 1F, 1F);
	}
	
	public int getRenderType() {
		return -1;
	}
	
	public boolean isOpaqueCube() {
		return false;
	}
	
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityGrowPot();
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(ModInfo.ID + ":" + this.getUnlocalizedName().substring(5));

	}
	
	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack stack)
	{
	if (entity == null)
	{
	return;
	}
  }
}


