package net.oriont.ofood.proxy;

import net.oriont.ofood.handlers.BlockHandler;
import net.oriont.ofood.handlers.ItemHandler;

public class CommonProxy implements IProxy {
    public void preInit() {
        ItemHandler.init();
        ItemHandler.register();

        BlockHandler.init();
        BlockHandler.register();
    }

    public void init() {

    }

    public void postInit() {

    }
}
