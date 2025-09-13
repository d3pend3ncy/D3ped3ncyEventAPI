package com.d3pend3ncy.api.event.interfaces.entity;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.entity.EntityResurrectEvent;

public interface EntityResurrectEventInterface extends Listener {
    void onEntityResurrectEvent(EntityResurrectEvent event);
}
