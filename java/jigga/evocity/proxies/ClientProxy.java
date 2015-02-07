package jigga.evocity.proxies;

import jigga.evocity.blocks.renders.RenderGasPump;
import jigga.evocity.blocks.renders.RenderGrowLight;
import jigga.evocity.blocks.renders.RenderGrowPot;
import jigga.evocity.blocks.renders.RenderPilon;
import jigga.evocity.blocks.renders.RenderVendingMachine;
import jigga.evocity.blocks.tiles.TileEntityGrowLight;
import jigga.evocity.blocks.tiles.TileEntityGrowPot;
import jigga.evocity.blocks.tiles.TileEntityPilon;
import jigga.evocity.blocks.tiles.TileEntityVendingMachine;
import jigga.evocity.blocks.tiles.TileEntityblockGasPump;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {

	public void registerRenderThings() {
		
		TileEntitySpecialRenderer rendergp = new RenderGasPump();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityblockGasPump.class, rendergp);
		
		TileEntitySpecialRenderer rendervm = new RenderVendingMachine();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityVendingMachine.class, rendervm);
		
		TileEntitySpecialRenderer renderfp = new RenderGrowPot();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGrowPot.class, renderfp);

		TileEntitySpecialRenderer rendergl = new RenderGrowLight();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGrowLight.class, rendergl);
		
		TileEntitySpecialRenderer renderpl = new RenderPilon();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPilon.class, renderpl);
	}

	public void registerTileEntitySpecialRenderer(){
		
	}
	
}
