package xyz.magmabits.echomistcore.effects;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import xyz.magmabits.echomistcore.EchomistCore;

public class ModEffects {
    public static final RegistryEntry<StatusEffect> SILENCE = registerStatusEffect("silence", new SilenceEffect(StatusEffectCategory.BENEFICIAL, 0x09505f));

    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(EchomistCore.MOD_ID, name), statusEffect);
    }

    public static void registerEffects() {

    }
}
