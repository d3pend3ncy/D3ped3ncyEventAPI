package com.d3pend3ncy.api.event.interfaces.player;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public interface PlayerQuitEventInterface extends Listener {
    void onPlayerQuitEvent(PlayerQuitEvent event);
}
