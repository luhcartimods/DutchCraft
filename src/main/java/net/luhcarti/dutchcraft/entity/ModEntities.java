package net.luhcarti.dutchcraft.entity;

import net.luhcarti.dutchcraft.DutchFoods;
import net.luhcarti.dutchcraft.entity.custom.HerringEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, DutchFoods.MOD_ID);

    public static final RegistryObject<EntityType<HerringEntity>> HERRING =
            ENTITY_TYPES.register("herring", () -> EntityType.Builder.of(HerringEntity::new, MobCategory.CREATURE)
                    .sized(0.7f, 0.4f).build("herring"));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
