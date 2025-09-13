package com.d3pend3ncy.api.event.interfaces.world;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.world.WorldInitEvent;

public interface WorldInitEventInterface extends Listener {
    void onWorldInitEvent(WorldInitEvent event);
}
