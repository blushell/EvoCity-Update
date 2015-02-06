package jigga.evocity.blocks.renders;

import jigga.evocity.blocks.models.ModelVendingMachine;
import jigga.evocity.blocks.tiles.TileEntityVendingMachine;
import jigga.evocity.lib.ModInfo;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;


public class RenderVendingMachine extends TileEntitySpecialRenderer {

	public static final ResourceLocation texture = new ResourceLocation(ModInfo.ID + ":" + "textures/model/ModelVendingMachine.png");
	
	private ModelVendingMachine model;
	
	public RenderVendingMachine() {
		this.model = new ModelVendingMachine();
	}
	 
    private void adjustRotatePivotViaMeta(World world, int x, int y, int z) {
	    int meta = world.getBlockMetadata(x, y, z);
	    GL11.glPushMatrix();
	    GL11.glRotatef(meta * (-90), 0.0F, 0.0F, 1.0F);
	    GL11.glPopMatrix();
}

	
	
	@Override
	public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f) {
		
	    GL11.glPushMatrix();

	    GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
		this.bindTexture(texture);
				  
	    GL11.glPushMatrix();
	    TileEntityVendingMachine tile = (TileEntityVendingMachine) tileentity;
	    int direction = tile.direction;
	    GL11.glRotatef(direction * 90 + 90, 0.0F, 1.0F, 0.0F);

	    GL11.glPushMatrix();
	    GL11.glRotatef(180, 0.0F, 0.0F, 1.0F);
	    this.model.renderModel(0.0625F);

	    GL11.glPopMatrix();
	    GL11.glPopMatrix();
	    GL11.glPopMatrix();
	}
}

