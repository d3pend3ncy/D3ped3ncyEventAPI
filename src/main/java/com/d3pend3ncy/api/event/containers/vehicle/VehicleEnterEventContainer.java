package com.d3pend3ncy.api.event.containers.vehicle;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.vehicle.VehicleEnterEventInterface;
import org.bukkit.event.vehicle.VehicleEnterEvent;

public class VehicleEnterEventContainer extends ContainerEvent<VehicleEnterEventInterface, VehicleEnterEvent> {

    public VehicleEnterEventContainer(VehicleEnterEvent event) {
        super(event);
    }

    @Override
    protected void call(VehicleEnterEventInterface listener, VehicleEnterEvent event) {
        listener.onVehicleEnterEvent(event);
    }

    @Override
    public Class<VehicleEnterEventInterface> getListenerType() {
        return VehicleEnterEventInterface.class;
    }
}
