package com.d3pend3ncy.api.event.containers.vehicle;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.vehicle.VehicleEntityCollisionEventInterface;
import org.bukkit.event.vehicle.VehicleEntityCollisionEvent;

public class VehicleEntityCollisionEventContainer extends ContainerEvent<VehicleEntityCollisionEventInterface, VehicleEntityCollisionEvent> {

    public VehicleEntityCollisionEventContainer(VehicleEntityCollisionEvent event) {
        super(event);
    }

    @Override
    protected void call(VehicleEntityCollisionEventInterface listener, VehicleEntityCollisionEvent event) {
        listener.onVehicleEntityCollisionEvent(event);
    }

    @Override
    public Class<VehicleEntityCollisionEventInterface> getListenerType() {
        return VehicleEntityCollisionEventInterface.class;
    }
}
