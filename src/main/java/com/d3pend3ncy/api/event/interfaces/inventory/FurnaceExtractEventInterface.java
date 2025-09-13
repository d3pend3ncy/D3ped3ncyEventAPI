package com.d3pend3ncy.api.event.interfaces.inventory;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.inventory.FurnaceExtractEvent;

public interface FurnaceExtractEventInterface extends Listener {
    void onFurnaceExtractEvent(FurnaceExtractEvent event);
}
