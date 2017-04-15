package net.oriont.ofood.handlers;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.oriont.ofood.items.*;

public final class ItemHandler {

    public static Item testItem, testPickaxe, testSword, testAxe, testShovel, testHoe, testBanana, testHelmet, testChest, testLegs, testBoots;

    public static void init() {
        testItem = new ItemFoodItem("test_item", CreativeTabs.MATERIALS);
        testBanana = new ItemFoodItem("test_banana", CreativeTabs.MATERIALS);

        testPickaxe = new ItemTestPickaxe("test_pickaxe", MaterialHandler.TEST, CreativeTabHandler.tabTools);
        testSword = new ItemTestSword("test_sword", MaterialHandler.TEST, CreativeTabHandler.tabCombat);
        testShovel = new ItemTestShovel("test_shovel", MaterialHandler.TEST, CreativeTabHandler.tabTools);
        testHoe = new ItemTestHoe("test_hoe", MaterialHandler.TEST, CreativeTabHandler.tabTools);
        testAxe = new ItemTestAxe("test_axe", MaterialHandler.TEST, CreativeTabHandler.tabTools);

        testHelmet = new ItemTestArmor("test_helmet", CreativeTabHandler.tabCombat, MaterialHandler.TUTORIAL_ARMOR, 0, EntityEquipmentSlot.HEAD);
        testChest = new ItemTestArmor("test_chest", CreativeTabHandler.tabCombat, MaterialHandler.TUTORIAL_ARMOR, 0, EntityEquipmentSlot.CHEST);
        testLegs = new ItemTestArmor("test_leggings", CreativeTabHandler.tabCombat, MaterialHandler.TUTORIAL_ARMOR, 1, EntityEquipmentSlot.LEGS);
        testBoots = new ItemTestArmor("test_boots", CreativeTabHandler.tabCombat, MaterialHandler.TUTORIAL_ARMOR, 0, EntityEquipmentSlot.FEET);
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

    private static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

}
