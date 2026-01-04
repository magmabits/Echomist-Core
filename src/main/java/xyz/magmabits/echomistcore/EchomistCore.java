package xyz.magmabits.echomistcore;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyz.magmabits.echomistcore.block.ModBlocks;
import xyz.magmabits.echomistcore.effects.ModEffects;
import xyz.magmabits.echomistcore.item.ModItemGroups;
import xyz.magmabits.echomistcore.item.ModPotions;

public class EchomistCore implements ModInitializer {
	public static final String MOD_ID = "echomistcore";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
		ModEffects.registerEffects();
		ModPotions.registerPotions();

		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.AWKWARD, Items.SCULK_SENSOR, ModPotions.SILENCE_POTION);
		});

		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(ModPotions.SILENCE_POTION, Items.REDSTONE, ModPotions.LONG_SILENCE_POTION);
		});
	}
}