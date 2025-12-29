package xyz.magmabits.echomistcore.trim;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.trim.ArmorTrimMaterial;
import net.minecraft.registry.*;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import xyz.magmabits.echomistcore.EchomistCore;

import java.util.Map;

public class ModTrimMaterials {
    public static final RegistryKey<ArmorTrimMaterial> ECHO_SHARD = RegistryKey.of(RegistryKeys.TRIM_MATERIAL, Identifier.of(EchomistCore.MOD_ID, "echo_shard"));

    public static void bootstrap(Registerable<ArmorTrimMaterial> registerable) {
        register(registerable, ECHO_SHARD, Registries.ITEM.getEntry(Items.ECHO_SHARD), Style.EMPTY.withColor(TextColor.parse("#09505f").getOrThrow()), 0.8f);
    }

    private static void register(Registerable<ArmorTrimMaterial> registerable, RegistryKey<ArmorTrimMaterial> armorTrimMaterialKey, RegistryEntry<Item> item, Style style, float itemModelIndex) {
        ArmorTrimMaterial trimMaterial = new ArmorTrimMaterial(armorTrimMaterialKey.getValue().getPath(), item, itemModelIndex, Map.of(), Text.translatable(Util.createTranslationKey("trim_material", armorTrimMaterialKey.getValue())).fillStyle(style));

        registerable.register(armorTrimMaterialKey, trimMaterial);
    }
}
