package com.mls.bbmef.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModTabs {
    public static final CreativeModeTab BBMEF_TAB = new CreativeModeTab("bbmef_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.METHYLAMINE.get());
        }
    };
}
