
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.elo.taskthree.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.elo.taskthree.world.features.plants.TeaFlowerFeature;
import net.elo.taskthree.world.features.ores.BlackTeaOreOreFeature;
import net.elo.taskthree.TaskthreeMod;

@Mod.EventBusSubscriber
public class TaskthreeModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, TaskthreeMod.MODID);
	public static final RegistryObject<Feature<?>> BLACK_TEA_ORE_ORE = REGISTRY.register("black_tea_ore_ore", BlackTeaOreOreFeature::feature);
	public static final RegistryObject<Feature<?>> TEA_FLOWER = REGISTRY.register("tea_flower", TeaFlowerFeature::feature);
}
