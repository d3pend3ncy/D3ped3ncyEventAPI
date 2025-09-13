package com.d3pend3ncy.api.event.interfaces.entity;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.entity.EntityPortalExitEvent;

public interface EntityPortalExitEventInterface extends Listener {
    void onEntityPortalExitEvent(EntityPortalExitEvent event);
}
