package com.d3pend3ncy.api.event.interfaces.inventory;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.inventory.BrewEvent;

public interface BrewEventInterface extends Listener {
    void onBrewEvent(BrewEvent event);
}
