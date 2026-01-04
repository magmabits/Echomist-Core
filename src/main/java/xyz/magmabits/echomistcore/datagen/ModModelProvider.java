package xyz.magmabits.echomistcore.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import xyz.magmabits.echomistcore.block.ModBlocks;


public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SCULK_BRICKS)
                .stairs(ModBlocks.SCULK_BRICK_STAIRS)
                .slab(ModBlocks.SCULK_BRICK_SLAB)
                .wall(ModBlocks.SCULK_BRICK_WALL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SCULK_TILES)
                .stairs(ModBlocks.SCULK_TILE_STAIRS)
                .slab(ModBlocks.SCULK_TILE_SLAB)
                .wall(ModBlocks.SCULK_TILE_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_SCULK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}
