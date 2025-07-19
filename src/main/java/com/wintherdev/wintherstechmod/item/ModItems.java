package com.wintherdev.wintherstechmod.item;

import com.wintherdev.wintherstechmod.WinthersTechMod;
import com.wintherdev.wintherstechmod.item.custom.ChiselItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(WinthersTechMod.MODID);

    public static final DeferredItem<Item> ALUMINIUM_INGOT = ITEMS.register("aluminium_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_ALUMINIUM = ITEMS.register("raw_aluminium",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_PLATINUM = ITEMS.register("raw_platinum",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> GRATE = ITEMS.register("grate",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SILICA_STONE = ITEMS.register("silica_stone",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> COIL = ITEMS.register("coil",
            () -> new Item(new Item.Properties()));




    public static final DeferredItem<Item> CHISEL = ITEMS.register("chisel",
            () -> new ChiselItem(new Item.Properties().durability(10)));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
