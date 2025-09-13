package com.d3pend3ncy.api.event.interfaces.entity;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.entity.CreeperPowerEvent;

public interface CreeperPowerEventInterface extends Listener {
    void onCreeperPowerEvent(CreeperPowerEvent event);
}
