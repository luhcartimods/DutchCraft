package net.luhcarti.dutchcraft.datagen;

import net.luhcarti.dutchcraft.DutchCraft;
import net.luhcarti.dutchcraft.item.ModItems;
import net.luhcarti.dutchcraft.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, DutchCraft.MOD_ID);
    }

    @Override
    protected void start() {

        add("raw_herring_from_herring", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/herring")).build() }, ModItems.RAW_HERRING.get()));
    }
}