package com.d3pend3ncy.api.event.interfaces.inventory;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.inventory.InventoryPickupItemEvent;

public interface InventoryPickupItemEventInterface extends Listener {
    void onInventoryPickupItemEvent(InventoryPickupItemEvent event);
}
