package net.luhcarti.dutchcraft.datagen;

import net.luhcarti.dutchcraft.DutchCraft;
import net.luhcarti.dutchcraft.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, DutchCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(ModItems.HERRING_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
    }
}
