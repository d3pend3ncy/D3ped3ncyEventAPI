package com.d3pend3ncy.api.event.interfaces.server;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.server.ServiceRegisterEvent;

public interface ServiceRegisterEventInterface extends Listener {
    void onServiceRegisterEvent(ServiceRegisterEvent event);
}
