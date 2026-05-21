package net.majleeuwerik.semiconcraft.item.custom;

import net.majleeuwerik.semiconcraft.util.SCCrudeWaferDataHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;

import java.util.List;
import java.util.function.Consumer;

public class WaferItem extends Item {
    public WaferItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, TooltipDisplay tooltip, Consumer<Component> builder, TooltipFlag flag) {

        int layer = SCCrudeWaferDataHelper.getLayer(stack);

        //tooltip.add(Component.literal("Layer: " + layer + "/4"));
        builder.accept(Component.literal("Layer: " + layer + "/4"));
        super.appendHoverText(stack, context, tooltip, builder, flag);
    }

    @Override
    public boolean isBarVisible(ItemStack stack) {
        return SCCrudeWaferDataHelper.getLayer(stack) >= 0;
    }

    @Override
    public int getBarWidth(ItemStack stack) {
        int layer = SCCrudeWaferDataHelper.getLayer(stack);
        int maxLayer = 4;
        return Math.round(13.0F * layer / maxLayer);
    }

/*
    @Override
    public Component getName(ItemStack stack) {
        int layer = SCCrudeWaferDataHelper.getLayer(stack);
        return Component.literal(
                "Deposited Wafer [" + layer + "/4]"
        );
    }

 */

    @Override
    public int getBarColor(ItemStack stack) {
        return 0x55FFAA;
    }
}
