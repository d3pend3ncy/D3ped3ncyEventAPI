package com.d3pend3ncy.api.event.containers.vehicle;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.vehicle.VehicleCreateEventInterface;
import org.bukkit.event.vehicle.VehicleCreateEvent;

public class VehicleCreateEventContainer extends ContainerEvent<VehicleCreateEventInterface, VehicleCreateEvent> {

    public VehicleCreateEventContainer(VehicleCreateEvent event) {
        super(event);
    }

    @Override
    protected void call(VehicleCreateEventInterface listener, VehicleCreateEvent event) {
        listener.onVehicleCreateEvent(event);
    }

    @Override
    public Class<VehicleCreateEventInterface> getListenerType() {
        return VehicleCreateEventInterface.class;
    }
}
