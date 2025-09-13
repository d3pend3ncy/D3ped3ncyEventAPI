package com.d3pend3ncy.api.event.interfaces.player;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.player.PlayerExpChangeEvent;

public interface PlayerExpChangeEventInterface extends Listener {
    void onPlayerExpChangeEvent(PlayerExpChangeEvent event);
}
