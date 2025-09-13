package com.d3pend3ncy.api.event.interfaces.player;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.player.PlayerTeleportEvent;

public interface PlayerTeleportEventInterface extends Listener {
    void onPlayerTeleportEvent(PlayerTeleportEvent event);
}
