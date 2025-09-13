package com.d3pend3ncy.api.event.interfaces.player;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public interface PlayerLoginEventInterface extends Listener {
    void onPlayerLoginEvent(PlayerLoginEvent event);
}
