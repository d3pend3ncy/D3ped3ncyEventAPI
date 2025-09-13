package com.d3pend3ncy.api.event.interfaces.entity;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.entity.EntityToggleGlideEvent;

public interface EntityToggleGlideEventInterface extends Listener {
    void onEntityToggleGlideEvent(EntityToggleGlideEvent event);
}
