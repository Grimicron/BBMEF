package com.mls.bbmef.block;

import com.mls.bbmef.BBMEF;
import com.mls.bbmef.item.ModItems;
import com.mls.bbmef.item.ModTabs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.swing.*;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BBMEF.MOD_ID);
    public static final RegistryObject<Block> PURE_METH_BOX = registerBlock("pure_meth_box",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5f)), ModTabs.BBMEF_TAB);
    public static final RegistryObject<Block> IMPURE_METH_BOX = registerBlock("impure_meth_box",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5f)), ModTabs.BBMEF_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> result = BLOCKS.register(name, block);
        registerBlockItem(name, result, tab);
        return result;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
