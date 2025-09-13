package com.d3pend3ncy.api.event.interfaces.vehicle;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.vehicle.VehicleDamageEvent;

public interface VehicleDamageEventInterface extends Listener {
    void onVehicleDamageEvent(VehicleDamageEvent event);
}
