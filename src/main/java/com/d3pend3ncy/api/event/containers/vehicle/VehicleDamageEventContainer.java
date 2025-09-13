package com.d3pend3ncy.api.event.containers.vehicle;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.vehicle.VehicleDamageEventInterface;
import org.bukkit.event.vehicle.VehicleDamageEvent;

public class VehicleDamageEventContainer extends ContainerEvent<VehicleDamageEventInterface, VehicleDamageEvent> {

    public VehicleDamageEventContainer(VehicleDamageEvent event) {
        super(event);
    }

    @Override
    protected void call(VehicleDamageEventInterface listener, VehicleDamageEvent event) {
        listener.onVehicleDamageEvent(event);
    }

    @Override
    public Class<VehicleDamageEventInterface> getListenerType() {
        return VehicleDamageEventInterface.class;
    }
}
