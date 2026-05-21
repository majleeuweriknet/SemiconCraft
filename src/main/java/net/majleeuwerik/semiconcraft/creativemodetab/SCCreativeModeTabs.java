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

    public static final Supplier<CreativeModeTab> SEMICONCRAFT_ITEMS_TAB = CREATIVE_MODE_TABS.register("semiconcraft_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(SCItems.SILICON_CRYSTAL.get()))
                    .title(Component.translatable("creativetab.semiconcraft.semiconcraft_items"))
                    .withTabsBefore(CreativeModeTabs.INGREDIENTS)
                    .withTabsAfter(Identifier.fromNamespaceAndPath(SemiconCraft.MODID, "semiconcraft_blocks_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(SCItems.SILICON_CRYSTAL);
                        output.accept(SCItems.SILICON_BOULE);
                        output.accept(SCItems.SILICON_WAFER);
                        output.accept(SCItems.SILICON_DUST);
                        output.accept(SCItems.SILICON_RAW);
                    }).build());

    public static final Supplier<CreativeModeTab> SEMICONCRAFT_BLOCKS_TAB = CREATIVE_MODE_TABS.register("semiconcraft_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(SCBlocks.CRYSTAL_BLOCK.get()))
                    .title(Component.translatable("creativetab.semiconcraft.semiconcraft_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(SCBlocks.CRYSTAL_ORE);
                        output.accept(SCBlocks.CRYSTAL_BLOCK);
                        output.accept(SCBlocks.CRYSTALLIZER);
                    }).build());

    public static final Supplier<CreativeModeTab> SEMICONCRAFT_WAFERS_TAB = CREATIVE_MODE_TABS.register("semiconcraft_wafers_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(SCItems.WAFER_CRUDE_PROCESSED.get()))
                    .title(Component.translatable("creativetab.semiconcraft.semiconcraft_wafers"))
                    .withTabsBefore(Identifier.fromNamespaceAndPath(SemiconCraft.MODID, "semiconcraft_blocks_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(SCItems.WAFER_CRUDE_DIRTY);
                        output.accept(SCItems.WAFER_CRUDE_CLEAN);
                        output.accept(SCItems.WAFER_CRUDE_DEPOSITED);
                        output.accept(SCItems.WAFER_CRUDE_COATED);
                        output.accept(SCItems.WAFER_CRUDE_EXPOSED);
                        output.accept(SCItems.WAFER_CRUDE_DEVELOPED);
                        output.accept(SCItems.WAFER_CRUDE_ETCHED);
                        output.accept(SCItems.WAFER_CRUDE_ENRICHED);
                        output.accept(SCItems.WAFER_CRUDE_PROCESSED);

                        output.accept(SCItems.DIE_BASIC);
                        output.accept(SCItems.IC_BASIC);

                        output.accept(SCItems.WAFER_SAW.get());
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
