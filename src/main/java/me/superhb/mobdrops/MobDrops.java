package me.superhb.mobdrops;

import java.util.ArrayList;
import java.util.List;
import com.google.common.collect.Lists;
import me.superhb.mobdrops.content.MDItems;
import me.superhb.mobdrops.handler.CreeperViewHandler;
import me.superhb.mobdrops.handler.LivingDropsHandler;
import me.superhb.mobdrops.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class MobDrops {
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@Instance(Reference.MODID)
	public static MobDrops instance;
	
	public static boolean customItems;
	public static boolean onlyBones;
	
	// Creative Tab
	public static CreativeTabs mdTab;
	
	@EventHandler
	public void preInit (FMLPreInitializationEvent event) {
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		
		config.load();
		
		customItems = config.getBoolean("customItems", Configuration.CATEGORY_GENERAL, true, "Allows you to turn on and off custom items");
		onlyBones = config.getBoolean("onlyBones", Configuration.CATEGORY_GENERAL, false, "Turns off custom items and only drops bones");
		
		config.save();
		
		if (customItems) {
			mdTab = new CreativeTabs("MobDrops") {
				public Item getTabIconItem () {
					return MDItems.creeperSkin;
				}
				
				public String getTranslatedTabLabel () {
					return Reference.NAME;
				}
			};
		}
	}
	
	@EventHandler
	public void init (FMLInitializationEvent event) {
		if (customItems) {
			MDItems.init();
			MDItems.register();
			
			proxy.registerRenders();
		}
		
		MinecraftForge.EVENT_BUS.register(new LivingDropsHandler());
	}
	
	@EventHandler
	public void postInit (FMLPostInitializationEvent event) {
		//MinecraftForge.EVENT_BUS.register(new CreeperViewHandler());
	}
}
