package com.d3pend3ncy.api.event.interfaces.inventory;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.inventory.CraftItemEvent;

public interface CraftItemEventInterface extends Listener {
    void onCraftItemEvent(CraftItemEvent event);
}
