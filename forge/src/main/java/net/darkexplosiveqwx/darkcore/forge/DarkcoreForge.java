package net.darkexplosiveqwx.darkcore.forge;

import dev.architectury.platform.forge.EventBuses;
import net.darkexplosiveqwx.darkcore.Darkcore;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Darkcore.MOD_ID)
public class DarkcoreForge {
    public DarkcoreForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(Darkcore.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
            Darkcore.init();
    }
}