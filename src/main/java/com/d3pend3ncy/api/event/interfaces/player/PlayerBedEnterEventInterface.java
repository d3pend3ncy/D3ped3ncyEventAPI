package com.d3pend3ncy.api.event.interfaces.player;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

public interface PlayerBedEnterEventInterface extends Listener {
    void onPlayerBedEnterEvent(PlayerBedEnterEvent event);
}
