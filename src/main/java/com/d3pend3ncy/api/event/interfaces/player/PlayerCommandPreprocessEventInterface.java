package com.d3pend3ncy.api.event.interfaces.player;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public interface PlayerCommandPreprocessEventInterface extends Listener {
    void onPlayerCommandPreprocessEvent(PlayerCommandPreprocessEvent event);
}
