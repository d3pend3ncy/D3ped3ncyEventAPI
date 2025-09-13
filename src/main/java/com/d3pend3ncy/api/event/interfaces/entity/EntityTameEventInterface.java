package com.d3pend3ncy.api.event.interfaces.entity;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.entity.EntityTameEvent;

public interface EntityTameEventInterface extends Listener {
    void onEntityTameEvent(EntityTameEvent event);
}
