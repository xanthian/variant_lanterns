package net.xanthian.variant_lanterns.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.LanternBlock;

public class VariantLantern extends LanternBlock {
    public VariantLantern() {
        super((FabricBlockSettings.copy(Blocks.LANTERN)));
    }
}
