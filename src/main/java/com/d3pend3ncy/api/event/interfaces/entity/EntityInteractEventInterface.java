package com.d3pend3ncy.api.event.interfaces.entity;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.entity.EntityInteractEvent;

public interface EntityInteractEventInterface extends Listener {
    void onEntityInteractEvent(EntityInteractEvent event);
}
