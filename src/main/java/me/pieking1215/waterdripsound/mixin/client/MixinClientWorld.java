package me.pieking1215.waterdripsound.mixin.client;

import me.pieking1215.waterdripsound.WaterDripSoundConfig;
import net.minecraft.client.world.ClientWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(ClientWorld.class)
public class MixinClientWorld {

    // modify rate of drip spawning

    @ModifyConstant(method = "animateTick(IIIILjava/util/Random;ZLnet/minecraft/util/math/BlockPos$Mutable;)V", constant = @Constant(intValue = 10))
    private int modifyDripChance(int original){
        return WaterDripSoundConfig.GENERAL.dripChance.get();
    }
}
