package net.stinx.witherite.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;


public class WitheriteBlock extends Block{

    public WitheriteBlock() {
        super(FabricBlockSettings.of(Material.METAL).breakInstantly().luminance(15).sounds(BlockSoundGroup.AMETHYST_BLOCK).resistance(1200f));
    }
}