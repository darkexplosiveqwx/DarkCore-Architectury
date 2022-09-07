package net.darkexplosiveqwx.darkcore.forge;

import com.mojang.logging.LogUtils;
import dev.architectury.platform.forge.EventBuses;
import net.darkexplosiveqwx.darkcore.DarkCore;
import net.darkexplosiveqwx.darkcore.forge.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.*;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.*;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

@Mod(DarkCore.MOD_ID)
public class DarkCoreForge {

    private static final Logger LOGGER = LogUtils.getLogger();

    public DarkCoreForge() {
        LOGGER.debug("Mod DarkCore started!");

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);


        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(DarkCore.MOD_ID, modEventBus);
            DarkCore.init();
    }

    private void commonSetup(final @NotNull FMLCommonSetupEvent event){
        event.enqueueWork(() -> {

        });

        LOGGER.debug("Successful commonSetup!");
    }

    @Mod.EventBusSubscriber(modid = DarkCore.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public  static class  ClientModEvents{
        @SubscribeEvent
        public static void  onClientSetup(FMLClientSetupEvent event){
            //ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_SOAP_WATER.get(), RenderType.translucent());
            //ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_SOAP_WATER.get(), RenderType.translucent());

            //MenuScreens.register(ModMenuTypes.GEM_INFUSING_STATION_MENU.get(), GemInfusingStationScreen::new);
            //MenuScreens.register(ModMenuTypes.DARK_CRAFTING_TABLE_MENU.get(), DarkCraftingTableScreen::new);
            LOGGER.debug("Successful onClientSetup!");
        }
    }

}