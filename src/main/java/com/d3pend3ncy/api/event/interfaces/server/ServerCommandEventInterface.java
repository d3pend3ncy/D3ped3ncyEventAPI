package com.d3pend3ncy.api.event.interfaces.server;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.server.ServerCommandEvent;

public interface ServerCommandEventInterface extends Listener {
    void onServerCommandEvent(ServerCommandEvent event);
}
