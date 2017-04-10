package net.oriont.ofood.handlers;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.oriont.ofood.items.ItemFoodItem;

public final class ItemHandler {

    public static Item testItem;

    public static void init() {
        testItem = new ItemFoodItem("test_item", CreativeTabs.MATERIALS);
    }

    public static void register() {
        GameRegistry.register(testItem);
    }

    public static void registerRenders() {
        registerRender(testItem);

    }

    public static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

}
