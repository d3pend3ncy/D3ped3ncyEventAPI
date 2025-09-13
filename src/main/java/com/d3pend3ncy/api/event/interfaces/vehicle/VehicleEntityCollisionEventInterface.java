package com.d3pend3ncy.api.event.interfaces.vehicle;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.vehicle.VehicleEntityCollisionEvent;

public interface VehicleEntityCollisionEventInterface extends Listener {
    void onVehicleEntityCollisionEvent(VehicleEntityCollisionEvent event);
}
