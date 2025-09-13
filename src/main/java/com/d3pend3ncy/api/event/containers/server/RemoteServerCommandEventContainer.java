package com.d3pend3ncy.api.event.containers.server;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.server.RemoteServerCommandEventInterface;
import org.bukkit.event.server.RemoteServerCommandEvent;

public class RemoteServerCommandEventContainer extends ContainerEvent<RemoteServerCommandEventInterface, RemoteServerCommandEvent> {

    public RemoteServerCommandEventContainer(RemoteServerCommandEvent event) {
        super(event);
    }

    @Override
    protected void call(RemoteServerCommandEventInterface listener, RemoteServerCommandEvent event) {
        listener.onRemoteServerCommandEvent(event);
    }

    @Override
    public Class<RemoteServerCommandEventInterface> getListenerType() {
        return RemoteServerCommandEventInterface.class;
    }
}
