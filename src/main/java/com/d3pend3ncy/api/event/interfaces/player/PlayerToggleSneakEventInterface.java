package com.d3pend3ncy.api.event.interfaces.player;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;

public interface PlayerToggleSneakEventInterface extends Listener {
    void onPlayerToggleSneakEvent(PlayerToggleSneakEvent event);
}
