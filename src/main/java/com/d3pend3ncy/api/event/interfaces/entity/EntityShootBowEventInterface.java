package com.d3pend3ncy.api.event.interfaces.entity;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;

public interface EntityShootBowEventInterface extends Listener {
    void onEntityShootBowEvent(EntityShootBowEvent event);
}
