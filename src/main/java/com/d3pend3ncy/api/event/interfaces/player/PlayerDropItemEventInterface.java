package com.d3pend3ncy.api.event.interfaces.player;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public interface PlayerDropItemEventInterface extends Listener {
    void onPlayerDropItemEvent(PlayerDropItemEvent event);
}
