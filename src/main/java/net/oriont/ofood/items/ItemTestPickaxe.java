package net.oriont.ofood.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ItemTestPickaxe extends ItemPickaxe {

    public ItemTestPickaxe(String name, ToolMaterial material, CreativeTabs tab) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
        ModItem.items.add(this);
    }

}
