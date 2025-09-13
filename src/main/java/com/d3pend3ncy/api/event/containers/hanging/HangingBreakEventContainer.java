package com.d3pend3ncy.api.event.containers.hanging;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.hanging.HangingBreakEventInterface;
import org.bukkit.event.hanging.HangingBreakEvent;

public class HangingBreakEventContainer extends ContainerEvent<HangingBreakEventInterface, HangingBreakEvent> {

    public HangingBreakEventContainer(HangingBreakEvent event) {
        super(event);
    }

    @Override
    protected void call(HangingBreakEventInterface listener, HangingBreakEvent event) {
        listener.onHangingBreakEvent(event);
    }

    @Override
    public Class<HangingBreakEventInterface> getListenerType() {
        return HangingBreakEventInterface.class;
    }
}
