package net.xanthian.variant_lanterns;

import com.google.common.collect.Lists;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import net.xanthian.variant_lanterns.blocks.Lanterns;
import org.apache.commons.lang3.tuple.Pair;

import java.util.List;

public class Initialise implements ModInitializer {

	public static final String MOD_ID = "variant_lanterns";

	public static final ItemGroup VARIANT_LANTERNS = FabricItemGroupBuilder.build(new Identifier(Initialise.MOD_ID, "variant_lanterns"),
			() -> new ItemStack(Items.LANTERN));
	public static List<Pair<String, String[]>> nuggetTypes = Lists.newArrayList();

	@Override
	public void onInitialize() {

		// Vanilla
			nuggetTypes.add(Pair.of("gold", new String[0]));
			Lanterns.addVanillaLanterns();

		// Tech Reborn
		if (FabricLoader.getInstance().isModLoaded("techreborn")) {
			nuggetTypes.add(Pair.of("aluminum", new String[]{"techreborn"}));
			nuggetTypes.add(Pair.of("brass", new String[]{"techreborn"}));
			nuggetTypes.add(Pair.of("bronze", new String[]{"techreborn"}));
			nuggetTypes.add(Pair.of("chrome", new String[]{"techreborn"}));
			nuggetTypes.add(Pair.of("copper", new String[]{"techreborn"}));
			nuggetTypes.add(Pair.of("diamond", new String[]{"techreborn"}));
			nuggetTypes.add(Pair.of("electrum", new String[]{"techreborn"}));
			nuggetTypes.add(Pair.of("emerald", new String[]{"techreborn"}));
			nuggetTypes.add(Pair.of("hot_tungstensteel", new String[]{"techreborn"}));
			nuggetTypes.add(Pair.of("invar", new String[]{"techreborn"}));
			nuggetTypes.add(Pair.of("iridium", new String[]{"techreborn"}));
			nuggetTypes.add(Pair.of("lead", new String[]{"techreborn"}));
			nuggetTypes.add(Pair.of("netherite", new String[]{"techreborn"}));
			nuggetTypes.add(Pair.of("nickel", new String[]{"techreborn"}));
			nuggetTypes.add(Pair.of("platinum", new String[]{"techreborn"}));
			nuggetTypes.add(Pair.of("refined_iron", new String[]{"techreborn"}));
			nuggetTypes.add(Pair.of("silver", new String[]{"techreborn"}));
			nuggetTypes.add(Pair.of("steel", new String[]{"techreborn"}));
			nuggetTypes.add(Pair.of("tin", new String[]{"techreborn"}));
			nuggetTypes.add(Pair.of("titanium", new String[]{"techreborn"}));
			nuggetTypes.add(Pair.of("tungsten", new String[]{"techreborn"}));
			nuggetTypes.add(Pair.of("tungstensteel", new String[]{"techreborn"}));
			nuggetTypes.add(Pair.of("zinc", new String[]{"techreborn"}));
			Lanterns.addTechRebornLanterns();
		}
		if (FabricLoader.getInstance().isModLoaded("betterend")) {
			nuggetTypes.add(Pair.of("terminite", new String[]{"betterend"}));
			nuggetTypes.add(Pair.of("thallasium", new String[]{"betterend"}));
			Lanterns.addBetterEndLanterns();
		}
		if (FabricLoader.getInstance().isModLoaded("ad_astra")) {
			nuggetTypes.add(Pair.of("calorite", new String[]{"ad_astra"}));
			nuggetTypes.add(Pair.of("desh", new String[]{"ad_astra"}));
			nuggetTypes.add(Pair.of("ostrum", new String[]{"ad_astra"}));
			//nuggetTypes.add(Pair.of("steel", new String[]{"ad_astra"}));
			Lanterns.addAdAstraLanterns();
		}
	}
}