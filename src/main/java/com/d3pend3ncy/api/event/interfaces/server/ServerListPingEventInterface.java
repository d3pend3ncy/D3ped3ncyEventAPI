package com.d3pend3ncy.api.event.interfaces.server;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public interface ServerListPingEventInterface extends Listener {
    void onServerListPingEvent(ServerListPingEvent event);
}
