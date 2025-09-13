package com.d3pend3ncy.api.event.interfaces.server;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.server.PluginDisableEvent;

public interface PluginDisableEventInterface extends Listener {
    void onPluginDisableEvent(PluginDisableEvent event);
}
