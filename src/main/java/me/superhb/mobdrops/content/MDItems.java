package me.superhb.mobdrops.content;

import me.superhb.mobdrops.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MDItems {
	// Creative Tab
	static CreativeTabs tab = MobDrops.mdTab;
	
	// Items
	public static Item
	creeperSkin,
	wolfSkin,
	redLeather,
	batFur, batEar, batEye, batWing, batSuit,
	enderScale, enderTear,
	goo, magmaGoo,
	ocelotFur, // used to make fur stole (fur around neck with head and legs)
	zombieBrain,
	blazeShard;
	
	// Tools
	public static Item
	spiderLeg,
	zombieArm,
	gooSword,
	magmaGooSword,
	blazeBow, blazeSword;
	
	// Food
	public static Item
	ham, bacon,
	squidTentacle, calamari,
	chickenLeg, cookedChickenLeg,
	pigmanMeat, cookedPigmanMeat,
	ribs, cookedRibs,
	creeperEye;
	
	// Armor
	public static Item
	creeperHelmet, creeperViewHelmet, creeperChestplate, creeperLeggings, creeperBoots,
	wolfHelmet, wolfChestplate, furStole, wolfLeggings, wolfBoots,
	ocelotHelmet, ocelotChestplate, ocelotLeggings, ocelotBoots,
	enderHelmet, enderChestplate, enderLeggings, enderBoots,
	blazeHelmet, blazeChestplate, blazeLeggings, blazeBoots;
	
	public static void init () {
		// Items
		creeperSkin = new Item().setUnlocalizedName("creeper_skin").setCreativeTab(tab);
		wolfSkin = new Item().setUnlocalizedName("wolf_skin").setCreativeTab(tab);
		redLeather = new Item().setUnlocalizedName("red_leather").setCreativeTab(tab);
		batFur = new Item().setUnlocalizedName("bat_fur").setCreativeTab(tab);
		batEar = new Item().setUnlocalizedName("bat_ear").setCreativeTab(tab);
		batEye = new Item().setUnlocalizedName("bat_eye").setCreativeTab(tab);
		batWing = new Item().setUnlocalizedName("bat_wing").setCreativeTab(tab);
		enderScale = new Item().setUnlocalizedName("ender_scale").setCreativeTab(tab);
		enderTear = new Item().setUnlocalizedName("ender_tear").setCreativeTab(tab);
		goo = new Item().setUnlocalizedName("goo").setCreativeTab(tab);
		magmaGoo = new Item().setUnlocalizedName("magma_goo").setCreativeTab(tab);
		ocelotFur = new Item().setUnlocalizedName("ocelot_fur").setCreativeTab(tab);
		zombieBrain = new Item().setUnlocalizedName("zombie_brain").setCreativeTab(tab);
		blazeShard = new Item().setUnlocalizedName("blaze_shard").setCreativeTab(tab);
		batSuit = new MDBatSuit(MDMaterial.WOLF, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("bat_suit").setCreativeTab(tab);
		
		// Tools
		spiderLeg = new MDSword(MDMaterial.SPIDER).setUnlocalizedName("spider_leg").setCreativeTab(tab);
		zombieArm = new MDSword(MDMaterial.ZOMBIE).setUnlocalizedName("zombie_arm").setCreativeTab(tab);
		gooSword = new MDSword(MDMaterial.GOO).setUnlocalizedName("goo_sword").setCreativeTab(tab);
		magmaGooSword = new MDSword(MDMaterial.MAGMA).setUnlocalizedName("magmagoo_sword").setCreativeTab(tab);
		blazeSword = new MDSword(MDMaterial.TBLAZE).setUnlocalizedName("blaze_sword").setCreativeTab(tab);
		blazeBow = new MDBow().setUnlocalizedName("blaze_bow").setCreativeTab(tab);
		
		//.setPotionEffect(new PotionEffect(MobEffects.POISON, 100, 0), 0.6F)
		// Food
		ham = new ItemFood(1, 1, true).setPotionEffect(new PotionEffect(MobEffects.POISON, 50, 0), 0.6F).setUnlocalizedName("ham").setCreativeTab(tab);
		bacon = new ItemFood(1, 1, true).setUnlocalizedName("bacon").setCreativeTab(tab);
		squidTentacle = new ItemFood(1, 1, false).setPotionEffect(new PotionEffect(MobEffects.POISON, 50, 0), 0.6F).setUnlocalizedName("squid_tentacle").setCreativeTab(tab);
		calamari = new ItemFood(1, 1, false).setUnlocalizedName("calamari").setCreativeTab(tab);
		chickenLeg = new ItemFood(1, 1, true).setPotionEffect(new PotionEffect(MobEffects.POISON, 50, 0), 0.6F).setUnlocalizedName("chicken_leg").setCreativeTab(tab);
		cookedChickenLeg = new ItemFood(1, 1, true).setUnlocalizedName("cooked_chicken_leg").setCreativeTab(tab);
		pigmanMeat = new ItemFood(1, 1, true).setPotionEffect(new PotionEffect(MobEffects.POISON, 50, 0), 0.6F).setUnlocalizedName("pigman_meat").setCreativeTab(tab);
		cookedPigmanMeat = new ItemFood(1, 1, true).setUnlocalizedName("cooked_pigman_meat").setCreativeTab(tab);
		ribs = new ItemFood(1, 1, true).setPotionEffect(new PotionEffect(MobEffects.POISON, 50, 0), 0.6F).setUnlocalizedName("ribs").setCreativeTab(tab);
		cookedRibs = new ItemFood(1, 1, true).setUnlocalizedName("cooked_ribs").setCreativeTab(tab);
		creeperEye = new ItemFood(1, 1, false).setUnlocalizedName("creeper_eye").setCreativeTab(tab);
		
		// Armor
		creeperViewHelmet = new MDArmor(MDMaterial.CREEPER, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("creeper_view_helmet").setCreativeTab(tab);
		creeperHelmet = new MDArmor(MDMaterial.CREEPER, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("creeper_helmet").setCreativeTab(tab);
		creeperChestplate = new MDArmor(MDMaterial.CREEPER, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("creeper_chestplate").setCreativeTab(tab);
		creeperLeggings = new MDArmor(MDMaterial.CREEPER, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("creeper_leggings").setCreativeTab(tab);
		creeperBoots = new MDArmor(MDMaterial.CREEPER, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("creeper_boots").setCreativeTab(tab);
		wolfHelmet = new MDArmor(MDMaterial.WOLF, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("wolf_helmet").setCreativeTab(tab);
		wolfChestplate = new MDArmor(MDMaterial.WOLF, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("wolf_chestplate").setCreativeTab(tab);
		furStole = new MDArmor(MDMaterial.WOLF, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("fur_stole").setCreativeTab(tab); // new material?
		wolfLeggings = new MDArmor(MDMaterial.WOLF, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("wolf_leggings").setCreativeTab(tab);
		wolfBoots = new MDArmor(MDMaterial.WOLF, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("wolf_boots").setCreativeTab(tab);
		ocelotHelmet = new MDArmor(MDMaterial.OCELOT, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("ocelot_helmet").setCreativeTab(tab);
		ocelotChestplate = new MDArmor(MDMaterial.OCELOT, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("ocelot_chestplate").setCreativeTab(tab);
		ocelotLeggings = new MDArmor(MDMaterial.OCELOT, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("ocelot_leggings").setCreativeTab(tab);
		ocelotBoots = new MDArmor(MDMaterial.OCELOT, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("ocelot_boots").setCreativeTab(tab);
		enderHelmet = new MDArmor(MDMaterial.ENDER, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("ender_helmet").setCreativeTab(tab);
		enderChestplate = new MDArmor(MDMaterial.ENDER, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("ender_chestplate").setCreativeTab(tab);
		enderLeggings = new MDArmor(MDMaterial.ENDER, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("ender_leggings").setCreativeTab(tab);
		enderBoots = new MDArmor(MDMaterial.ENDER, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("ender_boots").setCreativeTab(tab);
		blazeHelmet = new MDArmor(MDMaterial.BLAZE, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("blaze_helmet").setCreativeTab(tab);
		blazeChestplate = new MDArmor(MDMaterial.BLAZE, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("blaze_chestplate").setCreativeTab(tab);
		blazeLeggings = new MDArmor(MDMaterial.BLAZE, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("blaze_leggings").setCreativeTab(tab);
		blazeBoots = new MDArmor(MDMaterial.BLAZE, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("blaze_boots").setCreativeTab(tab);
		
		// Armor Repair Material
		MDMaterial.CREEPER.customCraftingMaterial = creeperSkin;
		MDMaterial.WOLF.customCraftingMaterial = wolfSkin;
		MDMaterial.OCELOT.customCraftingMaterial = ocelotFur;
		MDMaterial.ENDER.customCraftingMaterial = enderScale;
		MDMaterial.BLAZE.customCraftingMaterial = blazeShard;
		
		// TODO Use red leather when leather armor is dyed red
		//ArmorMaterial.LEATHER.customCraftingMaterial = redLeather;
		
		/*
		fur stole item and model needed
		*/
	}
	
	public static void register () {
		// Items
		registerItem(creeperSkin, "creeper_skin");
		registerItem(wolfSkin, "wolf_skin");
		registerItem(redLeather, "red_leather");
		/*
		GameRegistry.register(batFur.setRegistryName(batFur.getUnlocalizedName().substring(5)));
		GameRegistry.register(batEar.setRegistryName(batEar.getUnlocalizedName().substring(5)));
		GameRegistry.register(batEye.setRegistryName(batEye.getUnlocalizedName().substring(5)));
		GameRegistry.register(batWing.setRegistryName(batWing.getUnlocalizedName().substring(5)));
		*/
		registerItem(enderScale, "ender_scale");
		//GameRegistry.register(enderTear.setRegistryName(enderTear.getUnlocalizedName().substring(5)));
		registerItem(goo, "goo");
		registerItem(magmaGoo, "magma_goo");
		registerItem(ocelotFur, "ocelot_fur");
		registerItem(zombieBrain, "zombie_brain");
		registerItem(blazeShard, "blaze_shard");
		//GameRegistry.register(batSuit.setRegistryName(batSuit.getUnlocalizedName().substring(5)));
		
		// Tools
		registerItem(spiderLeg, "spider_leg");
		registerItem(zombieArm, "zombie_arm");
		registerItem(gooSword, "goo_sword");
		registerItem(magmaGooSword, "magmagoo_sword");
		registerItem(blazeSword, "blaze_sword");
		registerItem(blazeBow, "blaze_bow");
		
		// Foods
		registerItem(ham, "ham");
		registerItem(bacon, "bacon");
		registerItem(squidTentacle, "squid_tentacle");
		registerItem(calamari, "calamari");
		registerItem(chickenLeg, "chicken_leg");
		registerItem(cookedChickenLeg, "cooked_chicken_leg");
		registerItem(pigmanMeat, "pigman_meat");
		registerItem(cookedPigmanMeat, "cooked_pigman_meat");
		registerItem(ribs, "ribs");
		registerItem(cookedRibs, "cooked_ribs");
		registerItem(creeperEye, "creeper_eye");
		
		// Armor
		registerItem(creeperViewHelmet, "creeper_view_helmet");
		registerItem(creeperHelmet, "creeper_helmet");
		registerItem(creeperChestplate, "creeper_chestplate");
		registerItem(creeperLeggings, "creeper_leggings");
		registerItem(creeperBoots, "creeper_boots");
		
		registerItem(wolfHelmet, "wolf_helmet");
		registerItem(wolfChestplate, "wolf_chestplate");
		//GameRegistry.register(furStole.setRegistryName(furStole.getUnlocalizedName().substring(5)));
		registerItem(wolfLeggings, "wolf_leggings");
		registerItem(wolfBoots, "wolf_boots");
		
		registerItem(ocelotHelmet, "ocelot_helmet");
		registerItem(ocelotChestplate, "ocelot_chestplate");
		registerItem(ocelotLeggings, "ocelot_leggings");
		registerItem(ocelotBoots, "ocelot_boots");
		
		registerItem(enderHelmet, "ender_helmet");
		registerItem(enderChestplate, "ender_chestplate");
		registerItem(enderLeggings, "ender_leggings");
		registerItem(enderBoots, "ender_boots");
		
		registerItem(blazeHelmet, "blaze_helmet");
		registerItem(blazeChestplate, "blaze_chestplate");
		registerItem(blazeLeggings, "blaze_leggings");
		registerItem(blazeBoots, "blaze_boots");
	}
	
	public static void registerItem (Item item, String name) {
		GameRegistry.register(item.setRegistryName(name));
	}
	
	public static void registerRenders () {
		// Items
		registerRender(creeperSkin);
		registerRender(wolfSkin);
		registerRender(redLeather);
		/*
		registerRender(batFur);
		registerRender(batEar);
		registerRender(batEye);
		registerRender(batWing);
		*/
		registerRender(enderScale);
		//registerRender(enderTear);
		registerRender(goo);
		registerRender(magmaGoo);
		registerRender(ocelotFur);
		registerRender(zombieBrain);
		registerRender(blazeShard);
		//registerRender(batSuit);
		
		// Tools
		registerRender(spiderLeg);
		registerRender(zombieArm);
		registerRender(gooSword);
		registerRender(magmaGooSword);
		registerRender(blazeSword);
		registerRender(blazeBow);
		
		// Foods
		registerRender(ham);
		registerRender(bacon);
		registerRender(squidTentacle);
		registerRender(calamari);
		registerRender(chickenLeg);
		registerRender(cookedChickenLeg);
		registerRender(pigmanMeat);
		registerRender(cookedPigmanMeat);
		registerRender(ribs);
		registerRender(cookedRibs);
		registerRender(creeperEye);
		
		// Armor
		registerRender(creeperViewHelmet);
		registerRender(creeperHelmet);
		registerRender(creeperChestplate);
		registerRender(creeperLeggings);
		registerRender(creeperBoots);
		registerRender(wolfHelmet);
		registerRender(wolfChestplate);
		//registerRender(furStole);
		registerRender(wolfLeggings);
		registerRender(wolfBoots);
		registerRender(ocelotHelmet);
		registerRender(ocelotChestplate);
		registerRender(ocelotLeggings);
		registerRender(ocelotBoots);
		registerRender(enderHelmet);
		registerRender(enderChestplate);
		registerRender(enderLeggings);
		registerRender(enderBoots);
		registerRender(blazeHelmet);
		registerRender(blazeChestplate);
		registerRender(blazeLeggings);
		registerRender(blazeBoots);
	}
	
	public static void registerRender (Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
