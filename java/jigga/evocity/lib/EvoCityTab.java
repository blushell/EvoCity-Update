package jigga.evocity.lib;

import jigga.evocity.items.EvoItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class EvoCityTab extends CreativeTabs {

	public EvoCityTab(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return EvoItems.PoliceBatonItem;
	}

}
