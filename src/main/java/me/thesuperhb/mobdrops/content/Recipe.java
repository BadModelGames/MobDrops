package me.thesuperhb.mobdrops.content;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipe {
	public static void registerRecipe(){
		// Crafting Table
		GameRegistry.addRecipe(new ItemStack(MobDropItems.creeperHelmet, 1), new Object[]{"ccc", "c c", 'c', MobDropItems.creeperSkin});
		GameRegistry.addRecipe(new ItemStack(MobDropItems.creeperChestplate, 1), new Object[]{"c c", "ccc", "ccc", 'c', MobDropItems.creeperSkin});
		GameRegistry.addRecipe(new ItemStack(MobDropItems.creeperLeggings, 1), new Object[]{"ccc", "c c", "c c", 'c', MobDropItems.creeperSkin});
		GameRegistry.addRecipe(new ItemStack(MobDropItems.creeperBoots, 1), new Object[]{"c c", "c c", 'c', MobDropItems.creeperSkin});
		GameRegistry.addRecipe(new ItemStack(MobDropItems.wolfHelmet, 1), new Object[]{"www", "w w", 'w', MobDropItems.wolfSkin});
		GameRegistry.addRecipe(new ItemStack(MobDropItems.wolfChestplate, 1), new Object[]{"w w", "www", "www", 'w', MobDropItems.wolfSkin});
		GameRegistry.addRecipe(new ItemStack(MobDropItems.wolfLeggings, 1), new Object[]{"www", "w w", "w w", 'w', MobDropItems.wolfSkin});
		GameRegistry.addRecipe(new ItemStack(MobDropItems.wolfBoots, 1), new Object[]{"w w", "w w", 'w', MobDropItems.wolfSkin});
		GameRegistry.addRecipe(new ItemStack(MobDropItems.horseHelmet, 1), new Object[]{"hhh", "h h", 'h', MobDropItems.horseSkin});
		GameRegistry.addRecipe(new ItemStack(MobDropItems.horseChestplate, 1), new Object[]{"h h", "hhh", "hhh", 'h', MobDropItems.horseSkin});
		GameRegistry.addRecipe(new ItemStack(MobDropItems.horseLeggings, 1), new Object[]{"hhh", "h h", "h h", 'h', MobDropItems.horseSkin});
		GameRegistry.addRecipe(new ItemStack(MobDropItems.horseBoots, 1), new Object[]{"h h", "h h", 'h', MobDropItems.horseSkin});
		GameRegistry.addRecipe(new ItemStack(MobDropItems.ocelotHelmet, 1), new Object[]{"ooo", "o o", 'o', MobDropItems.ocelotFur});
		GameRegistry.addRecipe(new ItemStack(MobDropItems.ocelotChestplate, 1), new Object[]{"o o", "ooo", "ooo", 'o', MobDropItems.ocelotFur});
		GameRegistry.addRecipe(new ItemStack(MobDropItems.ocelotLeggings, 1), new Object[]{"ooo", "o o", "o o", 'o', MobDropItems.ocelotFur});
		GameRegistry.addRecipe(new ItemStack(MobDropItems.ocelotBoots, 1), new Object[]{"o o", "o o", 'o', MobDropItems.ocelotFur});
		GameRegistry.addRecipe(new ItemStack(MobDropItems.mooHelmet, 1), new Object[]{"mmm", "m m", 'm', MobDropItems.redLeather});
		GameRegistry.addRecipe(new ItemStack(MobDropItems.mooChestplate, 1), new Object[]{"m m", "mmm", "mmm", 'm', MobDropItems.redLeather});
		GameRegistry.addRecipe(new ItemStack(MobDropItems.mooLeggings, 1), new Object[]{"mmm", "m m", "m m", 'm', MobDropItems.redLeather});
		GameRegistry.addRecipe(new ItemStack(MobDropItems.mooBoots, 1), new Object[]{"m m", "m m", 'm', MobDropItems.redLeather});
		GameRegistry.addRecipe(new ItemStack(MobDropItems.enderScaleHelmet, 1), new Object[]{"eee", "e e", 'e', MobDropItems.enderScale});
		GameRegistry.addRecipe(new ItemStack(MobDropItems.enderScaleChestplate, 1), new Object[]{"e e", "eee", "eee", 'e', MobDropItems.enderScale});
		GameRegistry.addRecipe(new ItemStack(MobDropItems.enderScaleLeggings, 1), new Object[]{"eee", "e e", "e e", 'e', MobDropItems.enderScale});
		GameRegistry.addRecipe(new ItemStack(MobDropItems.enderScaleBoots, 1), new Object[]{"e e", "e e", 'e', MobDropItems.enderScale});	
		
		GameRegistry.addRecipe(new ItemStack(MobDropItems.gooSword, 1), new Object[]{"g", "g", "s", 'g', MobDropItems.goo, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MobDropItems.magmaGooSword, 1), new Object[]{"m", "m", "s", 'm', MobDropItems.magmaGoo, 's', Items.stick});
		
		// Furnace
		GameRegistry.addSmelting(new ItemStack(MobDropItems.rawChickenLeg), new ItemStack(MobDropItems.cookedChickenLeg), 0.35F);
		GameRegistry.addSmelting(new ItemStack(MobDropItems.rawRibs), new ItemStack(MobDropItems.ribs), 0.35F);
		GameRegistry.addSmelting(new ItemStack(MobDropItems.squidTentacle), new ItemStack(MobDropItems.calamari), 0.35F);
		GameRegistry.addSmelting(new ItemStack(MobDropItems.ham), new ItemStack(MobDropItems.bacon), 0.35F);
		GameRegistry.addSmelting(new ItemStack(MobDropItems.ham), new ItemStack(MobDropItems.calamari), 0.50F);
		GameRegistry.addSmelting(new ItemStack(MobDropItems.cookedChickenLeg), new ItemStack(MobDropItems.friedChickenLeg), 0.54F);
		GameRegistry.addSmelting(new ItemStack(Items.cooked_chicken), new ItemStack(MobDropItems.friedChicken), 0.54F);
		GameRegistry.addSmelting(new ItemStack(MobDropItems.rawPigmanMeat), new ItemStack(MobDropItems.friedPigmanMeat), 0.35F);
		GameRegistry.addSmelting(new ItemStack(MobDropItems.rawRibs), new ItemStack(MobDropItems.ribs), 0.30F);
	}
}
