package com.d3pend3ncy.api.event.containers.server;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.server.ServerCommandEventInterface;
import org.bukkit.event.server.ServerCommandEvent;

public class ServerCommandEventContainer extends ContainerEvent<ServerCommandEventInterface, ServerCommandEvent> {

    public ServerCommandEventContainer(ServerCommandEvent event) {
        super(event);
    }

    @Override
    protected void call(ServerCommandEventInterface listener, ServerCommandEvent event) {
        listener.onServerCommandEvent(event);
    }

    @Override
    public Class<ServerCommandEventInterface> getListenerType() {
        return ServerCommandEventInterface.class;
    }
}
