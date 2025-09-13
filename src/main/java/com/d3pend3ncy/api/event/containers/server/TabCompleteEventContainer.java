package com.d3pend3ncy.api.event.containers.server;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.server.TabCompleteEventInterface;
import org.bukkit.event.server.TabCompleteEvent;

public class TabCompleteEventContainer extends ContainerEvent<TabCompleteEventInterface, TabCompleteEvent> {

    public TabCompleteEventContainer(TabCompleteEvent event) {
        super(event);
    }

    @Override
    protected void call(TabCompleteEventInterface listener, TabCompleteEvent event) {
        listener.onTabCompleteEvent(event);
    }

    @Override
    public Class<TabCompleteEventInterface> getListenerType() {
        return TabCompleteEventInterface.class;
    }
}
