package com.d3pend3ncy.api.event.interfaces.inventory;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;

public interface InventoryCloseEventInterface extends Listener {
    void onInventoryCloseEvent(InventoryCloseEvent event);
}
