package com.d3pend3ncy.api.event.interfaces.entity;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.entity.EnderDragonChangePhaseEvent;

public interface EnderDragonChangePhaseEventInterface extends Listener {
    void onEnderDragonChangePhaseEvent(EnderDragonChangePhaseEvent event);
}
