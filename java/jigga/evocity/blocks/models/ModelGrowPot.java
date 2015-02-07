package jigga.evocity.blocks.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGrowPot extends ModelBase
{
  //fields
    ModelRenderer RimF;
    ModelRenderer RimB;
    ModelRenderer RimL;
    ModelRenderer RimR;
    ModelRenderer SideF;
    ModelRenderer SideB;
    ModelRenderer SideL;
    ModelRenderer SideR;
    ModelRenderer Bottom;
    ModelRenderer PotB;
    ModelRenderer Stem;
  
  public ModelGrowPot()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      RimF = new ModelRenderer(this, 0, 0);
      RimF.addBox(0F, 0F, 0F, 18, 2, 3);
      RimF.setRotationPoint(-9F, 8F, -9F);
      RimF.setTextureSize(64, 64);
      RimF.mirror = true;
      setRotation(RimF, 0F, 0F, 0F);
      RimB = new ModelRenderer(this, 0, 0);
      RimB.addBox(0F, 0F, 0F, 18, 2, 3);
      RimB.setRotationPoint(-9F, 8F, 6F);
      RimB.setTextureSize(64, 64);
      RimB.mirror = true;
      setRotation(RimB, 0F, 0F, 0F);
      RimL = new ModelRenderer(this, 0, 0);
      RimL.addBox(0F, 0F, 0F, 3, 2, 12);
      RimL.setRotationPoint(6F, 8F, -6F);
      RimL.setTextureSize(64, 64);
      RimL.mirror = true;
      setRotation(RimL, 0F, 0F, 0F);
      RimR = new ModelRenderer(this, 0, 0);
      RimR.addBox(0F, 0F, 0F, 3, 2, 12);
      RimR.setRotationPoint(-9F, 8F, -6F);
      RimR.setTextureSize(64, 64);
      RimR.mirror = true;
      setRotation(RimR, 0F, 0F, 0F);
      SideF = new ModelRenderer(this, 0, 0);
      SideF.addBox(0F, 0F, 0F, 14, 8, 1);
      SideF.setRotationPoint(-7F, 10F, -7F);
      SideF.setTextureSize(64, 64);
      SideF.mirror = true;
      setRotation(SideF, 0F, 0F, 0F);
      SideB = new ModelRenderer(this, 0, 0);
      SideB.addBox(0F, 0F, 0F, 14, 8, 1);
      SideB.setRotationPoint(-7F, 10F, 6F);
      SideB.setTextureSize(64, 64);
      SideB.mirror = true;
      setRotation(SideB, 0F, 0F, 0F);
      SideL = new ModelRenderer(this, 0, 0);
      SideL.addBox(0F, 0F, 0F, 1, 8, 12);
      SideL.setRotationPoint(6F, 10F, -6F);
      SideL.setTextureSize(64, 64);
      SideL.mirror = true;
      setRotation(SideL, 0F, 0F, 0F);
      SideR = new ModelRenderer(this, 0, 0);
      SideR.addBox(0F, 0F, 0F, 1, 8, 12);
      SideR.setRotationPoint(-7F, 10F, -6F);
      SideR.setTextureSize(64, 64);
      SideR.mirror = true;
      setRotation(SideR, 0F, 0F, 0F);
      Bottom = new ModelRenderer(this, 0, 0);
      Bottom.addBox(0F, 0F, 0F, 14, 2, 14);
      Bottom.setRotationPoint(-7F, 22F, -7F);
      Bottom.setTextureSize(64, 64);
      Bottom.mirror = true;
      setRotation(Bottom, 0F, 0F, 0F);
      PotB = new ModelRenderer(this, 0, 0);
      PotB.addBox(0F, 0F, 0F, 12, 1, 12);
      PotB.setRotationPoint(-6F, 18F, -6F);
      PotB.setTextureSize(64, 64);
      PotB.mirror = true;
      setRotation(PotB, 0F, 0F, 0F);
      Stem = new ModelRenderer(this, 0, 0);
      Stem.addBox(0F, 0F, 0F, 6, 3, 6);
      Stem.setRotationPoint(-3F, 19F, -3F);
      Stem.setTextureSize(64, 64);
      Stem.mirror = true;
      setRotation(Stem, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    RimF.render(f5);
    RimB.render(f5);
    RimL.render(f5);
    RimR.render(f5);
    SideF.render(f5);
    SideB.render(f5);
    SideL.render(f5);
    SideR.render(f5);
    Bottom.render(f5);
    PotB.render(f5);
    Stem.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
	public void renderModel(float f) {
	    RimF.render(f);
	    RimB.render(f);
	    RimL.render(f);
	    RimR.render(f);
	    SideF.render(f);
	    SideB.render(f);
	    SideL.render(f);
	    SideR.render(f);
	    Bottom.render(f);
	    PotB.render(f);
	    Stem.render(f);
	}

}
