package me.thesuperhb.mobdrops.content;

import me.thesuperhb.mobdrops.Main;
import me.thesuperhb.mobdrops.Refrence;
import me.thesuperhb.mobdrops.content.armor.*;
import me.thesuperhb.mobdrops.content.tools.GooSword;
import me.thesuperhb.mobdrops.content.tools.MagmaGooSword;
import me.thesuperhb.mobdrops.content.tools.SpiderLeg;
import me.thesuperhb.mobdrops.content.tools.ZombieArm;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MobDropItems {
	// Creative Tab
	static CreativeTabs mD = Main.mdTab;
	
	// Items
	public static Item 
	creeperSkin, 
	wolfSkin,
	redLeather,
	enderScale,
	goo, magmaGoo,
	horseSkin,
	ocelotFur,
	squidEye,
	wort, 
	zombieBrain;
	
	// Tools
	public static Item
	spiderLeg, zombieArm,
	gooSword, magmaGooSword;
	
	// Food
	/*
	 * Uncooked
	 * Use 0.3F Minimum
	 * 
	 * Cooked
	 * Used 0.8F Minimum
	 * 
	 * Form:
	 * public static Item uncooked_item, cooked_item; 
	 */
	public static Item 
	ham, bacon,
	squidTentacle, calamari,
	rawChickenLeg, cookedChickenLeg, friedChickenLeg, friedChicken,
	rawPigmanMeat, friedPigmanMeat,
	rawRibs, ribs,
	creeperEye;
	
	// Armor
	public static Item 
	creeperHelmet, creeperChestplate, creeperLeggings, creeperBoots,
	wolfHelmet, wolfChestplate, wolfLeggings, wolfBoots,
	horseHelmet, horseChestplate, horseLeggings, horseBoots,
	ocelotHelmet, ocelotChestplate, ocelotLeggings, ocelotBoots,
	mooHelmet, mooChestplate, mooLeggings, mooBoots,
	enderScaleHelmet, enderScaleChestplate, enderScaleLeggings, enderScaleBoots;

	//TODO Remove All '//Done' Comments
	public static void init(){
		// Items
		creeperSkin = new Item().setUnlocalizedName("creeper_skin").setCreativeTab(mD);
		wolfSkin = new Item().setUnlocalizedName("wolf_skin").setCreativeTab(mD);
		redLeather = new Item().setUnlocalizedName("red_leather").setCreativeTab(mD);
		enderScale = new Item().setUnlocalizedName("ender_scale").setCreativeTab(mD);
		goo = new Item().setUnlocalizedName("goo").setCreativeTab(mD);
		magmaGoo = new Item().setUnlocalizedName("magma_goo").setCreativeTab(mD);
		horseSkin = new Item().setUnlocalizedName("horse_skin").setCreativeTab(mD);
		ocelotFur = new Item().setUnlocalizedName("ocelot_fur").setCreativeTab(mD);
		squidEye = new Item().setUnlocalizedName("squid_eye").setCreativeTab(mD);
		wort = new Item().setUnlocalizedName("wort").setCreativeTab(mD);
		zombieBrain = new Item().setUnlocalizedName("zombie_brain").setCreativeTab(mD);
		
		// Food
		ham = new ItemFood(1, 0.3F, false).setUnlocalizedName("ham").setCreativeTab(mD);
		bacon = new ItemFood(3, 0.8F, true).setUnlocalizedName("bacon").setCreativeTab(mD);
		squidTentacle = new ItemFood(1, 0.3F, false).setUnlocalizedName("squid_tentacle").setCreativeTab(mD);
		calamari = new ItemFood(2, 0.9F, false).setUnlocalizedName("calamari").setCreativeTab(mD);
		rawChickenLeg = new ItemFood(1, 0.3F, false).setUnlocalizedName("raw_chickenleg").setCreativeTab(mD);
		cookedChickenLeg = new ItemFood(4, 1F, true).setUnlocalizedName("chicken_leg").setCreativeTab(mD);
		friedChickenLeg = new ItemFood(5, 1.2F, false).setUnlocalizedName("fried_chickenleg").setCreativeTab(mD);
		friedChicken = new ItemFood(1, 0.3F, false).setUnlocalizedName("fried_chicken").setCreativeTab(mD);
		rawPigmanMeat = new ItemFood(1, 0.3F, false).setUnlocalizedName("raw_pigmanmeat").setCreativeTab(mD);
		friedPigmanMeat = new ItemFood(2, 0.8F, false).setUnlocalizedName("pigman_meat").setCreativeTab(mD);
		rawRibs = new ItemFood(1, 0.3F, false).setUnlocalizedName("raw_ribs").setCreativeTab(mD);
		ribs = new ItemFood(3, 0.8F, true).setUnlocalizedName("ribs").setCreativeTab(mD);
		creeperEye = new ItemFood(2, 0.5F, false).setUnlocalizedName("creeper_eye").setCreativeTab(mD); 
		
		// Armor
		creeperHelmet = new CreeperArmor(MDArmorMaterial.CREEPER, ItemID.creeperHelmetID, 0).setUnlocalizedName("creeper_helmet").setCreativeTab(mD);
		creeperChestplate = new CreeperArmor(MDArmorMaterial.CREEPER, ItemID.creeperChestID, 1).setUnlocalizedName("creeper_chestplate").setCreativeTab(mD);
		creeperLeggings = new CreeperArmor(MDArmorMaterial.CREEPER, ItemID.creeperPantsID, 2).setUnlocalizedName("creeper_leggings").setCreativeTab(mD);
		creeperBoots = new CreeperArmor(MDArmorMaterial.CREEPER, ItemID.creeperShoesID, 3).setUnlocalizedName("creeper_boots").setCreativeTab(mD);
		wolfHelmet = new WolfArmor(MDArmorMaterial.WOLF, ItemID.wolfHelmetID, 0).setUnlocalizedName("wolf_helmet").setCreativeTab(mD);
		wolfChestplate = new WolfArmor(MDArmorMaterial.WOLF, ItemID.wolfChestID, 1).setUnlocalizedName("wolf_chestplate").setCreativeTab(mD);
		wolfLeggings = new WolfArmor(MDArmorMaterial.WOLF, ItemID.wolfPantsID, 2).setUnlocalizedName("wolf_leggings").setCreativeTab(mD);
		wolfBoots = new WolfArmor(MDArmorMaterial.WOLF, ItemID.wolfShoesID, 3).setUnlocalizedName("wolf_boots").setCreativeTab(mD);
		
		// TODO Armor Textures
		horseHelmet = new HorseArmor(MDArmorMaterial.HORSE, ItemID.horseHelmetID, 0).setUnlocalizedName("horse_helmet").setCreativeTab(mD);
		horseChestplate = new HorseArmor(MDArmorMaterial.HORSE, ItemID.horseChestplateID, 1).setUnlocalizedName("horse_chestplate").setCreativeTab(mD);
		horseLeggings = new HorseArmor(MDArmorMaterial.HORSE, ItemID.horsePantsID, 2).setUnlocalizedName("horse_leggings").setCreativeTab(mD);
		horseBoots = new HorseArmor(MDArmorMaterial.HORSE, ItemID.horseShoesID, 3).setUnlocalizedName("horse_boots").setCreativeTab(mD);
		ocelotHelmet = new OcelotArmor(MDArmorMaterial.OCELOT, ItemID.ocelotHelmetID, 0).setUnlocalizedName("ocelot_helmet").setCreativeTab(mD);
		ocelotChestplate = new OcelotArmor(MDArmorMaterial.OCELOT, ItemID.ocelotChestplateID, 1).setUnlocalizedName("ocelot_chestplate").setCreativeTab(mD);
		ocelotLeggings = new OcelotArmor(MDArmorMaterial.OCELOT, ItemID.ocelotPantsID, 2).setUnlocalizedName("ocelot_leggings").setCreativeTab(mD);
		ocelotBoots = new OcelotArmor(MDArmorMaterial.OCELOT, ItemID.ocelotShoesID, 3).setUnlocalizedName("ocelot_boots").setCreativeTab(mD);
		mooHelmet = new MooArmor(MDArmorMaterial.MOO, ItemID.mooHelmetID, 0).setUnlocalizedName("moo_helmet"); //.setCreativeTab(mD); //TODO Textures
		mooChestplate = new MooArmor(MDArmorMaterial.MOO, ItemID.mooChestplateID, 1).setUnlocalizedName("moo_chestplate"); //.setCreativeTab(mD); //TODO Textures
		mooLeggings = new MooArmor(MDArmorMaterial.MOO, ItemID.mooPantsID, 2).setUnlocalizedName("moo_leggings"); //.setCreativeTab(mD); //TODO Textures
		mooBoots = new MooArmor(MDArmorMaterial.MOO, ItemID.mooShoesID, 3).setUnlocalizedName("moo_boots"); //.setCreativeTab(mD); //TODO Textures
		enderScaleHelmet = new EnderScaleArmor(MDArmorMaterial.ENDERSCALE, ItemID.enderHelmetID, 0).setUnlocalizedName("ender_helmet"); //.setCreativeTab(mD); //TODO Textures
		enderScaleChestplate = new EnderScaleArmor(MDArmorMaterial.ENDERSCALE, ItemID.enderChestplateID, 1).setUnlocalizedName("ender_chestplate"); //.setCreativeTab(mD); //TODO Textures
		enderScaleLeggings = new EnderScaleArmor(MDArmorMaterial.ENDERSCALE, ItemID.enderPantsID, 2).setUnlocalizedName("ender_leggings"); //.setCreativeTab(mD); //TODO Textures
		enderScaleBoots = new EnderScaleArmor(MDArmorMaterial.ENDERSCALE, ItemID.enderShoesID, 3).setUnlocalizedName("ender_boots"); //.setCreativeTab(mD); //TODO Textures
		
		// Tools
		spiderLeg = new SpiderLeg(MDToolMaterial.SPIDER).setUnlocalizedName("spider_leg").setCreativeTab(mD);
		zombieArm = new ZombieArm(MDToolMaterial.ZOMBIE).setUnlocalizedName("zombie_arm").setCreativeTab(mD);
		gooSword = new GooSword(MDToolMaterial.GOO).setUnlocalizedName("goo_sword").setCreativeTab(mD);
		magmaGooSword = new MagmaGooSword(MDToolMaterial.MAGMAGOO).setUnlocalizedName("magmagoo_sword").setCreativeTab(mD);
	}
	
	public static void register(){
		// Items
		GameRegistry.registerItem(creeperSkin, creeperSkin.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(wolfSkin, wolfSkin.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(redLeather, redLeather.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(enderScale, enderScale.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(goo, goo.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(magmaGoo, magmaGoo.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(horseSkin, horseSkin.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ocelotFur, ocelotFur.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(squidEye, squidEye.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(wort, wort.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(zombieBrain, zombieBrain.getUnlocalizedName().substring(5));
		
		// Food
		GameRegistry.registerItem(ham, ham.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(bacon, bacon.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(squidTentacle, squidTentacle.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(calamari, calamari.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(rawChickenLeg, rawChickenLeg.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cookedChickenLeg, cookedChickenLeg.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(friedChickenLeg, friedChickenLeg.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(friedChicken, friedChicken.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(rawPigmanMeat, rawPigmanMeat.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(friedPigmanMeat, friedPigmanMeat.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(rawRibs, rawRibs.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ribs, ribs.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(creeperEye, creeperEye.getUnlocalizedName().substring(5));
		
		// Armor
		GameRegistry.registerItem(creeperHelmet, creeperHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(creeperChestplate, creeperChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(creeperLeggings, creeperLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(creeperBoots, creeperBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(wolfHelmet, wolfHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(wolfChestplate, wolfChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(wolfLeggings, wolfLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(wolfBoots, wolfBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(horseHelmet, horseHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(horseChestplate, horseChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(horseLeggings, horseLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(horseBoots, horseBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ocelotHelmet, ocelotHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ocelotChestplate, ocelotChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ocelotLeggings, ocelotLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ocelotBoots, ocelotBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(mooHelmet, mooHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(mooChestplate, mooChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(mooLeggings, mooLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(mooBoots, mooBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(enderScaleHelmet, enderScaleHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(enderScaleChestplate, enderScaleChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(enderScaleLeggings, enderScaleLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(enderScaleBoots, enderScaleBoots.getUnlocalizedName().substring(5));
		
		// Tools
		GameRegistry.registerItem(spiderLeg, spiderLeg.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(zombieArm, zombieArm.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(gooSword, gooSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(magmaGooSword, magmaGooSword.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders(){
		// Items
		registerRender(creeperSkin);
		registerRender(wolfSkin);
		registerRender(redLeather);
		registerRender(enderScale);
		registerRender(goo);
		registerRender(magmaGoo);
		registerRender(horseSkin);
		registerRender(ocelotFur);
		registerRender(squidEye);
		registerRender(wort);
		registerRender(zombieBrain);
		
		// Food
		registerRender(ham);
		registerRender(bacon);
		registerRender(squidTentacle);
		registerRender(calamari);
		registerRender(rawChickenLeg);
		registerRender(cookedChickenLeg);
		registerRender(friedChickenLeg);
		registerRender(friedChicken);
		registerRender(rawPigmanMeat);
		registerRender(friedPigmanMeat);
		registerRender(rawRibs);
		registerRender(ribs);
		registerRender(creeperEye);
		
		// Armor
		registerRender(creeperHelmet);
		registerRender(creeperChestplate);
		registerRender(creeperLeggings);
		registerRender(creeperBoots);
		registerRender(wolfHelmet);
		registerRender(wolfChestplate);
		registerRender(wolfLeggings);
		registerRender(wolfBoots);
		registerRender(ocelotHelmet);
		registerRender(ocelotChestplate);
		registerRender(ocelotLeggings);
		registerRender(ocelotBoots);
		registerRender(mooHelmet);
		registerRender(mooChestplate);
		registerRender(mooLeggings);
		registerRender(mooBoots);
		registerRender(enderScaleHelmet);
		registerRender(enderScaleChestplate);
		registerRender(enderScaleLeggings);
		registerRender(enderScaleBoots);
		
		// Tools
		registerRender(spiderLeg);
		registerRender(zombieArm);
		registerRender(gooSword);
		registerRender(magmaGooSword);
	}
	
	public static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Refrence.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
