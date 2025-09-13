package com.d3pend3ncy.api.event.interfaces.hanging;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.hanging.HangingBreakByEntityEvent;

public interface HangingBreakByEntityEventInterface extends Listener {
    void onHangingBreakByEntityEvent(HangingBreakByEntityEvent event);
}
