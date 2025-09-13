package com.d3pend3ncy.api.event.interfaces.entity;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.entity.EntityPortalEnterEvent;

public interface EntityPortalEnterEventInterface extends Listener {
    void onEntityPortalEnterEvent(EntityPortalEnterEvent event);
}
