package com.d3pend3ncy.api.event.containers.inventory;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.inventory.InventoryClickEventInterface;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryClickEventContainer extends ContainerEvent<InventoryClickEventInterface, InventoryClickEvent> {

    public InventoryClickEventContainer(InventoryClickEvent event) {
        super(event);
    }

    @Override
    protected void call(InventoryClickEventInterface listener, InventoryClickEvent event) {
        listener.onInventoryClickEvent(event);
    }

    @Override
    public Class<InventoryClickEventInterface> getListenerType() {
        return InventoryClickEventInterface.class;
    }
}
