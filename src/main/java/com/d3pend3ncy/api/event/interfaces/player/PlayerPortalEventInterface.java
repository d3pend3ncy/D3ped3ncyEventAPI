package com.d3pend3ncy.api.event.interfaces.player;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.player.PlayerPortalEvent;

public interface PlayerPortalEventInterface extends Listener {
    void onPlayerPortalEvent(PlayerPortalEvent event);
}
