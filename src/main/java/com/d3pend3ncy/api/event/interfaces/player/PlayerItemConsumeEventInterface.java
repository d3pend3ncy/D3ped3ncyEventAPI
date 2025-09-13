package com.d3pend3ncy.api.event.interfaces.player;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;

public interface PlayerItemConsumeEventInterface extends Listener {
    void onPlayerItemConsumeEvent(PlayerItemConsumeEvent event);
}
