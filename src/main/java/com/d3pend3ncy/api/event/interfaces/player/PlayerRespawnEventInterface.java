package com.d3pend3ncy.api.event.interfaces.player;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;

public interface PlayerRespawnEventInterface extends Listener {
    void onPlayerRespawnEvent(PlayerRespawnEvent event);
}
