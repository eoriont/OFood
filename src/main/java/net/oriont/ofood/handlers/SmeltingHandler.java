package net.oriont.ofood.handlers;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingHandler {

    public static void init() {

        GameRegistry.addSmelting(ItemHandler.testItem, new ItemStack(ItemHandler.testBanana), 1.0F);

    }

}
