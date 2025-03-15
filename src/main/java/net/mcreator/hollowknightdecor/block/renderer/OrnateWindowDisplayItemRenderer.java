package net.mcreator.hollowknightdecor.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.hollowknightdecor.block.model.OrnateWindowDisplayModel;
import net.mcreator.hollowknightdecor.block.display.OrnateWindowDisplayItem;

public class OrnateWindowDisplayItemRenderer extends GeoItemRenderer<OrnateWindowDisplayItem> {
	public OrnateWindowDisplayItemRenderer() {
		super(new OrnateWindowDisplayModel());
	}

	@Override
	public RenderType getRenderType(OrnateWindowDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
