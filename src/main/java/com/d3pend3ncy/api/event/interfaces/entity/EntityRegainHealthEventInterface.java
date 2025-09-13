package com.d3pend3ncy.api.event.interfaces.entity;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.entity.EntityRegainHealthEvent;

public interface EntityRegainHealthEventInterface extends Listener {
    void onEntityRegainHealthEvent(EntityRegainHealthEvent event);
}
