package com.d3pend3ncy.api.event.containers.world;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.world.WorldSaveEventInterface;
import org.bukkit.event.world.WorldSaveEvent;

public class WorldSaveEventContainer extends ContainerEvent<WorldSaveEventInterface, WorldSaveEvent> {

    public WorldSaveEventContainer(WorldSaveEvent event) {
        super(event);
    }

    @Override
    protected void call(WorldSaveEventInterface listener, WorldSaveEvent event) {
        listener.onWorldSaveEvent(event);
    }

    @Override
    public Class<WorldSaveEventInterface> getListenerType() {
        return WorldSaveEventInterface.class;
    }
}
