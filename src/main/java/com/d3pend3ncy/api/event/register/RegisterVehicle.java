package com.d3pend3ncy.api.event.register;

import com.d3pend3ncy.api.event.core.eventManager;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.vehicle.*;
import com.d3pend3ncy.api.event.containers.vehicle.*;

public class RegisterVehicle implements Listener {

    public RegisterVehicle() {}

    @EventHandler
    public void onVehicleBlockCollisionEvent(VehicleBlockCollisionEvent event) {
        VehicleBlockCollisionEventContainer container = new VehicleBlockCollisionEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onVehicleCollisionEvent(VehicleCollisionEvent event) {
        VehicleCollisionEventContainer container = new VehicleCollisionEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onVehicleCreateEvent(VehicleCreateEvent event) {
        VehicleCreateEventContainer container = new VehicleCreateEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onVehicleDamageEvent(VehicleDamageEvent event) {
        VehicleDamageEventContainer container = new VehicleDamageEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onVehicleDestroyEvent(VehicleDestroyEvent event) {
        VehicleDestroyEventContainer container = new VehicleDestroyEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onVehicleEnterEvent(VehicleEnterEvent event) {
        VehicleEnterEventContainer container = new VehicleEnterEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onVehicleEntityCollisionEvent(VehicleEntityCollisionEvent event) {
        VehicleEntityCollisionEventContainer container = new VehicleEntityCollisionEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onVehicleExitEvent(VehicleExitEvent event) {
        VehicleExitEventContainer container = new VehicleExitEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onVehicleMoveEvent(VehicleMoveEvent event) {
        VehicleMoveEventContainer container = new VehicleMoveEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onVehicleUpdateEvent(VehicleUpdateEvent event) {
        VehicleUpdateEventContainer container = new VehicleUpdateEventContainer(event);
        eventManager.fire(container);
    }

}
