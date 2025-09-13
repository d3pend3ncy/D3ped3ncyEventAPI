package com.d3pend3ncy.api.event.interfaces.inventory;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.inventory.InventoryCreativeEvent;

public interface InventoryCreativeEventInterface extends Listener {
    void onInventoryCreativeEvent(InventoryCreativeEvent event);
}
