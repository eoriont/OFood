package net.oriont.ofood.handlers;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.item.Item.ToolMaterial;

public class MaterialHandler {

    public static ToolMaterial TEST = EnumHelper.addToolMaterial("test", 3, 2500, 5F, 5F, 20);
    public static final ArmorMaterial TUTORIAL_ARMOR = EnumHelper.addArmorMaterial("test_armor", "ofood:test_armor", 1500, new int[]{3, 5, 4, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 8F);

}
