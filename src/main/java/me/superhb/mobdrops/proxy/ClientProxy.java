package me.superhb.mobdrops.proxy;

import me.superhb.mobdrops.content.MDItems;
import me.superhb.mobdrops.content.Recipe;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenders () {
		MDItems.registerRenders();
		Recipe.registerRecipe();
	}
}
