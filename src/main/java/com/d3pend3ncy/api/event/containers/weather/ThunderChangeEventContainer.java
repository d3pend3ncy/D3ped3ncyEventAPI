package com.d3pend3ncy.api.event.containers.weather;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.weather.ThunderChangeEventInterface;
import org.bukkit.event.weather.ThunderChangeEvent;

public class ThunderChangeEventContainer extends ContainerEvent<ThunderChangeEventInterface, ThunderChangeEvent> {

    public ThunderChangeEventContainer(ThunderChangeEvent event) {
        super(event);
    }

    @Override
    protected void call(ThunderChangeEventInterface listener, ThunderChangeEvent event) {
        listener.onThunderChangeEvent(event);
    }

    @Override
    public Class<ThunderChangeEventInterface> getListenerType() {
        return ThunderChangeEventInterface.class;
    }
}
