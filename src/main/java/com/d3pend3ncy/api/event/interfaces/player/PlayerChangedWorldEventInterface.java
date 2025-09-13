package com.d3pend3ncy.api.event.interfaces.player;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;

public interface PlayerChangedWorldEventInterface extends Listener {
    void onPlayerChangedWorldEvent(PlayerChangedWorldEvent event);
}
