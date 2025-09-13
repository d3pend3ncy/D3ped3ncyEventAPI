package com.d3pend3ncy.api.event.containers.inventory;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.inventory.InventoryMoveItemEventInterface;
import org.bukkit.event.inventory.InventoryMoveItemEvent;

public class InventoryMoveItemEventContainer extends ContainerEvent<InventoryMoveItemEventInterface, InventoryMoveItemEvent> {

    public InventoryMoveItemEventContainer(InventoryMoveItemEvent event) {
        super(event);
    }

    @Override
    protected void call(InventoryMoveItemEventInterface listener, InventoryMoveItemEvent event) {
        listener.onInventoryMoveItemEvent(event);
    }

    @Override
    public Class<InventoryMoveItemEventInterface> getListenerType() {
        return InventoryMoveItemEventInterface.class;
    }
}
