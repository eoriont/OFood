package net.oriont.ofood.handlers;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabHandler {

    public static CreativeTabs tabBlocks = new CreativeTabs("test_blocks") {
        public ItemStack getTabIconItem() {
            return new ItemStack(Item.getItemFromBlock(BlockHandler.tutBlock));
        }
    };

    public static CreativeTabs tabTools = new CreativeTabs("test_tools") {
        public ItemStack getTabIconItem() {
            return new ItemStack(ItemHandler.testPickaxe);
        }
    };

    public static CreativeTabs tabCombat = new CreativeTabs("test_combat") {
        public ItemStack getTabIconItem() {
            return new ItemStack(ItemHandler.testSword);
        }
    };

}
