package com.d3pend3ncy.api.event.interfaces.raid;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.raid.RaidFinishEvent;

public interface RaidFinishEventInterface extends Listener {
    void onRaidFinishEvent(RaidFinishEvent event);
}
