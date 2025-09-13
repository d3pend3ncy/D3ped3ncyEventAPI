package com.d3pend3ncy.api.event.containers.vehicle;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.vehicle.VehicleDestroyEventInterface;
import org.bukkit.event.vehicle.VehicleDestroyEvent;

public class VehicleDestroyEventContainer extends ContainerEvent<VehicleDestroyEventInterface, VehicleDestroyEvent> {

    public VehicleDestroyEventContainer(VehicleDestroyEvent event) {
        super(event);
    }

    @Override
    protected void call(VehicleDestroyEventInterface listener, VehicleDestroyEvent event) {
        listener.onVehicleDestroyEvent(event);
    }

    @Override
    public Class<VehicleDestroyEventInterface> getListenerType() {
        return VehicleDestroyEventInterface.class;
    }
}
