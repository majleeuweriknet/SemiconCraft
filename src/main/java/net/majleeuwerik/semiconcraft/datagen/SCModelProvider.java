package net.majleeuwerik.semiconcraft.datagen;

import net.majleeuwerik.semiconcraft.SemiconCraft;
import net.majleeuwerik.semiconcraft.block.SCBlocks;
import net.majleeuwerik.semiconcraft.item.SCItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;

public class SCModelProvider extends ModelProvider {
    public SCModelProvider(PackOutput output) {
        super(output, SemiconCraft.MODID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        itemModels.generateFlatItem(SCItems.SILICON_CRYSTAL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(SCItems.SILICON_BOULE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(SCItems.SILICON_WAFER.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(SCItems.SILICON_DUST.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(SCItems.SILICON_RAW.get(), ModelTemplates.FLAT_ITEM);

        /* BLOCKS */
        blockModels.createTrivialCube(SCBlocks.CRYSTAL_BLOCK.get());
        blockModels.createTrivialCube(SCBlocks.CRYSTAL_ORE.get());
    }
}

