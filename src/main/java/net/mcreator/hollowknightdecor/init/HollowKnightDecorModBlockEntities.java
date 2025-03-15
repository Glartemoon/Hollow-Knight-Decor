
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hollowknightdecor.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.hollowknightdecor.block.entity.OrnateWindowTileEntity;
import net.mcreator.hollowknightdecor.HollowKnightDecorMod;

public class HollowKnightDecorModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, HollowKnightDecorMod.MODID);
	public static final RegistryObject<BlockEntityType<OrnateWindowTileEntity>> ORNATE_WINDOW = REGISTRY.register("ornate_window",
			() -> BlockEntityType.Builder.of(OrnateWindowTileEntity::new, HollowKnightDecorModBlocks.ORNATE_WINDOW.get()).build(null));

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
