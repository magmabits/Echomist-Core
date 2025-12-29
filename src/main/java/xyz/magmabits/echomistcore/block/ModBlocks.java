package xyz.magmabits.echomistcore.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import xyz.magmabits.echomistcore.EchomistCore;

public class ModBlocks {

    public static final Block SCULK_BRICKS = registerBlock("sculk_bricks",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.SCULK_CATALYST)));
    public static final Block SCULK_BRICK_STAIRS = registerBlock("sculk_brick_stairs",
            new StairsBlock(ModBlocks.SCULK_BRICKS.getDefaultState(), AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.SCULK_CATALYST)));
    public static final Block SCULK_BRICK_SLAB = registerBlock("sculk_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.SCULK_CATALYST)));
    public static final Block SCULK_BRICK_WALL = registerBlock("sculk_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.SCULK_CATALYST)));

    public static final Block SCULK_TILES = registerBlock("sculk_tiles",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.SCULK_CATALYST)));
    public static final Block SCULK_TILE_STAIRS = registerBlock("sculk_tile_stairs",
            new StairsBlock(ModBlocks.SCULK_TILES.getDefaultState(), AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.SCULK_CATALYST)));
    public static final Block SCULK_TILE_SLAB = registerBlock("sculk_tile_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.SCULK_CATALYST)));
    public static final Block SCULK_TILE_WALL = registerBlock("sculk_tile_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.SCULK_CATALYST)));

    public static final Block CHISELED_SCULK = registerBlock("chiseled_sculk",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.SCULK_CATALYST)));

    public static final Block SCULK_PILLAR = registerBlock("sculk_pillar", new PillarBlock(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.SCULK_CATALYST)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(EchomistCore.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(EchomistCore.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
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
        });
    }
}
