package com.d3pend3ncy.api.event.interfaces.block;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.block.LeavesDecayEvent;

public interface LeavesDecayEventInterface extends Listener {
    void onLeavesDecayEvent(LeavesDecayEvent event);
}
