package net.majleeuwerik.semiconcraft.item;

import net.majleeuwerik.semiconcraft.SemiconCraft;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class SCItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SemiconCraft.MODID);

    public static final DeferredItem<Item> SILICON_CRYSTAL = ITEMS.registerSimpleItem("silicon_crystal");
    public static final DeferredItem<Item> SILICON_BOULE = ITEMS.registerSimpleItem("silicon_boule");
    public static final DeferredItem<Item> SILICON_WAFER = ITEMS.registerSimpleItem("silicon_wafer");

    public static final DeferredItem<Item> SILICON_DUST = ITEMS.registerSimpleItem("silicon_dust");
    public static final DeferredItem<Item> SILICON_RAW = ITEMS.registerSimpleItem("silicon_raw");

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
