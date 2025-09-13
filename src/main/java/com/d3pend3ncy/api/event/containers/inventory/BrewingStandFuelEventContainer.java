package com.d3pend3ncy.api.event.containers.inventory;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.inventory.BrewingStandFuelEventInterface;
import org.bukkit.event.inventory.BrewingStandFuelEvent;

public class BrewingStandFuelEventContainer extends ContainerEvent<BrewingStandFuelEventInterface, BrewingStandFuelEvent> {

    public BrewingStandFuelEventContainer(BrewingStandFuelEvent event) {
        super(event);
    }

    @Override
    protected void call(BrewingStandFuelEventInterface listener, BrewingStandFuelEvent event) {
        listener.onBrewingStandFuelEvent(event);
    }

    @Override
    public Class<BrewingStandFuelEventInterface> getListenerType() {
        return BrewingStandFuelEventInterface.class;
    }
}
