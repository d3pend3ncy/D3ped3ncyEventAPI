package com.d3pend3ncy.api.event.interfaces.entity;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.entity.EntityPotionEffectEvent;

public interface EntityPotionEffectEventInterface extends Listener {
    void onEntityPotionEffectEvent(EntityPotionEffectEvent event);
}
