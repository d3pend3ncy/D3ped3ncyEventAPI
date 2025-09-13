package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.CreeperPowerEventInterface;
import org.bukkit.event.entity.CreeperPowerEvent;

public class CreeperPowerEventContainer extends ContainerEvent<CreeperPowerEventInterface, CreeperPowerEvent> {

    public CreeperPowerEventContainer(CreeperPowerEvent event) {
        super(event);
    }

    @Override
    protected void call(CreeperPowerEventInterface listener, CreeperPowerEvent event) {
        listener.onCreeperPowerEvent(event);
    }

    @Override
    public Class<CreeperPowerEventInterface> getListenerType() {
        return CreeperPowerEventInterface.class;
    }
}
