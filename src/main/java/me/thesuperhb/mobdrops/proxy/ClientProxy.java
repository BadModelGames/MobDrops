package me.thesuperhb.mobdrops.proxy;

import me.thesuperhb.mobdrops.content.*;
import me.thesuperhb.mobdrops.content.Recipe;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void registerRenders(){
		MobDropItems.registerRenders();
		Recipe.registerRecipe();
	}
}
