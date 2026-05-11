package net.majleeuwerik.semiconcraft.creativemodetab;

import net.majleeuwerik.semiconcraft.SemiconCraft;
import net.majleeuwerik.semiconcraft.block.SCBlocks;
import net.majleeuwerik.semiconcraft.item.SCItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class SCCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SemiconCraft.MODID);

    public static final Supplier<CreativeModeTab> AZURITE_ITEMS_TAB = CREATIVE_MODE_TABS.register("semiconcraft_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(SCItems.SILICON_CRYSTAL.get()))
                    .title(Component.translatable("creativetab.semiconcraft.semiconcraft_items"))
                    .withTabsBefore(CreativeModeTabs.INGREDIENTS)
                    .withTabsAfter(Identifier.fromNamespaceAndPath(SemiconCraft.MODID, "semiconcraft_items_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(SCItems.SILICON_CRYSTAL);
                        //output.accept(ModItems.RAW_AZURITE);

                        //output.accept(ModItems.METAL_DETECTOR);
                        //output.accept(ModItems.ONION);
                        //output.accept(ModItems.END_FIRE_STARTER);
                    }).build());

    public static final Supplier<CreativeModeTab> AZURITE_BLOCKS_TAB = CREATIVE_MODE_TABS.register("semiconcraft_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(SCBlocks.CRYSTAL_BLOCK.get()))
                    .title(Component.translatable("creativetab.semiconcraft.semiconcraft_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(SCBlocks.CRYSTAL_ORE);
                        output.accept(SCBlocks.CRYSTAL_BLOCK);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
