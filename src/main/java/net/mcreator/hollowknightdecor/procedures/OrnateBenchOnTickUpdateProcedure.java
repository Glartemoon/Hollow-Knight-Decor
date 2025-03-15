package net.mcreator.hollowknightdecor.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.network.chat.Component;

public class OrnateBenchOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("/tp @p[type=hollow_knight_decor:bench_monster] " + x + " " + y + " " + z)), false);
	}
}
