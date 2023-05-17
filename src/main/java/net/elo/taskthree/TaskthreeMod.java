package net.elo.taskthree;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.common.MinecraftForge;
import net.elo.taskthree.init.TaskthreeModTabs;
import net.elo.taskthree.init.TaskthreeModItems;
import net.elo.taskthree.init.TaskthreeModFeatures;
import net.elo.taskthree.init.TaskthreeModBlocks;


@Mod("taskthree")
public class TaskthreeMod {
    public static final Logger LOGGER = LogManager.getLogger(TaskthreeMod.class);
    public static final String MODID = "taskthree";

    public TaskthreeMod() {
        MinecraftForge.EVENT_BUS.register(this);
        TaskthreeModTabs.load();
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        TaskthreeModBlocks.REGISTRY.register(bus);
        TaskthreeModItems.REGISTRY.register(bus);

        TaskthreeModFeatures.REGISTRY.register(bus);


    }

}
