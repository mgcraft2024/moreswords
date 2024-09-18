package com.sam.moresword.items;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CompressionLv2StoneSword implements ToolMaterial {

    public static final CompressionLv2StoneSword INSTANCE = new CompressionLv2StoneSword();
    @Override
    public int getDurability() {
        return 650;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {return 57;}

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 80;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}