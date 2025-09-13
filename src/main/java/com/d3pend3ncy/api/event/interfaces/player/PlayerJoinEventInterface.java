package com.d3pend3ncy.api.event.interfaces.player;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public interface PlayerJoinEventInterface extends Listener {
    void onPlayerJoinEvent(PlayerJoinEvent event);
}
