package me.thesuperhb.mobdrops;

import me.thesuperhb.mobdrops.content.*;
import me.thesuperhb.mobdrops.drops.LivingDropsHandler;
import me.thesuperhb.mobdrops.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Refrence.MODID, name = Refrence.NAME, version = Refrence.VERSION)

public class Main {
	@SidedProxy(clientSide = Refrence.CLIENT_PROXY_CLASS, serverSide = Refrence.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@Instance(Refrence.MODID)
	public static Main instance;
	
	//Creative Tab
	public static final CreativeTabs mdTab = new CreativeTabs("MobDrops"){
		public Item getTabIconItem(){
			return MobDropItems.creeperSkin;
		}
		
		public String getTranslatedTabLabel(){
			return "MobDrops";
		}
	};
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		MobDropItems.init();
		MobDropItems.register();
		
		MinecraftForge.EVENT_BUS.register(new LivingDropsHandler());
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		proxy.registerRenders();
		
		//TODO Get Creeper View Overlay working
		//MinecraftForge.EVENT_BUS.register(new CreeperViewEventHandler(Minecraft.getMinecraft()));
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
}