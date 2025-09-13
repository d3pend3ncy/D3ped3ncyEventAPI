package com.d3pend3ncy.api.event.interfaces.hanging;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.hanging.HangingPlaceEvent;

public interface HangingPlaceEventInterface extends Listener {
    void onHangingPlaceEvent(HangingPlaceEvent event);
}
