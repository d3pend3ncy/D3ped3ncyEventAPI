package com.d3pend3ncy.api.event.containers.inventory;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.inventory.CraftItemEventInterface;
import org.bukkit.event.inventory.CraftItemEvent;

public class CraftItemEventContainer extends ContainerEvent<CraftItemEventInterface, CraftItemEvent> {

    public CraftItemEventContainer(CraftItemEvent event) {
        super(event);
    }

    @Override
    protected void call(CraftItemEventInterface listener, CraftItemEvent event) {
        listener.onCraftItemEvent(event);
    }

    @Override
    public Class<CraftItemEventInterface> getListenerType() {
        return CraftItemEventInterface.class;
    }
}
