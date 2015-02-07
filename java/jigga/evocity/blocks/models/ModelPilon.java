package jigga.evocity.blocks.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPilon extends ModelBase
{
	  //fields
	    ModelRenderer Base;
	    ModelRenderer Poll;
	    ModelRenderer Top;
	  
	  public ModelPilon()
	  {
	    textureWidth = 32;
	    textureHeight = 64;
	    
	      Base = new ModelRenderer(this, 0, 0);
	      Base.addBox(0F, 0F, 0F, 8, 4, 8);
	      Base.setRotationPoint(-4F, 20F, -4F);
	      Base.setTextureSize(32, 64);
	      Base.mirror = true;
	      setRotation(Base, 0F, 0F, 0F);
	      Poll = new ModelRenderer(this, 0, 12);
	      Poll.addBox(0F, 0F, 0F, 4, 27, 4);
	      Poll.setRotationPoint(-2F, -7F, -2F);
	      Poll.setTextureSize(32, 64);
	      Poll.mirror = true;
	      setRotation(Poll, 0F, 0F, 0F);
	      Top = new ModelRenderer(this, 16, 12);
	      Top.addBox(0F, 0F, 0F, 2, 1, 2);
	      Top.setRotationPoint(-1F, -8F, -1F);
	      Top.setTextureSize(32, 64);
	      Top.mirror = true;
	      setRotation(Top, 0F, 0F, 0F);
	  }
	  
	  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	  {
	    super.render(entity, f, f1, f2, f3, f4, f5);
	    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	    Base.render(f5);
	    Poll.render(f5);
	    Top.render(f5);
	  }
	  
	  private void setRotation(ModelRenderer model, float x, float y, float z)
	  {
	    model.rotateAngleX = x;
	    model.rotateAngleY = y;
	    model.rotateAngleZ = z;
	  }
	  
		public void renderModel(float f) {
		    Base.render(f);
		    Poll.render(f);
		    Top.render(f);
		}
	  
	}

