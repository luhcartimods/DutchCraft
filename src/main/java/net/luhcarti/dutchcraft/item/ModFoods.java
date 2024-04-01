package net.luhcarti.dutchcraft.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {

    private static FoodProperties.Builder stew(int pNutrition) {
        return (new FoodProperties.Builder()).nutrition(pNutrition).saturationMod(0.6F);
    }
    public static final FoodProperties STROOPWAFEL = new FoodProperties.Builder().alwaysEat().nutrition(4)
            .saturationMod(0.6f).build();

    public static final FoodProperties APPLE_PIE = new FoodProperties.Builder().alwaysEat().nutrition(8)
            .saturationMod(0.3f).build();

    public static final FoodProperties PEA_STEW = stew(6).build();

    public static final FoodProperties RAW_HERRING = new FoodProperties.Builder().alwaysEat().nutrition(2)
            .saturationMod(0.1f).build();

    public static final FoodProperties GOUDA = new FoodProperties.Builder().alwaysEat().meat().nutrition(2)
            .saturationMod(0.2f).build();

    public static final FoodProperties COOKED_HERRING = new FoodProperties.Builder().alwaysEat().meat().nutrition(6)
            .saturationMod(0.8f).build();
}
