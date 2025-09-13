package com.d3pend3ncy.api.event.interfaces.entity;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.entity.EntityCreatePortalEvent;

public interface EntityCreatePortalEventInterface extends Listener {
    void onEntityCreatePortalEvent(EntityCreatePortalEvent event);
}
