package jigga.evocity.blocks;

import jigga.evocity.EvoCity;
import jigga.evocity.lib.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GuanoBoxBlock extends Block {

	protected GuanoBoxBlock(Material material) {
		super(material);
		this.setBlockName("GuanoBox");
		this.setCreativeTab(EvoCity.EvoTab);
		this.setStepSound(soundTypeMetal);
	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(ModInfo.ID + ":" + this.getUnlocalizedName().substring(5));
	}
}
