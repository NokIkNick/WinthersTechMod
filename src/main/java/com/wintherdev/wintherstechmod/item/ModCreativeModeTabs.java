package com.wintherdev.wintherstechmod.item;

import com.wintherdev.wintherstechmod.WinthersTechMod;
import com.wintherdev.wintherstechmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WinthersTechMod.MODID);

    public static final Supplier<CreativeModeTab> WINTHERS_TECH_MOD_TAB = CREATIVE_MODE_TAB.register("winthers_tech_mod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ALUMINIUM_INGOT.get()))
                    .title(Component.translatable("creativetab.wintherstechmod.techmod"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ALUMINIUM_INGOT);
                        output.accept(ModItems.RAW_ALUMINIUM);
                        output.accept(ModItems.CHISEL);
                        output.accept(ModItems.GRATE);
                        output.accept(ModItems.SILICA_STONE);
                        output.accept(ModItems.COIL);
                        output.accept(ModItems.PLATINUM_INGOT);
                        output.accept(ModItems.RAW_PLATINUM);

                        output.accept(ModBlocks.ALUMINIUM_BLOCK);
                        output.accept(ModBlocks.ALUMINIUM_ORE);
                        output.accept(ModBlocks.DEEPSLATE_ALUMINIUM_ORE);
                        output.accept(ModBlocks.TEST_CUSTOM_BLOCK);
                        output.accept(ModBlocks.PLATINUM_BLOCK);
                        output.accept(ModBlocks.PLATINUM_ORE);
                        output.accept(ModBlocks.DEEPSLATE_PLATINUM_ORE);
                        output.accept(ModBlocks.SOLAR_PANEL);


                    }).build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
