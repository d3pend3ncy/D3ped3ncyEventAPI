package com.d3pend3ncy.api.event.containers.vehicle;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.vehicle.VehicleBlockCollisionEventInterface;
import org.bukkit.event.vehicle.VehicleBlockCollisionEvent;

public class VehicleBlockCollisionEventContainer extends ContainerEvent<VehicleBlockCollisionEventInterface, VehicleBlockCollisionEvent> {

    public VehicleBlockCollisionEventContainer(VehicleBlockCollisionEvent event) {
        super(event);
    }

    @Override
    protected void call(VehicleBlockCollisionEventInterface listener, VehicleBlockCollisionEvent event) {
        listener.onVehicleBlockCollisionEvent(event);
    }

    @Override
    public Class<VehicleBlockCollisionEventInterface> getListenerType() {
        return VehicleBlockCollisionEventInterface.class;
    }
}
