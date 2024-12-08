
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.campermc.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.campermc.client.gui.CraftingMenuScreen;
import net.mcreator.campermc.client.gui.CampsiteHubGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CampermcModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(CampermcModMenus.CAMPSITE_HUB_GUI.get(), CampsiteHubGUIScreen::new);
			MenuScreens.register(CampermcModMenus.CRAFTING_MENU.get(), CraftingMenuScreen::new);
		});
	}
}
