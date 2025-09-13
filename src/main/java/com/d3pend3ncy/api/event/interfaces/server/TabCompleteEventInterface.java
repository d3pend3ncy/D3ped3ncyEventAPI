package com.d3pend3ncy.api.event.interfaces.server;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.server.TabCompleteEvent;

public interface TabCompleteEventInterface extends Listener {
    void onTabCompleteEvent(TabCompleteEvent event);
}
