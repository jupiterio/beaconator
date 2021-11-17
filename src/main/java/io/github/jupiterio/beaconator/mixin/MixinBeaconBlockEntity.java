package io.github.jupiterio.beaconator.mixin;

import net.minecraft.block.entity.BeaconBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(BeaconBlockEntity.class)
public class MixinBeaconBlockEntity {

    @ModifyVariable(method = "applyPlayerEffects", at = @At(value = "STORE", ordinal = 0), ordinal = 0)
    private static double increaseDistance(double d) {
        return d * 2;
    }
}
