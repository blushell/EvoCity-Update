package jigga.evocity.blocks.crops;

import jigga.evocity.items.EvoItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class OGPlantCrop extends BlockCrops {

	@Override
    protected Item func_149866_i()
    {
        return EvoItems.OGSeeds;
    }
	@Override
    protected Item func_149865_P()
    {
        return EvoItems.OGBudWet;
    }
	
}
