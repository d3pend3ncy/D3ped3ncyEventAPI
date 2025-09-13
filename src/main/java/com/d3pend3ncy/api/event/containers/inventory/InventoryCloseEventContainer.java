package com.d3pend3ncy.api.event.containers.inventory;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.inventory.InventoryCloseEventInterface;
import org.bukkit.event.inventory.InventoryCloseEvent;

public class InventoryCloseEventContainer extends ContainerEvent<InventoryCloseEventInterface, InventoryCloseEvent> {

    public InventoryCloseEventContainer(InventoryCloseEvent event) {
        super(event);
    }

    @Override
    protected void call(InventoryCloseEventInterface listener, InventoryCloseEvent event) {
        listener.onInventoryCloseEvent(event);
    }

    @Override
    public Class<InventoryCloseEventInterface> getListenerType() {
        return InventoryCloseEventInterface.class;
    }
}
