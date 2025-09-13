package com.d3pend3ncy.api.event.interfaces.player;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.player.PlayerFishEvent;

public interface PlayerFishEventInterface extends Listener {
    void onPlayerFishEvent(PlayerFishEvent event);
}
