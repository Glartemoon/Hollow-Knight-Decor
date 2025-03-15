package net.mcreator.hollowknightdecor.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.hollowknightdecor.block.entity.OrnateWindowTileEntity;

public class OrnateWindowBlockModel extends GeoModel<OrnateWindowTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OrnateWindowTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("hollow_knight_decor", "animations/ornatewindow.animation.json");
		return new ResourceLocation("hollow_knight_decor", "animations/ornatewindow.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OrnateWindowTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("hollow_knight_decor", "geo/ornatewindow.geo.json");
		return new ResourceLocation("hollow_knight_decor", "geo/ornatewindow.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OrnateWindowTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("hollow_knight_decor", "textures/block/ornatewindow1top.png");
		return new ResourceLocation("hollow_knight_decor", "textures/block/ornatewindow1center.png");
	}
}
