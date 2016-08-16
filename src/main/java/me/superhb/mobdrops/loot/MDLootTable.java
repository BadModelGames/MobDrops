package me.superhb.mobdrops.loot;

import me.superhb.mobdrops.Refrence;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;

public class MDLootTable extends LootTableList {
	public static ResourceLocation ENTITIES_COW = register("entities/cow");
	
	public static ResourceLocation register (String name) {
		return register(new ResourceLocation(Refrence.MODID + ":" + name));
	}
}
