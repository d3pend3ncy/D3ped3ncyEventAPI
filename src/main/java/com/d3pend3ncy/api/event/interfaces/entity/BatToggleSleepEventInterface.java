package com.d3pend3ncy.api.event.interfaces.entity;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.entity.BatToggleSleepEvent;

public interface BatToggleSleepEventInterface extends Listener {
    void onBatToggleSleepEvent(BatToggleSleepEvent event);
}
