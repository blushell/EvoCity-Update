package jigga.evocity.blocks;

import jigga.evocity.blocks.crops.BBPlantCrop;
import jigga.evocity.blocks.crops.OGPlantCrop;
import jigga.evocity.blocks.tiles.TileEntityGrowPot;
import jigga.evocity.blocks.tiles.TileEntityVendingMachine;
import jigga.evocity.blocks.tiles.TileEntityblockGasPump;
import jigga.evocity.lib.ModInfo;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class EvoBlocks {

	public static Block GuanoBoxBlock;
	public static Block GasPumpBlock;
	public static Block VendingMachineBlock;
	public static Block GrowPotBlock;
	
	//Blueberry Kush
	public static Block BBerryPlant;
	//OG Kush
	public static Block OGPlant;
	
	
	public static void init(){
		
		GuanoBoxBlock = new GuanoBoxBlock(Material.wood);
		GameRegistry.registerBlock(GuanoBoxBlock, "GuanoBox");
		
		BBerryPlant = new BBPlantCrop().setBlockName("BBerryPlant").setBlockTextureName(ModInfo.ID + ":bbplant");
		GameRegistry.registerBlock(BBerryPlant, "BBerryPlant");
		
		OGPlant = new OGPlantCrop().setBlockName("OGPlant").setBlockTextureName(ModInfo.ID + ":ogplant");
		GameRegistry.registerBlock(OGPlant, "OGPlant");
		
		GasPumpBlock = new GasPumpBlock(Material.iron).setBlockName("GasPump");
		GameRegistry.registerBlock(GasPumpBlock, "GasPump");
		 GameRegistry.registerTileEntity(TileEntityblockGasPump.class, "tileEntityGasPump");
		 
		 VendingMachineBlock = new VendingMachineBlock(Material.iron).setBlockName("VendingMachine");
			GameRegistry.registerBlock(VendingMachineBlock, "VendingMachine");
			 GameRegistry.registerTileEntity(TileEntityVendingMachine.class, "tileEntityVendingMachine");
			 
			 GrowPotBlock = new GrowPotBlock(Material.sand).setBlockName("GrowPot");
			 GameRegistry.registerBlock(GrowPotBlock, "GrowPot");
			  GameRegistry.registerTileEntity(TileEntityGrowPot.class, "tileEntityGrowPot");
		
	}
}