package com.d3pend3ncy.api.event.interfaces.vehicle;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.vehicle.VehicleBlockCollisionEvent;

public interface VehicleBlockCollisionEventInterface extends Listener {
    void onVehicleBlockCollisionEvent(VehicleBlockCollisionEvent event);
}
