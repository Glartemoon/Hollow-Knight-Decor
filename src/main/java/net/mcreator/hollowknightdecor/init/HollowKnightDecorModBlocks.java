
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hollowknightdecor.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.hollowknightdecor.block.WitheredRoyalWallpaperBlock;
import net.mcreator.hollowknightdecor.block.SmallFossilstonePillarBlock;
import net.mcreator.hollowknightdecor.block.PolishedFossilstoneBlock;
import net.mcreator.hollowknightdecor.block.OrnateWindowBlock;
import net.mcreator.hollowknightdecor.block.OrnateLumaflyLanternBlock;
import net.mcreator.hollowknightdecor.block.OrnateIronSealBlock;
import net.mcreator.hollowknightdecor.block.OrnateIronPostSpearBlock;
import net.mcreator.hollowknightdecor.block.OrnateIronPostBlock;
import net.mcreator.hollowknightdecor.block.OrnateIronFenceBlock;
import net.mcreator.hollowknightdecor.block.OrnateDoubleLumaflyLanternBlock;
import net.mcreator.hollowknightdecor.block.OrnateBenchBlock;
import net.mcreator.hollowknightdecor.block.OldOrnateLumaflyLanternBlock;
import net.mcreator.hollowknightdecor.block.FossilstoneWithShellsBlock;
import net.mcreator.hollowknightdecor.block.FossilstoneWallBlock;
import net.mcreator.hollowknightdecor.block.FossilstoneStalactiteBlock;
import net.mcreator.hollowknightdecor.block.FossilstoneStairsBlock;
import net.mcreator.hollowknightdecor.block.FossilstoneSlabBlock;
import net.mcreator.hollowknightdecor.block.FossilstoneSealBlock;
import net.mcreator.hollowknightdecor.block.FossilstonePillarBlock;
import net.mcreator.hollowknightdecor.block.FossilstoneBricksWallBlock;
import net.mcreator.hollowknightdecor.block.FossilstoneBricksStairsBlock;
import net.mcreator.hollowknightdecor.block.FossilstoneBricksSlabBlock;
import net.mcreator.hollowknightdecor.block.FossilstoneBricksBlock;
import net.mcreator.hollowknightdecor.block.FossilstoneBlock;
import net.mcreator.hollowknightdecor.HollowKnightDecorMod;

public class HollowKnightDecorModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, HollowKnightDecorMod.MODID);
	public static final RegistryObject<Block> FOSSILSTONE = REGISTRY.register("fossilstone", () -> new FossilstoneBlock());
	public static final RegistryObject<Block> FOSSILSTONE_WITH_SHELLS = REGISTRY.register("fossilstone_with_shells", () -> new FossilstoneWithShellsBlock());
	public static final RegistryObject<Block> FOSSILSTONE_SLAB = REGISTRY.register("fossilstone_slab", () -> new FossilstoneSlabBlock());
	public static final RegistryObject<Block> FOSSILSTONE_STAIRS = REGISTRY.register("fossilstone_stairs", () -> new FossilstoneStairsBlock());
	public static final RegistryObject<Block> FOSSILSTONE_WALL = REGISTRY.register("fossilstone_wall", () -> new FossilstoneWallBlock());
	public static final RegistryObject<Block> FOSSILSTONE_BRICKS = REGISTRY.register("fossilstone_bricks", () -> new FossilstoneBricksBlock());
	public static final RegistryObject<Block> FOSSILSTONE_PILLAR = REGISTRY.register("fossilstone_pillar", () -> new FossilstonePillarBlock());
	public static final RegistryObject<Block> SMALL_FOSSILSTONE_PILLAR = REGISTRY.register("small_fossilstone_pillar", () -> new SmallFossilstonePillarBlock());
	public static final RegistryObject<Block> POLISHED_FOSSILSTONE = REGISTRY.register("polished_fossilstone", () -> new PolishedFossilstoneBlock());
	public static final RegistryObject<Block> FOSSILSTONE_BRICKS_SLAB = REGISTRY.register("fossilstone_bricks_slab", () -> new FossilstoneBricksSlabBlock());
	public static final RegistryObject<Block> FOSSILSTONE_BRICKS_STAIRS = REGISTRY.register("fossilstone_bricks_stairs", () -> new FossilstoneBricksStairsBlock());
	public static final RegistryObject<Block> FOSSILSTONE_BRICKS_WALL = REGISTRY.register("fossilstone_bricks_wall", () -> new FossilstoneBricksWallBlock());
	public static final RegistryObject<Block> ORNATE_IRON_FENCE = REGISTRY.register("ornate_iron_fence", () -> new OrnateIronFenceBlock());
	public static final RegistryObject<Block> ORNATE_IRON_POST = REGISTRY.register("ornate_iron_post", () -> new OrnateIronPostBlock());
	public static final RegistryObject<Block> ORNATE_LUMAFLY_LANTERN = REGISTRY.register("ornate_lumafly_lantern", () -> new OrnateLumaflyLanternBlock());
	public static final RegistryObject<Block> ORNATE_IRON_POST_SPEAR = REGISTRY.register("ornate_iron_post_spear", () -> new OrnateIronPostSpearBlock());
	public static final RegistryObject<Block> OLD_ORNATE_LUMAFLY_LANTERN = REGISTRY.register("old_ornate_lumafly_lantern", () -> new OldOrnateLumaflyLanternBlock());
	public static final RegistryObject<Block> FOSSILSTONE_STALACTITE = REGISTRY.register("fossilstone_stalactite", () -> new FossilstoneStalactiteBlock());
	public static final RegistryObject<Block> ORNATE_WINDOW = REGISTRY.register("ornate_window", () -> new OrnateWindowBlock());
	public static final RegistryObject<Block> ORNATE_IRON_SEAL = REGISTRY.register("ornate_iron_seal", () -> new OrnateIronSealBlock());
	public static final RegistryObject<Block> FOSSILSTONE_SEAL = REGISTRY.register("fossilstone_seal", () -> new FossilstoneSealBlock());
	public static final RegistryObject<Block> ORNATE_DOUBLE_LUMAFLY_LANTERN = REGISTRY.register("ornate_double_lumafly_lantern", () -> new OrnateDoubleLumaflyLanternBlock());
	public static final RegistryObject<Block> WITHERED_ROYAL_WALLPAPER = REGISTRY.register("withered_royal_wallpaper", () -> new WitheredRoyalWallpaperBlock());
	public static final RegistryObject<Block> ORNATE_BENCH = REGISTRY.register("ornate_bench", () -> new OrnateBenchBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
