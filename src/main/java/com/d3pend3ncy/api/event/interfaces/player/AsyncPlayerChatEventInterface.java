package com.d3pend3ncy.api.event.interfaces.player;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public interface AsyncPlayerChatEventInterface extends Listener {
    void onAsyncPlayerChatEvent(AsyncPlayerChatEvent event);
}
