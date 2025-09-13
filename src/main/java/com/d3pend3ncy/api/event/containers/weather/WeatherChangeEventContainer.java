package com.d3pend3ncy.api.event.containers.weather;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.weather.WeatherChangeEventInterface;
import org.bukkit.event.weather.WeatherChangeEvent;

public class WeatherChangeEventContainer extends ContainerEvent<WeatherChangeEventInterface, WeatherChangeEvent> {

    public WeatherChangeEventContainer(WeatherChangeEvent event) {
        super(event);
    }

    @Override
    protected void call(WeatherChangeEventInterface listener, WeatherChangeEvent event) {
        listener.onWeatherChangeEvent(event);
    }

    @Override
    public Class<WeatherChangeEventInterface> getListenerType() {
        return WeatherChangeEventInterface.class;
    }
}
