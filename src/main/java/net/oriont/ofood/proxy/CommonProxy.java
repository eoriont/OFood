package net.oriont.ofood.proxy;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.oriont.ofood.handlers.BlockHandler;
import net.oriont.ofood.handlers.CraftingHandler;
import net.oriont.ofood.handlers.ItemHandler;
import net.oriont.ofood.handlers.SmeltingHandler;
import net.oriont.ofood.world.WorldGenOre;

public class CommonProxy implements IProxy {
    public void preInit() {
        ItemHandler.init();
        ItemHandler.register();

        BlockHandler.init();
        BlockHandler.register();
    }

    public void init() {
        GameRegistry.registerWorldGenerator(new WorldGenOre(), 0);
    }

    public void postInit() {
        CraftingHandler.init();
        SmeltingHandler.init();
    }
}
