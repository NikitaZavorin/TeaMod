
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.taskthree.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.taskthree.world.inventory.TeaBagGUIMenu;
import net.mcreator.taskthree.TaskthreeMod;

public class TaskthreeModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, TaskthreeMod.MODID);
	public static final RegistryObject<MenuType<TeaBagGUIMenu>> TEA_BAG_GUI = REGISTRY.register("tea_bag_gui", () -> IForgeMenuType.create(TeaBagGUIMenu::new));
}
