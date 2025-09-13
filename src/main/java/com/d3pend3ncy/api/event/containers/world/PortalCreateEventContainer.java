package com.d3pend3ncy.api.event.containers.world;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.world.PortalCreateEventInterface;
import org.bukkit.event.world.PortalCreateEvent;

public class PortalCreateEventContainer extends ContainerEvent<PortalCreateEventInterface, PortalCreateEvent> {

    public PortalCreateEventContainer(PortalCreateEvent event) {
        super(event);
    }

    @Override
    protected void call(PortalCreateEventInterface listener, PortalCreateEvent event) {
        listener.onPortalCreateEvent(event);
    }

    @Override
    public Class<PortalCreateEventInterface> getListenerType() {
        return PortalCreateEventInterface.class;
    }
}
