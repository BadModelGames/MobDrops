package me.thesuperhb.mobdrops.content.armor;

import me.thesuperhb.mobdrops.Refrence;
import me.thesuperhb.mobdrops.content.MobDropItems;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class OcelotArmor extends ItemArmor {
	public OcelotArmor(ArmorMaterial material, int id, int placement){
		super(material, id, placement);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) 
	{
		if (stack.getItem() == MobDropItems.ocelotHelmet || stack.getItem() == MobDropItems.ocelotChestplate  || stack.getItem() == MobDropItems.ocelotBoots)
			return Refrence.MODID + ":textures/models/armor/ocelot_1.png";
		if (stack.getItem() == MobDropItems.ocelotLeggings)
			return Refrence.MODID + ":textures/models/armor/ocelot_2.png";
		else
			return null;
	}
}
