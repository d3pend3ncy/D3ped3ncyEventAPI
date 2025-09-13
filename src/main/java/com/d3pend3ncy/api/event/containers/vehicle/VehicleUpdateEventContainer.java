package com.d3pend3ncy.api.event.containers.vehicle;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.vehicle.VehicleUpdateEventInterface;
import org.bukkit.event.vehicle.VehicleUpdateEvent;

public class VehicleUpdateEventContainer extends ContainerEvent<VehicleUpdateEventInterface, VehicleUpdateEvent> {

    public VehicleUpdateEventContainer(VehicleUpdateEvent event) {
        super(event);
    }

    @Override
    protected void call(VehicleUpdateEventInterface listener, VehicleUpdateEvent event) {
        listener.onVehicleUpdateEvent(event);
    }

    @Override
    public Class<VehicleUpdateEventInterface> getListenerType() {
        return VehicleUpdateEventInterface.class;
    }
}
