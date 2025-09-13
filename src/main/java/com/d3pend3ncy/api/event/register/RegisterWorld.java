package com.d3pend3ncy.api.event.register;

import com.d3pend3ncy.api.event.core.eventManager;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.world.*;
import com.d3pend3ncy.api.event.containers.world.*;

public class RegisterWorld implements Listener {

    public RegisterWorld() {}

    @EventHandler
    public void onChunkLoadEvent(ChunkLoadEvent event) {
        ChunkLoadEventContainer container = new ChunkLoadEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onChunkUnloadEvent(ChunkUnloadEvent event) {
        ChunkUnloadEventContainer container = new ChunkUnloadEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPortalCreateEvent(PortalCreateEvent event) {
        PortalCreateEventContainer container = new PortalCreateEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onStructureGrowEvent(StructureGrowEvent event) {
        StructureGrowEventContainer container = new StructureGrowEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onWorldInitEvent(WorldInitEvent event) {
        WorldInitEventContainer container = new WorldInitEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onWorldLoadEvent(WorldLoadEvent event) {
        WorldLoadEventContainer container = new WorldLoadEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onWorldSaveEvent(WorldSaveEvent event) {
        WorldSaveEventContainer container = new WorldSaveEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onWorldUnloadEvent(WorldUnloadEvent event) {
        WorldUnloadEventContainer container = new WorldUnloadEventContainer(event);
        eventManager.fire(container);
    }

}
