package net.majleeuwerik.semiconcraft.item;

import net.majleeuwerik.semiconcraft.SemiconCraft;
//import net.majleeuwerik.semiconcraft.item.custom.WaferSawItem;
import net.majleeuwerik.semiconcraft.item.custom.WaferItem;
import net.majleeuwerik.semiconcraft.item.custom.WaferSawItem;
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
    //public static final DeferredItem<Item> WAFER_CRUDE_DEPOSITED = ITEMS.registerSimpleItem("wafer_crude_deposited");
    //public static final DeferredItem<Item> WAFER_CRUDE_DEPOSITED = ITEMS.registerItem("wafer_crude_deposited",
    //        properties ->  new WaferItem(new Item.Properties()));

    public static final DeferredItem<Item> WAFER_CRUDE_DEPOSITED =
            ITEMS.registerItem("wafer_crude_deposited", properties -> new WaferItem(properties));
    public static final DeferredItem<Item> WAFER_CRUDE_COATED =
            ITEMS.registerItem("wafer_crude_coated", properties -> new WaferItem(properties));
    public static final DeferredItem<Item> WAFER_CRUDE_EXPOSED =
            ITEMS.registerItem("wafer_crude_exposed", properties -> new WaferItem(properties));
    public static final DeferredItem<Item> WAFER_CRUDE_DEVELOPED =
            ITEMS.registerItem("wafer_crude_developed", properties -> new WaferItem(properties));
    public static final DeferredItem<Item> WAFER_CRUDE_ETCHED =
            ITEMS.registerItem("wafer_crude_etched", properties -> new WaferItem(properties));
    public static final DeferredItem<Item> WAFER_CRUDE_ENRICHED =
            ITEMS.registerItem("wafer_crude_enriched", properties -> new WaferItem(properties));
    public static final DeferredItem<Item> WAFER_CRUDE_PROCESSED =
            ITEMS.registerSimpleItem("wafer_crude_processed");

    // ICs and Dies
    public static final DeferredItem<Item> DIE_BASIC = ITEMS.registerSimpleItem("die_basic");
    public static final DeferredItem<Item> IC_BASIC = ITEMS.registerSimpleItem("ic_basic");


    // Tools
    //public static final DeferredItem<Item> WAFER_SAW = ITEMS.registerSimpleItem("wafer_saw");
    public static final DeferredItem<Item> WAFER_SAW = ITEMS.registerItem("wafer_saw",
            properties -> new WaferSawItem(properties.durability(32)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
