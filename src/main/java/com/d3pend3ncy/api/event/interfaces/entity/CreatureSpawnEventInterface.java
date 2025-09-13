package com.d3pend3ncy.api.event.interfaces.entity;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public interface CreatureSpawnEventInterface extends Listener {
    void onCreatureSpawnEvent(CreatureSpawnEvent event);
}
