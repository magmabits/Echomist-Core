package xyz.magmabits.echomistcore.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import xyz.magmabits.echomistcore.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SCULK_BRICKS, 4)
                .pattern("##")
                .pattern("##")
                .input('#', Blocks.SCULK)
                .criterion("has_sculk", conditionsFromItem(Blocks.SCULK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SCULK_TILES, 4)
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.SCULK_BRICKS)
                .criterion("has_sculk_bricks", conditionsFromItem(ModBlocks.SCULK_BRICKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SCULK_PILLAR, 1)
                .pattern("#")
                .pattern("#")
                .input('#', ModBlocks.SCULK_BRICKS)
                .criterion("has_sculk_bricks", conditionsFromItem(ModBlocks.SCULK_BRICKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_SCULK, 1)
                .pattern("#")
                .pattern("#")
                .input('#', ModBlocks.SCULK_BRICK_SLAB)
                .criterion("has_sculk_brick_slab", conditionsFromItem(ModBlocks.SCULK_BRICK_SLAB))
                .offerTo(exporter);

        createStairsRecipe(ModBlocks.SCULK_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.SCULK_BRICKS))
                .criterion(hasItem(ModBlocks.SCULK_BRICKS), conditionsFromItem(ModBlocks.SCULK_BRICKS))
                .offerTo(exporter);

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SCULK_BRICK_SLAB, Ingredient.ofItems(ModBlocks.SCULK_BRICKS))
                .criterion(hasItem(ModBlocks.SCULK_BRICKS), conditionsFromItem(ModBlocks.SCULK_BRICKS))
                .offerTo(exporter);

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SCULK_BRICK_WALL, ModBlocks.SCULK_BRICKS);

        createStairsRecipe(ModBlocks.SCULK_TILE_STAIRS, Ingredient.ofItems(ModBlocks.SCULK_TILES))
                .criterion(hasItem(ModBlocks.SCULK_TILES), conditionsFromItem(ModBlocks.SCULK_TILES))
                .offerTo(exporter);

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SCULK_TILE_SLAB, Ingredient.ofItems(ModBlocks.SCULK_TILES))
                .criterion(hasItem(ModBlocks.SCULK_TILES), conditionsFromItem(ModBlocks.SCULK_TILES))
                .offerTo(exporter);

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SCULK_TILE_WALL, ModBlocks.SCULK_TILES);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SCULK_BRICKS, Blocks.SCULK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SCULK_BRICK_STAIRS, Blocks.SCULK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SCULK_BRICK_STAIRS, ModBlocks.SCULK_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SCULK_BRICK_SLAB, Blocks.SCULK, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SCULK_BRICK_SLAB, ModBlocks.SCULK_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SCULK_BRICK_WALL, Blocks.SCULK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SCULK_BRICK_WALL, ModBlocks.SCULK_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SCULK_TILES, Blocks.SCULK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SCULK_TILE_STAIRS, Blocks.SCULK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SCULK_TILE_STAIRS, ModBlocks.SCULK_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SCULK_TILE_SLAB, Blocks.SCULK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SCULK_TILE_SLAB, ModBlocks.SCULK_TILES,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SCULK_TILE_WALL, Blocks.SCULK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SCULK_TILE_WALL, ModBlocks.SCULK_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_SCULK, Blocks.SCULK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SCULK_PILLAR, Blocks.SCULK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SCULK_PILLAR, ModBlocks.SCULK_BRICKS);

    }
}
