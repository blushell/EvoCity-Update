package jigga.evocity.items;

import jigga.evocity.EvoCity;
import jigga.evocity.lib.ModInfo;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PoliceBatonItem extends Item {
	
	public PoliceBatonItem() {
		this.setUnlocalizedName("PoliceBaton");
		this.setCreativeTab(EvoCity.EvoTab);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(ModInfo.ID + ":" + this.getUnlocalizedName().substring(5));
	}

}
