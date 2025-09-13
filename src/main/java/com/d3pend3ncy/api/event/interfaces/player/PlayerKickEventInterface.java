package com.d3pend3ncy.api.event.interfaces.player;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.player.PlayerKickEvent;

public interface PlayerKickEventInterface extends Listener {
    void onPlayerKickEvent(PlayerKickEvent event);
}
