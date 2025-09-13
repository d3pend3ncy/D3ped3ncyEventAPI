package com.d3pend3ncy.api.event.interfaces.entity;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.entity.PlayerLeashEntityEvent;

public interface PlayerLeashEntityEventInterface extends Listener {
    void onPlayerLeashEntityEvent(PlayerLeashEntityEvent event);
}
