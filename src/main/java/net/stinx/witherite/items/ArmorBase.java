package net.stinx.witherite.items;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;


public class ArmorBase extends ArmorItem {

    public ArmorBase(ArmorMaterial armorMaterial, EquipmentSlot slot) {
        super(armorMaterial, slot, new Item.Settings().group(ItemGroup.COMBAT));
    }  
}
