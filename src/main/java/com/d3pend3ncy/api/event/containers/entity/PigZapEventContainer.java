package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.PigZapEventInterface;
import org.bukkit.event.entity.PigZapEvent;

public class PigZapEventContainer extends ContainerEvent<PigZapEventInterface, PigZapEvent> {

    public PigZapEventContainer(PigZapEvent event) {
        super(event);
    }

    @Override
    protected void call(PigZapEventInterface listener, PigZapEvent event) {
        listener.onPigZapEvent(event);
    }

    @Override
    public Class<PigZapEventInterface> getListenerType() {
        return PigZapEventInterface.class;
    }
}
