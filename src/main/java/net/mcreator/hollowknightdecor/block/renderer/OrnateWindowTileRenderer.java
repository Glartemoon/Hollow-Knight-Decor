package net.mcreator.hollowknightdecor.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.hollowknightdecor.block.model.OrnateWindowBlockModel;
import net.mcreator.hollowknightdecor.block.entity.OrnateWindowTileEntity;

public class OrnateWindowTileRenderer extends GeoBlockRenderer<OrnateWindowTileEntity> {
	public OrnateWindowTileRenderer() {
		super(new OrnateWindowBlockModel());
	}

	@Override
	public RenderType getRenderType(OrnateWindowTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
