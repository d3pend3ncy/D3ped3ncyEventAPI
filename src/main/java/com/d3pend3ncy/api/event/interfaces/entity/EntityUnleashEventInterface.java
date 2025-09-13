package com.d3pend3ncy.api.event.interfaces.entity;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.entity.EntityUnleashEvent;

public interface EntityUnleashEventInterface extends Listener {
    void onEntityUnleashEvent(EntityUnleashEvent event);
}
