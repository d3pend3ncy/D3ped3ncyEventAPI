package com.d3pend3ncy.api.event.interfaces.world;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.world.WorldUnloadEvent;

public interface WorldUnloadEventInterface extends Listener {
    void onWorldUnloadEvent(WorldUnloadEvent event);
}
