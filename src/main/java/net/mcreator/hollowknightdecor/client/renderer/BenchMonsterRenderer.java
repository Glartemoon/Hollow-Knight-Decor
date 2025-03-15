
package net.mcreator.hollowknightdecor.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.hollowknightdecor.entity.BenchMonsterEntity;

public class BenchMonsterRenderer extends HumanoidMobRenderer<BenchMonsterEntity, HumanoidModel<BenchMonsterEntity>> {
	public BenchMonsterRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<BenchMonsterEntity>(context.bakeLayer(ModelLayers.PLAYER)), 1.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(BenchMonsterEntity entity) {
		return new ResourceLocation("hollow_knight_decor:textures/entities/void.png");
	}
}
