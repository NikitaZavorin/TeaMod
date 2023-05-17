
package net.elo.taskthree.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.elo.taskthree.block.TeaFlowerBlock;
import net.elo.taskthree.block.BlackTeaOreOreBlock;
import net.elo.taskthree.block.BlackTeaOreBlockBlock;
import net.elo.taskthree.TaskthreeMod;

public class TaskthreeModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TaskthreeMod.MODID);
	public static final RegistryObject<Block> BLACK_TEA_ORE_BLOCK = REGISTRY.register("black_tea_ore_block", () -> new BlackTeaOreBlockBlock());
	public static final RegistryObject<Block> BLACK_TEA_ORE_ORE = REGISTRY.register("black_tea_ore_ore", () -> new BlackTeaOreOreBlock());
	public static final RegistryObject<Block> TEA_FLOWER = REGISTRY.register("tea_flower", () -> new TeaFlowerBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			TeaFlowerBlock.blockColorLoad(event);
		}
	}
}
