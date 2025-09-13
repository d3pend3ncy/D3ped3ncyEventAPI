package com.d3pend3ncy.api.event.interfaces.player;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.player.PlayerShearEntityEvent;

public interface PlayerShearEntityEventInterface extends Listener {
    void onPlayerShearEntityEvent(PlayerShearEntityEvent event);
}
