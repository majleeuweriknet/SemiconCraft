package net.majleeuwerik.semiconcraft.event;

import net.majleeuwerik.semiconcraft.SemiconCraft;
import net.majleeuwerik.semiconcraft.item.SCItems;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;

@EventBusSubscriber(modid = SemiconCraft.MODID)
public class SCEvents {
    @SubscribeEvent
    public static void onItemCrafted(PlayerEvent.ItemCraftedEvent event) {
        // DOESNT WORK./
        CraftingContainer container = (CraftingContainer) event.getInventory();

        for (int i = 0; i < container.getContainerSize(); i++) {

            ItemStack stack = container.getItem(i);

            if (stack.is(SCItems.WAFER_SAW.get())) {

                if (event.getEntity().level() instanceof ServerLevel serverLevel) {

                    stack.hurtAndBreak(
                            1,
                            serverLevel,
                            event.getEntity(),
                            item -> {
                            }
                    );
                }

                container.setItem(i, stack);
            }
        }
    }
}