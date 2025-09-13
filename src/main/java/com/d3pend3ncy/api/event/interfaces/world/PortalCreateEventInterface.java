package com.d3pend3ncy.api.event.interfaces.world;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.world.PortalCreateEvent;

public interface PortalCreateEventInterface extends Listener {
    void onPortalCreateEvent(PortalCreateEvent event);
}
