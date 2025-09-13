package com.d3pend3ncy.api.event.interfaces.server;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.server.BroadcastMessageEvent;

public interface BroadcastMessageEventInterface extends Listener {
    void onBroadcastMessageEvent(BroadcastMessageEvent event);
}
