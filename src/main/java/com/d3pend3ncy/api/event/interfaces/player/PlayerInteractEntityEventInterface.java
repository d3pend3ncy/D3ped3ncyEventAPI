package com.d3pend3ncy.api.event.interfaces.player;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public interface PlayerInteractEntityEventInterface extends Listener {
    void onPlayerInteractEntityEvent(PlayerInteractEntityEvent event);
}
