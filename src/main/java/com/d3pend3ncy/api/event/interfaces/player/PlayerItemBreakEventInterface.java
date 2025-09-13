package com.d3pend3ncy.api.event.interfaces.player;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.player.PlayerItemBreakEvent;

public interface PlayerItemBreakEventInterface extends Listener {
    void onPlayerItemBreakEvent(PlayerItemBreakEvent event);
}
