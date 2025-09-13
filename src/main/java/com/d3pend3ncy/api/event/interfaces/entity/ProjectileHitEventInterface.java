package com.d3pend3ncy.api.event.interfaces.entity;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public interface ProjectileHitEventInterface extends Listener {
    void onProjectileHitEvent(ProjectileHitEvent event);
}
