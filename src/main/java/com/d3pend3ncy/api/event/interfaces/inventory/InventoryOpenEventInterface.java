package com.d3pend3ncy.api.event.interfaces.inventory;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;

public interface InventoryOpenEventInterface extends Listener {
    void onInventoryOpenEvent(InventoryOpenEvent event);
}
