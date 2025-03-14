
package net.mcreator.hollowknightdecor.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.hollowknightdecor.procedures.FossilstoneWithFossilsStartProcedure;

public class OrnateWindowBlock extends Block {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 1);
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public OrnateWindowBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GLASS).strength(2f, 10f).lightLevel(s -> (new Object() {
			public int getLightLevel() {
				if (s.getValue(BLOCKSTATE) == 1)
					return 0;
				return 0;
			}
		}.getLightLevel())).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		if (state.getValue(BLOCKSTATE) == 1) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(6.5, 7, -2.5, 9.5, 11, 0.5), box(-1, 0, -1, 17, 16, 2), box(-16, 0, 2, 2, 16, 5), box(14, 0, 2, 32, 16, 5));
				case NORTH -> Shapes.or(box(6.5, 7, 15.5, 9.5, 11, 18.5), box(-1, 0, 14, 17, 16, 17), box(14, 0, 11, 32, 16, 14), box(-16, 0, 11, 2, 16, 14));
				case EAST -> Shapes.or(box(-2.5, 7, 6.5, 0.5, 11, 9.5), box(-1, 0, -1, 2, 16, 17), box(2, 0, 14, 5, 16, 32), box(2, 0, -16, 5, 16, 2));
				case WEST -> Shapes.or(box(15.5, 7, 6.5, 18.5, 11, 9.5), box(14, 0, -1, 17, 16, 17), box(11, 0, -16, 14, 16, 2), box(11, 0, 14, 14, 16, 32));
			};
		}
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(6.5, 11, -2.5, 9.5, 15, 0.5), box(-1, 0, -1, 17, 16, 2), box(-16, 0, 2, 2, 16, 5), box(14, 0, 2, 32, 16, 5));
			case NORTH -> Shapes.or(box(6.5, 11, 15.5, 9.5, 15, 18.5), box(-1, 0, 14, 17, 16, 17), box(14, 0, 11, 32, 16, 14), box(-16, 0, 11, 2, 16, 14));
			case EAST -> Shapes.or(box(-2.5, 11, 6.5, 0.5, 15, 9.5), box(-1, 0, -1, 2, 16, 17), box(2, 0, 14, 5, 16, 32), box(2, 0, -16, 5, 16, 2));
			case WEST -> Shapes.or(box(15.5, 11, 6.5, 18.5, 15, 9.5), box(14, 0, -1, 17, 16, 17), box(11, 0, -16, 14, 16, 2), box(11, 0, 14, 14, 16, 32));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING, BLOCKSTATE);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return super.getStateForPlacement(context).setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		FossilstoneWithFossilsStartProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
		FossilstoneWithFossilsStartProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}
