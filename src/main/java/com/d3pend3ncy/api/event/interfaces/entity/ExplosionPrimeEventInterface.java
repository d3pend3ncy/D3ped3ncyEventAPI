package com.d3pend3ncy.api.event.interfaces.entity;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.entity.ExplosionPrimeEvent;

public interface ExplosionPrimeEventInterface extends Listener {
    void onExplosionPrimeEvent(ExplosionPrimeEvent event);
}
