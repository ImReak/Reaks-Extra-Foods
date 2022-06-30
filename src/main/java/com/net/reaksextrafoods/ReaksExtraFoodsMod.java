package com.net.reaksextrafoods;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.MinecraftVersion;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.print.Paper;

public class ReaksExtraFoodsMod implements ModInitializer {
	public static final Identifier SOUND_PAIMON = new Identifier("reaksextrafoods:sound_paimon");
	public static SoundEvent PAIMON_SOUND_EVENT = new SoundEvent(SOUND_PAIMON);

	public static final com.net.reaksextrafoods.Icon ICON = new com.net.reaksextrafoods.Icon(new FabricItemSettings().maxCount(1));
	public static final ItemGroup REAKSEXTRAFOOD = FabricItemGroupBuilder.build(
			new Identifier("reaksextrafoods", "food"),
			() -> new ItemStack(ICON));

	public static final com.net.reaksextrafoods.Vodka VODKA = new com.net.reaksextrafoods.Vodka(new FabricItemSettings().group(REAKSEXTRAFOOD)
			.food((new FoodComponent.Builder())
					.hunger(3)
					.saturationModifier(0.3F)
					.snack()
					.statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,600,1),1.0F)
					.statusEffect(new StatusEffectInstance(StatusEffects.SPEED,600,1),1.0F)
					.statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,600,1),1.0F)
					.statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,100,1),1.0F)
					.statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,200,1),1.0F)
					.alwaysEdible()
					.build())
			.maxCount(16));
	public static final com.net.reaksextrafoods.Ryebread RYE_BREAD = new com.net.reaksextrafoods.Ryebread(new FabricItemSettings().group(REAKSEXTRAFOOD)
			.food((new FoodComponent.Builder())
					.hunger(6)
					.saturationModifier(0.6F)
					.statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,60,1),1.0F)
					.alwaysEdible()
					.build())
			.maxCount(64));
	public static final com.net.reaksextrafoods.Kvass KVASS = new com.net.reaksextrafoods.Kvass(new FabricItemSettings().group(REAKSEXTRAFOOD)
			.food((new FoodComponent.Builder())
					.hunger(4)
					.saturationModifier(0.4F)
					.snack()
					.statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,60,1),1.0F)
					.statusEffect(new StatusEffectInstance(StatusEffects.HASTE,240,1),1.0F)
					.alwaysEdible()
					.build())
			.maxCount(16));
	public static final com.net.reaksextrafoods.CondensedMilkPack CONDENSEDMILKPACK = new com.net.reaksextrafoods.CondensedMilkPack(new FabricItemSettings().group(REAKSEXTRAFOOD)
			.food((new FoodComponent.Builder())
					.hunger(5)
					.saturationModifier(0.5F)
					.snack()
					.statusEffect(new StatusEffectInstance(StatusEffects.SATURATION,300,1),1.0F)
					.statusEffect(new StatusEffectInstance(StatusEffects.LUCK,300,1),1.0F)
					.alwaysEdible()
					.build())
			.maxCount(16));
	public static final com.net.reaksextrafoods.Milkchocolatealionka MILKCHOCOLATEALIONKA = new com.net.reaksextrafoods.Milkchocolatealionka(new FabricItemSettings().group(REAKSEXTRAFOOD)
			.food((new FoodComponent.Builder())
					.hunger(5)
					.saturationModifier(0.5F)
					.snack()
					.statusEffect(new StatusEffectInstance(StatusEffects.SATURATION,600,1),1.0F)
					.alwaysEdible()
					.build())
			.maxCount(64));
	public static final com.net.reaksextrafoods.Okroshka OKROSHKA = new com.net.reaksextrafoods.Okroshka(new FabricItemSettings().group(REAKSEXTRAFOOD)
			.food((new FoodComponent.Builder())
					.hunger(7)
					.saturationModifier(0.7F)
					.statusEffect(new StatusEffectInstance(StatusEffects.SATURATION,600,1),1.0F)
					.statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,300,1),1.0F)
					.alwaysEdible()
					.build())
			.maxCount(1));
	public static final com.net.reaksextrafoods.RussianSoup RUSSIAN_SOUP = new com.net.reaksextrafoods.RussianSoup(new FabricItemSettings().group(REAKSEXTRAFOOD)
			.food((new FoodComponent.Builder())
					.hunger(8)
					.saturationModifier(0.8F)
					.statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,40,1),1.0F)
					.alwaysEdible()
					.build())
			.maxCount(1));
	public static final com.net.reaksextrafoods.TinnedCaviar TINNED_CAVIAR = new com.net.reaksextrafoods.TinnedCaviar(new FabricItemSettings().group(REAKSEXTRAFOOD)
			.food((new FoodComponent.Builder())
					.hunger(4)
					.saturationModifier(0.4F)
					.snack()
					.statusEffect(new StatusEffectInstance(StatusEffects.SPEED,100,1),1.0F)
					.alwaysEdible()
					.build())
			.maxCount(64));
	public static final com.net.reaksextrafoods.TinnedSalmonCaviar TINNED_SALMON_CAVIAR = new com.net.reaksextrafoods.TinnedSalmonCaviar(new FabricItemSettings().group(REAKSEXTRAFOOD)
			.food((new FoodComponent.Builder())
					.hunger(4)
					.saturationModifier(0.4F)
					.snack()
					.statusEffect(new StatusEffectInstance(StatusEffects.SPEED,100,1),1.0F)
					.alwaysEdible()
					.build())
			.maxCount(64));
	public static final com.net.reaksextrafoods.Sausage SAUSAGE = new com.net.reaksextrafoods.Sausage(new FabricItemSettings().group(REAKSEXTRAFOOD)
			.food((new FoodComponent.Builder())
					.hunger(4)
					.saturationModifier(0.4F)
					.meat()
					.statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS,30,1),1.0F)
					.alwaysEdible()
					.build())
			.maxCount(64));
	public static final com.net.reaksextrafoods.CookedSausage COOKED_SAUSAGE = new com.net.reaksextrafoods.CookedSausage(new FabricItemSettings().group(REAKSEXTRAFOOD)
			.food((new FoodComponent.Builder())
					.hunger(7)
					.saturationModifier(0.7F)
					.meat()
					.statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,400,1),1.0F)
					.statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,40,1),1.0F)
					.alwaysEdible()
					.build())
			.maxCount(64));
	public static final com.net.reaksextrafoods.BakedApple BAKED_APPLE = new com.net.reaksextrafoods.BakedApple(new FabricItemSettings().group(REAKSEXTRAFOOD)
			.food((new FoodComponent.Builder())
					.hunger(5)
					.saturationModifier(0.5F)
					.statusEffect(new StatusEffectInstance(StatusEffects.LUCK,400,1),1.0F)
					.alwaysEdible()
					.build())
			.maxCount(64));
	public static final com.net.reaksextrafoods.Flour FLOUR = new com.net.reaksextrafoods.Flour(new FabricItemSettings().group(REAKSEXTRAFOOD).maxCount(64));
	public static final com.net.reaksextrafoods.BakedDough BAKED_DOUGH = new com.net.reaksextrafoods.BakedDough(new FabricItemSettings().group(REAKSEXTRAFOOD)
			.food((new FoodComponent.Builder())
					.hunger(8)
					.saturationModifier(0.4F)
					.statusEffect(new StatusEffectInstance(StatusEffects.SATURATION,200,0),1.0F)
					.alwaysEdible()
					.build())
			.maxCount(64));
	public static final com.net.reaksextrafoods.Salt SALT = new com.net.reaksextrafoods.Salt(new FabricItemSettings().group(REAKSEXTRAFOOD).maxCount(64));
	public static final com.net.reaksextrafoods.Dough DOUGH = new com.net.reaksextrafoods.Dough(new FabricItemSettings().group(REAKSEXTRAFOOD)
			.food((new FoodComponent.Builder())
					.hunger(5)
					.saturationModifier(0.3F)
					.statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS,100,0),1.0F)
					.alwaysEdible()
					.build())
			.maxCount(64));
	public static final com.net.reaksextrafoods.ApplePie APPLE_PIE = new com.net.reaksextrafoods.ApplePie(new FabricItemSettings().group(REAKSEXTRAFOOD)
			.food((new FoodComponent.Builder())
					.hunger(12)
					.saturationModifier(0.5F)
					.statusEffect(new StatusEffectInstance(StatusEffects.GLOWING,6000,0),1.0F)
					.alwaysEdible()
					.build())
			.maxCount(64));
	public static final com.net.reaksextrafoods.DriedRottenFlesh DRIED_ROTTEN_FLESH = new com.net.reaksextrafoods.DriedRottenFlesh(new FabricItemSettings().group(REAKSEXTRAFOOD)
			.food((new FoodComponent.Builder())
					.hunger(5)
					.saturationModifier(0.5F)
					.statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION,400,1),1.0F)
					.alwaysEdible()
					.build())
			.maxCount(64));
	public static final com.net.reaksextrafoods.Coconut COCONUT = new com.net.reaksextrafoods.Coconut(new FabricItemSettings().group(REAKSEXTRAFOOD)
			.food((new FoodComponent.Builder())
					.hunger(5)
					.saturationModifier(0.4F)
					.snack()
					.statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,200,0),1.0F)
					.alwaysEdible()
					.build())
			.maxCount(64));
	public static final com.net.reaksextrafoods.BakedCoconut BAKED_COCONUT = new com.net.reaksextrafoods.BakedCoconut(new FabricItemSettings().group(REAKSEXTRAFOOD)
			.food((new FoodComponent.Builder())
					.hunger(7)
					.saturationModifier(0.4F)
					.statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,400,0),1.0F)
					.alwaysEdible()
					.build())
			.maxCount(64));
	public static final com.net.reaksextrafoods.HotChocolate HOT_CHOCOLATE = new com.net.reaksextrafoods.HotChocolate(new FabricItemSettings().group(REAKSEXTRAFOOD)
			.food((new FoodComponent.Builder())
					.hunger(3)
					.saturationModifier(0.5F)
					.snack()
					.statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,100,1),1.0F)
					.alwaysEdible()
					.build())
			.maxCount(16));
	public static final com.net.reaksextrafoods.Paimon PAIMON = new com.net.reaksextrafoods.Paimon(new FabricItemSettings().group(REAKSEXTRAFOOD)
			.fireproof()
			.food((new FoodComponent.Builder())
					.hunger(20)
					.saturationModifier(0.5F)
					.snack()
					.statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION,2400,5),1.0F)
					.statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,400,4),1.0F)
					.statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,6000,0),1.0F)
					.statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,6000,0),1.0F)
					.alwaysEdible()
					.build())
			.maxCount(16));
	public static final com.net.reaksextrafoods.ChocolateBar CHOCOLATE_BAR = new com.net.reaksextrafoods.ChocolateBar(new FabricItemSettings().group(REAKSEXTRAFOOD)
			.food((new FoodComponent.Builder())
					.hunger(6)
					.saturationModifier(0.3F)
					.statusEffect(new StatusEffectInstance(StatusEffects.SPEED,400,1),1.0F)
					.alwaysEdible()
					.build())
			.maxCount(64));
	public static final com.net.reaksextrafoods.CopperApple COPPER_APPLE = new com.net.reaksextrafoods.CopperApple(new FabricItemSettings().group(REAKSEXTRAFOOD)
			.food((new FoodComponent.Builder())
					.hunger(3)
					.saturationModifier(0.6F)
					.statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION,2400,0),1.0F)
					.statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,100,0),1.0F)
					.alwaysEdible()
					.build())
			.maxCount(64));
	public static final com.net.reaksextrafoods.CookedEgg COOKED_EGG = new com.net.reaksextrafoods.CookedEgg(new FabricItemSettings().group(REAKSEXTRAFOOD)
			.food((new FoodComponent.Builder())
					.hunger(3)
					.saturationModifier(0.3F)
					.snack()
					.statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,40,0),1.0F)
					.alwaysEdible()
					.build())
			.maxCount(64));
	public static final com.net.reaksextrafoods.ChocolateCoconutBread CHOCOLATE_COCONUT_BREAD = new com.net.reaksextrafoods.ChocolateCoconutBread(new FabricItemSettings().group(REAKSEXTRAFOOD)
			.food((new FoodComponent.Builder())
					.hunger(7)
					.saturationModifier(0.4F)
					.statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,200,1),1.0F)
					.alwaysEdible()
					.build())
			.maxCount(64));
	public static final com.net.reaksextrafoods.WetFilter WET_FILTER = new com.net.reaksextrafoods.WetFilter(new FabricItemSettings().group(REAKSEXTRAFOOD)
			.maxCount(64));
	public static final com.net.reaksextrafoods.Filter FILTER = new com.net.reaksextrafoods.Filter(new FabricItemSettings().group(REAKSEXTRAFOOD)
			.recipeRemainder(ReaksExtraFoodsMod.WET_FILTER)
			.maxCount(64));
	public static final com.net.reaksextrafoods.DriedPufferFish DRIED_PUFFER_FISH = new com.net.reaksextrafoods.DriedPufferFish(new FabricItemSettings().group(REAKSEXTRAFOOD)
			.food((new FoodComponent.Builder())
					.hunger(5)
					.saturationModifier(0.5F)
					.statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,600,0),1.0F)
					.alwaysEdible()
					.build())
			.maxCount(64));
	public static final com.net.reaksextrafoods.PotatoPie POTATO_PIE = new com.net.reaksextrafoods.PotatoPie(new FabricItemSettings().group(REAKSEXTRAFOOD)
			.food((new FoodComponent.Builder())
					.hunger(8)
					.saturationModifier(0.4F)
					.statusEffect(new StatusEffectInstance(StatusEffects.SATURATION,200,1),1.0F)
					.alwaysEdible()
					.build())
			.maxCount(64));
	public static final com.net.reaksextrafoods.BakedBambooShoot BAKED_BAMBOOSHOOT = new com.net.reaksextrafoods.BakedBambooShoot(new FabricItemSettings().group(REAKSEXTRAFOOD)
			.food((new FoodComponent.Builder())
					.hunger(4)
					.saturationModifier(0.3F)
					.statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,600,0),1.0F)
					.alwaysEdible()
					.build())
			.maxCount(64));
	public static final com.net.reaksextrafoods.BambooShoot BAMBOOSHOOT = new com.net.reaksextrafoods.BambooShoot(new FabricItemSettings().group(REAKSEXTRAFOOD)
			.food((new FoodComponent.Builder())
					.hunger(2)
					.saturationModifier(0.4F)
					.snack()
					.statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,300,0),1.0F)
					.alwaysEdible()
					.build())
			.maxCount(64));
	public static final com.net.reaksextrafoods.ChickenSoup CHICKEN_SOUP = new com.net.reaksextrafoods.ChickenSoup(new FabricItemSettings().group(REAKSEXTRAFOOD)
			.food((new FoodComponent.Builder())
					.hunger(8)
					.saturationModifier(0.4F)
					.statusEffect(new StatusEffectInstance(StatusEffects.HASTE,2400,1),1.0F)
					.statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,2400,1),1.0F)
					.alwaysEdible()
					.build())
			.maxCount(1));
	public static final com.net.reaksextrafoods.PoisonChickenSoup POISON_CHICKEN_SOUP = new com.net.reaksextrafoods.PoisonChickenSoup(new FabricItemSettings().group(REAKSEXTRAFOOD)
			.food((new FoodComponent.Builder())
					.hunger(8)
					.saturationModifier(0.4F)
					.statusEffect(new StatusEffectInstance(StatusEffects.POISON,400,1),1.0F)
					.statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS,400,4),1.0F)
					.statusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE,400,4),1.0F)
					.statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS,400,4),1.0F)
					.statusEffect(new StatusEffectInstance(StatusEffects.HUNGER,400,4),1.0F)
					.statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS,400,4),1.0F)
					.statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,400,4),1.0F)
					.statusEffect(new StatusEffectInstance(StatusEffects.WITHER,400,1),1.0F)
					.statusEffect(new StatusEffectInstance(StatusEffects.BAD_OMEN,1145141919,4),1.0F)
					.statusEffect(new StatusEffectInstance(StatusEffects.UNLUCK,400,4),1.0F)
					.alwaysEdible()
					.build())
			.maxCount(1));

	public static final Logger LOGGER = LoggerFactory.getLogger("reaksextrafoods");

	@Override
	public void onInitialize() {

		Registry.register(Registry.SOUND_EVENT, ReaksExtraFoodsMod.SOUND_PAIMON, PAIMON_SOUND_EVENT);
		Registry.register(Registry.ITEM, new Identifier("reaksextrafoods", "icon"), ICON);
		Registry.register(Registry.ITEM, new Identifier("reaksextrafoods", "vodka"), VODKA);
		Registry.register(Registry.ITEM, new Identifier("reaksextrafoods", "rye_bread"), RYE_BREAD);
		Registry.register(Registry.ITEM, new Identifier("reaksextrafoods", "kvass"), KVASS);
		Registry.register(Registry.ITEM, new Identifier("reaksextrafoods", "condensed_milk_pack"), CONDENSEDMILKPACK);
		Registry.register(Registry.ITEM, new Identifier("reaksextrafoods", "milkchocolatealionka"), MILKCHOCOLATEALIONKA);
		Registry.register(Registry.ITEM, new Identifier("reaksextrafoods", "okroshka"), OKROSHKA);
		Registry.register(Registry.ITEM, new Identifier("reaksextrafoods", "russian_soup"), RUSSIAN_SOUP);
		Registry.register(Registry.ITEM, new Identifier("reaksextrafoods", "tinned_caviar"), TINNED_CAVIAR);
		Registry.register(Registry.ITEM, new Identifier("reaksextrafoods", "tinned_salmon_caviar"), TINNED_SALMON_CAVIAR);
		Registry.register(Registry.ITEM, new Identifier("reaksextrafoods", "sausage"), SAUSAGE);
		Registry.register(Registry.ITEM, new Identifier("reaksextrafoods", "cooked_sausage"), COOKED_SAUSAGE);
		Registry.register(Registry.ITEM, new Identifier("reaksextrafoods", "baked_apple"), BAKED_APPLE);
		Registry.register(Registry.ITEM, new Identifier("reaksextrafoods", "flour"), FLOUR);
		Registry.register(Registry.ITEM, new Identifier("reaksextrafoods", "salt"), SALT);
		Registry.register(Registry.ITEM, new Identifier("reaksextrafoods", "baked_dough"), BAKED_DOUGH);
		Registry.register(Registry.ITEM, new Identifier("reaksextrafoods", "dough"), DOUGH);
		Registry.register(Registry.ITEM, new Identifier("reaksextrafoods", "apple_pie"), APPLE_PIE);
		Registry.register(Registry.ITEM, new Identifier("reaksextrafoods", "dried_rotten_flesh"), DRIED_ROTTEN_FLESH);
		Registry.register(Registry.ITEM, new Identifier("reaksextrafoods", "coconut"), COCONUT);
		Registry.register(Registry.ITEM, new Identifier("reaksextrafoods", "baked_coconut"), BAKED_COCONUT);
		Registry.register(Registry.ITEM, new Identifier("reaksextrafoods", "hot_chocolate"), HOT_CHOCOLATE);
		Registry.register(Registry.ITEM, new Identifier("reaksextrafoods", "paimon"), PAIMON);
		Registry.register(Registry.ITEM, new Identifier("reaksextrafoods", "chocolate_bar"), CHOCOLATE_BAR);
		Registry.register(Registry.ITEM, new Identifier("reaksextrafoods", "copper_apple"), COPPER_APPLE);
		Registry.register(Registry.ITEM, new Identifier("reaksextrafoods", "cooked_egg"), COOKED_EGG);
		Registry.register(Registry.ITEM, new Identifier("reaksextrafoods", "chocolate_coconut_bread"), CHOCOLATE_COCONUT_BREAD);
		Registry.register(Registry.ITEM, new Identifier("reaksextrafoods", "filter"), FILTER);
        Registry.register(Registry.ITEM, new Identifier("reaksextrafoods", "wet_filter"), WET_FILTER);
		Registry.register(Registry.ITEM, new Identifier("reaksextrafoods", "dried_puffer_fish"), DRIED_PUFFER_FISH);
		Registry.register(Registry.ITEM, new Identifier("reaksextrafoods", "potato_pie"), POTATO_PIE);
		Registry.register(Registry.ITEM, new Identifier("reaksextrafoods", "bambooshoot"), BAMBOOSHOOT);
		Registry.register(Registry.ITEM, new Identifier("reaksextrafoods", "baked_bambooshoot"), BAKED_BAMBOOSHOOT);
		Registry.register(Registry.ITEM, new Identifier("reaksextrafoods", "chicken_soup"), CHICKEN_SOUP);
		Registry.register(Registry.ITEM, new Identifier("reaksextrafoods", "poison_chicken_soup"), POISON_CHICKEN_SOUP);

		LOGGER.info("Hello Fabric world!");
	}
}
