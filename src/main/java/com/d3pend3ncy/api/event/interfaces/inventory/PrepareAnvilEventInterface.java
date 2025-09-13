package com.d3pend3ncy.api.event.interfaces.inventory;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.inventory.PrepareAnvilEvent;

public interface PrepareAnvilEventInterface extends Listener {
    void onPrepareAnvilEvent(PrepareAnvilEvent event);
}
