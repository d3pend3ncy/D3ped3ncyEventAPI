package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.VillagerReplenishTradeEventInterface;
import org.bukkit.event.entity.VillagerReplenishTradeEvent;

public class VillagerReplenishTradeEventContainer extends ContainerEvent<VillagerReplenishTradeEventInterface, VillagerReplenishTradeEvent> {

    public VillagerReplenishTradeEventContainer(VillagerReplenishTradeEvent event) {
        super(event);
    }

    @Override
    protected void call(VillagerReplenishTradeEventInterface listener, VillagerReplenishTradeEvent event) {
        listener.onVillagerReplenishTradeEvent(event);
    }

    @Override
    public Class<VillagerReplenishTradeEventInterface> getListenerType() {
        return VillagerReplenishTradeEventInterface.class;
    }
}
