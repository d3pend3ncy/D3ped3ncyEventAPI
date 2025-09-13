package com.d3pend3ncy.api.event.interfaces.inventory;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.inventory.FurnaceSmeltEvent;

public interface FurnaceSmeltEventInterface extends Listener {
    void onFurnaceSmeltEvent(FurnaceSmeltEvent event);
}
