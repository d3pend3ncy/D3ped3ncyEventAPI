package com.d3pend3ncy.api.event.interfaces.vehicle;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.vehicle.VehicleCollisionEvent;

public interface VehicleCollisionEventInterface extends Listener {
    void onVehicleCollisionEvent(VehicleCollisionEvent event);
}
