package net.majleeuwerik.semiconcraft.registry;

import net.majleeuwerik.semiconcraft.SemiconCraft;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class SCItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SemiconCraft.MODID);
/*
    // Silicon Boule
    public static final DeferredItem<Item> SILICON_BOULE = ITEMS.register("silicon_boule",
            ()-> new Item(new Item.Properties()));
*/
    public static final DeferredItem<Item> SILICON_BOULE = ITEMS.registerSimpleItem("silicon_boule");
/*
    // Silicon Crystal
    public static final DeferredItem<Item> SILICON_CRYSTAL = ITEMS.register("silicon_crystal",
            ()-> new Item(new Item.Properties()));
*/
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
