package com.d3pend3ncy.api.event.containers.inventory;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.inventory.InventoryDragEventInterface;
import org.bukkit.event.inventory.InventoryDragEvent;

public class InventoryDragEventContainer extends ContainerEvent<InventoryDragEventInterface, InventoryDragEvent> {

    public InventoryDragEventContainer(InventoryDragEvent event) {
        super(event);
    }

    @Override
    protected void call(InventoryDragEventInterface listener, InventoryDragEvent event) {
        listener.onInventoryDragEvent(event);
    }

    @Override
    public Class<InventoryDragEventInterface> getListenerType() {
        return InventoryDragEventInterface.class;
    }
}
