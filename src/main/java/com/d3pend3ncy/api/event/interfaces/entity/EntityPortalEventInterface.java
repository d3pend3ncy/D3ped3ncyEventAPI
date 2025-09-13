package com.d3pend3ncy.api.event.interfaces.entity;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.entity.EntityPortalEvent;

public interface EntityPortalEventInterface extends Listener {
    void onEntityPortalEvent(EntityPortalEvent event);
}
