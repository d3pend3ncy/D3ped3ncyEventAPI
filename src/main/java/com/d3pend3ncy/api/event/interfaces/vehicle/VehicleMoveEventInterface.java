package com.d3pend3ncy.api.event.interfaces.vehicle;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.vehicle.VehicleMoveEvent;

public interface VehicleMoveEventInterface extends Listener {
    void onVehicleMoveEvent(VehicleMoveEvent event);
}
