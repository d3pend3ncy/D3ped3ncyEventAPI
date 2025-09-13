package com.d3pend3ncy.api.event.interfaces.server;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.server.ServiceUnregisterEvent;

public interface ServiceUnregisterEventInterface extends Listener {
    void onServiceUnregisterEvent(ServiceUnregisterEvent event);
}
