package net.majleeuwerik.semiconcraft.content.item;

import net.majleeuwerik.semiconcraft.SemiconCraft;
import net.majleeuwerik.semiconcraft.registry.SCBlocks;
import net.majleeuwerik.semiconcraft.registry.SCItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.world.item.CreativeModeTab;

import java.util.function.Supplier;
public class SCCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SemiconCraft.MODID);

    // Adding item tab
    public static final Supplier<CreativeModeTab> SEMICONCRAFT_ITEMS_TAB = CREATIVE_MODE_TAB.register("semiconcraft_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(SCItems.SILICON_BOULE.get()))
                    .title(Component.translatable("creativetab.semiconcraft.semiconcraft_items"))
                    .displayItems((itemsDisplayParameters, output) -> {
                        //output.accept(SCItems.SILICON_CRYSTAL);
                        output.accept(SCItems.SILICON_BOULE);
                    }).build());

    // Adding block tab
    public static final Supplier<CreativeModeTab> SEMICONCRAFT_BLOCKS_TAB = CREATIVE_MODE_TAB.register("semiconcraft_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(SCBlocks.CRYSTAL_BLOCK.get()))
                    .withTabsBefore(Identifier.fromNamespaceAndPath(SemiconCraft.MODID, "semiconcraft_items_tab"))
                    .title(Component.translatable("creativetab.semiconcraft.semiconcraft_blocks"))
                    .displayItems((itemsDisplayParameters, output) -> {
                        //output.accept(SCBlocks.CRYSTAL_ORE);
                        output.accept(SCBlocks.CRYSTAL_BLOCK);
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
