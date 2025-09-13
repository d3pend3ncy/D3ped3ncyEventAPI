package com.d3pend3ncy.api.event.containers.inventory;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.inventory.InventoryPickupItemEventInterface;
import org.bukkit.event.inventory.InventoryPickupItemEvent;

public class InventoryPickupItemEventContainer extends ContainerEvent<InventoryPickupItemEventInterface, InventoryPickupItemEvent> {

    public InventoryPickupItemEventContainer(InventoryPickupItemEvent event) {
        super(event);
    }

    @Override
    protected void call(InventoryPickupItemEventInterface listener, InventoryPickupItemEvent event) {
        listener.onInventoryPickupItemEvent(event);
    }

    @Override
    public Class<InventoryPickupItemEventInterface> getListenerType() {
        return InventoryPickupItemEventInterface.class;
    }
}
