package com.d3pend3ncy.api.event.interfaces.inventory;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.inventory.InventoryMoveItemEvent;

public interface InventoryMoveItemEventInterface extends Listener {
    void onInventoryMoveItemEvent(InventoryMoveItemEvent event);
}
