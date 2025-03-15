package net.mcreator.hollowknightdecor.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.hollowknightdecor.init.HollowKnightDecorModBlockEntities;
import net.mcreator.hollowknightdecor.block.renderer.OrnateWindowTileRenderer;
import net.mcreator.hollowknightdecor.HollowKnightDecorMod;

@Mod.EventBusSubscriber(modid = HollowKnightDecorMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(HollowKnightDecorModBlockEntities.ORNATE_WINDOW.get(), context -> new OrnateWindowTileRenderer());
	}
}
