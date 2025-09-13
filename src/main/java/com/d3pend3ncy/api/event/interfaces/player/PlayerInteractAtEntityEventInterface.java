package com.d3pend3ncy.api.event.interfaces.player;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;

public interface PlayerInteractAtEntityEventInterface extends Listener {
    void onPlayerInteractAtEntityEvent(PlayerInteractAtEntityEvent event);
}
