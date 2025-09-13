package com.d3pend3ncy.api.event.containers.server;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.server.PluginEnableEventInterface;
import org.bukkit.event.server.PluginEnableEvent;

public class PluginEnableEventContainer extends ContainerEvent<PluginEnableEventInterface, PluginEnableEvent> {

    public PluginEnableEventContainer(PluginEnableEvent event) {
        super(event);
    }

    @Override
    protected void call(PluginEnableEventInterface listener, PluginEnableEvent event) {
        listener.onPluginEnableEvent(event);
    }

    @Override
    public Class<PluginEnableEventInterface> getListenerType() {
        return PluginEnableEventInterface.class;
    }
}
