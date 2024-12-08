
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.campermc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.campermc.block.entity.CuttingboardBlockEntity;
import net.mcreator.campermc.block.entity.CampsitehubBlockEntity;
import net.mcreator.campermc.CampermcMod;

public class CampermcModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CampermcMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> CAMPSITEHUB = register("campsitehub", CampermcModBlocks.CAMPSITEHUB, CampsitehubBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CUTTINGBOARD = register("cuttingboard", CampermcModBlocks.CUTTINGBOARD, CuttingboardBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
