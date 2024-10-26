package com.sam.moresword.items;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CompressionLv8IronSword implements ToolMaterial {

    public static final  CompressionLv8IronSword INSTANCE = new CompressionLv8IronSword();
    @Override
    public int getDurability() {
        return 2500;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {return 700;}

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 5000;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}
