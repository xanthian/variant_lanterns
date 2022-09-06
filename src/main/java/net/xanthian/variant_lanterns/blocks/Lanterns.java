package net.xanthian.variant_lanterns.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.variant_lanterns.Initialise;

public class Lanterns {

    // Vanilla
    public static void addVanillaLanterns() {
        VariantLantern GOLD_LANTERN = new VariantLantern();
        registerLanterns("gold_lantern", GOLD_LANTERN);
        VariantSoulLantern GOLD_SOUL_LANTERN = new VariantSoulLantern();
        registerLanterns("gold_soul_lantern", GOLD_SOUL_LANTERN);
        VariantRedstoneLantern GOLD_REDSTONE_LANTERN = new VariantRedstoneLantern();
        registerLanterns("gold_redstone_lantern", GOLD_REDSTONE_LANTERN);

        // Iron Lantern not req.
        // Iron Soul Lantern not req.
        VariantRedstoneLantern IRON_REDSTONE_LANTERN = new VariantRedstoneLantern();
        registerLanterns("iron_redstone_lantern", IRON_REDSTONE_LANTERN);
        
    }
    public static void addTechRebornLanterns() {
        VariantLantern ALUMINIUM_LANTERN = new VariantLantern();
        registerLanterns("aluminium_lantern", ALUMINIUM_LANTERN);
        VariantSoulLantern ALUMINIUM_SOUL_LANTERN = new VariantSoulLantern();
        registerLanterns("aluminium_soul_lantern", ALUMINIUM_SOUL_LANTERN);
        VariantRedstoneLantern ALUMINIUM_REDSTONE_LANTERN = new VariantRedstoneLantern();
        registerLanterns("aluminium_redstone_lantern", ALUMINIUM_REDSTONE_LANTERN);
        VariantLantern BRASS_LANTERN = new VariantLantern();
        registerLanterns("brass_lantern", BRASS_LANTERN);
        VariantSoulLantern BRASS_SOUL_LANTERN = new VariantSoulLantern();
        registerLanterns("brass_soul_lantern", BRASS_SOUL_LANTERN);
        VariantRedstoneLantern BRASS_REDSTONE_LANTERN = new VariantRedstoneLantern();
        registerLanterns("brass_redstone_lantern", BRASS_REDSTONE_LANTERN);
    }
        private static void registerLanterns(String Id, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, Id.toLowerCase());
        Registry.register(Registry.BLOCK, identifier, block);
        Registry.register(Registry.ITEM, identifier, new BlockItem(block, new FabricItemSettings().group(Initialise.VARIANT_LANTERNS)));
    }
}