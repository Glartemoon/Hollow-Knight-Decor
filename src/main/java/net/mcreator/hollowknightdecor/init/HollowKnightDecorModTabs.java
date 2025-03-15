
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hollowknightdecor.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.hollowknightdecor.HollowKnightDecorMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HollowKnightDecorModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HollowKnightDecorMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(HollowKnightDecorModBlocks.ORNATE_BENCH.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(HollowKnightDecorModBlocks.FOSSILSTONE_STALACTITE.get().asItem());
			tabData.accept(HollowKnightDecorModBlocks.FOSSILSTONE.get().asItem());
			tabData.accept(HollowKnightDecorModBlocks.FOSSILSTONE_WITH_SHELLS.get().asItem());
			tabData.accept(HollowKnightDecorModBlocks.FOSSILSTONE_SLAB.get().asItem());
			tabData.accept(HollowKnightDecorModBlocks.FOSSILSTONE_STAIRS.get().asItem());
			tabData.accept(HollowKnightDecorModBlocks.FOSSILSTONE_WALL.get().asItem());
			tabData.accept(HollowKnightDecorModBlocks.FOSSILSTONE_BRICKS.get().asItem());
			tabData.accept(HollowKnightDecorModBlocks.FOSSILSTONE_PILLAR.get().asItem());
			tabData.accept(HollowKnightDecorModBlocks.FOSSILSTONE_BRICKS_SLAB.get().asItem());
			tabData.accept(HollowKnightDecorModBlocks.FOSSILSTONE_BRICKS_STAIRS.get().asItem());
			tabData.accept(HollowKnightDecorModBlocks.FOSSILSTONE_BRICKS_WALL.get().asItem());
			tabData.accept(HollowKnightDecorModBlocks.SMALL_FOSSILSTONE_PILLAR.get().asItem());
			tabData.accept(HollowKnightDecorModBlocks.FOSSILSTONE_SEAL.get().asItem());
			tabData.accept(HollowKnightDecorModBlocks.POLISHED_FOSSILSTONE.get().asItem());
			tabData.accept(HollowKnightDecorModBlocks.ORNATE_IRON_POST.get().asItem());
			tabData.accept(HollowKnightDecorModBlocks.ORNATE_IRON_POST_SPEAR.get().asItem());
			tabData.accept(HollowKnightDecorModBlocks.ORNATE_IRON_SEAL.get().asItem());
			tabData.accept(HollowKnightDecorModBlocks.ORNATE_LUMAFLY_LANTERN.get().asItem());
			tabData.accept(HollowKnightDecorModBlocks.ORNATE_DOUBLE_LUMAFLY_LANTERN.get().asItem());
			tabData.accept(HollowKnightDecorModBlocks.OLD_ORNATE_LUMAFLY_LANTERN.get().asItem());
			tabData.accept(HollowKnightDecorModBlocks.ORNATE_IRON_FENCE.get().asItem());
			tabData.accept(HollowKnightDecorModBlocks.ORNATE_WINDOW.get().asItem());
			tabData.accept(HollowKnightDecorModBlocks.WITHERED_ROYAL_WALLPAPER.get().asItem());
			tabData.accept(HollowKnightDecorModBlocks.ORNATE_BENCH.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(HollowKnightDecorModBlocks.FOSSILSTONE_STALACTITE.get().asItem());
			tabData.accept(HollowKnightDecorModBlocks.FOSSILSTONE.get().asItem());
			tabData.accept(HollowKnightDecorModBlocks.FOSSILSTONE_WITH_SHELLS.get().asItem());
			tabData.accept(HollowKnightDecorModBlocks.FOSSILSTONE_SLAB.get().asItem());
			tabData.accept(HollowKnightDecorModBlocks.FOSSILSTONE_STAIRS.get().asItem());
			tabData.accept(HollowKnightDecorModBlocks.FOSSILSTONE_WALL.get().asItem());
		}
	}
}
