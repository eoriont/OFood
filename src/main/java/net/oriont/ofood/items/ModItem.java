package net.oriont.ofood.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModItem extends Item {
    public static List<Item> items = new ArrayList<Item>();

    public ModItem(String name, CreativeTabs tab){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
        items.add(this);
    }

    public ModItem(String name, CreativeTabs tab, int stacksize){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
        setMaxStackSize(stacksize);
        items.add(this);
    }
}
