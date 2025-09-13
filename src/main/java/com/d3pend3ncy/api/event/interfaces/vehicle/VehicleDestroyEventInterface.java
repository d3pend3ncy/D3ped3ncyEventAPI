package com.d3pend3ncy.api.event.interfaces.vehicle;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.vehicle.VehicleDestroyEvent;

public interface VehicleDestroyEventInterface extends Listener {
    void onVehicleDestroyEvent(VehicleDestroyEvent event);
}
