package me.superhb.mobdrops.content;

import me.superhb.mobdrops.MobDrops;
import me.superhb.mobdrops.Refrence;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
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
	mooHelmet, mooChestplate, mooLeggings, mooBoots,
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
		mooHelmet = new MDArmor(MDMaterial.MOO, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("moo_helmet").setCreativeTab(tab);
		mooChestplate = new MDArmor(MDMaterial.MOO, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("moo_chestplate").setCreativeTab(tab);
		mooLeggings = new MDArmor(MDMaterial.MOO, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("moo_leggings").setCreativeTab(tab);
		mooBoots = new MDArmor(MDMaterial.MOO, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("moo_boots").setCreativeTab(tab);
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
		MDMaterial.MOO.customCraftingMaterial = redLeather;
		MDMaterial.ENDER.customCraftingMaterial = enderScale;
		MDMaterial.BLAZE.customCraftingMaterial = blazeShard;
		
		/*
		textures/items/fur_stole.png
		textures/items/moo_leggings.png
		textures/items/moo_chestplate.png
		textures/items/moo_boots.png
		textures/items/moo_helmet.png
		*/
	}
	
	public static void register () {
		// Items
		GameRegistry.register(creeperSkin.setRegistryName(creeperSkin.getUnlocalizedName().substring(5)));
		GameRegistry.register(wolfSkin.setRegistryName(wolfSkin.getUnlocalizedName().substring(5)));
		GameRegistry.register(redLeather.setRegistryName(redLeather.getUnlocalizedName().substring(5)));
		/*
		GameRegistry.register(batFur.setRegistryName(batFur.getUnlocalizedName().substring(5)));
		GameRegistry.register(batEar.setRegistryName(batEar.getUnlocalizedName().substring(5)));
		GameRegistry.register(batEye.setRegistryName(batEye.getUnlocalizedName().substring(5)));
		GameRegistry.register(batWing.setRegistryName(batWing.getUnlocalizedName().substring(5)));
		*/
		GameRegistry.register(enderScale.setRegistryName(enderScale.getUnlocalizedName().substring(5)));
		//GameRegistry.register(enderTear.setRegistryName(enderTear.getUnlocalizedName().substring(5)));
		GameRegistry.register(goo.setRegistryName(goo.getUnlocalizedName().substring(5)));
		GameRegistry.register(magmaGoo.setRegistryName(magmaGoo.getUnlocalizedName().substring(5)));
		GameRegistry.register(ocelotFur.setRegistryName(ocelotFur.getUnlocalizedName().substring(5)));
		GameRegistry.register(zombieBrain.setRegistryName(zombieBrain.getUnlocalizedName().substring(5)));
		GameRegistry.register(blazeShard.setRegistryName(blazeShard.getUnlocalizedName().substring(5)));
		//GameRegistry.register(batSuit.setRegistryName(batSuit.getUnlocalizedName().substring(5)));
		
		// Tools
		GameRegistry.register(spiderLeg.setRegistryName(spiderLeg.getUnlocalizedName().substring(5)));
		GameRegistry.register(zombieArm.setRegistryName(zombieArm.getUnlocalizedName().substring(5)));
		GameRegistry.register(gooSword.setRegistryName(gooSword.getUnlocalizedName().substring(5)));
		GameRegistry.register(magmaGooSword.setRegistryName(magmaGooSword.getUnlocalizedName().substring(5)));
		GameRegistry.register(blazeSword.setRegistryName(blazeSword.getUnlocalizedName().substring(5)));
		GameRegistry.register(blazeBow.setRegistryName(blazeBow.getUnlocalizedName().substring(5)));
		
		// Foods
		GameRegistry.register(ham.setRegistryName(ham.getUnlocalizedName().substring(5)));
		GameRegistry.register(bacon.setRegistryName(bacon.getUnlocalizedName().substring(5)));
		GameRegistry.register(squidTentacle.setRegistryName(squidTentacle.getUnlocalizedName().substring(5)));
		GameRegistry.register(calamari.setRegistryName(calamari.getUnlocalizedName().substring(5)));
		GameRegistry.register(chickenLeg.setRegistryName(chickenLeg.getUnlocalizedName().substring(5)));
		GameRegistry.register(cookedChickenLeg.setRegistryName(cookedChickenLeg.getUnlocalizedName().substring(5)));
		GameRegistry.register(pigmanMeat.setRegistryName(pigmanMeat.getUnlocalizedName().substring(5)));
		GameRegistry.register(cookedPigmanMeat.setRegistryName(cookedPigmanMeat.getUnlocalizedName().substring(5)));
		GameRegistry.register(ribs.setRegistryName(ribs.getUnlocalizedName().substring(5)));
		GameRegistry.register(cookedRibs.setRegistryName(cookedRibs.getUnlocalizedName().substring(5)));
		GameRegistry.register(creeperEye.setRegistryName(creeperEye.getUnlocalizedName().substring(5)));
		
		// Armor
		GameRegistry.register(creeperViewHelmet.setRegistryName(creeperViewHelmet.getUnlocalizedName().substring(5)));
		GameRegistry.register(creeperHelmet.setRegistryName(creeperHelmet.getUnlocalizedName().substring(5)));
		GameRegistry.register(creeperChestplate.setRegistryName(creeperChestplate.getUnlocalizedName().substring(5)));
		GameRegistry.register(creeperLeggings.setRegistryName(creeperLeggings.getUnlocalizedName().substring(5)));
		GameRegistry.register(creeperBoots.setRegistryName(creeperBoots.getUnlocalizedName().substring(5)));
		GameRegistry.register(wolfHelmet.setRegistryName(wolfHelmet.getUnlocalizedName().substring(5)));
		GameRegistry.register(wolfChestplate.setRegistryName(wolfChestplate.getUnlocalizedName().substring(5)));
		//GameRegistry.register(furStole.setRegistryName(furStole.getUnlocalizedName().substring(5)));
		GameRegistry.register(wolfLeggings.setRegistryName(wolfLeggings.getUnlocalizedName().substring(5)));
		GameRegistry.register(wolfBoots.setRegistryName(wolfBoots.getUnlocalizedName().substring(5)));
		GameRegistry.register(ocelotHelmet.setRegistryName(ocelotHelmet.getUnlocalizedName().substring(5)));
		GameRegistry.register(ocelotChestplate.setRegistryName(ocelotChestplate.getUnlocalizedName().substring(5)));
		GameRegistry.register(ocelotLeggings.setRegistryName(ocelotLeggings.getUnlocalizedName().substring(5)));
		GameRegistry.register(ocelotBoots.setRegistryName(ocelotBoots.getUnlocalizedName().substring(5)));
		/*
		GameRegistry.register(mooHelmet.setRegistryName(mooHelmet.getUnlocalizedName().substring(5)));
		GameRegistry.register(mooChestplate.setRegistryName(mooChestplate.getUnlocalizedName().substring(5)));
		GameRegistry.register(mooLeggings.setRegistryName(mooLeggings.getUnlocalizedName().substring(5)));
		GameRegistry.register(mooBoots.setRegistryName(mooBoots.getUnlocalizedName().substring(5)));
		GameRegistry.register(enderHelmet.setRegistryName(enderHelmet.getUnlocalizedName().substring(5)));
		GameRegistry.register(enderChestplate.setRegistryName(enderChestplate.getUnlocalizedName().substring(5)));
		GameRegistry.register(enderLeggings.setRegistryName(enderLeggings.getUnlocalizedName().substring(5)));
		GameRegistry.register(enderBoots.setRegistryName(enderBoots.getUnlocalizedName().substring(5)));
		*/
		GameRegistry.register(blazeHelmet.setRegistryName(blazeHelmet.getUnlocalizedName().substring(5)));
		GameRegistry.register(blazeChestplate.setRegistryName(blazeChestplate.getUnlocalizedName().substring(5)));
		GameRegistry.register(blazeLeggings.setRegistryName(blazeLeggings.getUnlocalizedName().substring(5)));
		GameRegistry.register(blazeBoots.setRegistryName(blazeBoots.getUnlocalizedName().substring(5)));
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
		registerRender(batSuit);
		
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
		/*
		registerRender(mooHelmet);
		registerRender(mooChestplate);
		registerRender(mooLeggings);
		registerRender(mooBoots);
		registerRender(enderHelmet);
		registerRender(enderChestplate);
		registerRender(enderLeggings);
		registerRender(enderBoots);
		*/
		registerRender(blazeHelmet);
		registerRender(blazeChestplate);
		registerRender(blazeLeggings);
		registerRender(blazeBoots);
	}
	
	public static void registerRender (Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Refrence.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
