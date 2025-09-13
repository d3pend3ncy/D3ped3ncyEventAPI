package com.d3pend3ncy.api.event.interfaces.player;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.player.PlayerToggleSprintEvent;

public interface PlayerToggleSprintEventInterface extends Listener {
    void onPlayerToggleSprintEvent(PlayerToggleSprintEvent event);
}
