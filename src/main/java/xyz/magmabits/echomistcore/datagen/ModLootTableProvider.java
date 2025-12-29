package xyz.magmabits.echomistcore.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import xyz.magmabits.echomistcore.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.SCULK_BRICKS);
        addDrop(ModBlocks.SCULK_BRICK_STAIRS);
        addDrop(ModBlocks.SCULK_BRICK_SLAB, slabDrops(ModBlocks.SCULK_BRICK_SLAB));
        addDrop(ModBlocks.SCULK_BRICK_WALL);

        addDrop(ModBlocks.SCULK_TILES);
        addDrop(ModBlocks.SCULK_TILE_STAIRS);
        addDrop(ModBlocks.SCULK_TILE_SLAB, slabDrops(ModBlocks.SCULK_TILE_SLAB));
        addDrop(ModBlocks.SCULK_TILE_WALL);

        addDrop(ModBlocks.CHISELED_SCULK);
        addDrop(ModBlocks.SCULK_PILLAR);
    }
}
