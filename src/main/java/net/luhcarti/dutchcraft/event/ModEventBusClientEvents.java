package net.luhcarti.dutchcraft.event;

import net.luhcarti.dutchcraft.DutchCraft;
import net.luhcarti.dutchcraft.entity.client.HerringModel;
import net.luhcarti.dutchcraft.entity.client.ModModelLayers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = DutchCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.HERRING_LAYER, HerringModel::createBodyLayer);
    }
}
