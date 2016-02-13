package me.thesuperhb.mobdrops.content.armor;

import me.thesuperhb.mobdrops.Refrence;
import me.thesuperhb.mobdrops.content.MobDropItems;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class CreeperArmor extends ItemArmor{
	public CreeperArmor(ArmorMaterial material, int id, int placement){
		super(material, id, placement);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) 
	{
		if (stack.getItem() == MobDropItems.creeperHelmet || stack.getItem() == MobDropItems.creeperChestplate  || stack.getItem() == MobDropItems.creeperBoots)
			return Refrence.MODID + ":textures/models/armor/creeper_1.png";
		if (stack.getItem() == MobDropItems.creeperLeggings)
			return Refrence.MODID + ":textures/models/armor/creeper_2.png";
		else
			return null;
	}
}
