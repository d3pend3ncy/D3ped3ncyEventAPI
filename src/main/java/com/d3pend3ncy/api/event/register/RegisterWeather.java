package com.d3pend3ncy.api.event.register;

import com.d3pend3ncy.api.event.core.eventManager;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.weather.*;
import com.d3pend3ncy.api.event.containers.weather.*;

public class RegisterWeather implements Listener {

    public RegisterWeather() {}

    @EventHandler
    public void onLightningStrikeEvent(LightningStrikeEvent event) {
        LightningStrikeEventContainer container = new LightningStrikeEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onThunderChangeEvent(ThunderChangeEvent event) {
        ThunderChangeEventContainer container = new ThunderChangeEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onWeatherChangeEvent(WeatherChangeEvent event) {
        WeatherChangeEventContainer container = new WeatherChangeEventContainer(event);
        eventManager.fire(container);
    }

}
