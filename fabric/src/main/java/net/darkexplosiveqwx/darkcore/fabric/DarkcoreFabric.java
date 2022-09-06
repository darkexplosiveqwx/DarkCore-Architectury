package net.darkexplosiveqwx.darkcore.fabric;

import net.darkexplosiveqwx.darkcore.Darkcore;
import net.fabricmc.api.ModInitializer;

public class DarkcoreFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Darkcore.init();
    }
}