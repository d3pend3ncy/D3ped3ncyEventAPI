package com.d3pend3ncy.api.event.containers.server;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.server.ServerListPingEventInterface;
import org.bukkit.event.server.ServerListPingEvent;

public class ServerListPingEventContainer extends ContainerEvent<ServerListPingEventInterface, ServerListPingEvent> {

    public ServerListPingEventContainer(ServerListPingEvent event) {
        super(event);
    }

    @Override
    protected void call(ServerListPingEventInterface listener, ServerListPingEvent event) {
        listener.onServerListPingEvent(event);
    }

    @Override
    public Class<ServerListPingEventInterface> getListenerType() {
        return ServerListPingEventInterface.class;
    }
}
