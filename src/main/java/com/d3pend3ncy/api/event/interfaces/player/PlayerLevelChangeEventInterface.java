package com.d3pend3ncy.api.event.interfaces.player;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.player.PlayerLevelChangeEvent;

public interface PlayerLevelChangeEventInterface extends Listener {
    void onPlayerLevelChangeEvent(PlayerLevelChangeEvent event);
}
