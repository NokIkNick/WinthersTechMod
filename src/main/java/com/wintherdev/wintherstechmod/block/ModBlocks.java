package com.wintherdev.wintherstechmod.block;

import com.wintherdev.wintherstechmod.WinthersTechMod;
import com.wintherdev.wintherstechmod.block.custom.MagicBlock;
import com.wintherdev.wintherstechmod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(WinthersTechMod.MODID);

    public static final DeferredBlock<Block> ALUMINIUM_BLOCK = registerBlock("aluminium_block", () -> new Block(BlockBehaviour.Properties.of()
            .requiresCorrectToolForDrops().strength(4f).sound(SoundType.METAL)));

    public static final DeferredBlock<Block> ALUMINIUM_ORE = registerBlock("aluminium_ore", () -> new DropExperienceBlock(UniformInt.of(0,4),BlockBehaviour.Properties.of()
            .requiresCorrectToolForDrops().strength(4f).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> DEEPSLATE_ALUMINIUM_ORE = registerBlock("deepslate_aluminium_ore", () -> new DropExperienceBlock(UniformInt.of(0,4),BlockBehaviour.Properties.of()
            .requiresCorrectToolForDrops().strength(4f).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> PLATINUM_BLOCK = registerBlock("platinum_block", () -> new Block(BlockBehaviour.Properties.of()
            .requiresCorrectToolForDrops().strength(4f).sound(SoundType.METAL)));

    public static final DeferredBlock<Block> PLATINUM_ORE = registerBlock("platinum_ore", () -> new DropExperienceBlock(UniformInt.of(0,4),BlockBehaviour.Properties.of()
            .requiresCorrectToolForDrops().strength(4f).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> DEEPSLATE_PLATINUM_ORE = registerBlock("deepslate_platinum_ore", () -> new DropExperienceBlock(UniformInt.of(0,4),BlockBehaviour.Properties.of()
            .requiresCorrectToolForDrops().strength(4f).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> TEST_CUSTOM_BLOCK = registerBlock("test_custom_block", () -> new MagicBlock(BlockBehaviour.Properties.of()
            .requiresCorrectToolForDrops().strength(4f).sound(SoundType.METAL)));


    public static final DeferredBlock<Block> SOLAR_PANEL = registerBlock("solar_panel", () -> new Block(BlockBehaviour.Properties.of().noOcclusion()
            .requiresCorrectToolForDrops().strength(4f).sound(SoundType.METAL)));



    private static <T extends Block>DeferredBlock<T> registerBlock(String name, Supplier<T> block){
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
