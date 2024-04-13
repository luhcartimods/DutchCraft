package net.luhcarti.dutchcraft;

import com.mojang.logging.LogUtils;
import net.luhcarti.dutchcraft.block.ModBlocks;
import net.luhcarti.dutchcraft.datagen.ModEntitySpawn;
import net.luhcarti.dutchcraft.entity.ModEntities;
import net.luhcarti.dutchcraft.entity.client.HerringRenderer;
import net.luhcarti.dutchcraft.item.ModCreativeModeTabs;
import net.luhcarti.dutchcraft.item.ModItems;
import net.luhcarti.dutchcraft.loot.ModLootModifiers;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(DutchFoods.MOD_ID)
public class DutchFoods
{
    public static final String MOD_ID = "dutchfoods";

    private static final Logger LOGGER = LogUtils.getLogger();
    public DutchFoods()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);

        ModCreativeModeTabs.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModEntities.register(modEventBus);
        ModLootModifiers.register(modEventBus);
        ModEntitySpawn.SERIALIZER.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
        });
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
    }
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(ModEntities.HERRING.get(), HerringRenderer::new);
        }
    }
}
