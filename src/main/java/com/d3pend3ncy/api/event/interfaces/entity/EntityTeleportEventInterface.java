package com.d3pend3ncy.api.event.interfaces.entity;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.entity.EntityTeleportEvent;

public interface EntityTeleportEventInterface extends Listener {
    void onEntityTeleportEvent(EntityTeleportEvent event);
}
