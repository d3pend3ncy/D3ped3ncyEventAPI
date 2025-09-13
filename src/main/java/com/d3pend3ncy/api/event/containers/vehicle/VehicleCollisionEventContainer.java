package com.d3pend3ncy.api.event.containers.vehicle;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.vehicle.VehicleCollisionEventInterface;
import org.bukkit.event.vehicle.VehicleCollisionEvent;

public class VehicleCollisionEventContainer extends ContainerEvent<VehicleCollisionEventInterface, VehicleCollisionEvent> {

    public VehicleCollisionEventContainer(VehicleCollisionEvent event) {
        super(event);
    }

    @Override
    protected void call(VehicleCollisionEventInterface listener, VehicleCollisionEvent event) {
        listener.onVehicleCollisionEvent(event);
    }

    @Override
    public Class<VehicleCollisionEventInterface> getListenerType() {
        return VehicleCollisionEventInterface.class;
    }
}
