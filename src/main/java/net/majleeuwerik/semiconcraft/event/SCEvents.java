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

        CraftingContainer container = (CraftingContainer) event.getInventory();
        for (int i = 0; i < container.getContainerSize(); i++) {
            ItemStack stack = container.getItem(i);

            // Return saw to inventory after crafting. Not neatest but works.
            /*
            if (stack.is(SCItems.WAFER_SAW.get())) {
                ItemStack returnedSaw = stack.copy();
                returnedSaw.setCount(1);
                event.getEntity().addItem(returnedSaw);

            }*/

            // Take 1 damage to saw, and return to inventory
            if (stack.is(SCItems.WAFER_SAW.get())) {

                ItemStack returnedSaw = stack.copy();
                returnedSaw.setCount(1);

                returnedSaw.setDamageValue(
                        returnedSaw.getDamageValue() + 1
                );

                if (returnedSaw.getDamageValue() < returnedSaw.getMaxDamage()) {
                    event.getEntity().addItem(returnedSaw);
                }
            }
        }
    }
}