package xyz.magmabits.echomistcore.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import xyz.magmabits.echomistcore.EchomistCore;
import xyz.magmabits.echomistcore.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup CORE_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(EchomistCore.MOD_ID, "core_group"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModBlocks.SCULK_BRICKS))
                    .displayName(Text.translatable("itemgroup.echomistcore.core_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.SCULK_BRICKS);
                        entries.add(ModBlocks.SCULK_BRICK_STAIRS);
                        entries.add(ModBlocks.SCULK_BRICK_SLAB);
                        entries.add(ModBlocks.SCULK_BRICK_WALL);

                        entries.add(ModBlocks.SCULK_TILES);
                        entries.add(ModBlocks.SCULK_TILE_STAIRS);
                        entries.add(ModBlocks.SCULK_TILE_SLAB);
                        entries.add(ModBlocks.SCULK_TILE_WALL);

                        entries.add(ModBlocks.CHISELED_SCULK);

                        entries.add(ModBlocks.SCULK_PILLAR.asItem());
                    })
                    .build());

    public static void registerItemGroups() {

    }
}
