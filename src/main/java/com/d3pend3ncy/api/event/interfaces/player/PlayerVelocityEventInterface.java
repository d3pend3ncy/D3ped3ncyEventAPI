package com.d3pend3ncy.api.event.interfaces.player;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.player.PlayerVelocityEvent;

public interface PlayerVelocityEventInterface extends Listener {
    void onPlayerVelocityEvent(PlayerVelocityEvent event);
}
