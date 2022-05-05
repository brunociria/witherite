package net.stinx.witherite.items.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;


public class PickaxeBase extends PickaxeItem {

    public PickaxeBase(ToolMaterial toolMaterial) {
        super(toolMaterial, -1, 16f, new Item.Settings().group(ItemGroup.TOOLS));
    }
}