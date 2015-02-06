package jigga.evocity.items;

import jigga.evocity.EvoCity;
import jigga.evocity.blocks.EvoBlocks;
import jigga.evocity.blocks.crops.BBPlantCrop;
import jigga.evocity.blocks.crops.OGPlantCrop;
import jigga.evocity.lib.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import cpw.mods.fml.common.registry.GameRegistry;

public class EvoItems {

	public static Item PoliceBatonItem;
	public static Item GasCardItem;
	
	//BlueBerry Kush
	public static Item BBerrySeeds;
	public static Item BBerryBudWet;
	public static Item BBerryBud;
	
	//OG Kush
	public static Item OGSeeds;
	public static Item OGBudWet;
	public static Item OGBud;
	
	public static void init(){
		
		PoliceBatonItem = new PoliceBatonItem();
		GameRegistry.registerItem(PoliceBatonItem, "PoliceBaton");
		
		GasCardItem = new GasCardItem();
		GameRegistry.registerItem(GasCardItem, "GasCard");
			
		//BlueBerry Kush
		BBerrySeeds = new ItemSeeds(EvoBlocks.BBerryPlant, Blocks.farmland).setUnlocalizedName("BBerrySeeds").setTextureName(ModInfo.ID + ":bbseeds").setCreativeTab(EvoCity.EvoTab);
		GameRegistry.registerItem(BBerrySeeds, "BBerrySeeds");
		
		BBerryBudWet = new Item().setUnlocalizedName("BBerryBudWet").setTextureName(ModInfo.ID + ":bbbudwet").setCreativeTab(EvoCity.EvoTab);
		GameRegistry.registerItem(BBerryBudWet, "BBerryBudWet");
		
		BBerryBud = new Item().setUnlocalizedName("BBerryBud").setTextureName(ModInfo.ID + ":bbbud").setCreativeTab(EvoCity.EvoTab);
		GameRegistry.registerItem(BBerryBud, "BBerryBud");
		
		
		//OG Kush
		OGSeeds = new ItemSeeds(EvoBlocks.OGPlant, EvoBlocks.GrowPotBlock).setUnlocalizedName("OGSeeds").setTextureName(ModInfo.ID + ":ogseeds").setCreativeTab(EvoCity.EvoTab);
		GameRegistry.registerItem(OGSeeds, "OGSeeds");
		
		OGBudWet = new Item().setUnlocalizedName("OGBudWet").setTextureName(ModInfo.ID + ":ogbudwet").setCreativeTab(EvoCity.EvoTab);
		GameRegistry.registerItem(OGBudWet, "OGBudWet");
		
		OGBud = new Item().setUnlocalizedName("OGBud").setTextureName(ModInfo.ID + ":ogbud").setCreativeTab(EvoCity.EvoTab);
		GameRegistry.registerItem(OGBud, "OGBud");

	}
}