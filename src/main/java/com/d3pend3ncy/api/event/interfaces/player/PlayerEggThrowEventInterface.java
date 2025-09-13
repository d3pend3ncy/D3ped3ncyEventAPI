package com.d3pend3ncy.api.event.interfaces.player;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.player.PlayerEggThrowEvent;

public interface PlayerEggThrowEventInterface extends Listener {
    void onPlayerEggThrowEvent(PlayerEggThrowEvent event);
}
