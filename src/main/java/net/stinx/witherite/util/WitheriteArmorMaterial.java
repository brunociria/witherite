package net.stinx.witherite.util;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import net.stinx.witherite.WitheriteMain;


public class WitheriteArmorMaterial implements ArmorMaterial {

    /* base variables */
    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
    private static final int[] PROTECTION_AMOUNTS = new int[] {2, 5, 6, 3};

    /* durability */
    @Override
    public int getDurability(EquipmentSlot arg) {
        return BASE_DURABILITY[arg.getEntitySlotId()]*25;
    }
    /* protection level */
    @Override
    public int getProtectionAmount(EquipmentSlot arg) {
        return PROTECTION_AMOUNTS[arg.getEntitySlotId()];
    }
    /* enchantability */
    @Override
    public int getEnchantability() {
        return 30   ;
    }
    /* sound when equipped */
    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.BLOCK_AMETHYST_BLOCK_PLACE;
    }
    /* repair in anvil item */
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(WitheriteMain.WITHERITE_PETALS);
    }
    /* tag given to armor */
    @Override
    public String getName() {
        return "witherite";
    }
    /* toughness */
    @Override
    public float getToughness() {
        return 2;
    }
    /* knockback resistance */
    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}
