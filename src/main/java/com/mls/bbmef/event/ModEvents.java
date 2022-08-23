package com.mls.bbmef.event;

import com.mls.bbmef.BBMEF;
import com.mls.bbmef.item.ModItems;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = BBMEF.MOD_ID)
public class ModEvents {
    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event){
        if (event.getType() != VillagerProfession.NITWIT) return;
        Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
        ItemStack pure = new ItemStack(Items.EMERALD, 50);
        ItemStack impure = new ItemStack(Items.EMERALD, 20);
        int villagerLevel = 1;
        trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                new ItemStack(ModItems.PURE_BAGGED_METH.get(), 1),
                pure,10,8,0.02F));
        trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                new ItemStack(ModItems.IMPURE_BAGGED_METH.get(), 1),
                impure,10,8,0.02F));
    }
}
