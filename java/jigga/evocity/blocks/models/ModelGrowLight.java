package jigga.evocity.blocks.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;



public class ModelGrowLight extends ModelBase
{
	  //fields
	    ModelRenderer Shade;
	    ModelRenderer Shade1;
	    ModelRenderer Shade2;
	    ModelRenderer Shade3;
	    ModelRenderer Shade4;
	    ModelRenderer SideR;
	    ModelRenderer SideL;
	    ModelRenderer Light1;
	    ModelRenderer Light2;
	    ModelRenderer Light3;
	    ModelRenderer Light4;
	    ModelRenderer ITop;
	    ModelRenderer IMid;
	    ModelRenderer IBot;
	    ModelRenderer Chain;
	    ModelRenderer Chain2;
	  
	  public ModelGrowLight()
	  {
	    textureWidth = 64;
	    textureHeight = 128;
	    
	      Shade = new ModelRenderer(this, 0, 111);
	      Shade.addBox(0F, 0F, 0F, 16, 1, 16);
	      Shade.setRotationPoint(-8F, 21F, -8F);
	      Shade.setTextureSize(64, 128);
	      Shade.mirror = true;
	      setRotation(Shade, 0F, 0F, 0F);
	      Shade1 = new ModelRenderer(this, 0, 0);
	      Shade1.addBox(0F, 0F, 0F, 14, 1, 16);
	      Shade1.setRotationPoint(-7F, 20F, -8F);
	      Shade1.setTextureSize(64, 128);
	      Shade1.mirror = true;
	      setRotation(Shade1, 0F, 0F, 0F);
	      Shade2 = new ModelRenderer(this, 0, 0);
	      Shade2.addBox(0F, 0F, 0F, 12, 1, 16);
	      Shade2.setRotationPoint(-6F, 19F, -8F);
	      Shade2.setTextureSize(64, 128);
	      Shade2.mirror = true;
	      setRotation(Shade2, 0F, 0F, 0F);
	      Shade3 = new ModelRenderer(this, 0, 0);
	      Shade3.addBox(0F, 0F, 0F, 10, 1, 16);
	      Shade3.setRotationPoint(-5F, 18F, -8F);
	      Shade3.setTextureSize(64, 128);
	      Shade3.mirror = true;
	      setRotation(Shade3, 0F, 0F, 0F);
	      Shade4 = new ModelRenderer(this, 0, 0);
	      Shade4.addBox(0F, 0F, 0F, 6, 1, 16);
	      Shade4.setRotationPoint(-3F, 17F, -8F);
	      Shade4.setTextureSize(64, 128);
	      Shade4.mirror = true;
	      setRotation(Shade4, 0F, 0F, 0F);
	      SideR = new ModelRenderer(this, 0, 0);
	      SideR.addBox(0F, 0F, 0F, 1, 2, 16);
	      SideR.setRotationPoint(-8F, 22F, -8F);
	      SideR.setTextureSize(64, 128);
	      SideR.mirror = true;
	      setRotation(SideR, 0F, 0F, 0F);
	      SideL = new ModelRenderer(this, 0, 0);
	      SideL.addBox(0F, 0F, 0F, 1, 2, 16);
	      SideL.setRotationPoint(7F, 22F, -8F);
	      SideL.setTextureSize(64, 128);
	      SideL.mirror = true;
	      setRotation(SideL, 0F, 0F, 0F);
	      Light1 = new ModelRenderer(this, 0, 94);
	      Light1.addBox(0F, 0F, 0F, 2, 1, 16);
	      Light1.setRotationPoint(-6F, 22F, -8F);
	      Light1.setTextureSize(64, 128);
	      Light1.mirror = true;
	      setRotation(Light1, 0F, 0F, 0F);
	      Light2 = new ModelRenderer(this, 0, 94);
	      Light2.addBox(0F, 0F, 0F, 2, 1, 16);
	      Light2.setRotationPoint(-3F, 22F, -8F);
	      Light2.setTextureSize(64, 128);
	      Light2.mirror = true;
	      setRotation(Light2, 0F, 0F, 0F);
	      Light3 = new ModelRenderer(this, 0, 94);
	      Light3.addBox(0F, 0F, 0F, 2, 1, 16);
	      Light3.setRotationPoint(1F, 22F, -8F);
	      Light3.setTextureSize(64, 128);
	      Light3.mirror = true;
	      setRotation(Light3, 0F, 0F, 0F);
	      Light4 = new ModelRenderer(this, 0, 94);
	      Light4.addBox(0F, 0F, 0F, 2, 1, 16);
	      Light4.setRotationPoint(4F, 22F, -8F);
	      Light4.setTextureSize(64, 128);
	      Light4.mirror = true;
	      setRotation(Light4, 0F, 0F, 0F);
	      ITop = new ModelRenderer(this, 0, 25);
	      ITop.addBox(0F, 0F, 0F, 4, 1, 16);
	      ITop.setRotationPoint(-2F, 8F, -8F);
	      ITop.setTextureSize(64, 128);
	      ITop.mirror = true;
	      setRotation(ITop, 0F, 0F, 0F);
	      IMid = new ModelRenderer(this, 0, 25);
	      IMid.addBox(0F, 0F, 0F, 2, 3, 16);
	      IMid.setRotationPoint(-1F, 9F, -8F);
	      IMid.setTextureSize(64, 128);
	      IMid.mirror = true;
	      setRotation(IMid, 0F, 0F, 0F);
	      IBot = new ModelRenderer(this, 0, 25);
	      IBot.addBox(0F, 0F, 0F, 4, 1, 16);
	      IBot.setRotationPoint(-2F, 12F, -8F);
	      IBot.setTextureSize(64, 128);
	      IBot.mirror = true;
	      setRotation(IBot, 0F, 0F, 0F);
	      Chain = new ModelRenderer(this, 0, 48);
	      Chain.addBox(0F, 0F, 0F, 2, 4, 1);
	      Chain.setRotationPoint(-1F, 13F, 5F);
	      Chain.setTextureSize(64, 128);
	      Chain.mirror = true;
	      setRotation(Chain, 0F, 0F, 0F);
	      Chain2 = new ModelRenderer(this, 0, 48);
	      Chain2.addBox(0F, 0F, 0F, 2, 4, 1);
	      Chain2.setRotationPoint(-1F, 13F, -6F);
	      Chain2.setTextureSize(64, 128);
	      Chain2.mirror = true;
	      setRotation(Chain2, 0F, 0F, 0F);
	  }
	  
	  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	  {
	    super.render(entity, f, f1, f2, f3, f4, f5);
	    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	    Shade.render(f5);
	    Shade1.render(f5);
	    Shade2.render(f5);
	    Shade3.render(f5);
	    Shade4.render(f5);
	    SideR.render(f5);
	    SideL.render(f5);
	    Light1.render(f5);
	    Light2.render(f5);
	    Light3.render(f5);
	    Light4.render(f5);
	    ITop.render(f5);
	    IMid.render(f5);
	    IBot.render(f5);
	    Chain.render(f5);
	    Chain2.render(f5);
	  }
	  
	  private void setRotation(ModelRenderer model, float x, float y, float z)
	  {
	    model.rotateAngleX = x;
	    model.rotateAngleY = y;
	    model.rotateAngleZ = z;
	  }
	  
	  public void renderModel(float f){
		    Shade.render(f);
		    Shade1.render(f);
		    Shade2.render(f);
		    Shade3.render(f);
		    Shade4.render(f);
		    SideR.render(f);
		    SideL.render(f);
		    Light1.render(f);
		    Light2.render(f);
		    Light3.render(f);
		    Light4.render(f);
		    ITop.render(f);
		    IMid.render(f);
		    IBot.render(f);
		    Chain.render(f);
		    Chain2.render(f); 
	  }
	  
	}

