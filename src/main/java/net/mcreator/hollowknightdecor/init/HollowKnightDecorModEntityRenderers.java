
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hollowknightdecor.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.hollowknightdecor.client.renderer.BenchMonsterRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HollowKnightDecorModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(HollowKnightDecorModEntities.BENCH_MONSTER.get(), BenchMonsterRenderer::new);
	}
}
