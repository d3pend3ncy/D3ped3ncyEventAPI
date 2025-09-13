package com.d3pend3ncy.api.event.interfaces.block;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.block.EntityBlockFormEvent;

public interface EntityBlockFormEventInterface extends Listener {
    void onEntityBlockFormEvent(EntityBlockFormEvent event);
}
