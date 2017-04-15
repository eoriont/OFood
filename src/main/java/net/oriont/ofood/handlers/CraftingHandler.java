package net.oriont.ofood.handlers;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingHandler {

    public static void init() {
        GameRegistry.addRecipe(new ItemStack(ItemHandler.testPickaxe, 1), "TTT", " S ", " S ", 'T', ItemHandler.testBanana, 'S', Items.STICK);
    }

}
