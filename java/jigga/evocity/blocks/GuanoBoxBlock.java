package jigga.evocity.blocks;

import java.util.Random;

import jigga.evocity.EvoCity;
import jigga.evocity.lib.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class GuanoBoxBlock extends Block {
	
public IIcon gor;
public IIcon dol;
public IIcon st1;
public IIcon st2;
public IIcon st3;
public IIcon st4;


	protected GuanoBoxBlock(Material material) {
		super(material);
		this.setBlockName("GuanoBox");
		this.setCreativeTab(EvoCity.EvoTab);
		this.setStepSound(soundTypeWood);
	}

	public void registerBlockIcons(IIconRegister reg){
	this.gor = reg.registerIcon(ModInfo.ID + ":GuanoBox");
	this.dol = reg.registerIcon(ModInfo.ID + ":GuanoBox _Top");
	this.st1 = reg.registerIcon(ModInfo.ID + ":GuanoBox");
	this.st2 = reg.registerIcon(ModInfo.ID + ":GuanoBox");
	this.st3 = reg.registerIcon(ModInfo.ID + ":GuanoBox");
	this.st4 = reg.registerIcon(ModInfo.ID + ":GuanoBox");
	}
	
	public IIcon getIcon(int i, int par2){

		if (i == 0)
		return gor;

		else if (i == 1)
		return dol;

		else if (i == 2)
		return st1;

		else if (i == 3)
		return st2;

		else if (i == 4)
		return st4;

		else if (i == 5)
		return st3;

		else
		return gor;

		}
	
	
	public void randomDisplayTick(World world, int i, int j, int k, Random random){
		EntityPlayer entity = Minecraft.getMinecraft().thePlayer;
				World par1World = world;
						int par2 = i;
						int par3 = j;
						int par4 = k;
				Random par5Random = random;
		if(true)
		        for (int l = 0; l < 4; ++l)
		        {
		            double d0 = (double)((float)par2 + par5Random.nextFloat());
		            double d1 = (double)((float)par3 + par5Random.nextFloat());
		            double d2 = (double)((float)par4 + par5Random.nextFloat());
		            double d3 = 0.0D;
		            double d4 = 0.0D;
		            double d5 = 0.0D;
		            int i1 = par5Random.nextInt(2) * 2 - 1;
		            d3 = ((double)par5Random.nextFloat() - 0.5D) * 0.5D;
		            d4 = ((double)par5Random.nextFloat() - 0.5D) * 0.5D;
		            d5 = ((double)par5Random.nextFloat() - 0.5D) * 0.5D;
		            par1World.spawnParticle("smoke", d0, d1, d2, d3, d4, d5);
		        }
		}
}
