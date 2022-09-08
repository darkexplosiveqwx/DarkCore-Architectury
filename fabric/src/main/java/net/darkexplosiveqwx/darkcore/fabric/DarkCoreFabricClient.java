package net.darkexplosiveqwx.darkcore.fabric;

import net.darkexplosiveqwx.darkcore.DarkCore;
import net.fabricmc.api.ModInitializer;

public class DarkCoreFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        DarkCore.init();
    }
}