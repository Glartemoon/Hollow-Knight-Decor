
package net.mcreator.hollowknightdecor.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class FossilstoneBricksSlabBlock extends SlabBlock {
	public FossilstoneBricksSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(4f, 20f).requiresCorrectToolForDrops().dynamicShape());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}
}
