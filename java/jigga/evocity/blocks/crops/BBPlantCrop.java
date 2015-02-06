package jigga.evocity.blocks.crops;

import java.util.Random;

import jigga.evocity.items.EvoItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class BBPlantCrop extends BlockCrops {

	@Override
    protected Item func_149866_i()
    {
        return EvoItems.BBerrySeeds;
    }
	@Override
    protected Item func_149865_P()
    {
        return EvoItems.BBerryBudWet;
    }
	
	public int quantityDropped(Random random){
		return 4;
	}
	
}
