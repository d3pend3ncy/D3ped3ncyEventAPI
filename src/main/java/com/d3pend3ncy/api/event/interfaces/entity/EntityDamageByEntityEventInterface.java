package com.d3pend3ncy.api.event.interfaces.entity;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public interface EntityDamageByEntityEventInterface extends Listener {
    void onEntityDamageByEntityEvent(EntityDamageByEntityEvent event);
}
