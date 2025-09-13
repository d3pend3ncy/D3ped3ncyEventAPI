package com.d3pend3ncy.api.event.interfaces.raid;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.raid.RaidSpawnWaveEvent;

public interface RaidSpawnWaveEventInterface extends Listener {
    void onRaidSpawnWaveEvent(RaidSpawnWaveEvent event);
}
