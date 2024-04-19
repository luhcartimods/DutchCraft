package net.luhcarti.dutchcraft.item;

import net.luhcarti.dutchcraft.DutchCraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DutchCraft.MOD_ID);

    public static final RegistryObject<CreativeModeTab> DUTCH_TAB = CREATIVE_MODE_TABS.register("dutch_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STROOPWAFEL.get()))
                    .title(Component.translatable("creativetab.dutch_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.STROOPWAFEL.get());
                        pOutput.accept(ModItems.PEA_STEW.get());
                        pOutput.accept(ModItems.RAW_HERRING.get());
                        pOutput.accept(ModItems.COOKED_HERRING.get());
                        pOutput.accept(ModItems.APPLE_PIE.get());
                        pOutput.accept(ModItems.BUCKET_OF_HERRING.get());
                        pOutput.accept(ModItems.HERRING_SPAWN_EGG.get());

                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}