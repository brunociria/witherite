package net.stinx.witherite.items.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;


public class SwordBase extends SwordItem {

    public SwordBase(ToolMaterial toolMaterial) {
        super(toolMaterial, 2, 16f, new Item.Settings().group(ItemGroup.COMBAT));
    }
}
