package xyz.magmabits.echomistcore.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import xyz.magmabits.echomistcore.EchomistCore;
import xyz.magmabits.echomistcore.effects.ModEffects;

public class ModPotions {
    public static final RegistryEntry<Potion> SILENCE_POTION = registerPotion("silence_potion",
            new Potion(new StatusEffectInstance(ModEffects.SILENCE, 1200 * 3, 0)));
    public static final RegistryEntry<Potion> LONG_SILENCE_POTION = registerPotion("long_silence_potion",
            new Potion(new StatusEffectInstance(ModEffects.SILENCE, 1200 * 8, 0)));


    private static RegistryEntry<Potion> registerPotion(String name, Potion potion) {
        return Registry.registerReference(Registries.POTION, Identifier.of(EchomistCore.MOD_ID, name), potion);
    }

    public static void registerPotions() {
    }
}
