package jigga.evocity.lib;

import net.minecraft.item.ItemStack;
import jigga.evocity.items.EvoItems;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {

	public static void initSmeltingRecipes(){
		GameRegistry.addSmelting(EvoItems.BBerryBudWet, new ItemStack(EvoItems.BBerryBud), 0F);
		GameRegistry.addSmelting(EvoItems.OGBudWet, new ItemStack(EvoItems.OGBud), 0F);
	}
	
}
