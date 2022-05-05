package net.stinx.witherite.items.tools;

import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;


public class HoeBase extends HoeItem {

    public HoeBase(ToolMaterial toolMaterial) {
        super(toolMaterial, -6, 16f,  new Item.Settings().group(ItemGroup.TOOLS));
    }
}
