package com.d3pend3ncy.api.event.containers.server;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.server.MapInitializeEventInterface;
import org.bukkit.event.server.MapInitializeEvent;

public class MapInitializeEventContainer extends ContainerEvent<MapInitializeEventInterface, MapInitializeEvent> {

    public MapInitializeEventContainer(MapInitializeEvent event) {
        super(event);
    }

    @Override
    protected void call(MapInitializeEventInterface listener, MapInitializeEvent event) {
        listener.onMapInitializeEvent(event);
    }

    @Override
    public Class<MapInitializeEventInterface> getListenerType() {
        return MapInitializeEventInterface.class;
    }
}
