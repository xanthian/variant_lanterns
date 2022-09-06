package net.xanthian.variant_lanterns.mixin;

import com.google.gson.JsonElement;

import net.minecraft.recipe.RecipeManager;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.profiler.Profiler;

import net.xanthian.variant_lanterns.Initialise;
import net.xanthian.variant_lanterns.util.Recipes;
import org.apache.commons.lang3.tuple.Pair;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Map;

@Mixin(RecipeManager.class)
public abstract class RecipeManagerMixin {

    @Inject(method = "apply", at = @At("HEAD"))
    public void interceptApply(Map<Identifier, JsonElement> map, ResourceManager resourceManager, Profiler profiler, CallbackInfo info) {
        for (Pair<String, String[]> nuggetType : Initialise.nuggetTypes) {
            map.put(new Identifier(Initialise.MOD_ID, nuggetType.getLeft() + "_lantern"), Recipes.createLanternRecipeJson(nuggetType.getLeft(), nuggetType.getRight()));
            map.put(new Identifier(Initialise.MOD_ID, nuggetType.getLeft() + "_soul_lantern"), Recipes.createSoulLanternRecipeJson(nuggetType.getLeft(), nuggetType.getRight()));
            map.put(new Identifier(Initialise.MOD_ID, nuggetType.getLeft() + "_redstone_lantern"), Recipes.createRedstoneLanternRecipeJson(nuggetType.getLeft(), nuggetType.getRight()));
        }
    }
}