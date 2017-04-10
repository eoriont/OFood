package net.oriont.ofood.proxy;

import net.oriont.ofood.handlers.BlockHandler;
import net.oriont.ofood.handlers.ItemHandler;

public class ClientProxy extends CommonProxy {
    public void init() {
        ItemHandler.registerRenders();
        BlockHandler.registerRenders();
    }
}
