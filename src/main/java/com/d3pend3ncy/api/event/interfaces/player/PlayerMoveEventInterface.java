package com.d3pend3ncy.api.event.interfaces.player;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public interface PlayerMoveEventInterface extends Listener {
    void onPlayerMoveEvent(PlayerMoveEvent event);
}
