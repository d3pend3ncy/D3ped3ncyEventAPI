package com.d3pend3ncy.api.event.interfaces.server;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.server.PluginEnableEvent;

public interface PluginEnableEventInterface extends Listener {
    void onPluginEnableEvent(PluginEnableEvent event);
}
