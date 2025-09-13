package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.BatToggleSleepEventInterface;
import org.bukkit.event.entity.BatToggleSleepEvent;

public class BatToggleSleepEventContainer extends ContainerEvent<BatToggleSleepEventInterface, BatToggleSleepEvent> {

    public BatToggleSleepEventContainer(BatToggleSleepEvent event) {
        super(event);
    }

    @Override
    protected void call(BatToggleSleepEventInterface listener, BatToggleSleepEvent event) {
        listener.onBatToggleSleepEvent(event);
    }

    @Override
    public Class<BatToggleSleepEventInterface> getListenerType() {
        return BatToggleSleepEventInterface.class;
    }
}
