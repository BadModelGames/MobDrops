package me.thesuperhb.mobdrops.content.armor;

import me.thesuperhb.mobdrops.Refrence;
import me.thesuperhb.mobdrops.content.MobDropItems;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class HorseArmor extends ItemArmor {
	public HorseArmor(ArmorMaterial material, int id, int placement){
		super(material, id, placement);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) 
	{
		if (stack.getItem() == MobDropItems.horseHelmet || stack.getItem() == MobDropItems.horseChestplate  || stack.getItem() == MobDropItems.horseBoots)
			return Refrence.MODID + ":textures/models/armor/horse_1.png";
		if (stack.getItem() == MobDropItems.horseLeggings)
			return Refrence.MODID + ":textures/models/armor/horse_2.png";
		else
			return null;
	}
}
