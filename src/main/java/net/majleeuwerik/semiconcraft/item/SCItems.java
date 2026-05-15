package net.majleeuwerik.semiconcraft.item;

import net.majleeuwerik.semiconcraft.SemiconCraft;
//import net.majleeuwerik.semiconcraft.item.custom.WaferSawItem;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class SCItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SemiconCraft.MODID);

    public static final DeferredItem<Item> SILICON_CRYSTAL = ITEMS.registerSimpleItem("silicon_crystal");
    public static final DeferredItem<Item> SILICON_BOULE = ITEMS.registerSimpleItem("silicon_boule");
    public static final DeferredItem<Item> SILICON_WAFER = ITEMS.registerSimpleItem("silicon_wafer");

    public static final DeferredItem<Item> SILICON_DUST = ITEMS.registerSimpleItem("silicon_dust");
    public static final DeferredItem<Item> SILICON_RAW = ITEMS.registerSimpleItem("silicon_raw");

    // Wafers
    public static final DeferredItem<Item> WAFER_CRUDE_DIRTY = ITEMS.registerSimpleItem("wafer_crude_dirty");
    public static final DeferredItem<Item> WAFER_CRUDE_CLEAN = ITEMS.registerSimpleItem("wafer_crude_clean");
    public static final DeferredItem<Item> WAFER_CRUDE_DEPOSITED = ITEMS.registerSimpleItem("wafer_crude_deposited");
    public static final DeferredItem<Item> WAFER_CRUDE_COATED = ITEMS.registerSimpleItem("wafer_crude_coated");
    public static final DeferredItem<Item> WAFER_CRUDE_EXPOSED = ITEMS.registerSimpleItem("wafer_crude_exposed");
    public static final DeferredItem<Item> WAFER_CRUDE_DEVELOPED = ITEMS.registerSimpleItem("wafer_crude_developed");
    public static final DeferredItem<Item> WAFER_CRUDE_ETCHED = ITEMS.registerSimpleItem("wafer_crude_etched");
    public static final DeferredItem<Item> WAFER_CRUDE_ENRICHED = ITEMS.registerSimpleItem("wafer_crude_enriched");
    public static final DeferredItem<Item> WAFER_CRUDE_PROCESSED = ITEMS.registerSimpleItem("wafer_crude_processed");

    // ICs and Dies
    public static final DeferredItem<Item> DIE_BASIC = ITEMS.registerSimpleItem("die_basic");
    public static final DeferredItem<Item> IC_BASIC = ITEMS.registerSimpleItem("ic_basic");


    // Tools
    public static final DeferredItem<Item> WAFER_SAW = ITEMS.registerSimpleItem("wafer_saw");



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
