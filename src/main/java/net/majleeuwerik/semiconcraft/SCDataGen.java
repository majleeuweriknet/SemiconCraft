package net.majleeuwerik.semiconcraft;
import net.majleeuwerik.semiconcraft.datagen.*;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = SemiconCraft.MODID)
public class SCDataGen {
    @SubscribeEvent
    public static void gatherClientData(GatherDataEvent.Client event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        var lookupProvider = event.getLookupProvider();

        generator.addProvider(true, new SCModelProvider(packOutput));
        //generator.addProvider(true, new ModBlockTagsProvider(packOutput, lookupProvider));
        //generator.addProvider(true, new LootTableProvider(packOutput, Collections.emptySet(),
        //        List.of(new LootTableProvider.SubProviderEntry(ModBlockLootTableProvider::new, LootContextParamSets.BLOCK)), lookupProvider));

        //generator.addProvider(true, new ModRecipeProvider.Runner(packOutput, lookupProvider));
        //generator.addProvider(true, new ModDataMapProvider(packOutput, lookupProvider));
        //generator.addProvider(true, new ModItemTagsProvider(packOutput, lookupProvider));
    }
}

