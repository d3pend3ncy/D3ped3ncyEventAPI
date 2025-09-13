package com.d3pend3ncy.api.event.interfaces.weather;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.weather.ThunderChangeEvent;

public interface ThunderChangeEventInterface extends Listener {
    void onThunderChangeEvent(ThunderChangeEvent event);
}
