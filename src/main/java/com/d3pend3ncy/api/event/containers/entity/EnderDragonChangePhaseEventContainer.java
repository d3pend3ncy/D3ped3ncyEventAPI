package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.EnderDragonChangePhaseEventInterface;
import org.bukkit.event.entity.EnderDragonChangePhaseEvent;

public class EnderDragonChangePhaseEventContainer extends ContainerEvent<EnderDragonChangePhaseEventInterface, EnderDragonChangePhaseEvent> {

    public EnderDragonChangePhaseEventContainer(EnderDragonChangePhaseEvent event) {
        super(event);
    }

    @Override
    protected void call(EnderDragonChangePhaseEventInterface listener, EnderDragonChangePhaseEvent event) {
        listener.onEnderDragonChangePhaseEvent(event);
    }

    @Override
    public Class<EnderDragonChangePhaseEventInterface> getListenerType() {
        return EnderDragonChangePhaseEventInterface.class;
    }
}
