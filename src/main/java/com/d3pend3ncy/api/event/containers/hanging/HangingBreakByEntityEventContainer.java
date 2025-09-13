package com.d3pend3ncy.api.event.containers.hanging;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.hanging.HangingBreakByEntityEventInterface;
import org.bukkit.event.hanging.HangingBreakByEntityEvent;

public class HangingBreakByEntityEventContainer extends ContainerEvent<HangingBreakByEntityEventInterface, HangingBreakByEntityEvent> {

    public HangingBreakByEntityEventContainer(HangingBreakByEntityEvent event) {
        super(event);
    }

    @Override
    protected void call(HangingBreakByEntityEventInterface listener, HangingBreakByEntityEvent event) {
        listener.onHangingBreakByEntityEvent(event);
    }

    @Override
    public Class<HangingBreakByEntityEventInterface> getListenerType() {
        return HangingBreakByEntityEventInterface.class;
    }
}
