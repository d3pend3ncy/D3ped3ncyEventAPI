package com.d3pend3ncy.api.event.interfaces.raid;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.raid.RaidTriggerEvent;

public interface RaidTriggerEventInterface extends Listener {
    void onRaidTriggerEvent(RaidTriggerEvent event);
}
