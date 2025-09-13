package com.d3pend3ncy.api.event.interfaces.entity;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.entity.EntityCombustByBlockEvent;

public interface EntityCombustByBlockEventInterface extends Listener {
    void onEntityCombustByBlockEvent(EntityCombustByBlockEvent event);
}
