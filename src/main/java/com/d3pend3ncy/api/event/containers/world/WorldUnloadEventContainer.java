package com.d3pend3ncy.api.event.containers.world;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.world.WorldUnloadEventInterface;
import org.bukkit.event.world.WorldUnloadEvent;

public class WorldUnloadEventContainer extends ContainerEvent<WorldUnloadEventInterface, WorldUnloadEvent> {

    public WorldUnloadEventContainer(WorldUnloadEvent event) {
        super(event);
    }

    @Override
    protected void call(WorldUnloadEventInterface listener, WorldUnloadEvent event) {
        listener.onWorldUnloadEvent(event);
    }

    @Override
    public Class<WorldUnloadEventInterface> getListenerType() {
        return WorldUnloadEventInterface.class;
    }
}
