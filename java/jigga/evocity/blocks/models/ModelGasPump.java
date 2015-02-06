package jigga.evocity.blocks.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;



public class ModelGasPump extends ModelBase {
	  //fields
	    ModelRenderer Box;
	    ModelRenderer BoxTop;
	    ModelRenderer SideL;
	    ModelRenderer SideR;
	    ModelRenderer Top;
	    ModelRenderer Screen;
	    ModelRenderer Screen2;
	    ModelRenderer Button1;
	    ModelRenderer Button2;
	    ModelRenderer Button3;
	    ModelRenderer Button4;
	    ModelRenderer Button5;
	    ModelRenderer Button6;
	  
	  public ModelGasPump()
	  {
	    textureWidth = 128;
	    textureHeight = 128;
	    
	      Box = new ModelRenderer(this, 0, 0);
	      Box.addBox(0F, 0F, 0F, 16, 16, 16);
	      Box.setRotationPoint(-8F, 8F, -8F);
	      Box.setTextureSize(128, 128);
	      Box.mirror = true;
	      setRotation(Box, 0F, 0F, 0F);
	      BoxTop = new ModelRenderer(this, 0, 32);
	      BoxTop.addBox(0F, -4F, 0F, 12, 12, 14);
	      BoxTop.setRotationPoint(-6F, 0F, -7F);
	      BoxTop.setTextureSize(128, 128);
	      BoxTop.mirror = true;
	      setRotation(BoxTop, 0F, 0F, 0F);
	      SideL = new ModelRenderer(this, 0, 62);
	      SideL.addBox(0F, 0F, 0F, 2, 18, 16);
	      SideL.setRotationPoint(6F, -10F, -8F);
	      SideL.setTextureSize(128, 128);
	      SideL.mirror = true;
	      setRotation(SideL, 0F, 0F, 0F);
	      SideR = new ModelRenderer(this, 0, 62);
	      SideR.addBox(0F, 0F, 0F, 2, 18, 16);
	      SideR.setRotationPoint(-8F, -10F, -8F);
	      SideR.setTextureSize(128, 128);
	      SideR.mirror = true;
	      setRotation(SideR, 0F, 0F, 0F);
	      Top = new ModelRenderer(this, 0, 98);
	      Top.addBox(0F, 0F, 0F, 18, 2, 18);
	      Top.setRotationPoint(-9F, -12F, -9F);
	      Top.setTextureSize(128, 128);
	      Top.mirror = true;
	      setRotation(Top, 0F, 0F, 0F);
	      Screen = new ModelRenderer(this, 36, 62);
	      Screen.addBox(0F, 0F, 0F, 8, 4, 1);
	      Screen.setRotationPoint(-4F, -3F, 7F);
	      Screen.setTextureSize(128, 128);
	      Screen.mirror = true;
	      setRotation(Screen, 0F, 0F, 0F);
	      Screen2 = new ModelRenderer(this, 36, 62);
	      Screen2.addBox(0F, 0F, 0F, 8, 4, 1);
	      Screen2.setRotationPoint(-4F, -3F, -8F);
	      Screen2.setTextureSize(128, 128);
	      Screen2.mirror = true;
	      setRotation(Screen2, 0F, 0F, 0F);
	      Button1 = new ModelRenderer(this, 36, 67);
	      Button1.addBox(0F, 0F, 0F, 2, 4, 1);
	      Button1.setRotationPoint(3F, 2F, 7F);
	      Button1.setTextureSize(128, 128);
	      Button1.mirror = true;
	      setRotation(Button1, 0F, 0F, 0F);
	      Button2 = new ModelRenderer(this, 42, 67);
	      Button2.addBox(0F, 0F, 0F, 2, 4, 1);
	      Button2.setRotationPoint(-1F, 2F, 7F);
	      Button2.setTextureSize(128, 128);
	      Button2.mirror = true;
	      setRotation(Button2, 0F, 0F, 0F);
	      Button3 = new ModelRenderer(this, 48, 67);
	      Button3.addBox(0F, 0F, 0F, 2, 4, 1);
	      Button3.setRotationPoint(-5F, 2F, 7F);
	      Button3.setTextureSize(128, 128);
	      Button3.mirror = true;
	      setRotation(Button3, 0F, 0F, 0F);
	      Button4 = new ModelRenderer(this, 36, 67);
	      Button4.addBox(0F, 0F, 0F, 2, 4, 1);
	      Button4.setRotationPoint(3F, 2F, -8F);
	      Button4.setTextureSize(128, 128);
	      Button4.mirror = true;
	      setRotation(Button4, 0F, 0F, 0F);
	      Button5 = new ModelRenderer(this, 42, 67);
	      Button5.addBox(0F, 0F, 0F, 2, 4, 1);
	      Button5.setRotationPoint(-1F, 2F, -8F);
	      Button5.setTextureSize(128, 128);
	      Button5.mirror = true;
	      setRotation(Button5, 0F, 0F, 0F);
	      Button6 = new ModelRenderer(this, 48, 67);
	      Button6.addBox(0F, 0F, 0F, 2, 4, 1);
	      Button6.setRotationPoint(-5F, 2F, -8F);
	      Button6.setTextureSize(128, 128);
	      Button6.mirror = true;
	      setRotation(Button6, 0F, 0F, 0F);
	  }
	  
	  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	  {
	    super.render(entity, f, f1, f2, f3, f4, f5);
	    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	    Box.render(f5);
	    BoxTop.render(f5);
	    SideL.render(f5);
	    SideR.render(f5);
	    Top.render(f5);
	    Screen.render(f5);
	    Screen2.render(f5);
	    Button1.render(f5);
	    Button2.render(f5);
	    Button3.render(f5);
	    Button4.render(f5);
	    Button5.render(f5);
	    Button6.render(f5);
	  }
	  
	  private void setRotation(ModelRenderer model, float x, float y, float z)
	  {
	    model.rotateAngleX = x;
	    model.rotateAngleY = y;
	    model.rotateAngleZ = z;
	  }

	  public void renderModel(float f){
		    Box.render(f);
		    BoxTop.render(f);
		    SideL.render(f);
		    SideR.render(f);
		    Top.render(f);
		    Screen.render(f);
		    Button1.render(f);
		    Button2.render(f);
		    Button3.render(f);
		    Screen2.render(f);
		    Button4.render(f);
		    Button5.render(f);
		    Button6.render(f); 
	  }

	}
