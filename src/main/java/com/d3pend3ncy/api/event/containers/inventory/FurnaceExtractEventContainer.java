package com.d3pend3ncy.api.event.containers.inventory;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.inventory.FurnaceExtractEventInterface;
import org.bukkit.event.inventory.FurnaceExtractEvent;

public class FurnaceExtractEventContainer extends ContainerEvent<FurnaceExtractEventInterface, FurnaceExtractEvent> {

    public FurnaceExtractEventContainer(FurnaceExtractEvent event) {
        super(event);
    }

    @Override
    protected void call(FurnaceExtractEventInterface listener, FurnaceExtractEvent event) {
        listener.onFurnaceExtractEvent(event);
    }

    @Override
    public Class<FurnaceExtractEventInterface> getListenerType() {
        return FurnaceExtractEventInterface.class;
    }
}
