package com.d3pend3ncy.api.event.containers.inventory;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.inventory.PrepareAnvilEventInterface;
import org.bukkit.event.inventory.PrepareAnvilEvent;

public class PrepareAnvilEventContainer extends ContainerEvent<PrepareAnvilEventInterface, PrepareAnvilEvent> {

    public PrepareAnvilEventContainer(PrepareAnvilEvent event) {
        super(event);
    }

    @Override
    protected void call(PrepareAnvilEventInterface listener, PrepareAnvilEvent event) {
        listener.onPrepareAnvilEvent(event);
    }

    @Override
    public Class<PrepareAnvilEventInterface> getListenerType() {
        return PrepareAnvilEventInterface.class;
    }
}
