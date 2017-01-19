package me.superhb.mobdrops.content;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.*;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipe {
	public static void registerRecipe () {
		ItemStack redHelmet = new ItemStack(Items.LEATHER_HELMET, 1);
		NBTTagCompound helmetTag = redHelmet.func_190925_c("display");
		helmetTag.setInteger("color", 10040115);
		
		ItemStack redChestplate = new ItemStack(Items.LEATHER_CHESTPLATE, 1);
		NBTTagCompound chestplateTag = redChestplate.func_190925_c("display");
		chestplateTag.setInteger("color", 10040115);
		
		ItemStack redLeggings = new ItemStack(Items.LEATHER_LEGGINGS, 1);
		NBTTagCompound leggingsTag = redLeggings.func_190925_c("display");
		leggingsTag.setInteger("color", 10040115);
		
		ItemStack redBoots = new ItemStack(Items.LEATHER_BOOTS, 1);
		NBTTagCompound redTags = redBoots.func_190925_c("display");
		redTags.setInteger("color", 10040115);
		
		// Crafting Table
		GameRegistry.addRecipe(new ItemStack(MDItems.blazeShard, 2), new Object[] { " f ", "fbf", " f ", 'f', Items.FLINT, 'b', Items.BLAZE_ROD });
		GameRegistry.addRecipe(new ItemStack(MDItems.gooSword, 1), new Object[] { "g", "g", "s", 'g', MDItems.goo, 's', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(MDItems.magmaGooSword, 1), new Object[] { "m", "m", "b", 'm', MDItems.magmaGoo, 'b', Items.BLAZE_ROD });
		GameRegistry.addRecipe(new ItemStack(MDItems.blazeSword, 1), new Object[] { "b", "b", "i", 'b', MDItems.blazeShard, 'i', Items.IRON_INGOT });
		GameRegistry.addRecipe(new ItemStack(MDItems.blazeBow, 1), new Object[] { " bs", "b s", " bs", 'b', Items.BLAZE_ROD, 's', Items.STRING });
		GameRegistry.addRecipe(new ItemStack(MDItems.creeperViewHelmet, 1), new Object[] { "ccc", "cgc", 'c', MDItems.creeperSkin, 'g', Blocks.GLASS_PANE });
		GameRegistry.addRecipe(new ItemStack(MDItems.creeperHelmet, 1), new Object[] { "ccc", "c c", 'c', MDItems.creeperSkin });
		GameRegistry.addRecipe(new ItemStack(MDItems.creeperChestplate, 1), new Object[] { "c c", "ccc", "ccc",'c', MDItems.creeperSkin });
		GameRegistry.addRecipe(new ItemStack(MDItems.creeperLeggings, 1), new Object[] { "ccc", "c c", "c c", 'c', MDItems.creeperSkin });
		GameRegistry.addRecipe(new ItemStack(MDItems.creeperBoots, 1), new Object[] { "c c", "c c", 'c', MDItems.creeperSkin });
		GameRegistry.addRecipe(new ItemStack(MDItems.wolfHelmet, 1), new Object[] { "www", "w w", 'w', MDItems.wolfSkin });
		GameRegistry.addRecipe(new ItemStack(MDItems.wolfChestplate, 1), new Object[] { "w w", "www", "www", 'w', MDItems.wolfSkin });
		GameRegistry.addRecipe(new ItemStack(MDItems.wolfLeggings, 1), new Object[] { "www", "w w", "w w", 'w', MDItems.wolfSkin });
		GameRegistry.addRecipe(new ItemStack(MDItems.wolfBoots, 1), new Object[] { "w w", "w w", 'w', MDItems.wolfSkin });
		GameRegistry.addRecipe(new ItemStack(MDItems.furStole, 1), new Object[] { "www", "h b", 'w', MDItems.wolfSkin, 'h', MDItems.wolfHelmet, 'b', MDItems.wolfBoots });
		GameRegistry.addRecipe(new ItemStack(MDItems.ocelotHelmet, 1), new Object[] { "ooo", "o o", 'o', MDItems.ocelotFur });
		GameRegistry.addRecipe(new ItemStack(MDItems.ocelotChestplate, 1), new Object[] { "o o", "ooo", "ooo", 'o', MDItems.ocelotFur });
		GameRegistry.addRecipe(new ItemStack(MDItems.ocelotLeggings, 1), new Object[] { "ooo", "o o", "o o", 'o', MDItems.ocelotFur });
		GameRegistry.addRecipe(new ItemStack(MDItems.ocelotBoots, 1), new Object[] { "o o", "o o", 'o', MDItems.ocelotFur });
		GameRegistry.addRecipe(redHelmet, new Object[] { "rrr", "r r", 'r', MDItems.redLeather });
		GameRegistry.addRecipe(redChestplate, new Object[] { "r r", "rrr", "rrr", 'r', MDItems.redLeather });
		GameRegistry.addRecipe(redLeggings, new Object[] { "rrr", "r r", "r r", 'r', MDItems.redLeather });
		GameRegistry.addRecipe(redBoots, new Object[] { "r r", "r r", 'r', MDItems.redLeather });
		GameRegistry.addRecipe(new ItemStack(MDItems.enderHelmet, 1), new Object[] { "eoe", "e e", 'e', MDItems.enderScale, 'o', Blocks.OBSIDIAN });
		GameRegistry.addRecipe(new ItemStack(MDItems.enderChestplate, 1), new Object[] { "o o", "eoe", "eee", 'r', MDItems.enderScale, 'o', Blocks.OBSIDIAN });
		GameRegistry.addRecipe(new ItemStack(MDItems.enderLeggings, 1), new Object[] { "eee", "o o", "e e", 'r', MDItems.enderScale, 'o', Blocks.OBSIDIAN });
		GameRegistry.addRecipe(new ItemStack(MDItems.enderBoots, 1), new Object[] { "e e", "o o", 'r', MDItems.enderScale, 'o', Blocks.OBSIDIAN });
		GameRegistry.addRecipe(new ItemStack(MDItems.blazeHelmet, 1), new Object[] { "bob", "b b", 'b', MDItems.blazeShard });
		GameRegistry.addRecipe(new ItemStack(MDItems.blazeChestplate, 1), new Object[] { "o o", "bob", "bbb", 'b', MDItems.blazeShard, 'o', Blocks.OBSIDIAN });
		GameRegistry.addRecipe(new ItemStack(MDItems.blazeLeggings, 1), new Object[] { "bbb", "o o", "b b", 'b', MDItems.blazeShard, 'o', Blocks.OBSIDIAN });
		GameRegistry.addRecipe(new ItemStack(MDItems.blazeBoots, 1), new Object[] { "b b", "o o", 'b', MDItems.blazeShard, 'o', Blocks.OBSIDIAN });
		
		// Furnace
		GameRegistry.addSmelting(MDItems.ham, new ItemStack(MDItems.bacon), 0.35F);
		GameRegistry.addSmelting(MDItems.squidTentacle, new ItemStack(MDItems.calamari), 0.35F);
		GameRegistry.addSmelting(MDItems.chickenLeg, new ItemStack(MDItems.cookedChickenLeg), 0.35F);
		GameRegistry.addSmelting(MDItems.pigmanMeat, new ItemStack(MDItems.cookedPigmanMeat), 0.35F);
		GameRegistry.addSmelting(MDItems.ribs, new ItemStack(MDItems.cookedRibs), 0.35F);
	}
}
