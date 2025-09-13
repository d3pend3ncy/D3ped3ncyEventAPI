package com.d3pend3ncy.api.event.containers.server;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.server.BroadcastMessageEventInterface;
import org.bukkit.event.server.BroadcastMessageEvent;

public class BroadcastMessageEventContainer extends ContainerEvent<BroadcastMessageEventInterface, BroadcastMessageEvent> {

    public BroadcastMessageEventContainer(BroadcastMessageEvent event) {
        super(event);
    }

    @Override
    protected void call(BroadcastMessageEventInterface listener, BroadcastMessageEvent event) {
        listener.onBroadcastMessageEvent(event);
    }

    @Override
    public Class<BroadcastMessageEventInterface> getListenerType() {
        return BroadcastMessageEventInterface.class;
    }
}
