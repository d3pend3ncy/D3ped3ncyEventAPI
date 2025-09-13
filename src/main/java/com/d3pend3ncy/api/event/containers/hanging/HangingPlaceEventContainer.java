package com.d3pend3ncy.api.event.containers.hanging;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.hanging.HangingPlaceEventInterface;
import org.bukkit.event.hanging.HangingPlaceEvent;

public class HangingPlaceEventContainer extends ContainerEvent<HangingPlaceEventInterface, HangingPlaceEvent> {

    public HangingPlaceEventContainer(HangingPlaceEvent event) {
        super(event);
    }

    @Override
    protected void call(HangingPlaceEventInterface listener, HangingPlaceEvent event) {
        listener.onHangingPlaceEvent(event);
    }

    @Override
    public Class<HangingPlaceEventInterface> getListenerType() {
        return HangingPlaceEventInterface.class;
    }
}
