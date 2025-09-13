package com.d3pend3ncy.api.event.interfaces.entity;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.entity.PigZapEvent;

public interface PigZapEventInterface extends Listener {
    void onPigZapEvent(PigZapEvent event);
}
