package com.d3pend3ncy.api.event.interfaces.entity;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.entity.VillagerAcquireTradeEvent;

public interface VillagerAcquireTradeEventInterface extends Listener {
    void onVillagerAcquireTradeEvent(VillagerAcquireTradeEvent event);
}
