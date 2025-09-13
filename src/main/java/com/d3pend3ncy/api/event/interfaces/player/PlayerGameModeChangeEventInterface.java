package com.d3pend3ncy.api.event.interfaces.player;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.player.PlayerGameModeChangeEvent;

public interface PlayerGameModeChangeEventInterface extends Listener {
    void onPlayerGameModeChangeEvent(PlayerGameModeChangeEvent event);
}
