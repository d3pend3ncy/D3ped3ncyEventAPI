package com.d3pend3ncy.api.event.interfaces.block;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.block.MoistureChangeEvent;

public interface MoistureChangeEventInterface extends Listener {
    void onMoistureChangeEvent(MoistureChangeEvent event);
}
