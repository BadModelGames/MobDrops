package me.thesuperhb.mobdrops.content.armor;

import me.thesuperhb.mobdrops.Refrence;
import me.thesuperhb.mobdrops.content.MobDropItems;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class WolfArmor extends ItemArmor {
	public WolfArmor(ArmorMaterial material, int id, int placement){
		super(material, id, placement);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) 
	{
		if (stack.getItem() == MobDropItems.wolfHelmet || stack.getItem() == MobDropItems.wolfChestplate  || stack.getItem() == MobDropItems.wolfBoots)
			return Refrence.MODID + ":textures/models/armor/wolf_1.png";
		if (stack.getItem() == MobDropItems.wolfLeggings)
			return Refrence.MODID + ":textures/models/armor/wolf_2.png";
		else
			return null;
	}
}
