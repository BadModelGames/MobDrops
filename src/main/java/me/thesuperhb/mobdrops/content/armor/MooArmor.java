package me.thesuperhb.mobdrops.content.armor;

import me.thesuperhb.mobdrops.Refrence;
import me.thesuperhb.mobdrops.content.MobDropItems;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class MooArmor extends ItemArmor {
	public MooArmor(ArmorMaterial material, int id, int placement){
		super(material, id, placement);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) 
	{
		if (stack.getItem() == MobDropItems.mooHelmet || stack.getItem() == MobDropItems.mooChestplate  || stack.getItem() == MobDropItems.mooBoots)
			return Refrence.MODID + ":textures/models/armor/moo_1.png";
		if (stack.getItem() == MobDropItems.mooLeggings)
			return Refrence.MODID + ":textures/models/armor/moo_2.png";
		else
			return null;
	}
}
