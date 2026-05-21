package net.majleeuwerik.semiconcraft.util;

import net.majleeuwerik.semiconcraft.SCDataComponents;
import net.minecraft.world.item.ItemStack;

public class SCCrudeWaferDataHelper {

    public static int getLayer(ItemStack stack) {
        return stack.getOrDefault(
                SCDataComponents.LAYER.get(),
                0
        );
    }

    public static void setLayer(ItemStack stack, int layer) {
        stack.set(
                SCDataComponents.LAYER.get(),
                layer
        );
    }

    public static void incrementLayer(ItemStack stack) {
        setLayer(stack, getLayer(stack) + 1);
    }

    public static boolean hasLayer(ItemStack stack) {
        return stack.has(SCDataComponents.LAYER.get());
    }

    public static void clearLayer(ItemStack stack) {
        stack.remove(SCDataComponents.LAYER.get());
    }
}