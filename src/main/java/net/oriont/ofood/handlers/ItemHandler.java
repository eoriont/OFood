package net.oriont.ofood.handlers;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.oriont.ofood.items.*;

public final class ItemHandler {

    public static Item testItem, testPickaxe, testSword, testAxe, testShovel, testHoe;

    public static void init() {
        testItem = new ItemFoodItem("test_item", CreativeTabs.MATERIALS);
        testPickaxe = new ItemTestPickaxe("test_pickaxe", MaterialHandler.TEST, CreativeTabHandler.tabTools);
        testSword = new ItemTestSword("test_sword", MaterialHandler.TEST, CreativeTabHandler.tabCombat);
        testShovel = new ItemTestShovel("test_shovel", MaterialHandler.TEST, CreativeTabHandler.tabTools);
        testHoe = new ItemTestHoe("test_hoe", MaterialHandler.TEST, CreativeTabHandler.tabTools);
        testAxe = new ItemTestAxe("test_axe", MaterialHandler.TEST, CreativeTabHandler.tabTools);
    }

    public static void register() {
        for (Item item : ModItem.items) {
            GameRegistry.register(item);
        }
    }

    public static void registerRenders() {
        for (Item item : ModItem.items) {
            registerRender(item);
        }
    }

    public static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

}
