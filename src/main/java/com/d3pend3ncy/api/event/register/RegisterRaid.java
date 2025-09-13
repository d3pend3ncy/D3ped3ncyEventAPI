package com.d3pend3ncy.api.event.register;

import com.d3pend3ncy.api.event.core.eventManager;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.raid.*;
import com.d3pend3ncy.api.event.containers.raid.*;

public class RegisterRaid implements Listener {

    public RegisterRaid() {}

    @EventHandler
    public void onRaidFinishEvent(RaidFinishEvent event) {
        RaidFinishEventContainer container = new RaidFinishEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onRaidSpawnWaveEvent(RaidSpawnWaveEvent event) {
        RaidSpawnWaveEventContainer container = new RaidSpawnWaveEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onRaidStopEvent(RaidStopEvent event) {
        RaidStopEventContainer container = new RaidStopEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onRaidTriggerEvent(RaidTriggerEvent event) {
        RaidTriggerEventContainer container = new RaidTriggerEventContainer(event);
        eventManager.fire(container);
    }

}
