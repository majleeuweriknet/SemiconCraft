package net.majleeuwerik.semiconcraft.item;

import net.majleeuwerik.semiconcraft.SemiconCraft;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class SCItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SemiconCraft.MODID);


    //public static final DeferredItem<Item> AZURITE = ITEMS.registerSimpleItem("azurite");
    //public static final DeferredItem<Item> RAW_AZURITE = ITEMS.registerSimpleItem("raw_azurite");

    //public static final DeferredItem<Item> END_FIRE_STARTER = ITEMS.registerItem("end_fire_starter",
    //        properties -> new Item(properties.stacksTo(32)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
