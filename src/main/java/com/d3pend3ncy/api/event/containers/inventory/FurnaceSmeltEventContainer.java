package com.d3pend3ncy.api.event.containers.inventory;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.inventory.FurnaceSmeltEventInterface;
import org.bukkit.event.inventory.FurnaceSmeltEvent;

public class FurnaceSmeltEventContainer extends ContainerEvent<FurnaceSmeltEventInterface, FurnaceSmeltEvent> {

    public FurnaceSmeltEventContainer(FurnaceSmeltEvent event) {
        super(event);
    }

    @Override
    protected void call(FurnaceSmeltEventInterface listener, FurnaceSmeltEvent event) {
        listener.onFurnaceSmeltEvent(event);
    }

    @Override
    public Class<FurnaceSmeltEventInterface> getListenerType() {
        return FurnaceSmeltEventInterface.class;
    }
}
