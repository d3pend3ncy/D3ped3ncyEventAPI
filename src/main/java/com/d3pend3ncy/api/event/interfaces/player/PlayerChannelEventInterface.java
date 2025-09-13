package com.d3pend3ncy.api.event.interfaces.player;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.player.PlayerChannelEvent;

public interface PlayerChannelEventInterface extends Listener {
    void onPlayerChannelEvent(PlayerChannelEvent event);
}
