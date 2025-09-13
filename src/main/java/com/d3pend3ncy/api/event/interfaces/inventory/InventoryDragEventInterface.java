package com.d3pend3ncy.api.event.interfaces.inventory;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.inventory.InventoryDragEvent;

public interface InventoryDragEventInterface extends Listener {
    void onInventoryDragEvent(InventoryDragEvent event);
}
