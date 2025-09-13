package com.d3pend3ncy.api.event.containers.weather;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.weather.LightningStrikeEventInterface;
import org.bukkit.event.weather.LightningStrikeEvent;

public class LightningStrikeEventContainer extends ContainerEvent<LightningStrikeEventInterface, LightningStrikeEvent> {

    public LightningStrikeEventContainer(LightningStrikeEvent event) {
        super(event);
    }

    @Override
    protected void call(LightningStrikeEventInterface listener, LightningStrikeEvent event) {
        listener.onLightningStrikeEvent(event);
    }

    @Override
    public Class<LightningStrikeEventInterface> getListenerType() {
        return LightningStrikeEventInterface.class;
    }
}
