package com.d3pend3ncy.api.event.interfaces.entity;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.entity.SlimeSplitEvent;

public interface SlimeSplitEventInterface extends Listener {
    void onSlimeSplitEvent(SlimeSplitEvent event);
}
