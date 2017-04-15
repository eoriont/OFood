package net.oriont.ofood.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ItemTestSword extends ItemSword {

    public ItemTestSword(String name, ToolMaterial material, CreativeTabs tab) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
        ModItem.items.add(this);
    }

}
