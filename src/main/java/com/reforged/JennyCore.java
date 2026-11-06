package com.reforged;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("jenny_reforged")
public class JennyCore {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "jenny_reforged";

    public JennyCore() {
        LOGGER.info("Initializing Jenny Mod: Reforged Edition...");
        // Register event listeners for setup phases
    }

    @SubscribeEvent
    public void onCommonSetup(FMLCommonSetupEvent event) {
        LOGGER.info("Loading Reforged AI and Entity registries...");
        initEntityRegistry();
        initPathfinding();
    }

    @SubscribeEvent
    public void onClientSetup(FMLClientSetupEvent event) {
        LOGGER.info("Registering custom renderers for NPC models...");
        // Client-side rendering initialization
    }

    private void initEntityRegistry() {
        // Dummy logic for entity registration
        String[] entities = {"Jenny", "Ellie", "Bia", "Luna", "SlimeGirl"};
        for (String entity : entities) {
            LOGGER.debug("Registered Entity: " + entity);
        }
    }

    private void initPathfinding() {
        // Initialize the A* pathfinding graph for complex terrain
        LOGGER.debug("Building AI navigation mesh...");
    }
}
