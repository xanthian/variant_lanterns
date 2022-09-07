package net.xanthian.variant_lanterns.util;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import static net.xanthian.variant_lanterns.Initialise.MOD_ID;

public class Recipes {

    // Lantern
    public static JsonObject createLanternRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        String modPrefix = "";
        if (modList.size() > 0) {
            modPrefix = mods[0] + ":";
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("NNN");
        pattern.add("NTN");
        pattern.add("NNN");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item",   modPrefix + material + "_nugget");
        keyList.add("N", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
                iKey.addProperty("item",   "minecraft:torch");
        keyList.add("T", iKey);
        json.add("key", keyList);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":" + material + "_lantern");
        json.add("result", result);
        return json;
    }
    // Soul Lantern
    public static JsonObject createSoulLanternRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        String modPrefix = "";
        if (modList.size() > 0) {
            modPrefix = mods[0] + ":";
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("NNN");
        pattern.add("NTN");
        pattern.add("NNN");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item",   modPrefix + material + "_nugget");
        keyList.add("N", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item",   "minecraft:soul_torch");
        keyList.add("T", iKey);
        json.add("key", keyList);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":" + material + "_soul_lantern");
        json.add("result", result);
        return json;
    }
    // Redstone Lantern
    public static JsonObject createRedstoneLanternRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        String modPrefix = "";
        if (modList.size() > 0) {
            modPrefix = mods[0] + ":";
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");
        JsonArray pattern = new JsonArray();
        pattern.add("NNN");
        pattern.add("NTN");
        pattern.add("NNN");
        json.add("pattern", pattern);
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item",   modPrefix + material + "_nugget");
        keyList.add("N", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item",   "minecraft:redstone_torch");
        keyList.add("T", iKey);
        json.add("key", keyList);
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":" + material + "_redstone_lantern");
        json.add("result", result);
        return json;
    }
}