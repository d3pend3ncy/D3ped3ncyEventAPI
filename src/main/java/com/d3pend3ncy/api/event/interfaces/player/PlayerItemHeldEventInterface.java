package com.d3pend3ncy.api.event.interfaces.player;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.player.PlayerItemHeldEvent;

public interface PlayerItemHeldEventInterface extends Listener {
    void onPlayerItemHeldEvent(PlayerItemHeldEvent event);
}
