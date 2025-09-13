package com.d3pend3ncy.api.event.containers.world;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.world.WorldLoadEventInterface;
import org.bukkit.event.world.WorldLoadEvent;

public class WorldLoadEventContainer extends ContainerEvent<WorldLoadEventInterface, WorldLoadEvent> {

    public WorldLoadEventContainer(WorldLoadEvent event) {
        super(event);
    }

    @Override
    protected void call(WorldLoadEventInterface listener, WorldLoadEvent event) {
        listener.onWorldLoadEvent(event);
    }

    @Override
    public Class<WorldLoadEventInterface> getListenerType() {
        return WorldLoadEventInterface.class;
    }
}
