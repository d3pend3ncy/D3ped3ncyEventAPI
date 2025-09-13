package com.d3pend3ncy.api.event.containers.inventory;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.inventory.FurnaceBurnEventInterface;
import org.bukkit.event.inventory.FurnaceBurnEvent;

public class FurnaceBurnEventContainer extends ContainerEvent<FurnaceBurnEventInterface, FurnaceBurnEvent> {

    public FurnaceBurnEventContainer(FurnaceBurnEvent event) {
        super(event);
    }

    @Override
    protected void call(FurnaceBurnEventInterface listener, FurnaceBurnEvent event) {
        listener.onFurnaceBurnEvent(event);
    }

    @Override
    public Class<FurnaceBurnEventInterface> getListenerType() {
        return FurnaceBurnEventInterface.class;
    }
}
