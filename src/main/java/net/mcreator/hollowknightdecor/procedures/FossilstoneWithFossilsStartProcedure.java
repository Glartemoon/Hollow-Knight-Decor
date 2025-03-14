package net.mcreator.hollowknightdecor.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class FossilstoneWithFossilsStartProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			Direction _dir = Direction.getRandom(RandomSource.create());
			BlockPos _pos = BlockPos.containing(x, y, z);
			BlockState _bs = world.getBlockState(_pos);
			Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
			if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
				world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
			} else {
				_property = _bs.getBlock().getStateDefinition().getProperty("axis");
				if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
					world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
			}
		}
		{
			int _value = Mth.nextInt(RandomSource.create(), 0, 1);
			BlockPos _pos = BlockPos.containing(x, y, z);
			BlockState _bs = world.getBlockState(_pos);
			if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
				world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
		}
	}
}
