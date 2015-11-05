package lance5057.tDefense.armor.items.heavy;

import tconstruct.library.tools.ToolCore;
import tconstruct.tools.TinkerTools;
import lance5057.tDefense.TinkersDefense;
import lance5057.tDefense.armor.ArmorCore;
import lance5057.tDefense.armor.renderers.heavy.ModelTinkersHelm;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TinkersHelm extends ArmorCore 
{
	public TinkersHelm() {
		super(0,0);
		this.setUnlocalizedName("tinkershelm");
		armorModel = new ModelTinkersHelm();
	}
	
	@Override
	public Item getHeadItem() 
	{
		return TinkerTools.frypanHead;
	}
	
	@Override
	public Item getHandleItem() {
		return TinkerTools.toughRod;
	}
	
	@Override
	public Item getAccessoryItem() 
	{
		return TinkersDefense.partArmorplate;
	}
	
	@Override
	public int durabilityTypeAccessory() {
		return 2;
	}

	@Override
	public float getRepairCost() {
		return 4.0f;
	}

	@Override
	public float getDurabilityModifier() {
		return 2.5f;
	}
	
	@Override
	public float getDamageModifier() {
		return 1.4f;
	}

	@Override
	public int getPartAmount() {
		return 3;
	}
	
	@Override
	public String getIconSuffix(int partType) 
	{
		switch (partType) {
		case 0:
			return "_helm_top";
		case 1:
			return "_helm_top_broken";
		case 2:
			return "_helm_visor";
		case 3:
			return "_helm_plates";
		default:
			return "";
		}
	}
	
	@Override
	public String getEffectSuffix() 
	{
		return "_helm_effect";
	}
	
	@Override
	public String getDefaultFolder()
	{
		return "armor/helm";
	}
	
//	@Override
//	public void onUpdate(ItemStack stack, World world, Entity entity, int par4,
//			boolean par5) {
//		super.onUpdate(stack, world, entity, par4, par5);
//
//	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			String type) {
		return "tinkersdefense:textures/armor/TinkersHelm.png";
	}
	
	@Override
	public String[] getTraits() {
		return new String[] {"armor","helmet","helm","heavyarmor"};
	}

}
