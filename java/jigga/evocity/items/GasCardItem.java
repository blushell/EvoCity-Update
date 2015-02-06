package jigga.evocity.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import jigga.evocity.EvoCity;
import jigga.evocity.lib.ModInfo;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class GasCardItem extends Item {
	
	public GasCardItem() {
		this.setUnlocalizedName("GasCard");
		this.setCreativeTab(EvoCity.EvoTab);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(ModInfo.ID + ":" + this.getUnlocalizedName().substring(5));
	}
}

