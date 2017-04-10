package net.oriont.ofood;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.oriont.ofood.proxy.IProxy;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.MC_VERSION)
public class OFoodMod {
    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static IProxy proxy;
    public static OFoodMod instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        proxy.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit();
    }

}
