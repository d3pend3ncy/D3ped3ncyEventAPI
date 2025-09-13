package com.d3pend3ncy.api.event.interfaces.hanging;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.hanging.HangingBreakEvent;

public interface HangingBreakEventInterface extends Listener {
    void onHangingBreakEvent(HangingBreakEvent event);
}
