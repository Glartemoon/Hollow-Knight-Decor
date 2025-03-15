package net.mcreator.hollowknightdecor.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.hollowknightdecor.block.display.OrnateWindowDisplayItem;

public class OrnateWindowDisplayModel extends GeoModel<OrnateWindowDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OrnateWindowDisplayItem animatable) {
		return new ResourceLocation("hollow_knight_decor", "animations/ornatewindow.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OrnateWindowDisplayItem animatable) {
		return new ResourceLocation("hollow_knight_decor", "geo/ornatewindow.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OrnateWindowDisplayItem entity) {
		return new ResourceLocation("hollow_knight_decor", "textures/block/ornatewindow1center.png");
	}
}
