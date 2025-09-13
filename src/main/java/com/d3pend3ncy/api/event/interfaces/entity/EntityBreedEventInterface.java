package com.d3pend3ncy.api.event.interfaces.entity;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.entity.EntityBreedEvent;

public interface EntityBreedEventInterface extends Listener {
    void onEntityBreedEvent(EntityBreedEvent event);
}
