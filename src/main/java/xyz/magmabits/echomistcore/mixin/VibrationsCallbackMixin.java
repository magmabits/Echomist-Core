package xyz.magmabits.echomistcore.mixin;

import net.minecraft.entity.LivingEntity;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.event.GameEvent;
import net.minecraft.world.event.Vibrations;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import xyz.magmabits.echomistcore.effects.ModEffects;

@Mixin(Vibrations.Callback.class)
public interface VibrationsCallbackMixin {
    @Inject(method = "canAccept", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;isSpectator()Z"), cancellable = true)
    private void returnIfEntityHasCustomEffect(RegistryEntry<GameEvent> gameEvent, GameEvent.Emitter emitter, CallbackInfoReturnable<Boolean> cir) {
        if (emitter.sourceEntity() instanceof LivingEntity livingSourceEntity && livingSourceEntity.hasStatusEffect(ModEffects.SILENCE)) {
            cir.setReturnValue(false);
        }
    }
}