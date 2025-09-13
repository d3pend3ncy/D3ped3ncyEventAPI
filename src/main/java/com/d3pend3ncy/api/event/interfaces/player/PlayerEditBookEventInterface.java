package com.d3pend3ncy.api.event.interfaces.player;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.player.PlayerEditBookEvent;

public interface PlayerEditBookEventInterface extends Listener {
    void onPlayerEditBookEvent(PlayerEditBookEvent event);
}
