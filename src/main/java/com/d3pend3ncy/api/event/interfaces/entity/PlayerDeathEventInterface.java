package com.d3pend3ncy.api.event.interfaces.entity;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public interface PlayerDeathEventInterface extends Listener {
    void onPlayerDeathEvent(PlayerDeathEvent event);
}
