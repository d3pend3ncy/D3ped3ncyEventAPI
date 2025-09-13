package com.d3pend3ncy.api.event.interfaces.player;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.player.PlayerItemMendEvent;

public interface PlayerItemMendEventInterface extends Listener {
    void onPlayerItemMendEvent(PlayerItemMendEvent event);
}
