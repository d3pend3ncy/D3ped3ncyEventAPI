package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.ExpBottleEventInterface;
import org.bukkit.event.entity.ExpBottleEvent;

public class ExpBottleEventContainer extends ContainerEvent<ExpBottleEventInterface, ExpBottleEvent> {

    public ExpBottleEventContainer(ExpBottleEvent event) {
        super(event);
    }

    @Override
    protected void call(ExpBottleEventInterface listener, ExpBottleEvent event) {
        listener.onExpBottleEvent(event);
    }

    @Override
    public Class<ExpBottleEventInterface> getListenerType() {
        return ExpBottleEventInterface.class;
    }
}
