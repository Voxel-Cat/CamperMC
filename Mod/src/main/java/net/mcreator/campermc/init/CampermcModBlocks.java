
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.campermc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.campermc.block.CuttingboardBlock;
import net.mcreator.campermc.block.CampsitehubBlock;
import net.mcreator.campermc.CampermcMod;

public class CampermcModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CampermcMod.MODID);
	public static final RegistryObject<Block> CAMPSITEHUB = REGISTRY.register("campsitehub", () -> new CampsitehubBlock());
	public static final RegistryObject<Block> CUTTINGBOARD = REGISTRY.register("cuttingboard", () -> new CuttingboardBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
