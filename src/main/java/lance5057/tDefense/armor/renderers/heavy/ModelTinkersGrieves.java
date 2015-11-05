package lance5057.tDefense.armor.renderers.heavy;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * TinkersGrieves - Either Mojang or a mod author
 * Created using Tabula 4.1.1
 */
public class ModelTinkersGrieves extends ModelBiped {
    public ModelRenderer LegPlateL;
    public ModelRenderer CodPiece;
    public ModelRenderer LegPlateBackL;
    public ModelRenderer LegPlateBackR;
    public ModelRenderer LegPlateR;
    public ModelRenderer Belt;
    public ModelRenderer LeftLeg;
    public ModelRenderer RightLeg;

    public ModelTinkersGrieves() 
    {
    	super(1.0f, 0, 64,64);
    	
        this.textureWidth = 64;
        this.textureHeight = 64;
        
        this.LegPlateBackL = new ModelRenderer(this, 0, 43);
        this.LegPlateBackL.mirror = true;
        this.LegPlateBackL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegPlateBackL.addBox(-2.0F, 0.0F, 1.2F, 4, 5, 1, 0.1F);
        this.setRotateAngle(LegPlateBackL, 0.2617993877991494F, 0.0F, 0.0F);
        this.bipedLeftLeg.addChild(this.LegPlateBackL);
        
        this.LegPlateR = new ModelRenderer(this, 0, 32);
        this.LegPlateR.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegPlateR.addBox(1.1F, 0.0F, -1.9F, 1, 5, 4, 0.1F);
        this.setRotateAngle(LegPlateR, 0.0F, 3.141592653589793F, 0.2617993877991494F);
        this.bipedRightLeg.addChild(this.LegPlateR);
        
        this.LeftLeg = new ModelRenderer(this, 32, 32);
        this.LeftLeg.mirror = true;
        this.LeftLeg.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.bipedLeftLeg.addChild(this.LeftLeg);
        
        this.LegPlateL = new ModelRenderer(this, 0, 32);
        this.LegPlateL.mirror = true;
        this.LegPlateL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegPlateL.addBox(1.1F, 0.0F, -2.1F, 1, 5, 4, 0.1F);
        this.setRotateAngle(LegPlateL, 0.0F, 0.0F, -0.2617993877991494F);
        this.bipedLeftLeg.addChild(this.LegPlateL);
        
        this.CodPiece = new ModelRenderer(this, 0, 50);
        this.CodPiece.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.CodPiece.addBox(-2.0F, 10.0F, -2.8F, 4, 4, 3, -0.4F);
        this.bipedBody.addChild(this.CodPiece);
        
        this.LegPlateBackR = new ModelRenderer(this, 0, 43);
        this.LegPlateBackR.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegPlateBackR.addBox(-2.0F, 0.0F, 1.2F, 4, 5, 1, 0.1F);
        this.setRotateAngle(LegPlateBackR, 0.2617993877991494F, 0.0F, 0.0F);
        this.bipedRightLeg.addChild(this.LegPlateBackR);
        
        this.RightLeg = new ModelRenderer(this, 32, 32);
        this.RightLeg.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.bipedRightLeg.addChild(this.RightLeg);
        
        this.Belt = new ModelRenderer(this, 0, 57);
        this.Belt.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Belt.addBox(-4.5F, 10.0F, -2.5F, 9, 2, 5, 0.0F);
        this.bipedBody.addChild(this.Belt);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
