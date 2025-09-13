package com.d3pend3ncy.api.event.interfaces.player;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.player.PlayerUnleashEntityEvent;

public interface PlayerUnleashEntityEventInterface extends Listener {
    void onPlayerUnleashEntityEvent(PlayerUnleashEntityEvent event);
}
