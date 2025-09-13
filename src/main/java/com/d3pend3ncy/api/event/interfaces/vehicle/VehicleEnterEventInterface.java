package com.d3pend3ncy.api.event.interfaces.vehicle;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.vehicle.VehicleEnterEvent;

public interface VehicleEnterEventInterface extends Listener {
    void onVehicleEnterEvent(VehicleEnterEvent event);
}
