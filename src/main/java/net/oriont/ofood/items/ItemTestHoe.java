package net.oriont.ofood.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class ItemTestHoe extends ItemHoe {

    public ItemTestHoe(String name, ToolMaterial material, CreativeTabs tab) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
        ModItem.items.add(this);
    }

}
