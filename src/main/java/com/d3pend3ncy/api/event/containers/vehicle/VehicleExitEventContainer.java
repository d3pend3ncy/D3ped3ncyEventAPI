package com.d3pend3ncy.api.event.containers.vehicle;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.vehicle.VehicleExitEventInterface;
import org.bukkit.event.vehicle.VehicleExitEvent;

public class VehicleExitEventContainer extends ContainerEvent<VehicleExitEventInterface, VehicleExitEvent> {

    public VehicleExitEventContainer(VehicleExitEvent event) {
        super(event);
    }

    @Override
    protected void call(VehicleExitEventInterface listener, VehicleExitEvent event) {
        listener.onVehicleExitEvent(event);
    }

    @Override
    public Class<VehicleExitEventInterface> getListenerType() {
        return VehicleExitEventInterface.class;
    }
}
