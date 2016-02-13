package me.thesuperhb.mobdrops.drops;

import me.thesuperhb.mobdrops.content.MobDropItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.*;
import net.minecraft.init.Items;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class LivingDropsHandler {
	public static double rand;
	
	// For Passive Mobs
	@SubscribeEvent
	public void onPassiveDrop(LivingDropsEvent event){
		Entity e = event.entity;
		EntityLivingBase eL = event.entityLiving;
		
		if(event.source.getDamageType().equals("player") && event.entity.worldObj.rand.nextFloat() < 0.2F){ //0.2F is the drop rate.
			if(e instanceof EntityCow){
				//What to drop and how much
				eL.dropItem(Items.bone, 6);
				eL.dropItem(Items.skull, 1);
			}
			if(e instanceof EntityMooshroom)
				eL.dropItem(MobDropItems.redLeather, 2);
			if(e instanceof EntityOcelot)
				eL.dropItem(MobDropItems.ocelotFur, 1);
			if(e instanceof EntityPig){
				eL.dropItem(MobDropItems.ham, 2);
				eL.dropItem(MobDropItems.rawRibs, 3);
			}
			if(e instanceof EntityWolf)
				eL.dropItem(MobDropItems.wolfSkin, 1);
			if(e instanceof EntitySquid){
				eL.dropItem(MobDropItems.squidEye, 2);
				eL.dropItem(MobDropItems.squidTentacle, 7);
			}
		}
	}
	
	// For Monster Drops
	@SubscribeEvent
	public void onMonsterDrop(LivingDropsEvent event){
		Entity e = event.entity;
		EntityLivingBase eL = event.entityLiving;
		
		if(event.source.getDamageType().equals("player") && event.entity.worldObj.rand.nextFloat() < 0.2F){ //0.2F is the drop rate.
			if(e instanceof EntityCreeper){
				eL.dropItem(MobDropItems.creeperSkin, 3);
				eL.dropItem(MobDropItems.creeperEye, 2);
			}
			if(e instanceof EntityZombie){
				eL.dropItem(MobDropItems.zombieArm, 2);
				eL.dropItem(MobDropItems.zombieBrain, 1);
			}
			if(e instanceof EntityDragon)
				eL.dropItem(MobDropItems.enderScale, 10);
			if(e instanceof EntityWitch)
				eL.dropItem(MobDropItems.wort, 1);
			if(e instanceof EntitySlime)
				eL.dropItem(MobDropItems.goo, 5);
			if(e instanceof EntityMagmaCube)
				eL.dropItem(MobDropItems.magmaGoo, 5);
		}
	}
}
