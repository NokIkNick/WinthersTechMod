package com.wintherdev.wintherstechmod.datagen;

import com.wintherdev.wintherstechmod.WinthersTechMod;
import com.wintherdev.wintherstechmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, WinthersTechMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.RAW_ALUMINIUM.get());
        basicItem(ModItems.ALUMINIUM_INGOT.get());
        basicItem(ModItems.RAW_PLATINUM.get());
        basicItem(ModItems.PLATINUM_INGOT.get());
        basicItem(ModItems.CHISEL.get());
        basicItem(ModItems.COIL.get());
        basicItem(ModItems.SILICA_STONE.get());
        basicItem(ModItems.GRATE.get());
    }
}
