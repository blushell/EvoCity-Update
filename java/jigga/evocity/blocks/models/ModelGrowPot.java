package jigga.evocity.blocks.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGrowPot extends ModelBase
{
	  //fields
	    ModelRenderer Top1;
	    ModelRenderer Top2;
	    ModelRenderer Bottom1;
	    ModelRenderer Bottom2;
	    ModelRenderer Bottom3;
	    ModelRenderer Bottom4;
	    ModelRenderer Bottom5;
	    ModelRenderer Base;
	    ModelRenderer SideF;
	    ModelRenderer SideL;
	    ModelRenderer SideB;
	    ModelRenderer SideR;
	    ModelRenderer InsideFR;
	    ModelRenderer InsideFL;
	    ModelRenderer InsideRF;
	    ModelRenderer InsideRB;
	    ModelRenderer InsideBR;
	    ModelRenderer InsideBL;
	    ModelRenderer InsideLF;
	    ModelRenderer InsideLB;
	    ModelRenderer Rim1;
	    ModelRenderer Rim2;
	    ModelRenderer Rim3;
	    ModelRenderer Rim4;
	  
	  public ModelGrowPot()
	  {
	    textureWidth = 128;
	    textureHeight = 128;
	    
	      Top1 = new ModelRenderer(this, 0, 0);
	      Top1.addBox(0F, 0F, 0F, 16, 2, 14);
	      Top1.setRotationPoint(-8F, 7F, -7F);
	      Top1.setTextureSize(128, 128);
	      Top1.mirror = true;
	      setRotation(Top1, 0F, 0F, 0F);
	      Top2 = new ModelRenderer(this, 0, 0);
	      Top2.addBox(0F, 0F, 0F, 14, 2, 16);
	      Top2.setRotationPoint(-7F, 7F, -8F);
	      Top2.setTextureSize(128, 128);
	      Top2.mirror = true;
	      setRotation(Top2, 0F, 0F, 0F);
	      Bottom1 = new ModelRenderer(this, 0, 0);
	      Bottom1.addBox(0F, 0F, 0F, 14, 1, 14);
	      Bottom1.setRotationPoint(-7F, 23F, -7F);
	      Bottom1.setTextureSize(128, 128);
	      Bottom1.mirror = true;
	      setRotation(Bottom1, 0F, 0F, 0F);
	      Bottom2 = new ModelRenderer(this, 0, 0);
	      Bottom2.addBox(0F, 0F, 0F, 12, 1, 12);
	      Bottom2.setRotationPoint(-6F, 22F, -6F);
	      Bottom2.setTextureSize(128, 128);
	      Bottom2.mirror = true;
	      setRotation(Bottom2, 0F, 0F, 0F);
	      Bottom3 = new ModelRenderer(this, 0, 0);
	      Bottom3.addBox(0F, 0F, 0F, 10, 1, 10);
	      Bottom3.setRotationPoint(-5F, 21F, -5F);
	      Bottom3.setTextureSize(128, 128);
	      Bottom3.mirror = true;
	      setRotation(Bottom3, 0F, 0F, 0F);
	      Bottom4 = new ModelRenderer(this, 0, 0);
	      Bottom4.addBox(0F, 0F, 0F, 8, 1, 8);
	      Bottom4.setRotationPoint(-4F, 20F, -4F);
	      Bottom4.setTextureSize(128, 128);
	      Bottom4.mirror = true;
	      setRotation(Bottom4, 0F, 0F, 0F);
	      Bottom5 = new ModelRenderer(this, 0, 0);
	      Bottom5.addBox(0F, 0F, 0F, 4, 2, 4);
	      Bottom5.setRotationPoint(-2F, 18F, -2F);
	      Bottom5.setTextureSize(128, 128);
	      Bottom5.mirror = true;
	      setRotation(Bottom5, 0F, 0F, 0F);
	      Base = new ModelRenderer(this, 0, 0);
	      Base.addBox(0F, 0F, 0F, 8, 1, 8);
	      Base.setRotationPoint(-4F, 17F, -4F);
	      Base.setTextureSize(128, 128);
	      Base.mirror = true;
	      setRotation(Base, 0F, 0F, 0F);
	      SideF = new ModelRenderer(this, 0, 0);
	      SideF.addBox(0F, 0F, 0F, 8, 1, 10);
	      SideF.setRotationPoint(-4F, 17F, -4F);
	      SideF.setTextureSize(128, 128);
	      SideF.mirror = true;
	      setRotation(SideF, 1.985648F, 0F, 0F);
	      SideL = new ModelRenderer(this, 0, 0);
	      SideL.addBox(0F, 0F, 0F, 10, 1, 8);
	      SideL.setRotationPoint(3F, 17F, -4F);
	      SideL.setTextureSize(128, 128);
	      SideL.mirror = true;
	      setRotation(SideL, 0F, 0F, -1.169371F);
	      SideB = new ModelRenderer(this, 0, 0);
	      SideB.addBox(0F, 0F, 0F, 8, 1, 10);
	      SideB.setRotationPoint(-4F, 17F, 3F);
	      SideB.setTextureSize(128, 128);
	      SideB.mirror = true;
	      setRotation(SideB, 1.172989F, 0F, 0F);
	      SideR = new ModelRenderer(this, 0, 0);
	      SideR.addBox(0F, 0F, 0F, 10, 1, 8);
	      SideR.setRotationPoint(-4F, 17F, -4F);
	      SideR.setTextureSize(128, 128);
	      SideR.mirror = true;
	      setRotation(SideR, 0F, 0F, -1.989675F);
	      InsideFR = new ModelRenderer(this, 0, 0);
	      InsideFR.addBox(0F, 0F, 0F, 1, 3, 10);
	      InsideFR.setRotationPoint(-4F, 17F, -4F);
	      InsideFR.setTextureSize(128, 128);
	      InsideFR.mirror = true;
	      setRotation(InsideFR, 1.985648F, 0F, 0F);
	      InsideFL = new ModelRenderer(this, 0, 0);
	      InsideFL.addBox(0F, 0F, 0F, 1, 3, 10);
	      InsideFL.setRotationPoint(3F, 17F, -4F);
	      InsideFL.setTextureSize(128, 128);
	      InsideFL.mirror = true;
	      setRotation(InsideFL, 1.985648F, 0F, 0F);
	      InsideRF = new ModelRenderer(this, 0, 0);
	      InsideRF.addBox(0F, 0F, 0F, 10, 3, 1);
	      InsideRF.setRotationPoint(-4F, 17F, -4F);
	      InsideRF.setTextureSize(128, 128);
	      InsideRF.mirror = true;
	      setRotation(InsideRF, 0F, 0F, -1.989675F);
	      InsideRB = new ModelRenderer(this, 0, 0);
	      InsideRB.addBox(0F, 0F, 0F, 10, 3, 1);
	      InsideRB.setRotationPoint(-4F, 17F, 3F);
	      InsideRB.setTextureSize(128, 128);
	      InsideRB.mirror = true;
	      setRotation(InsideRB, 0F, 0F, -1.989675F);
	      InsideBR = new ModelRenderer(this, 0, 0);
	      InsideBR.addBox(0F, 0F, 0F, 1, 4, 10);
	      InsideBR.setRotationPoint(-4F, 16F, 0F);
	      InsideBR.setTextureSize(128, 128);
	      InsideBR.mirror = true;
	      setRotation(InsideBR, 1.172989F, 0F, 0F);
	      InsideBL = new ModelRenderer(this, 0, 0);
	      InsideBL.addBox(0F, 0F, 0F, 1, 4, 10);
	      InsideBL.setRotationPoint(3F, 16F, 0F);
	      InsideBL.setTextureSize(128, 128);
	      InsideBL.mirror = true;
	      setRotation(InsideBL, 1.172989F, 0F, 0F);
	      InsideLF = new ModelRenderer(this, 0, 0);
	      InsideLF.addBox(0F, 0F, 0F, 10, 3, 1);
	      InsideLF.setRotationPoint(1F, 16F, -4F);
	      InsideLF.setTextureSize(128, 128);
	      InsideLF.mirror = true;
	      setRotation(InsideLF, 0F, 0F, -1.169371F);
	      InsideLB = new ModelRenderer(this, 0, 0);
	      InsideLB.addBox(0F, 0F, 0F, 10, 3, 1);
	      InsideLB.setRotationPoint(1F, 16F, 3F);
	      InsideLB.setTextureSize(128, 128);
	      InsideLB.mirror = true;
	      setRotation(InsideLB, 0F, 0F, -1.169371F);
	      Rim1 = new ModelRenderer(this, 0, 18);
	      Rim1.addBox(0F, 0F, 0F, 12, 1, 14);
	      Rim1.setRotationPoint(-6F, 6F, -7F);
	      Rim1.setTextureSize(128, 128);
	      Rim1.mirror = true;
	      setRotation(Rim1, 0F, 0F, 0F);
	      Rim2 = new ModelRenderer(this, 0, 33);
	      Rim2.addBox(0F, 0F, 0F, 12, 1, 10);
	      Rim2.setRotationPoint(-6F, 5F, -5F);
	      Rim2.setTextureSize(128, 128);
	      Rim2.mirror = true;
	      setRotation(Rim2, 0F, 0F, 0F);
	      Rim3 = new ModelRenderer(this, 0, 44);
	      Rim3.addBox(0F, 0F, 0F, 10, 1, 12);
	      Rim3.setRotationPoint(-5F, 5F, -6F);
	      Rim3.setTextureSize(128, 128);
	      Rim3.mirror = true;
	      setRotation(Rim3, 0F, 0F, 0F);
	      Rim4 = new ModelRenderer(this, 0, 57);
	      Rim4.addBox(0F, 0F, 0F, 14, 1, 12);
	      Rim4.setRotationPoint(-7F, 6F, -6F);
	      Rim4.setTextureSize(128, 128);
	      Rim4.mirror = true;
	      setRotation(Rim4, 0F, 0F, 0F);
	  }
	  
	  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	  {
	    super.render(entity, f, f1, f2, f3, f4, f5);
	    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	    Top1.render(f5);
	    Top2.render(f5);
	    Bottom1.render(f5);
	    Bottom2.render(f5);
	    Bottom3.render(f5);
	    Bottom4.render(f5);
	    Bottom5.render(f5);
	    Base.render(f5);
	    SideF.render(f5);
	    SideL.render(f5);
	    SideB.render(f5);
	    SideR.render(f5);
	    InsideFR.render(f5);
	    InsideFL.render(f5);
	    InsideRF.render(f5);
	    InsideRB.render(f5);
	    InsideBR.render(f5);
	    InsideBL.render(f5);
	    InsideLF.render(f5);
	    InsideLB.render(f5);
	    Rim1.render(f5);
	    Rim2.render(f5);
	    Rim3.render(f5);
	    Rim4.render(f5);
	  }
	  
	  private void setRotation(ModelRenderer model, float x, float y, float z)
	  {
	    model.rotateAngleX = x;
	    model.rotateAngleY = y;
	    model.rotateAngleZ = z;
	  }

	public void renderModel(float f) {
	    Top1.render(f);
	    Top2.render(f);
	    Bottom1.render(f);
	    Bottom2.render(f);
	    Bottom3.render(f);
	    Bottom4.render(f);
	    Bottom5.render(f);
	    Base.render(f);
	    SideF.render(f);
	    SideL.render(f);
	    SideB.render(f);
	    SideR.render(f);
	    InsideFR.render(f);
	    InsideFL.render(f);
	    InsideRF.render(f);
	    InsideRB.render(f);
	    InsideBR.render(f);
	    InsideBL.render(f);
	    InsideLF.render(f);
	    InsideLB.render(f);
	    Rim1.render(f);
	    Rim2.render(f);
	    Rim3.render(f);
	    Rim4.render(f);	
	}
	  
	}
