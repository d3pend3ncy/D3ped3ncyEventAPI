package com.d3pend3ncy.api.event.interfaces.server;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.server.RemoteServerCommandEvent;

public interface RemoteServerCommandEventInterface extends Listener {
    void onRemoteServerCommandEvent(RemoteServerCommandEvent event);
}
