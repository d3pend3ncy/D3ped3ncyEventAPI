package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.VillagerAcquireTradeEventInterface;
import org.bukkit.event.entity.VillagerAcquireTradeEvent;

public class VillagerAcquireTradeEventContainer extends ContainerEvent<VillagerAcquireTradeEventInterface, VillagerAcquireTradeEvent> {

    public VillagerAcquireTradeEventContainer(VillagerAcquireTradeEvent event) {
        super(event);
    }

    @Override
    protected void call(VillagerAcquireTradeEventInterface listener, VillagerAcquireTradeEvent event) {
        listener.onVillagerAcquireTradeEvent(event);
    }

    @Override
    public Class<VillagerAcquireTradeEventInterface> getListenerType() {
        return VillagerAcquireTradeEventInterface.class;
    }
}
