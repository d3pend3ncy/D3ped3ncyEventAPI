package com.d3pend3ncy.api.event.containers.vehicle;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.vehicle.VehicleMoveEventInterface;
import org.bukkit.event.vehicle.VehicleMoveEvent;

public class VehicleMoveEventContainer extends ContainerEvent<VehicleMoveEventInterface, VehicleMoveEvent> {

    public VehicleMoveEventContainer(VehicleMoveEvent event) {
        super(event);
    }

    @Override
    protected void call(VehicleMoveEventInterface listener, VehicleMoveEvent event) {
        listener.onVehicleMoveEvent(event);
    }

    @Override
    public Class<VehicleMoveEventInterface> getListenerType() {
        return VehicleMoveEventInterface.class;
    }
}
