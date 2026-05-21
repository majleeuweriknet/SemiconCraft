package net.majleeuwerik.semiconcraft.block.entity;

import net.majleeuwerik.semiconcraft.SemiconCraft;
import net.majleeuwerik.semiconcraft.block.SCBlocks;
import net.majleeuwerik.semiconcraft.block.custom.CrystallizerBlock;
import net.majleeuwerik.semiconcraft.block.entity.custom.CrystallizerBlockEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;


public class SCBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, SemiconCraft.MODID);

    // Crystallizer Test

    public static final Supplier<BlockEntityType<CrystallizerBlockEntity>> CRYSTALLIZER_BE =
            BLOCK_ENTITIES.register("crystallizer_be", () -> new BlockEntityType<>(
                    CrystallizerBlockEntity::new, SCBlocks.CRYSTALLIZER.get()));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}


