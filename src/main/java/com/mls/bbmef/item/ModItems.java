package com.mls.bbmef.item;

import com.mls.bbmef.BBMEF;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BBMEF.MOD_ID);
    public static final RegistryObject<Item> PURE_METH = ITEMS.register("pure_meth",
            () -> new Item(new Item.Properties().tab(ModTabs.BBMEF_TAB)));
    public static final RegistryObject<Item> IMPURE_METH = ITEMS.register("impure_meth",
            () -> new Item(new Item.Properties().tab(ModTabs.BBMEF_TAB)));
    public static final RegistryObject<Item> PLASTIC = ITEMS.register("plastic",
            () -> new Item(new Item.Properties().tab(ModTabs.BBMEF_TAB)));
    public static final RegistryObject<Item> PLASTIC_BAG = ITEMS.register("plastic_bag",
            () -> new Item(new Item.Properties().tab(ModTabs.BBMEF_TAB)));
    public static final RegistryObject<Item> METHYLAMINE = ITEMS.register("methylamine",
            () -> new Item(new Item.Properties().tab(ModTabs.BBMEF_TAB)));
    public static final RegistryObject<Item> PURE_BAGGED_METH = ITEMS.register("pure_bagged_meth",
            () -> new Item(new Item.Properties().tab(ModTabs.BBMEF_TAB)));
    public static final RegistryObject<Item> IMPURE_BAGGED_METH = ITEMS.register("impure_bagged_meth",
            () -> new Item(new Item.Properties().tab(ModTabs.BBMEF_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
