package me.superhb.mobdrops.handler;

import me.superhb.mobdrops.*;
import me.superhb.mobdrops.content.MDItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.monster.EntityPolarBear;
import net.minecraft.init.Items;
import net.minecraft.world.storage.loot.*;
import net.minecraft.world.storage.loot.LootContext.*;
import net.minecraft.world.storage.loot.conditions.*;
import net.minecraft.world.storage.loot.functions.*;
import net.minecraft.world.storage.loot.properties.*;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class LivingDropsHandler {
	private float dropRate = 0.4F;
	
	@SubscribeEvent
	public void loadLoot (LootTableLoadEvent event) {
		if (!MobDrops.onlyBones) {
			if (event.getName().equals(LootTableList.ENTITIES_COW)) {
				event.getTable().addPool(new LootPool(new LootEntry[0], new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0), "mobdrops"));
				LootPool pool = event.getTable().getPool("mobdrops");
				pool.addEntry(new LootEntryItem(Items.BONE, 1, 0, new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(1, 4)), new LootingEnchantBonus(new LootCondition[0], new RandomValueRange(0, 1), 1) }, new LootCondition[0], Reference.MODID + ":bone"));
			} else if (event.getName().equals(LootTableList.ENTITIES_MUSHROOM_COW)) {
				LootPool main = event.getTable().getPool("main");
				main.removeEntry("minecraft:leather");
				main.addEntry(new LootEntryItem(MDItems.redLeather, 1, 0, new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(0, 2)), new LootingEnchantBonus(new LootCondition[0], new RandomValueRange(0, 1), 1) }, new LootCondition[0], Reference.MODID + ":red_leather"));
				
				event.getTable().addPool(new LootPool(new LootEntry[0], new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0), "mobdrops"));
				LootPool pool = event.getTable().getPool("mobdrops");
				main.addEntry(new LootEntryItem(Items.BONE, 1, 0, new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(1, 4)), new LootingEnchantBonus(new LootCondition[0], new RandomValueRange(0, 1), 1) }, new LootCondition[0], Reference.MODID + ":bone"));
			} else if (event.getName().equals(LootTableList.ENTITIES_PIG)) {
				event.getTable().addPool(new LootPool(new LootEntry[0], new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0), "mobdrops"));
				LootPool pool = event.getTable().getPool("mobdrops");
				pool.addEntry(new LootEntryItem(Items.BONE, 1, 0, new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(1, 2)), new LootingEnchantBonus(new LootCondition[0], new RandomValueRange(0, 1), 1) }, new LootCondition[0], Reference.MODID + ":bone"));
				pool.addEntry(new LootEntryItem(MDItems.ham, 1, 0, new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(1, 3)), new Smelt(new LootCondition[] { new EntityHasProperty(new EntityProperty[] { new EntityOnFire(true) }, EntityTarget.THIS) }), new LootingEnchantBonus(new LootCondition[0], new RandomValueRange(0, 1), 1) }, new LootCondition[0], Reference.MODID + ":ham"));
				pool.addEntry(new LootEntryItem(MDItems.ribs, 1, 0, new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(1, 2)), new Smelt(new LootCondition[] { new EntityHasProperty(new EntityProperty[] { new EntityOnFire(true) }, EntityTarget.THIS) }), new LootingEnchantBonus(new LootCondition[0], new RandomValueRange(0, 1), 1) }, new LootCondition[0], Reference.MODID + ":ribs"));
			} else if (event.getName().equals(LootTableList.ENTITIES_CREEPER)) {
				event.getTable().addPool(new LootPool(new LootEntry[0], new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0), "mobdrops"));
				LootPool pool = event.getTable().getPool("mobdrops");
				pool.addEntry(new LootEntryItem(Items.BONE, 1, 0, new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(1, 2)), new LootingEnchantBonus(new LootCondition[0], new RandomValueRange(0, 1), 1) }, new LootCondition[0], Reference.MODID + ":bone"));
				pool.addEntry(new LootEntryItem(MDItems.creeperSkin, 1, 0, new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(0, 2)), new LootingEnchantBonus(new LootCondition[0], new RandomValueRange(0, 1), 1) }, new LootCondition[0], Reference.MODID + ":creeper_skin"));
			} else if (event.getName().equals(LootTableList.ENTITIES_SPIDER)) {
				event.getTable().addPool(new LootPool(new LootEntry[0], new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0), "mobdrops"));
				LootPool pool = event.getTable().getPool("mobdrops");
				pool.addEntry(new LootEntryItem(MDItems.spiderLeg, 1, 0, new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(0, 4)) }, new LootCondition[0], Reference.MODID + ":spider_leg"));
			} else if (event.getName().equals(LootTableList.ENTITIES_ZOMBIE)) {
				event.getTable().addPool(new LootPool(new LootEntry[0], new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0), "mobdrops"));
				LootPool pool = event.getTable().getPool("mobdrops");
				pool.addEntry(new LootEntryItem(Items.BONE, 1, 0, new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(1, 2)), new LootingEnchantBonus(new LootCondition[0], new RandomValueRange(0, 1), 1) }, new LootCondition[0], Reference.MODID + ":bone"));
				pool.addEntry(new LootEntryItem(MDItems.zombieArm, 1, 0, new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(0, 2)) }, new LootCondition[0], Reference.MODID + ":zombie_arm"));
				pool.addEntry(new LootEntryItem(MDItems.zombieBrain, 1, 0, new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(0, 1)) }, new LootCondition[0], Reference.MODID + ":zombie_brain"));
			} else if (event.getName().equals(LootTableList.ENTITIES_ZOMBIE_PIGMAN)) {
				event.getTable().addPool(new LootPool(new LootEntry[0], new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0), "mobdrops"));
				LootPool pool = event.getTable().getPool("mobdrops");
				pool.addEntry(new LootEntryItem(Items.BONE, 1, 0, new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(1, 2)), new LootingEnchantBonus(new LootCondition[0], new RandomValueRange(0, 1), 1) }, new LootCondition[0], Reference.MODID + ":bone"));
				pool.addEntry(new LootEntryItem(MDItems.pigmanMeat, 1, 0, new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(1, 2)), new LootingEnchantBonus(new LootCondition[0], new RandomValueRange(0, 1), 1), new Smelt(new LootCondition[] { new EntityHasProperty(new EntityProperty[] { new EntityOnFire(true) }, EntityTarget.THIS) }) }, new LootCondition[0], Reference.MODID + ":pigman_meat"));
			} else if (event.getName().equals(LootTableList.ENTITIES_ENDERMAN)) {
				event.getTable().addPool(new LootPool(new LootEntry[0], new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0), "mobdrops"));
				LootPool pool = event.getTable().getPool("mobdrops");
				pool.addEntry(new LootEntryItem(Items.BONE, 1, 0, new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(1, 5)), new LootingEnchantBonus(new LootCondition[0], new RandomValueRange(0, 1), 1) }, new LootCondition[0], Reference.MODID + ":bone"));
			} else if (event.getName().equals(LootTableList.ENTITIES_CAVE_SPIDER)) {
				event.getTable().addPool(new LootPool(new LootEntry[0], new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0), "mobdrops"));
				LootPool pool = event.getTable().getPool("mobdrops");
				pool.addEntry(new LootEntryItem(MDItems.spiderLeg, 1, 0, new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(0, 2)) }, new LootCondition[0], Reference.MODID + ":spider_leg"));
			} else if (event.getName().equals(LootTableList.ENTITIES_BLAZE)) {
				event.getTable().addPool(new LootPool(new LootEntry[0], new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0), "mobdrops"));
				LootPool pool = event.getTable().getPool("mobdrops");
				pool.addEntry(new LootEntryItem(Items.BONE, 1, 0, new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(1, 2)), new LootingEnchantBonus(new LootCondition[0], new RandomValueRange(0, 1), 1) }, new LootCondition[0], Reference.MODID + ":bone"));
				pool.addEntry(new LootEntryItem(MDItems.blazeShard, 1, 0, new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(0, 3)), new LootingEnchantBonus(new LootCondition[0], new RandomValueRange(0, 1), 1) }, new LootCondition[0], Reference.MODID + ":blaze_shard"));
			} else if (event.getName().equals(LootTableList.ENTITIES_SLIME)) {
				event.getTable().addPool(new LootPool(new LootEntry[0], new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0), "mobdrops"));
				LootPool pool = event.getTable().getPool("mobdrops");
				pool.addEntry(new LootEntryItem(MDItems.goo, 1, 0, new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(0, 2)), new LootingEnchantBonus(new LootCondition[0], new RandomValueRange(0, 1), 1) }, new LootCondition[0], Reference.MODID + ":goo"));
			} else if (event.getName().equals(LootTableList.ENTITIES_MAGMA_CUBE)) {
				event.getTable().addPool(new LootPool(new LootEntry[0], new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0), "mobdrops"));
				LootPool pool = event.getTable().getPool("mobdrops");
				pool.addEntry(new LootEntryItem(MDItems.magmaGoo, 1, 0, new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(0, 2)), new LootingEnchantBonus(new LootCondition[0], new RandomValueRange(0, 1), 1) }, new LootCondition[0], Reference.MODID + ":magma_goo"));
			} else if (event.getName().equals(LootTableList.ENTITIES_BAT)) {
				event.getTable().addPool(new LootPool(new LootEntry[0], new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0), "mobdrops"));
				LootPool pool = event.getTable().getPool("mobdrops");
				pool.addEntry(new LootEntryItem(Items.BONE, 1, 0, new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(1)), new LootingEnchantBonus(new LootCondition[0], new RandomValueRange(0, 1), 1) }, new LootCondition[0], Reference.MODID + ":bone"));
			} else if (event.getName().equals(LootTableList.ENTITIES_SHEEP)) {
				event.getTable().addPool(new LootPool(new LootEntry[0], new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0), "mobdrops"));
				LootPool pool = event.getTable().getPool("mobdrops");
				pool.addEntry(new LootEntryItem(Items.BONE, 1, 0, new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(1, 3)), new LootingEnchantBonus(new LootCondition[0], new RandomValueRange(0, 1), 1) }, new LootCondition[0], Reference.MODID + ":bone"));
			} else if (event.getName().equals(LootTableList.ENTITIES_CHICKEN)) {
				event.getTable().addPool(new LootPool(new LootEntry[0], new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0), "mobdrops"));
				LootPool pool = event.getTable().getPool("mobdrops");
				pool.addEntry(new LootEntryItem(Items.BONE, 1, 0, new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(1)), new LootingEnchantBonus(new LootCondition[0], new RandomValueRange(0, 1), 1) }, new LootCondition[0], Reference.MODID + ":bone"));
				pool.addEntry(new LootEntryItem(MDItems.chickenLeg, 1, 0, new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(1, 2)), new LootingEnchantBonus(new LootCondition[0], new RandomValueRange(0, 1), 1), new Smelt(new LootCondition[] { new EntityHasProperty(new EntityProperty[] { new EntityOnFire(true) }, EntityTarget.THIS) }) }, new LootCondition[0], Reference.MODID + ":chicken_leg"));
			} else if (event.getName().equals(LootTableList.ENTITIES_SQUID)) {
				event.getTable().addPool(new LootPool(new LootEntry[0], new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0), "mobdrops"));
				LootPool pool = event.getTable().getPool("mobdrops");
				pool.addEntry(new LootEntryItem(MDItems.squidTentacle, 1, 0, new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(1, 4)), new LootingEnchantBonus(new LootCondition[0], new RandomValueRange(0, 1), 1), new Smelt(new LootCondition[] { new EntityHasProperty(new EntityProperty[] { new EntityOnFire(true) }, EntityTarget.THIS) }) }, new LootCondition[0], Reference.MODID + ":squid_tentacle"));
			} else if (event.getName().equals(LootTableList.ENTITIES_WOLF)) {
				event.getTable().addPool(new LootPool(new LootEntry[0], new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0), "mobdrops"));
				LootPool pool = event.getTable().getPool("mobdrops");
				pool.addEntry(new LootEntryItem(Items.BONE, 1, 0, new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(1, 2)), new LootingEnchantBonus(new LootCondition[0], new RandomValueRange(0, 1), 1) }, new LootCondition[0], Reference.MODID + ":bone"));
				pool.addEntry(new LootEntryItem(MDItems.wolfSkin, 1, 0, new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(0, 2)), new LootingEnchantBonus(new LootCondition[0], new RandomValueRange(0, 1), 1) }, new LootCondition[0], Reference.MODID + ":wolf_skin"));
			} else if (event.getName().equals(LootTableList.ENTITIES_OCELOT)) {
				event.getTable().addPool(new LootPool(new LootEntry[0], new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0), "mobdrops"));
				LootPool pool = event.getTable().getPool("mobdrops");
				pool.addEntry(new LootEntryItem(Items.BONE, 1, 0, new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(1, 2)), new LootingEnchantBonus(new LootCondition[0], new RandomValueRange(0, 1), 1) }, new LootCondition[0], Reference.MODID + ":bone"));
				pool.addEntry(new LootEntryItem(MDItems.ocelotFur, 1, 0, new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(0, 2)), new LootingEnchantBonus(new LootCondition[0], new RandomValueRange(0, 1), 1) }, new LootCondition[0], Reference.MODID + ":ocelot_fur"));
			} else {
				return;
			}
		} else {
			if (event.getName().equals(LootTableList.ENTITIES_COW)) {
				event.getTable().addPool(new LootPool(new LootEntry[0], new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0), "mobdrops"));
				LootPool pool = event.getTable().getPool("mobdrops");
				pool.addEntry(new LootEntryItem(Items.BONE, 1, 0, new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(1, 4)), new LootingEnchantBonus(new LootCondition[0], new RandomValueRange(0, 1), 1) }, new LootCondition[0], Reference.MODID + ":bone"));
			} else if (event.getName().equals(LootTableList.ENTITIES_MUSHROOM_COW)) {
				LootPool main = event.getTable().getPool("main");
				main.addEntry(new LootEntryItem(Items.BONE, 1, 0, new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(1, 4)), new LootingEnchantBonus(new LootCondition[0], new RandomValueRange(0, 1), 1) }, new LootCondition[0], Reference.MODID + ":bone"));
			} else if (event.getName().equals(LootTableList.ENTITIES_PIG)) {
				event.getTable().addPool(new LootPool(new LootEntry[0], new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0), "mobdrops"));
				LootPool pool = event.getTable().getPool("mobdrops");
				pool.addEntry(new LootEntryItem(Items.BONE, 1, 0, new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(1, 2)), new LootingEnchantBonus(new LootCondition[0], new RandomValueRange(0, 1), 1) }, new LootCondition[0], Reference.MODID + ":bone"));
			} else if (event.getName().equals(LootTableList.ENTITIES_CREEPER)) {
				event.getTable().addPool(new LootPool(new LootEntry[0], new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0), "mobdrops"));
				LootPool pool = event.getTable().getPool("mobdrops");
				pool.addEntry(new LootEntryItem(Items.BONE, 1, 0, new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(1, 2)), new LootingEnchantBonus(new LootCondition[0], new RandomValueRange(0, 1), 1) }, new LootCondition[0], Reference.MODID + ":bone"));
			} else if (event.getName().equals(LootTableList.ENTITIES_ZOMBIE)) {
				event.getTable().addPool(new LootPool(new LootEntry[0], new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0), "mobdrops"));
				LootPool pool = event.getTable().getPool("mobdrops");
				pool.addEntry(new LootEntryItem(Items.BONE, 1, 0, new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(1, 2)), new LootingEnchantBonus(new LootCondition[0], new RandomValueRange(0, 1), 1) }, new LootCondition[0], Reference.MODID + ":bone"));
			} else if (event.getName().equals(LootTableList.ENTITIES_ZOMBIE_PIGMAN)) {
				event.getTable().addPool(new LootPool(new LootEntry[0], new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0), "mobdrops"));
				LootPool pool = event.getTable().getPool("mobdrops");
				pool.addEntry(new LootEntryItem(Items.BONE, 1, 0, new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(1, 2)), new LootingEnchantBonus(new LootCondition[0], new RandomValueRange(0, 1), 1) }, new LootCondition[0], Reference.MODID + ":bone"));
			} else if (event.getName().equals(LootTableList.ENTITIES_ENDERMAN)) {
				event.getTable().addPool(new LootPool(new LootEntry[0], new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0), "mobdrops"));
				LootPool pool = event.getTable().getPool("mobdrops");
				pool.addEntry(new LootEntryItem(Items.BONE, 1, 0, new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(1, 5)), new LootingEnchantBonus(new LootCondition[0], new RandomValueRange(0, 1), 1) }, new LootCondition[0], Reference.MODID + ":bone"));
			} else if (event.getName().equals(LootTableList.ENTITIES_BLAZE)) {
				event.getTable().addPool(new LootPool(new LootEntry[0], new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0), "mobdrops"));
				LootPool pool = event.getTable().getPool("mobdrops");
				pool.addEntry(new LootEntryItem(Items.BONE, 1, 0, new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(1, 2)), new LootingEnchantBonus(new LootCondition[0], new RandomValueRange(0, 1), 1) }, new LootCondition[0], Reference.MODID + ":bone"));
			} else if (event.getName().equals(LootTableList.ENTITIES_BAT)) {
				event.getTable().addPool(new LootPool(new LootEntry[0], new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0), "mobdrops"));
				LootPool pool = event.getTable().getPool("mobdrops");
				pool.addEntry(new LootEntryItem(Items.BONE, 1, 0, new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(1)), new LootingEnchantBonus(new LootCondition[0], new RandomValueRange(0, 1), 1) }, new LootCondition[0], Reference.MODID + ":bone"));
			} else if (event.getName().equals(LootTableList.ENTITIES_SHEEP)) {
				event.getTable().addPool(new LootPool(new LootEntry[0], new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0), "mobdrops"));
				LootPool pool = event.getTable().getPool("mobdrops");
				pool.addEntry(new LootEntryItem(Items.BONE, 1, 0, new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(1, 3)), new LootingEnchantBonus(new LootCondition[0], new RandomValueRange(0, 1), 1) }, new LootCondition[0], Reference.MODID + ":bone"));
			} else if (event.getName().equals(LootTableList.ENTITIES_CHICKEN)) {
				event.getTable().addPool(new LootPool(new LootEntry[0], new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0), "mobdrops"));
				LootPool pool = event.getTable().getPool("mobdrops");
				pool.addEntry(new LootEntryItem(Items.BONE, 1, 0, new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(1)), new LootingEnchantBonus(new LootCondition[0], new RandomValueRange(0, 1), 1) }, new LootCondition[0], Reference.MODID + ":bone"));
			} else if (event.getName().equals(LootTableList.ENTITIES_WOLF)) {
				event.getTable().addPool(new LootPool(new LootEntry[0], new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0), "mobdrops"));
				LootPool pool = event.getTable().getPool("mobdrops");
				pool.addEntry(new LootEntryItem(Items.BONE, 1, 0, new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(1, 2)), new LootingEnchantBonus(new LootCondition[0], new RandomValueRange(0, 1), 1) }, new LootCondition[0], Reference.MODID + ":bone"));
			} else if (event.getName().equals(LootTableList.ENTITIES_OCELOT)) {
				event.getTable().addPool(new LootPool(new LootEntry[0], new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0), "mobdrops"));
				LootPool pool = event.getTable().getPool("mobdrops");
				pool.addEntry(new LootEntryItem(Items.BONE, 1, 0, new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(1, 2)), new LootingEnchantBonus(new LootCondition[0], new RandomValueRange(0, 1), 1) }, new LootCondition[0], Reference.MODID + ":bone"));
			} else {
				return;
			}
		}
	}
	
	@SubscribeEvent
	public void onEntityDrop (LivingDropsEvent event) {
		Entity entity = event.getEntity();
		EntityLivingBase living = event.getEntityLiving();
		
		if (event.getSource().getDamageType().equals("player") && !MobDrops.onlyBones) {
			if (entity instanceof EntityDragon) {
				if (entity.world.rand.nextFloat() < dropRate)
					living.dropItem(Items.BONE, 32);
				if (entity.world.rand.nextFloat() <= 0) //Basically 100% chance
					living.dropItem(MDItems.enderScale, 16);
			}
			
			if (entity instanceof EntityPolarBear) {
				if (entity.world.rand.nextFloat() < dropRate)
					living.dropItem(Items.BONE, 3);
			}
		} else if (event.getSource().getDamageType().equals("player") && MobDrops.onlyBones) {
			if (entity instanceof EntityDragon) {
				if (entity.world.rand.nextFloat() < dropRate)
					living.dropItem(Items.BONE, 32);
			}
			
			if (entity instanceof EntityPolarBear) {
				if (entity.world.rand.nextFloat() < dropRate)
					living.dropItem(Items.BONE, 3);
			}
		}
	}
}
