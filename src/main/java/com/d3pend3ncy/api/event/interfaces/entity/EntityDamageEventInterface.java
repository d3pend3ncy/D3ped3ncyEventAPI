package com.d3pend3ncy.api.event.interfaces.entity;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public interface EntityDamageEventInterface extends Listener {
    void onEntityDamageEvent(EntityDamageEvent event);
}
