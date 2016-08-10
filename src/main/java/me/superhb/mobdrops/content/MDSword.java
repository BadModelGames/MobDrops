package me.superhb.mobdrops.content;

import net.minecraft.entity.Entity;
import net.minecraft.init.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;

public class MDSword extends ItemSword {
	public MDSword (ToolMaterial material) {
		super(material);
	}
	
	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		if (stack.isItemEnchanted() == false && stack.getItem() == MDItems.blazeSword)
			stack.addEnchantment(Enchantments.FIRE_ASPECT, 1);
		super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
	}
}
