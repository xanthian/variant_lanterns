package net.xanthian.variant_lanterns.blocks;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.variant_lanterns.Initialise;

public class Lanterns {

    // Vanilla
    public static void addVanillaLanterns() {
        // Iron Lantern not req.
        // Iron Soul Lantern not req.
        VariantRedstoneLantern IRON_REDSTONE_LANTERN = new VariantRedstoneLantern();
        registerLanterns("iron_redstone_lantern", IRON_REDSTONE_LANTERN);

        VariantLantern GOLD_LANTERN = new VariantLantern();
        registerLanterns("gold_lantern", GOLD_LANTERN);
        VariantSoulLantern GOLD_SOUL_LANTERN = new VariantSoulLantern();
        registerLanterns("gold_soul_lantern", GOLD_SOUL_LANTERN);
        VariantRedstoneLantern GOLD_REDSTONE_LANTERN = new VariantRedstoneLantern();
        registerLanterns("gold_redstone_lantern", GOLD_REDSTONE_LANTERN);
    }
    public static void addTechRebornLanterns() {
        VariantLantern ALUMINUM_LANTERN = new VariantLantern();
        registerLanterns("aluminum_lantern", ALUMINUM_LANTERN);
        VariantSoulLantern ALUMINUM_SOUL_LANTERN = new VariantSoulLantern();
        registerLanterns("aluminum_soul_lantern", ALUMINUM_SOUL_LANTERN);
        VariantRedstoneLantern ALUMINUM_REDSTONE_LANTERN = new VariantRedstoneLantern();
        registerLanterns("aluminum_redstone_lantern", ALUMINUM_REDSTONE_LANTERN);
        VariantLantern BRASS_LANTERN = new VariantLantern();
        registerLanterns("brass_lantern", BRASS_LANTERN);
        VariantSoulLantern BRASS_SOUL_LANTERN = new VariantSoulLantern();
        registerLanterns("brass_soul_lantern", BRASS_SOUL_LANTERN);
        VariantRedstoneLantern BRASS_REDSTONE_LANTERN = new VariantRedstoneLantern();
        registerLanterns("brass_redstone_lantern", BRASS_REDSTONE_LANTERN);
        VariantLantern BRONZE_LANTERN = new VariantLantern();
        registerLanterns("bronze_lantern", BRONZE_LANTERN);
        VariantSoulLantern BRONZE_SOUL_LANTERN = new VariantSoulLantern();
        registerLanterns("bronze_soul_lantern", BRONZE_SOUL_LANTERN);
        VariantRedstoneLantern BRONZE_REDSTONE_LANTERN = new VariantRedstoneLantern();
        registerLanterns("bronze_redstone_lantern", BRONZE_REDSTONE_LANTERN);
        VariantLantern COPPER_LANTERN = new VariantLantern();
        registerLanterns("copper_lantern", COPPER_LANTERN);
        VariantSoulLantern COPPER_SOUL_LANTERN = new VariantSoulLantern();
        registerLanterns("copper_soul_lantern", COPPER_SOUL_LANTERN);
        VariantRedstoneLantern COPPER_REDSTONE_LANTERN = new VariantRedstoneLantern();
        registerLanterns("copper_redstone_lantern", COPPER_REDSTONE_LANTERN);
        VariantLantern CHROME_LANTERN = new VariantLantern();
        registerLanterns("chrome_lantern", CHROME_LANTERN);
        VariantSoulLantern CHROME_SOUL_LANTERN = new VariantSoulLantern();
        registerLanterns("chrome_soul_lantern", CHROME_SOUL_LANTERN);
        VariantRedstoneLantern CHROME_REDSTONE_LANTERN = new VariantRedstoneLantern();
        registerLanterns("chrome_redstone_lantern", CHROME_REDSTONE_LANTERN);
        VariantLantern DIAMOND_LANTERN = new VariantLantern();
        registerLanterns("diamond_lantern", DIAMOND_LANTERN);
        VariantSoulLantern DIAMOND_SOUL_LANTERN = new VariantSoulLantern();
        registerLanterns("diamond_soul_lantern", DIAMOND_SOUL_LANTERN);
        VariantRedstoneLantern DIAMOND_REDSTONE_LANTERN = new VariantRedstoneLantern();
        registerLanterns("diamond_redstone_lantern", DIAMOND_REDSTONE_LANTERN);
        VariantLantern ELECTRUM_LANTERN = new VariantLantern();
        registerLanterns("electrum_lantern", ELECTRUM_LANTERN);
        VariantSoulLantern ELECTRUM_SOUL_LANTERN = new VariantSoulLantern();
        registerLanterns("electrum_soul_lantern", ELECTRUM_SOUL_LANTERN);
        VariantRedstoneLantern ELECTRUM_REDSTONE_LANTERN = new VariantRedstoneLantern();
        registerLanterns("electrum_redstone_lantern", ELECTRUM_REDSTONE_LANTERN);
        VariantLantern EMERALD_LANTERN = new VariantLantern();
        registerLanterns("emerald_lantern", EMERALD_LANTERN);
        VariantSoulLantern EMERALD_SOUL_LANTERN = new VariantSoulLantern();
        registerLanterns("emerald_soul_lantern", EMERALD_SOUL_LANTERN);
        VariantRedstoneLantern EMERALD_REDSTONE_LANTERN = new VariantRedstoneLantern();
        registerLanterns("emerald_redstone_lantern", EMERALD_REDSTONE_LANTERN);
        VariantLantern HOT_TUNGSTENSTEEL_LANTERN = new VariantLantern();
        registerLanterns("hot_tungstensteel_lantern", HOT_TUNGSTENSTEEL_LANTERN);
        VariantSoulLantern HOT_TUNGSTENSTEEL_SOUL_LANTERN = new VariantSoulLantern();
        registerLanterns("hot_tungstensteel_soul_lantern", HOT_TUNGSTENSTEEL_SOUL_LANTERN);
        VariantRedstoneLantern HOT_TUNGSTENSTEEL_REDSTONE_LANTERN = new VariantRedstoneLantern();
        registerLanterns("hot_tungstensteel_redstone_lantern", HOT_TUNGSTENSTEEL_REDSTONE_LANTERN);
        VariantLantern INVAR_LANTERN = new VariantLantern();
        registerLanterns("invar_lantern", INVAR_LANTERN);
        VariantSoulLantern INVAR_SOUL_LANTERN = new VariantSoulLantern();
        registerLanterns("invar_soul_lantern", INVAR_SOUL_LANTERN);
        VariantRedstoneLantern INVAR_REDSTONE_LANTERN = new VariantRedstoneLantern();
        registerLanterns("invar_redstone_lantern", INVAR_REDSTONE_LANTERN);
        VariantLantern IRIDIUM_LANTERN = new VariantLantern();
        registerLanterns("iridium_lantern", IRIDIUM_LANTERN);
        VariantSoulLantern IRIDIUM_SOUL_LANTERN = new VariantSoulLantern();
        registerLanterns("iridium_soul_lantern", IRIDIUM_SOUL_LANTERN);
        VariantRedstoneLantern IRIDIUM_REDSTONE_LANTERN = new VariantRedstoneLantern();
        registerLanterns("iridium_redstone_lantern", IRIDIUM_REDSTONE_LANTERN);
        VariantLantern LEAD_LANTERN = new VariantLantern();
        registerLanterns("lead_lantern", LEAD_LANTERN);
        VariantSoulLantern LEAD_SOUL_LANTERN = new VariantSoulLantern();
        registerLanterns("lead_soul_lantern", LEAD_SOUL_LANTERN);
        VariantRedstoneLantern LEAD_REDSTONE_LANTERN = new VariantRedstoneLantern();
        registerLanterns("lead_redstone_lantern", LEAD_REDSTONE_LANTERN);
        VariantLantern NETHERITE_LANTERN = new VariantLantern();
        registerLanterns("netherite_lantern", NETHERITE_LANTERN);
        VariantSoulLantern NETHERITE_SOUL_LANTERN = new VariantSoulLantern();
        registerLanterns("netherite_soul_lantern", NETHERITE_SOUL_LANTERN);
        VariantRedstoneLantern NETHERITE_REDSTONE_LANTERN = new VariantRedstoneLantern();
        registerLanterns("netherite_redstone_lantern", NETHERITE_REDSTONE_LANTERN);
        VariantLantern NICKEL_LANTERN = new VariantLantern();
        registerLanterns("nickel_lantern", NICKEL_LANTERN);
        VariantSoulLantern NICKEL_SOUL_LANTERN = new VariantSoulLantern();
        registerLanterns("nickel_soul_lantern", NICKEL_SOUL_LANTERN);
        VariantRedstoneLantern NICKEL_REDSTONE_LANTERN = new VariantRedstoneLantern();
        registerLanterns("nickel_redstone_lantern", NICKEL_REDSTONE_LANTERN);
        VariantLantern PLATINUM_LANTERN = new VariantLantern();
        registerLanterns("platinum_lantern", PLATINUM_LANTERN);
        VariantSoulLantern PLATINUM_SOUL_LANTERN = new VariantSoulLantern();
        registerLanterns("platinum_soul_lantern", PLATINUM_SOUL_LANTERN);
        VariantRedstoneLantern PLATINUM_REDSTONE_LANTERN = new VariantRedstoneLantern();
        registerLanterns("platinum_redstone_lantern", PLATINUM_REDSTONE_LANTERN);
        VariantLantern REFINED_IRON_LANTERN = new VariantLantern();
        registerLanterns("refined_iron_lantern", REFINED_IRON_LANTERN);
        VariantSoulLantern REFINED_IRON_SOUL_LANTERN = new VariantSoulLantern();
        registerLanterns("refined_iron_soul_lantern", REFINED_IRON_SOUL_LANTERN);
        VariantRedstoneLantern REFINED_IRON_REDSTONE_LANTERN = new VariantRedstoneLantern();
        registerLanterns("refined_iron_redstone_lantern", REFINED_IRON_REDSTONE_LANTERN);
        VariantLantern SILVER_LANTERN = new VariantLantern();
        registerLanterns("silver_lantern", SILVER_LANTERN);
        VariantSoulLantern SILVER_SOUL_LANTERN = new VariantSoulLantern();
        registerLanterns("silver_soul_lantern", SILVER_SOUL_LANTERN);
        VariantRedstoneLantern SILVER_REDSTONE_LANTERN = new VariantRedstoneLantern();
        registerLanterns("silver_redstone_lantern", SILVER_REDSTONE_LANTERN);
        VariantLantern STEEL_LANTERN = new VariantLantern();
        registerLanterns("steel_lantern", STEEL_LANTERN);
        VariantSoulLantern STEEL_SOUL_LANTERN = new VariantSoulLantern();
        registerLanterns("steel_soul_lantern", STEEL_SOUL_LANTERN);
        VariantRedstoneLantern STEEL_REDSTONE_LANTERN = new VariantRedstoneLantern();
        registerLanterns("steel_redstone_lantern", STEEL_REDSTONE_LANTERN);
        VariantLantern TIN_LANTERN = new VariantLantern();
        registerLanterns("tin_lantern", TIN_LANTERN);
        VariantSoulLantern TIN_SOUL_LANTERN = new VariantSoulLantern();
        registerLanterns("tin_soul_lantern", TIN_SOUL_LANTERN);
        VariantRedstoneLantern TIN_REDSTONE_LANTERN = new VariantRedstoneLantern();
        registerLanterns("tin_redstone_lantern", TIN_REDSTONE_LANTERN);
        VariantLantern TITANIUM_LANTERN = new VariantLantern();
        registerLanterns("titanium_lantern", TITANIUM_LANTERN);
        VariantSoulLantern TITANIUM_SOUL_LANTERN = new VariantSoulLantern();
        registerLanterns("titanium_soul_lantern", TITANIUM_SOUL_LANTERN);
        VariantRedstoneLantern TITANIUM_REDSTONE_LANTERN = new VariantRedstoneLantern();
        registerLanterns("titanium_redstone_lantern", TITANIUM_REDSTONE_LANTERN);
        VariantLantern TUNGSTEN_LANTERN = new VariantLantern();
        registerLanterns("tungsten_lantern", TUNGSTEN_LANTERN);
        VariantSoulLantern TUNGSTEN_SOUL_LANTERN = new VariantSoulLantern();
        registerLanterns("tungsten_soul_lantern", TUNGSTEN_SOUL_LANTERN);
        VariantRedstoneLantern TUNGSTEN_REDSTONE_LANTERN = new VariantRedstoneLantern();
        registerLanterns("tungsten_redstone_lantern", TUNGSTEN_REDSTONE_LANTERN);
        VariantLantern TUNGSTENSTEEL_LANTERN = new VariantLantern();
        registerLanterns("tungstensteel_lantern", TUNGSTENSTEEL_LANTERN);
        VariantSoulLantern TUNGSTENSTEEL_SOUL_LANTERN = new VariantSoulLantern();
        registerLanterns("tungstensteel_soul_lantern", TUNGSTENSTEEL_SOUL_LANTERN);
        VariantRedstoneLantern TUNGSTENSTEEL_REDSTONE_LANTERN = new VariantRedstoneLantern();
        registerLanterns("tungstensteel_redstone_lantern", TUNGSTENSTEEL_REDSTONE_LANTERN);
        VariantLantern ZINC_LANTERN = new VariantLantern();
        registerLanterns("zinc_lantern", ZINC_LANTERN);
        VariantSoulLantern ZINC_SOUL_LANTERN = new VariantSoulLantern();
        registerLanterns("zinc_soul_lantern", ZINC_SOUL_LANTERN);
        VariantRedstoneLantern ZINC_REDSTONE_LANTERN = new VariantRedstoneLantern();
        registerLanterns("zinc_redstone_lantern", ZINC_REDSTONE_LANTERN);
    }
        private static void registerLanterns(String Id, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, Id.toLowerCase());
        Registry.register(Registry.BLOCK, identifier, block);
        Registry.register(Registry.ITEM, identifier, new BlockItem(block, new FabricItemSettings().group(Initialise.VARIANT_LANTERNS)));

            if (FabricLoader.getInstance().getEnvironmentType() == EnvType.CLIENT)
                RegisterBlockRenderLayerMap(block);
        }

    @Environment(EnvType.CLIENT)
    private static void RegisterBlockRenderLayerMap(Block block) {
        BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());
    }
}