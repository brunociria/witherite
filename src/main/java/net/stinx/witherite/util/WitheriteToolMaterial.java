package net.stinx.witherite.util;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import net.stinx.witherite.WitheriteMain;


public class WitheriteToolMaterial implements ToolMaterial{

    /* durability */
    @Override
    public int getDurability() {
        return 512;
    }
    /* mining speed */
    @Override
    public float getMiningSpeedMultiplier() {
        return 10.0f;
    }
    /* attack damage */
    @Override
    public float getAttackDamage() {
        return 6f;
    }
    /* no override = 0, can break low ores = 1, can break high ores = 2, can break obsidian = 3 */
    @Override
    public int getMiningLevel() {
        return 3;
    }
    /* enchantability */
    @Override
    public int getEnchantability() {
        return 30;
    }
    /* repair in anvil item */
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(WitheriteMain.WITHERITE_PETALS);
    }
}