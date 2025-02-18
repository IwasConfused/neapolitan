package com.teamabnormals.neapolitan.core.data.server.tags;

import com.teamabnormals.blueprint.core.other.tags.BlueprintBlockTags;
import com.teamabnormals.neapolitan.common.block.FlavoredCandleCakeBlock;
import com.teamabnormals.neapolitan.core.Neapolitan;
import com.teamabnormals.neapolitan.core.other.tags.NeapolitanBlockTags;
import com.teamabnormals.neapolitan.core.registry.NeapolitanBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.ExistingFileHelper;

public class NeapolitanBlockTagsProvider extends BlockTagsProvider {

	public NeapolitanBlockTagsProvider(DataGenerator generator, ExistingFileHelper fileHelper) {
		super(generator, Neapolitan.MOD_ID, fileHelper);
	}

	@Override
	protected void addTags() {
		FlavoredCandleCakeBlock.getCandleCakes().forEach((block -> this.tag(BlockTags.CANDLE_CAKES).add(block)));

		this.tag(BlockTags.CAULDRONS).add(NeapolitanBlocks.MILK_CAULDRON.get());
		this.tag(BlockTags.MINEABLE_WITH_AXE).add(NeapolitanBlocks.CHOCOLATE_BLOCK.get(), NeapolitanBlocks.CHOCOLATE_BRICKS.get(), NeapolitanBlocks.CHOCOLATE_BRICK_SLAB.get(), NeapolitanBlocks.CHOCOLATE_BRICK_STAIRS.get(), NeapolitanBlocks.CHOCOLATE_BRICK_WALL.get(), NeapolitanBlocks.CHOCOLATE_BRICK_VERTICAL_SLAB.get(), NeapolitanBlocks.CHISELED_CHOCOLATE_BRICKS.get(), NeapolitanBlocks.CHOCOLATE_TILES.get(), NeapolitanBlocks.CHOCOLATE_TILE_SLAB.get(), NeapolitanBlocks.CHOCOLATE_TILE_STAIRS.get(), NeapolitanBlocks.CHOCOLATE_TILE_WALL.get(), NeapolitanBlocks.CHOCOLATE_TILE_VERTICAL_SLAB.get(), NeapolitanBlocks.STRAWBERRY_BUSH.get(), NeapolitanBlocks.VANILLA_VINE.get(), NeapolitanBlocks.VANILLA_VINE_PLANT.get(), NeapolitanBlocks.MINT.get(), NeapolitanBlocks.ADZUKI_SPROUTS.get(), NeapolitanBlocks.STRAWBERRY_BASKET.get(), NeapolitanBlocks.WHITE_STRAWBERRY_BASKET.get(), NeapolitanBlocks.BANANA_CRATE.get(), NeapolitanBlocks.MINT_BASKET.get(), NeapolitanBlocks.ADZUKI_CRATE.get(), NeapolitanBlocks.ROASTED_ADZUKI_CRATE.get());
		this.tag(BlockTags.MINEABLE_WITH_HOE).add(NeapolitanBlocks.FROND_THATCH.get(), NeapolitanBlocks.FROND_THATCH_SLAB.get(), NeapolitanBlocks.FROND_THATCH_STAIRS.get(), NeapolitanBlocks.FROND_THATCH_VERTICAL_SLAB.get(), NeapolitanBlocks.BANANA_STALK.get(), NeapolitanBlocks.CARVED_BANANA_STALK.get(), NeapolitanBlocks.SMALL_BANANA_FROND.get(), NeapolitanBlocks.BANANA_FROND.get(), NeapolitanBlocks.LARGE_BANANA_FROND.get(), NeapolitanBlocks.BEANSTALK.get(), NeapolitanBlocks.BEANSTALK_THORNS.get(), NeapolitanBlocks.VANILLA_POD_BLOCK.get(), NeapolitanBlocks.DRIED_VANILLA_POD_BLOCK.get(), NeapolitanBlocks.BANANA_BUNDLE.get());
		this.tag(BlockTags.MINEABLE_WITH_SHOVEL).add(NeapolitanBlocks.VANILLA_ICE_CREAM_BLOCK.get(), NeapolitanBlocks.CHOCOLATE_ICE_CREAM_BLOCK.get(), NeapolitanBlocks.STRAWBERRY_ICE_CREAM_BLOCK.get(), NeapolitanBlocks.BANANA_ICE_CREAM_BLOCK.get(), NeapolitanBlocks.MINT_ICE_CREAM_BLOCK.get(), NeapolitanBlocks.ADZUKI_ICE_CREAM_BLOCK.get(), NeapolitanBlocks.ADZUKI_SOIL.get());
		this.tag(BlockTags.SLABS).add(NeapolitanBlocks.CHOCOLATE_BRICK_SLAB.get(), NeapolitanBlocks.CHOCOLATE_TILE_SLAB.get(), NeapolitanBlocks.FROND_THATCH_SLAB.get());
		this.tag(BlockTags.STAIRS).add(NeapolitanBlocks.CHOCOLATE_BRICK_STAIRS.get(), NeapolitanBlocks.CHOCOLATE_TILE_STAIRS.get(), NeapolitanBlocks.FROND_THATCH_STAIRS.get());
		this.tag(BlockTags.WALLS).add(NeapolitanBlocks.CHOCOLATE_BRICK_WALL.get(), NeapolitanBlocks.CHOCOLATE_TILE_WALL.get());

		this.tag(NeapolitanBlockTags.CHIMPANZEE_JUMPING_BLOCKS).addTag(BlockTags.BEDS).add(Blocks.SLIME_BLOCK);
		this.tag(NeapolitanBlockTags.UNAFFECTED_BY_MINT).add(NeapolitanBlocks.MINT.get());
		this.tag(NeapolitanBlockTags.VANILLA_PLANTABLE_ON).addTag(BlockTags.LEAVES).addTag(BlockTags.LOGS_THAT_BURN).addTag(BlockTags.DIRT);

		this.tag(BlueprintBlockTags.VERTICAL_SLABS).add(NeapolitanBlocks.CHOCOLATE_BRICK_VERTICAL_SLAB.get(), NeapolitanBlocks.CHOCOLATE_TILE_VERTICAL_SLAB.get(), NeapolitanBlocks.FROND_THATCH_VERTICAL_SLAB.get());
	}
}