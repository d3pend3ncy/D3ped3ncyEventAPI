package com.d3pend3ncy.api.event.interfaces.vehicle;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.vehicle.VehicleExitEvent;

public interface VehicleExitEventInterface extends Listener {
    void onVehicleExitEvent(VehicleExitEvent event);
}
