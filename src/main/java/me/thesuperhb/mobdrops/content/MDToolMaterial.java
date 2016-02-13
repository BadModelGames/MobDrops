package me.thesuperhb.mobdrops.content;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class MDToolMaterial {
	public static final ToolMaterial SPIDER = EnumHelper.addToolMaterial("spider", 0, 1, 2.0F, 1.0F, 0);
	public static final ToolMaterial ZOMBIE = EnumHelper.addToolMaterial("zombie", 0, 1, 2.0F, 1.0F, 0);
	public static final ToolMaterial GOO = EnumHelper.addToolMaterial("goo", 1, 250, 4.0F, 2.0F, 10);
	public static final ToolMaterial MAGMAGOO = EnumHelper.addToolMaterial("magma_goo", 1, 250, 3.0F, 2.5F, 10);
}