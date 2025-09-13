package com.d3pend3ncy.api.event.interfaces.inventory;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.inventory.FurnaceBurnEvent;

public interface FurnaceBurnEventInterface extends Listener {
    void onFurnaceBurnEvent(FurnaceBurnEvent event);
}
