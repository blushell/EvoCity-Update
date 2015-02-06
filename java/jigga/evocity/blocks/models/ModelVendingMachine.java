package jigga.evocity.blocks.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelVendingMachine extends ModelBase
{
	  //fields
	    ModelRenderer Box;
	    ModelRenderer Box2;
	    ModelRenderer LineT;
	    ModelRenderer LineB;
	    ModelRenderer LineR;
	    ModelRenderer LineL;
	    ModelRenderer ChangeT;
	    ModelRenderer ChangeB;
	    ModelRenderer ChangeL;
	    ModelRenderer ChangeR;
	    ModelRenderer Button1;
	    ModelRenderer Button2;
	    ModelRenderer Button3;
	    ModelRenderer Button4;
	    ModelRenderer Button5;
	    ModelRenderer Button6;
	  
	  public ModelVendingMachine()
	  {
	    textureWidth = 64;
	    textureHeight = 128;
	    
	      Box = new ModelRenderer(this, 0, 0);
	      Box.addBox(0F, 0F, 0F, 12, 32, 16);
	      Box.setRotationPoint(-8F, -8F, -8F);
	      Box.setTextureSize(64, 128);
	      Box.mirror = true;
	      setRotation(Box, 0F, 0F, 0F);
	      Box2 = new ModelRenderer(this, 0, 58);
	      Box2.addBox(0F, 0F, 0F, 4, 32, 14);
	      Box2.setRotationPoint(4F, -8F, -6F);
	      Box2.setTextureSize(64, 128);
	      Box2.mirror = true;
	      setRotation(Box2, 0F, 0F, 0F);
	      LineT = new ModelRenderer(this, 0, 48);
	      LineT.addBox(0F, 0F, 0F, 8, 1, 1);
	      LineT.setRotationPoint(-6F, 15F, -9F);
	      LineT.setTextureSize(64, 128);
	      LineT.mirror = true;
	      setRotation(LineT, 0F, 0F, 0F);
	      LineB = new ModelRenderer(this, 0, 48);
	      LineB.addBox(0F, 0F, 0F, 8, 1, 1);
	      LineB.setRotationPoint(-6F, 19F, -9F);
	      LineB.setTextureSize(64, 128);
	      LineB.mirror = true;
	      setRotation(LineB, 0F, 0F, 0F);
	      LineR = new ModelRenderer(this, 0, 50);
	      LineR.addBox(0F, 0F, 0F, 1, 3, 1);
	      LineR.setRotationPoint(1F, 16F, -9F);
	      LineR.setTextureSize(64, 128);
	      LineR.mirror = true;
	      setRotation(LineR, 0F, 0F, 0F);
	      LineL = new ModelRenderer(this, 0, 50);
	      LineL.addBox(0F, 0F, 0F, 1, 3, 1);
	      LineL.setRotationPoint(-6F, 16F, -9F);
	      LineL.setTextureSize(64, 128);
	      LineL.mirror = true;
	      setRotation(LineL, 0F, 0F, 0F);
	      ChangeT = new ModelRenderer(this, 0, 54);
	      ChangeT.addBox(0F, 0F, 0F, 4, 1, 1);
	      ChangeT.setRotationPoint(4F, 14F, -7F);
	      ChangeT.setTextureSize(64, 128);
	      ChangeT.mirror = true;
	      setRotation(ChangeT, 0F, 0F, 0F);
	      ChangeB = new ModelRenderer(this, 0, 54);
	      ChangeB.addBox(0F, 0F, 0F, 4, 1, 1);
	      ChangeB.setRotationPoint(4F, 16F, -7F);
	      ChangeB.setTextureSize(64, 128);
	      ChangeB.mirror = true;
	      setRotation(ChangeB, 0F, 0F, 0F);
	      ChangeL = new ModelRenderer(this, 0, 56);
	      ChangeL.addBox(0F, 0F, 0F, 1, 1, 1);
	      ChangeL.setRotationPoint(4F, 15F, -7F);
	      ChangeL.setTextureSize(64, 128);
	      ChangeL.mirror = true;
	      setRotation(ChangeL, 0F, 0F, 0F);
	      ChangeR = new ModelRenderer(this, 0, 56);
	      ChangeR.addBox(0F, 0F, 0F, 1, 1, 1);
	      ChangeR.setRotationPoint(7F, 15F, -7F);
	      ChangeR.setTextureSize(64, 128);
	      ChangeR.mirror = true;
	      setRotation(ChangeR, 0F, 0F, 0F);
	      Button1 = new ModelRenderer(this, 0, 105);
	      Button1.addBox(0F, 0F, 0F, 2, 1, 1);
	      Button1.setRotationPoint(5F, 8F, -7F);
	      Button1.setTextureSize(64, 128);
	      Button1.mirror = true;
	      setRotation(Button1, 0F, 0F, 0F);
	      Button2 = new ModelRenderer(this, 0, 107);
	      Button2.addBox(0F, 0F, 0F, 2, 1, 1);
	      Button2.setRotationPoint(5F, 6F, -7F);
	      Button2.setTextureSize(64, 128);
	      Button2.mirror = true;
	      setRotation(Button2, 0F, 0F, 0F);
	      Button3 = new ModelRenderer(this, 0, 109);
	      Button3.addBox(0F, 0F, 0F, 2, 1, 1);
	      Button3.setRotationPoint(5F, 4F, -7F);
	      Button3.setTextureSize(64, 128);
	      Button3.mirror = true;
	      setRotation(Button3, 0F, 0F, 0F);
	      Button4 = new ModelRenderer(this, 0, 111);
	      Button4.addBox(0F, 0F, 0F, 2, 1, 1);
	      Button4.setRotationPoint(5F, 2F, -7F);
	      Button4.setTextureSize(64, 128);
	      Button4.mirror = true;
	      setRotation(Button4, 0F, 0F, 0F);
	      Button5 = new ModelRenderer(this, 0, 113);
	      Button5.addBox(0F, 0F, 0F, 2, 1, 1);
	      Button5.setRotationPoint(5F, 0F, -7F);
	      Button5.setTextureSize(64, 128);
	      Button5.mirror = true;
	      setRotation(Button5, 0F, 0F, 0F);
	      Button6 = new ModelRenderer(this, 0, 115);
	      Button6.addBox(0F, 0F, 0F, 2, 1, 1);
	      Button6.setRotationPoint(5F, -2F, -7F);
	      Button6.setTextureSize(64, 128);
	      Button6.mirror = true;
	      setRotation(Button6, 0F, 0F, 0F);
	  }
	  
	  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	  {
	    super.render(entity, f, f1, f2, f3, f4, f5);
	    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	    Box.render(f5);
	    Box2.render(f5);
	    LineT.render(f5);
	    LineB.render(f5);
	    LineR.render(f5);
	    LineL.render(f5);
	    ChangeT.render(f5);
	    ChangeB.render(f5);
	    ChangeL.render(f5);
	    ChangeR.render(f5);
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

	public void renderModel(float f) {
	    Box.render(f);
	    Box2.render(f);
	    LineT.render(f);
	    LineB.render(f);
	    LineR.render(f);
	    LineL.render(f);
	    ChangeT.render(f);
	    ChangeB.render(f);
	    ChangeL.render(f);
	    ChangeR.render(f);
	    Button1.render(f);
	    Button2.render(f);
	    Button3.render(f);
	    Button4.render(f);
	    Button5.render(f);
	    Button6.render(f);
	}
	  
	}

