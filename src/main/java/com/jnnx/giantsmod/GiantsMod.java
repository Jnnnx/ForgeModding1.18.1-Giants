package com.jnnx.giantsmod;

import com.jnnx.giantsmod.core.init.EntityInit;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(value = GiantsMod.MODID)
public class GiantsMod {
    public static final String MODID = "giantsmod";

    //Directly reference a log4j logger
    private static final Logger LOGGER = LogManager.getLogger();

    public GiantsMod() {
        //Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        //Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);


        var bus = FMLJavaModLoadingContext.get().getModEventBus();

        EntityInit.ENTITIES.register(bus);
    }

    private void setup(final FMLCommonSetupEvent event){
        //some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
