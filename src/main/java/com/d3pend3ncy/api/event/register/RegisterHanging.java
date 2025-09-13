package com.d3pend3ncy.api.event.register;

import com.d3pend3ncy.api.event.core.eventManager;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.hanging.*;
import com.d3pend3ncy.api.event.containers.hanging.*;

public class RegisterHanging implements Listener {

    public RegisterHanging() {}

    @EventHandler
    public void onHangingBreakEvent(HangingBreakEvent event) {
        HangingBreakEventContainer container = new HangingBreakEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onHangingBreakByEntityEvent(HangingBreakByEntityEvent event) {
        HangingBreakByEntityEventContainer container = new HangingBreakByEntityEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onHangingPlaceEvent(HangingPlaceEvent event) {
        HangingPlaceEventContainer container = new HangingPlaceEventContainer(event);
        eventManager.fire(container);
    }

}
