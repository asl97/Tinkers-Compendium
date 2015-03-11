package gmail.Lance5057.gui;

import gmail.Lance5057.com.mod_TinkersDefense;
import gmail.Lance5057.containers.Container_CrestMount;
import gmail.Lance5057.network.Message_CrestMount;
import gmail.Lance5057.tileentities.TileEntity_CrestMount;

import javax.swing.plaf.basic.BasicComboBoxUI.KeyHandler;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

public class Gui_CrestMount extends GuiContainer
{
private float xSize_lo;
private float ySize_lo;

private static final ResourceLocation iconLocation = new ResourceLocation("tinkersdefense", "textures/gui/crest_mount.png");

private final TileEntity_CrestMount inventory;

public Gui_CrestMount(InventoryPlayer invPlayer, TileEntity_CrestMount te_crest)
{
super(new Container_CrestMount(invPlayer, te_crest));
this.inventory = te_crest;


}

@Override
public void initGui()
{
	super.initGui();
	this.buttonList.add(new GuiButton(1,this.guiLeft + 60, this.guiTop + 10, 18, 18,"Flip"));
	this.buttonList.add(new GuiButton(2,this.guiLeft + 94, this.guiTop + 10, 18, 18,"Flip"));
	this.buttonList.add(new GuiButton(3,this.guiLeft + 78, this.guiTop + 10, 18, 18,"Flip"));
	this.buttonList.add(new GuiButton(4,this.guiLeft + 77, this.guiTop + 64, 18, 18,"Flip"));
}

@Override
protected void actionPerformed(GuiButton button)
{
	for(int i = 1; i<5; i++)
	{
	 if(button.id == i)
	 {
		 if(inventory.flip[i-1]==false)
			 inventory.flip[i-1]=true;
		 else
			 inventory.flip[i-1]=false;
		 
		 mod_TinkersDefense.INSTANCE.sendToServer(new Message_CrestMount(inventory.xCoord, inventory.yCoord, inventory.zCoord, inventory.flip));
	 }
	}
}

public void drawScreen(int par1, int par2, float par3)
{
super.drawScreen(par1, par2, par3);
this.xSize_lo = (float)par1;
this.ySize_lo = (float)par2;
}

protected void drawGuiContainerForegroundLayer(int par1, int par2)
{
	
}

protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
{
GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
this.mc.getTextureManager().bindTexture(iconLocation);
int k = (this.width - this.xSize) / 2;
int l = (this.height - this.ySize) / 2;
this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
}
}