package com.d3pend3ncy.api.event.interfaces.vehicle;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.vehicle.VehicleUpdateEvent;

public interface VehicleUpdateEventInterface extends Listener {
    void onVehicleUpdateEvent(VehicleUpdateEvent event);
}
