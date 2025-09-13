package com.d3pend3ncy.api.event.interfaces.player;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.player.PlayerChangedMainHandEvent;

public interface PlayerChangedMainHandEventInterface extends Listener {
    void onPlayerChangedMainHandEvent(PlayerChangedMainHandEvent event);
}
