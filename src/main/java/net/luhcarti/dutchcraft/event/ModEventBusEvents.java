package net.luhcarti.dutchcraft.event;

import net.luhcarti.dutchcraft.DutchFoods;
import net.luhcarti.dutchcraft.entity.ModEntities;
import net.luhcarti.dutchcraft.entity.custom.HerringEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = DutchFoods.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.HERRING.get(), HerringEntity.createAttributes().build());
    }
}