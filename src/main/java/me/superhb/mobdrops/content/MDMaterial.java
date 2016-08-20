package me.superhb.mobdrops.content;

import me.superhb.mobdrops.Refrence;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;

public class MDMaterial {
	// Tools
	public static final ToolMaterial SPIDER = EnumHelper.addToolMaterial("Spider", 0, 5, 2, 0, 0);
	public static final ToolMaterial ZOMBIE = EnumHelper.addToolMaterial("Zombie", 0, 10, 2, 0, 0);
	public static final ToolMaterial GOO = EnumHelper.addToolMaterial("Goo", 0, 400, 6, 2, 10).setRepairItem(new ItemStack(MDItems.goo));
	public static final ToolMaterial MAGMA = EnumHelper.addToolMaterial("Magma", 0, 500, 7, 2.5F, 10).setRepairItem(new ItemStack(MDItems.magmaGoo));
	public static final ToolMaterial TBLAZE = EnumHelper.addToolMaterial("Blaze", 0, 1700, 8, 3, 10).setRepairItem(new ItemStack(MDItems.blazeShard));
	
	// Armor
	public static final ArmorMaterial CREEPER = EnumHelper.addArmorMaterial("Creeper", "creeper", 7, new int[] { 2, 3, 3, 2 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0);
	public static final ArmorMaterial WOLF = EnumHelper.addArmorMaterial("Wolf", "wolf", 6, new int[] { 1, 2, 3, 1 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0);
	public static final ArmorMaterial OCELOT = EnumHelper.addArmorMaterial("Ocelot", "ocelot", 5, new int[] { 1, 2, 3 , 1 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0);
	public static final ArmorMaterial HORSE = EnumHelper.addArmorMaterial("Horse", "horse", 5, new int[] { 1, 2, 3, 1 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0);
	public static final ArmorMaterial ENDER = EnumHelper.addArmorMaterial("Ender", "ender", 33, new int[] { 3, 8, 6, 3 }, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4);
	public static final ArmorMaterial BLAZE = EnumHelper.addArmorMaterial("Blaze", "blaze", 25, new int[] { 3, 8, 6, 3 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2);
	
	// Tool
	/*
	WOOD(0, 59, 2.0F, 0.0F, 15),
    STONE(1, 131, 4.0F, 1.0F, 5),
    IRON(2, 250, 6.0F, 2.0F, 14),
    DIAMOND(3, 1561, 8.0F, 3.0F, 10),
    GOLD(0, 32, 12.0F, 0.0F, 22);
	*/
	
	//Armor
	/*
	LEATHER("leather", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F),
        CHAIN("chainmail", 15, new int[]{1, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F),
        IRON("iron", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F),
        GOLD("gold", 7, new int[]{1, 3, 5, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F),
        DIAMOND("diamond", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	 */
}
