package jigga.evocity.blocks;

import jigga.evocity.EvoCity;
import jigga.evocity.blocks.tiles.TileEntityblockGasPump;
import jigga.evocity.items.EvoItems;
import jigga.evocity.lib.ModInfo;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GasPumpBlock extends BlockContainer  {

	public GasPumpBlock(Material material) {
		super(material);
		this.setStepSound(soundTypeMetal);
		this.setCreativeTab(EvoCity.EvoTab);
		this.setBlockBounds(0F, 0F, 0F, 1F, 2.5F, 1F);
		this.setLightLevel(8.0F);
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
		return new TileEntityblockGasPump();
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(ModInfo.ID + ":" + this.getUnlocalizedName().substring(5));

	}
	
	@Override
	public void onBlockAdded(World world, int i, int j, int k){
		EntityPlayer entity = Minecraft.getMinecraft().thePlayer;
		if(entity!=null&&world!=null){
		int le = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
		world.setBlockMetadataWithNotify(i, j, k, le, 2);
		}

		world.scheduleBlockUpdate(i, j, k, this, this.tickRate(world));

		}
	
	public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer entity, int l, float m, float n, float o){

		if(entity.inventory.getCurrentItem()!=null&&entity.inventory.getCurrentItem().getItem() == EvoItems.GasCardItem){
		if(entity instanceof EntityPlayer)((EntityPlayer)entity).inventory.addItemStackToInventory(new ItemStack(Items.coal, 3));
		}

		if(entity.inventory.getCurrentItem()!=null&&entity.inventory.getCurrentItem().getItem() == EvoItems.GasCardItem){
		if(entity instanceof EntityPlayer)((EntityPlayer)entity).inventory.consumeInventoryItem(EvoItems.GasCardItem);
		}

		return true;}

}

