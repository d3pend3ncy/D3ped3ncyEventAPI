package com.d3pend3ncy.api.event.interfaces.player;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.player.PlayerToggleFlightEvent;

public interface PlayerToggleFlightEventInterface extends Listener {
    void onPlayerToggleFlightEvent(PlayerToggleFlightEvent event);
}
