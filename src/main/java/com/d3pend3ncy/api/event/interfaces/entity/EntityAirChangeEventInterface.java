package com.d3pend3ncy.api.event.interfaces.entity;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.entity.EntityAirChangeEvent;

public interface EntityAirChangeEventInterface extends Listener {
    void onEntityAirChangeEvent(EntityAirChangeEvent event);
}
