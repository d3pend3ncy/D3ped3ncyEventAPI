package com.d3pend3ncy.api.event.interfaces.vehicle;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.vehicle.VehicleCreateEvent;

public interface VehicleCreateEventInterface extends Listener {
    void onVehicleCreateEvent(VehicleCreateEvent event);
}
