
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.elo.taskthree.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.elo.taskthree.item.TeaBagItem;
import net.elo.taskthree.item.TeaAxeItem;
import net.elo.taskthree.item.BlackTeaSwordItem;
import net.elo.taskthree.item.BlackTeaPickaxeItem;
import net.elo.taskthree.item.BlackTeaOreDustItem;
import net.elo.taskthree.item.BlackArmorItem;
import net.elo.taskthree.TaskthreeMod;

public class TaskthreeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TaskthreeMod.MODID);
	public static final RegistryObject<Item> BLACK_TEA_ORE_BLOCK = block(TaskthreeModBlocks.BLACK_TEA_ORE_BLOCK, TaskthreeModTabs.TAB_TEAS);
	public static final RegistryObject<Item> BLACK_TEA_ORE_ORE = block(TaskthreeModBlocks.BLACK_TEA_ORE_ORE, TaskthreeModTabs.TAB_TEAS);
	public static final RegistryObject<Item> BLACK_TEA_ORE_DUST = REGISTRY.register("black_tea_ore_dust", () -> new BlackTeaOreDustItem());
	public static final RegistryObject<Item> BLACK_TEA_PICKAXE = REGISTRY.register("black_tea_pickaxe", () -> new BlackTeaPickaxeItem());
	public static final RegistryObject<Item> BLACK_TEA_SWORD = REGISTRY.register("black_tea_sword", () -> new BlackTeaSwordItem());
	public static final RegistryObject<Item> TEA_AXE = REGISTRY.register("tea_axe", () -> new TeaAxeItem());
	public static final RegistryObject<Item> TEA_FLOWER = block(TaskthreeModBlocks.TEA_FLOWER, TaskthreeModTabs.TAB_TEAS);
	public static final RegistryObject<Item> BLACK_ARMOR_HELMET = REGISTRY.register("black_armor_helmet", () -> new BlackArmorItem.Helmet());
	public static final RegistryObject<Item> BLACK_ARMOR_CHESTPLATE = REGISTRY.register("black_armor_chestplate", () -> new BlackArmorItem.Chestplate());
	public static final RegistryObject<Item> BLACK_ARMOR_LEGGINGS = REGISTRY.register("black_armor_leggings", () -> new BlackArmorItem.Leggings());
	public static final RegistryObject<Item> BLACK_ARMOR_BOOTS = REGISTRY.register("black_armor_boots", () -> new BlackArmorItem.Boots());
	public static final RegistryObject<Item> TEA_BAG = REGISTRY.register("tea_bag", () -> new TeaBagItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
