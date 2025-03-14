
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hollowknightdecor.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.hollowknightdecor.HollowKnightDecorMod;

public class HollowKnightDecorModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HollowKnightDecorMod.MODID);
	public static final RegistryObject<Item> FOSSILSTONE = block(HollowKnightDecorModBlocks.FOSSILSTONE);
	public static final RegistryObject<Item> FOSSILSTONE_WITH_SHELLS = block(HollowKnightDecorModBlocks.FOSSILSTONE_WITH_SHELLS);
	public static final RegistryObject<Item> FOSSILSTONE_SLAB = block(HollowKnightDecorModBlocks.FOSSILSTONE_SLAB);
	public static final RegistryObject<Item> FOSSILSTONE_STAIRS = block(HollowKnightDecorModBlocks.FOSSILSTONE_STAIRS);
	public static final RegistryObject<Item> FOSSILSTONE_WALL = block(HollowKnightDecorModBlocks.FOSSILSTONE_WALL);
	public static final RegistryObject<Item> FOSSILSTONE_BRICKS = block(HollowKnightDecorModBlocks.FOSSILSTONE_BRICKS);
	public static final RegistryObject<Item> FOSSILSTONE_PILLAR = block(HollowKnightDecorModBlocks.FOSSILSTONE_PILLAR);
	public static final RegistryObject<Item> SMALL_FOSSILSTONE_PILLAR = block(HollowKnightDecorModBlocks.SMALL_FOSSILSTONE_PILLAR);
	public static final RegistryObject<Item> POLISHED_FOSSILSTONE = block(HollowKnightDecorModBlocks.POLISHED_FOSSILSTONE);
	public static final RegistryObject<Item> FOSSILSTONE_BRICKS_SLAB = block(HollowKnightDecorModBlocks.FOSSILSTONE_BRICKS_SLAB);
	public static final RegistryObject<Item> FOSSILSTONE_BRICKS_STAIRS = block(HollowKnightDecorModBlocks.FOSSILSTONE_BRICKS_STAIRS);
	public static final RegistryObject<Item> FOSSILSTONE_BRICKS_WALL = block(HollowKnightDecorModBlocks.FOSSILSTONE_BRICKS_WALL);
	public static final RegistryObject<Item> ORNATE_IRON_FENCE = block(HollowKnightDecorModBlocks.ORNATE_IRON_FENCE);
	public static final RegistryObject<Item> ORNATE_IRON_POST = block(HollowKnightDecorModBlocks.ORNATE_IRON_POST);
	public static final RegistryObject<Item> ORNATE_LUMAFLY_LANTERN = block(HollowKnightDecorModBlocks.ORNATE_LUMAFLY_LANTERN);
	public static final RegistryObject<Item> ORNATE_IRON_POST_SPEAR = block(HollowKnightDecorModBlocks.ORNATE_IRON_POST_SPEAR);
	public static final RegistryObject<Item> OLD_ORNATE_LUMAFLY_LANTERN = block(HollowKnightDecorModBlocks.OLD_ORNATE_LUMAFLY_LANTERN);
	public static final RegistryObject<Item> FOSSILSTONE_STALACTITE = block(HollowKnightDecorModBlocks.FOSSILSTONE_STALACTITE);
	public static final RegistryObject<Item> ORNATE_WINDOW = block(HollowKnightDecorModBlocks.ORNATE_WINDOW);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
