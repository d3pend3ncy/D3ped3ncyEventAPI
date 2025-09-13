package com.d3pend3ncy.api.event.interfaces.server;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.server.MapInitializeEvent;

public interface MapInitializeEventInterface extends Listener {
    void onMapInitializeEvent(MapInitializeEvent event);
}
