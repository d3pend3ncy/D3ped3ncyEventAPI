package com.d3pend3ncy.api.event.interfaces.inventory;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;

public interface PrepareItemCraftEventInterface extends Listener {
    void onPrepareItemCraftEvent(PrepareItemCraftEvent event);
}
