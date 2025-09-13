package com.d3pend3ncy.api.event.interfaces.inventory;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public interface InventoryClickEventInterface extends Listener {
    void onInventoryClickEvent(InventoryClickEvent event);
}
