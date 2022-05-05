package net.stinx.witherite.items.tools;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;


public class AxeBase extends AxeItem {

    public AxeBase(ToolMaterial toolMaterial) {
        super(toolMaterial, 3, 16f, new Item.Settings().group(ItemGroup.TOOLS));
    }   
}