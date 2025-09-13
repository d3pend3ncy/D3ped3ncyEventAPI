package com.d3pend3ncy.api.event.interfaces.entity;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.entity.VillagerReplenishTradeEvent;

public interface VillagerReplenishTradeEventInterface extends Listener {
    void onVillagerReplenishTradeEvent(VillagerReplenishTradeEvent event);
}
