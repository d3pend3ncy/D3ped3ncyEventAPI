package com.d3pend3ncy.api.event.containers.raid;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.raid.RaidSpawnWaveEventInterface;
import org.bukkit.event.raid.RaidSpawnWaveEvent;

public class RaidSpawnWaveEventContainer extends ContainerEvent<RaidSpawnWaveEventInterface, RaidSpawnWaveEvent> {

    public RaidSpawnWaveEventContainer(RaidSpawnWaveEvent event) {
        super(event);
    }

    @Override
    protected void call(RaidSpawnWaveEventInterface listener, RaidSpawnWaveEvent event) {
        listener.onRaidSpawnWaveEvent(event);
    }

    @Override
    public Class<RaidSpawnWaveEventInterface> getListenerType() {
        return RaidSpawnWaveEventInterface.class;
    }
}
