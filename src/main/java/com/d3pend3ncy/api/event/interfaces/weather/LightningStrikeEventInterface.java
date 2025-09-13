package com.d3pend3ncy.api.event.interfaces.weather;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.weather.LightningStrikeEvent;

public interface LightningStrikeEventInterface extends Listener {
    void onLightningStrikeEvent(LightningStrikeEvent event);
}
