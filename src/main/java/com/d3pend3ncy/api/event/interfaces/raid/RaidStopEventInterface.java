package com.d3pend3ncy.api.event.interfaces.raid;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.raid.RaidStopEvent;

public interface RaidStopEventInterface extends Listener {
    void onRaidStopEvent(RaidStopEvent event);
}
