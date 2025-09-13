package com.d3pend3ncy.api.event.interfaces.weather;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;

public interface WeatherChangeEventInterface extends Listener {
    void onWeatherChangeEvent(WeatherChangeEvent event);
}
