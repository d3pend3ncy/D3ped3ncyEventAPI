package com.d3pend3ncy.api.event.interfaces.player;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public interface PlayerInteractEventInterface extends Listener {
    void onPlayerInteractEvent(PlayerInteractEvent event);
}
