package me.thesuperhb.mobdrops.content;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class MDToolMaterial {
	public static final ToolMaterial SPIDER = EnumHelper.addToolMaterial("spider", 1, 1, 2F, 1.5F, 0);
	public static final ToolMaterial ZOMBIE = EnumHelper.addToolMaterial("zombie", 1, 1, 2F, 1.5F, 0);
	public static final ToolMaterial GOO = EnumHelper.addToolMaterial("goo", 1, 30, 2F, 3.5F, 30);
	public static final ToolMaterial MAGMAGOO = EnumHelper.addToolMaterial("magma_goo", 1, 1, 2F, 3F, 30);
}