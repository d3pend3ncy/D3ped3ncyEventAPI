package com.d3pend3ncy.api.event.interfaces.entity;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public interface EntityExplodeEventInterface extends Listener {
    void onEntityExplodeEvent(EntityExplodeEvent event);
}
