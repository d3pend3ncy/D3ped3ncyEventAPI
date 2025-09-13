package com.d3pend3ncy.api.event.containers.server;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.server.PluginDisableEventInterface;
import org.bukkit.event.server.PluginDisableEvent;

public class PluginDisableEventContainer extends ContainerEvent<PluginDisableEventInterface, PluginDisableEvent> {

    public PluginDisableEventContainer(PluginDisableEvent event) {
        super(event);
    }

    @Override
    protected void call(PluginDisableEventInterface listener, PluginDisableEvent event) {
        listener.onPluginDisableEvent(event);
    }

    @Override
    public Class<PluginDisableEventInterface> getListenerType() {
        return PluginDisableEventInterface.class;
    }
}
