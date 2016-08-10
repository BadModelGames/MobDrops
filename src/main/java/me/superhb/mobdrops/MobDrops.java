package me.superhb.mobdrops;

import me.superhb.mobdrops.content.MDBlocks;
import me.superhb.mobdrops.content.MDItems;
import me.superhb.mobdrops.handler.CreeperViewHandler;
import me.superhb.mobdrops.handler.LivingDropsHandler;
import me.superhb.mobdrops.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;

@Mod(modid = Refrence.MODID, name = Refrence.NAME, version = Refrence.VERSION)

public class MobDrops {
	@SidedProxy(clientSide = Refrence.CLIENT_PROXY_CLASS, serverSide = Refrence.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@Instance(Refrence.MODID)
	public static MobDrops instance;
	
	// Creative Tab
	public static final CreativeTabs mdTab = new CreativeTabs("MobDrops") {
		public Item getTabIconItem () {
			return MDItems.creeperSkin;
		}
		
		public String getTranslatedTabLabel () {
			return Refrence.NAME;
		}
	};
	
	@EventHandler
	public void preInit (FMLPreInitializationEvent event) {
		//MDBlocks.init();
		//MDBlocks.register();
		
		MDItems.init();
		MDItems.register();
		
		MinecraftForge.EVENT_BUS.register(new LivingDropsHandler());
	}
	
	@EventHandler
	public void init (FMLInitializationEvent event) {
		proxy.registerRenders();
	}
	
	@EventHandler
	public void postInit (FMLPostInitializationEvent event) {
		//MinecraftForge.EVENT_BUS.register(new CreeperViewHandler());
	}
}
