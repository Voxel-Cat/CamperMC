
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.campermc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.campermc.CampermcMod;

public class CampermcModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CampermcMod.MODID);
	public static final RegistryObject<CreativeModeTab> CAMPING_GEAR = REGISTRY.register("camping_gear",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.campermc.camping_gear")).icon(() -> new ItemStack(Blocks.CAMPFIRE)).displayItems((parameters, tabData) -> {
				tabData.accept(CampermcModBlocks.CAMPSITEHUB.get().asItem());
				tabData.accept(CampermcModBlocks.CUTTINGBOARD.get().asItem());
			})

					.build());
}
