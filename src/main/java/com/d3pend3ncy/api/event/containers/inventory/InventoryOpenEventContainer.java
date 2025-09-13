package com.d3pend3ncy.api.event.containers.inventory;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.inventory.InventoryOpenEventInterface;
import org.bukkit.event.inventory.InventoryOpenEvent;

public class InventoryOpenEventContainer extends ContainerEvent<InventoryOpenEventInterface, InventoryOpenEvent> {

    public InventoryOpenEventContainer(InventoryOpenEvent event) {
        super(event);
    }

    @Override
    protected void call(InventoryOpenEventInterface listener, InventoryOpenEvent event) {
        listener.onInventoryOpenEvent(event);
    }

    @Override
    public Class<InventoryOpenEventInterface> getListenerType() {
        return InventoryOpenEventInterface.class;
    }
}
