package com.d3pend3ncy.api.event.containers.inventory;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.inventory.InventoryCreativeEventInterface;
import org.bukkit.event.inventory.InventoryCreativeEvent;

public class InventoryCreativeEventContainer extends ContainerEvent<InventoryCreativeEventInterface, InventoryCreativeEvent> {

    public InventoryCreativeEventContainer(InventoryCreativeEvent event) {
        super(event);
    }

    @Override
    protected void call(InventoryCreativeEventInterface listener, InventoryCreativeEvent event) {
        listener.onInventoryCreativeEvent(event);
    }

    @Override
    public Class<InventoryCreativeEventInterface> getListenerType() {
        return InventoryCreativeEventInterface.class;
    }
}
