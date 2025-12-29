package xyz.magmabits.echomistcore.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import xyz.magmabits.echomistcore.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.SCULK_BRICKS)
                .add(ModBlocks.SCULK_TILES)
                .add(ModBlocks.CHISELED_SCULK)
                .add(ModBlocks.SCULK_PILLAR);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.SCULK_BRICKS)
                .add(ModBlocks.SCULK_TILES)
                .add(ModBlocks.CHISELED_SCULK)
                .add(ModBlocks.SCULK_PILLAR);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.SCULK_BRICK_WALL)
                .add(ModBlocks.SCULK_TILE_WALL);
    }
}
