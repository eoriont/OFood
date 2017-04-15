package net.oriont.ofood.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ItemTestAxe extends ItemAxe {

    public ItemTestAxe(String name, ToolMaterial material, CreativeTabs tab) {
        super(material, material.getDamageVsEntity(), material.getEfficiencyOnProperMaterial());
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
        ModItem.items.add(this);
    }

}
