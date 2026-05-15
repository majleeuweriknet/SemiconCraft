package net.majleeuwerik.semiconcraft.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class WaferSawItem extends Item {

    public WaferSawItem(Properties properties) {
        super(properties);
    }

    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }

    public ItemStack getCraftingRemainingItem(ItemStack stack) {
        ItemStack copy = stack.copy();

        copy.setDamageValue(copy.getDamageValue() + 1);

        if (copy.getDamageValue() >= copy.getMaxDamage()) {
            return ItemStack.EMPTY;
        }

        return copy;
    }
}