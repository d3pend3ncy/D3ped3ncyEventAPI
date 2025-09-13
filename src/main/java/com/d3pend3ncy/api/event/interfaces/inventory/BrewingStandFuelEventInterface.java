package com.d3pend3ncy.api.event.interfaces.inventory;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.inventory.BrewingStandFuelEvent;

public interface BrewingStandFuelEventInterface extends Listener {
    void onBrewingStandFuelEvent(BrewingStandFuelEvent event);
}
