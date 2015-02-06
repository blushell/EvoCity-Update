package jigga.evocity;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.config.Configuration;
import jigga.evocity.blocks.EvoBlocks;
import jigga.evocity.items.EvoItems;
import jigga.evocity.lib.EvoCityTab;
import jigga.evocity.lib.ModInfo;
import jigga.evocity.lib.Recipes;
import jigga.evocity.proxies.ClientProxy;
import jigga.evocity.proxies.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod( modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION )

public class EvoCity {
	
	@SidedProxy(clientSide = "jigga.evocity.proxies.ClientProxy", serverSide = "jigga.evocity.proxies.CommonProxy")
	public static CommonProxy Proxy;

	public static CreativeTabs EvoTab = new EvoCityTab(CreativeTabs.getNextID(), "EvoTab");
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Proxy.registerRenderThings();
		EvoBlocks.init();
		EvoItems.init();

		Recipes.initSmeltingRecipes();
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {

	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}

}
