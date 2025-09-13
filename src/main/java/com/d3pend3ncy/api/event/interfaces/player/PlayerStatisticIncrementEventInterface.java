package com.d3pend3ncy.api.event.interfaces.player;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.player.PlayerStatisticIncrementEvent;

public interface PlayerStatisticIncrementEventInterface extends Listener {
    void onPlayerStatisticIncrementEvent(PlayerStatisticIncrementEvent event);
}
