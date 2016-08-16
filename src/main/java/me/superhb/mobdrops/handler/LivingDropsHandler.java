package me.superhb.mobdrops.handler;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import com.mojang.authlib.GameProfile;

import me.superhb.mobdrops.MobDrops;
import me.superhb.mobdrops.content.MDItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.*;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTSizeTracker;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.nbt.NBTUtil;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class LivingDropsHandler {
	private float dropRate = 0.4F;
	
	@SubscribeEvent
	public void onEntityDrop (LivingDropsEvent event) {
		Entity entity = event.getEntity();
		EntityLivingBase living = event.getEntityLiving();
		
		// TODO Drop cooked meat on death
		if (event.getSource().getDamageType().equals("player") && !MobDrops.onlyBones) {
			if (entity instanceof EntityCow) {
				if (entity.worldObj.rand.nextFloat() < dropRate)
					living.dropItem(Items.BONE, 4);
			}
			
			if (entity instanceof EntityMooshroom) {
				if (entity.worldObj.rand.nextFloat() < dropRate) {
					living.dropItem(Items.BONE, 4);
					living.dropItem(MDItems.redLeather, 3);
				}
			}
			
			if (entity instanceof EntityPig) {
				if (entity.worldObj.rand.nextFloat() < dropRate) {
					living.dropItem(Items.BONE, 2);
					living.dropItem(MDItems.ribs, 2);
					living.dropItem(MDItems.ham, 3);
					//living.dropItem(MDItems.bacon, 3);
				}
			}
			
			if (entity instanceof EntityCreeper) {
				if (entity.worldObj.rand.nextFloat() < dropRate)
					living.dropItem(Items.BONE, 2);
			}
			
			if (entity instanceof EntitySpider) {
				if (entity.worldObj.rand.nextFloat() < dropRate)
					living.dropItem(MDItems.spiderLeg, 4);
			}
			
			if (entity instanceof EntityZombie) {
				if (entity.worldObj.rand.nextFloat() < dropRate) {
					living.dropItem(Items.BONE, 2);
					living.dropItem(MDItems.zombieArm, 2);
					living.dropItem(MDItems.zombieBrain, 1);
				}
			}
			
			if (entity instanceof EntityPigZombie) {
				if (entity.worldObj.rand.nextFloat() < dropRate) {
					living.dropItem(Items.BONE, 2);
					living.dropItem(MDItems.pigmanMeat, 2);
				}
			}
			
			if (entity instanceof EntityEnderman) {
				if (entity.worldObj.rand.nextFloat() < dropRate)
					living.dropItem(Items.BONE, 5);
			}
			
			if (entity instanceof EntityDragon) {
				if (entity.worldObj.rand.nextFloat() < dropRate)
					living.dropItem(Items.BONE, 32);
				if (entity.worldObj.rand.nextFloat() <= 0) //Basically 100% chance
					living.dropItem(MDItems.enderScale, 16);
			}
			
			if (entity instanceof EntityCaveSpider) {
				if (entity.worldObj.rand.nextFloat() < dropRate)
					living.dropItem(MDItems.spiderLeg, 2);
			}
			
			if (entity instanceof EntityBlaze) {
				if (entity.worldObj.rand.nextFloat() < dropRate)
					living.dropItem(Items.BONE, 2);
			}
			
			if (entity instanceof EntityMagmaCube) {
				if (entity.worldObj.rand.nextFloat() < dropRate)
					living.dropItem(MDItems.magmaGoo, 2);
			}
			
			if (entity instanceof EntityBat) {
				if (entity.worldObj.rand.nextFloat() < dropRate) {
					living.dropItem(Items.BONE, 1);
					// drop bat stuff
				}
			}
			
			if (entity instanceof EntitySheep) {
				if (entity.worldObj.rand.nextFloat() < dropRate)
					living.dropItem(Items.BONE, 3);
			}
			
			if (entity instanceof EntityChicken) {
				if (entity.worldObj.rand.nextFloat() < dropRate) {
					living.dropItem(Items.BONE, 1);
					living.dropItem(MDItems.chickenLeg, 2);
				}
			}
			
			if (entity instanceof EntitySquid) {
				if (entity.worldObj.rand.nextFloat() < dropRate)
					living.dropItem(MDItems.squidTentacle, 4);
			}
			
			if (entity instanceof EntityWolf) {
				if (entity.worldObj.rand.nextFloat() < dropRate) {
					living.dropItem(Items.BONE, 2);
					living.dropItem(MDItems.wolfSkin, 2);
				}
			}
			
			if (entity instanceof EntityOcelot) {
				if (entity.worldObj.rand.nextFloat() < dropRate) {
					living.dropItem(Items.BONE, 2);
					living.dropItem(MDItems.ocelotFur, 2);
				}
			}
			
			if (entity instanceof EntityPolarBear) {
				if (entity.worldObj.rand.nextFloat() < dropRate)
					living.dropItem(Items.BONE, 3);
			}
		} else if (event.getSource().getDamageType().equals("player") && MobDrops.onlyBones) {
			if (entity instanceof EntityCow) {
				if (entity.worldObj.rand.nextFloat() < dropRate)
					living.dropItem(Items.BONE, 4);
			}
			
			if (entity instanceof EntityMooshroom) {
				if (entity.worldObj.rand.nextFloat() < dropRate) {
					living.dropItem(Items.BONE, 4);
				}
			}
			
			if (entity instanceof EntityPig) {
				if (entity.worldObj.rand.nextFloat() < dropRate) {
					living.dropItem(Items.BONE, 2);
				}
			}
			
			if (entity instanceof EntityCreeper) {
				if (entity.worldObj.rand.nextFloat() < dropRate)
					living.dropItem(Items.BONE, 2);
			}
			
			if (entity instanceof EntityZombie) {
				if (entity.worldObj.rand.nextFloat() < dropRate) {
					living.dropItem(Items.BONE, 2);
				}
			}
			
			if (entity instanceof EntityPigZombie) {
				if (entity.worldObj.rand.nextFloat() < dropRate) {
					living.dropItem(Items.BONE, 2);
				}
			}
			
			if (entity instanceof EntityEnderman) {
				if (entity.worldObj.rand.nextFloat() < dropRate)
					living.dropItem(Items.BONE, 5);
			}
			
			if (entity instanceof EntityDragon) {
				if (entity.worldObj.rand.nextFloat() < dropRate)
					living.dropItem(Items.BONE, 32);
			}
			
			if (entity instanceof EntityBlaze) {
				if (entity.worldObj.rand.nextFloat() < dropRate)
					living.dropItem(Items.BONE, 2);
			}
			
			if (entity instanceof EntityBat) {
				if (entity.worldObj.rand.nextFloat() < dropRate) {
					living.dropItem(Items.BONE, 1);
					// drop bat stuff
				}
			}
			
			if (entity instanceof EntitySheep) {
				if (entity.worldObj.rand.nextFloat() < dropRate)
					living.dropItem(Items.BONE, 3);
			}
			
			if (entity instanceof EntityChicken) {
				if (entity.worldObj.rand.nextFloat() < dropRate) {
					living.dropItem(Items.BONE, 1);
				}
			}
			
			if (entity instanceof EntityWolf) {
				if (entity.worldObj.rand.nextFloat() < dropRate) {
					living.dropItem(Items.BONE, 2);
				}
			}
			
			if (entity instanceof EntityOcelot) {
				if (entity.worldObj.rand.nextFloat() < dropRate) {
					living.dropItem(Items.BONE, 2);
				}
			}
			
			if (entity instanceof EntityPolarBear) {
				if (entity.worldObj.rand.nextFloat() < dropRate)
					living.dropItem(Items.BONE, 3);
			}
		}
	}
}
