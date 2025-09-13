package com.d3pend3ncy.api.event.interfaces.world;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.world.WorldLoadEvent;

public interface WorldLoadEventInterface extends Listener {
    void onWorldLoadEvent(WorldLoadEvent event);
}
