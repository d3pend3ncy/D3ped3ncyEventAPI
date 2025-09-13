package com.d3pend3ncy.api.event.interfaces.entity;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.entity.FireworkExplodeEvent;

public interface FireworkExplodeEventInterface extends Listener {
    void onFireworkExplodeEvent(FireworkExplodeEvent event);
}
