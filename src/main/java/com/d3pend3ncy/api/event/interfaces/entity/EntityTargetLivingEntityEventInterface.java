package com.d3pend3ncy.api.event.interfaces.entity;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.entity.EntityTargetLivingEntityEvent;

public interface EntityTargetLivingEntityEventInterface extends Listener {
    void onEntityTargetLivingEntityEvent(EntityTargetLivingEntityEvent event);
}
