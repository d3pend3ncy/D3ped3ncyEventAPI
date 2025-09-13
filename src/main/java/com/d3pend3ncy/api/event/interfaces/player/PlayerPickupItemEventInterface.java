package com.d3pend3ncy.api.event.interfaces.player;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.player.PlayerPickupItemEvent;

public interface PlayerPickupItemEventInterface extends Listener {
    void onPlayerPickupItemEvent(PlayerPickupItemEvent event);
}
