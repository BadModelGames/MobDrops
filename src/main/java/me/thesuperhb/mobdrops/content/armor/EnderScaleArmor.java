package me.thesuperhb.mobdrops.content.armor;

import me.thesuperhb.mobdrops.Refrence;
import me.thesuperhb.mobdrops.content.MobDropItems;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class EnderScaleArmor extends ItemArmor {
	public EnderScaleArmor(ArmorMaterial material, int id, int placement){
		super(material, id, placement);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) 
	{
		if (stack.getItem() == MobDropItems.enderScaleHelmet || stack.getItem() == MobDropItems.enderScaleChestplate  || stack.getItem() == MobDropItems.enderScaleBoots)
			return Refrence.MODID + ":textures/models/armor/ender_1.png";
		if (stack.getItem() == MobDropItems.enderScaleLeggings)
			return Refrence.MODID + ":textures/models/armor/ender_2.png";
		else
			return null;
	}
}
