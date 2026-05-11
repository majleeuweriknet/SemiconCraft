package net.majleeuwerik.semiconcraft.registry;

import net.majleeuwerik.semiconcraft.SemiconCraft;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;
import java.util.function.Supplier;

public class SCBlocks {
    // List of blocks to register
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(SemiconCraft.MODID);

/*

    // Crystal Ore (old 1.21.1)
    public static final DeferredBlock<Block> CRYSTAL_ORE = registerBlock("crystal_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE))
    );
*/

    // Crystal Block (new 26.1)
    public static final DeferredBlock<Block> CRYSTAL_BLOCK = registerBlock("crystal_block",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST))
    );


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> function) {
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, function);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        SCItems.ITEMS.registerItem(name, properties -> new BlockItem(block.get(), properties.useBlockDescriptionPrefix()));
    }


    /*
    // Incompatible with 26.1
    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        SCItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
     */
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
