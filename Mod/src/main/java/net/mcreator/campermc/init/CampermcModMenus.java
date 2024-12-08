
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.campermc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.campermc.world.inventory.CraftingMenuMenu;
import net.mcreator.campermc.world.inventory.CampsiteHubGUIMenu;
import net.mcreator.campermc.CampermcMod;

public class CampermcModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, CampermcMod.MODID);
	public static final RegistryObject<MenuType<CampsiteHubGUIMenu>> CAMPSITE_HUB_GUI = REGISTRY.register("campsite_hub_gui", () -> IForgeMenuType.create(CampsiteHubGUIMenu::new));
	public static final RegistryObject<MenuType<CraftingMenuMenu>> CRAFTING_MENU = REGISTRY.register("crafting_menu", () -> IForgeMenuType.create(CraftingMenuMenu::new));
}
