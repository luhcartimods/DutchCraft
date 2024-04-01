package net.luhcarti.dutchcraft.item;

import net.luhcarti.dutchcraft.DutchCraft;
import net.luhcarti.dutchcraft.entity.ModEntities;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.*;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DutchCraft.MOD_ID);

    public static final RegistryObject<Item> STROOPWAFEL = ITEMS.register("stroopwafel",
            () -> new Item(new Item.Properties().food(ModFoods.STROOPWAFEL)));

    public static final RegistryObject<Item> PEA_STEW = ITEMS.register("pea_stew",
            () -> new Item(new Item.Properties().food(ModFoods.PEA_STEW)));

    public static final RegistryObject<Item> RAW_HERRING = ITEMS.register("herring",
            () -> new Item(new Item.Properties().food(ModFoods.RAW_HERRING)));

    public static final RegistryObject<Item> COOKED_HERRING = ITEMS.register("cooked_herring",
            () -> new Item(new Item.Properties().food(ModFoods.COOKED_HERRING)));

    public static final RegistryObject<Item> APPLE_PIE = ITEMS.register("apple_pie",
            () -> new Item(new Item.Properties().food(ModFoods.APPLE_PIE)));

    public static final RegistryObject<Item> GOUDA = ITEMS.register("gouda",
            () -> new Item(new Item.Properties().food(ModFoods.GOUDA)));

    public static final RegistryObject<MobBucketItem> HERRING_BUCKET =
            ITEMS.register("herring_bucket", () -> new MobBucketItem(() -> ModEntities.HERRING.get(), () -> Fluids.WATER, ()-> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().stacksTo(1)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

