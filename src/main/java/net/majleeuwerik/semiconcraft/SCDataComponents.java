package net.majleeuwerik.semiconcraft;

import com.mojang.serialization.Codec;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class SCDataComponents {
    public static final DeferredRegister<DataComponentType<?>> DATA_COMPONENT_TYPES =
            DeferredRegister.create(
                    Registries.DATA_COMPONENT_TYPE,
                    SemiconCraft.MODID
            );


    public static final Supplier<DataComponentType<Integer>> LAYER =
            DATA_COMPONENT_TYPES.register(
                    "layer",
                    () -> DataComponentType.<Integer>builder()
                            .persistent(Codec.INT)
                            .build()
            );

    public static void register(IEventBus eventBus) {
        DATA_COMPONENT_TYPES.register(eventBus);
    }
}
