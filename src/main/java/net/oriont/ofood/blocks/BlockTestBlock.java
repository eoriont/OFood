package net.oriont.ofood.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.oriont.ofood.handlers.ItemHandler;

import java.util.Random;

public class BlockTestBlock extends ModBlock {

    public BlockTestBlock(Material mat, String name, CreativeTabs tab, float hardness, float resistance, int harvest, String tool) {
        super(mat, name, tab, hardness, resistance, harvest, tool);
    }

    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        int chance = rand.nextInt(2);
        if(chance == 0){
            return ItemHandler.testItem;
        }
        if(chance == 1){
            return Items.DIAMOND;
        }

        return ItemHandler.testItem;
    }

    public int quantityDropped(IBlockState state, int fortune, Random random) {
        return random.nextInt(5) + 1;
    }

}
