package de.guntram.mcmod.easiervillagertrading;

import net.minecraftforge.fml.IExtensionPoint;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.config.ModConfigEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("easiervillagertrading")
public class EasierVillagerTrading {

    //Add config handler here
    //add server sided check for lcient side only mod

    public EasierVillagerTrading() {
        ModLoadingContext.get().registerExtensionPoint(IExtensionPoint.DisplayTest.class,
                () -> new IExtensionPoint.DisplayTest(() -> "useClientOnly", (ver, remote) -> true));

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::modConfig);
        ModLoadingContext modLoadingContext = ModLoadingContext.get();
        modLoadingContext.registerConfig(ModConfig.Type.CLIENT, ConfigData.CLIENT_SPEC);

    }

    public void modConfig(ModConfigEvent event) {
        if (event.getConfig().getSpec() == ConfigData.CLIENT_SPEC)
            ConfigData.refreshClient();
    }

}
