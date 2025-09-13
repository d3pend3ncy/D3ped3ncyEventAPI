package com.d3pend3ncy.api.event.containers.inventory;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.inventory.BrewEventInterface;
import org.bukkit.event.inventory.BrewEvent;

public class BrewEventContainer extends ContainerEvent<BrewEventInterface, BrewEvent> {

    public BrewEventContainer(BrewEvent event) {
        super(event);
    }

    @Override
    protected void call(BrewEventInterface listener, BrewEvent event) {
        listener.onBrewEvent(event);
    }

    @Override
    public Class<BrewEventInterface> getListenerType() {
        return BrewEventInterface.class;
    }
}
