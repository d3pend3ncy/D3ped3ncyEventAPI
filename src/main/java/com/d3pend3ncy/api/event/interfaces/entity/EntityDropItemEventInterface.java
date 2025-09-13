package com.d3pend3ncy.api.event.interfaces.entity;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.entity.EntityDropItemEvent;

public interface EntityDropItemEventInterface extends Listener {
    void onEntityDropItemEvent(EntityDropItemEvent event);
}
