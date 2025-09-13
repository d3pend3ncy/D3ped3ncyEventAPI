package com.d3pend3ncy.api.event.interfaces.world;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.world.StructureGrowEvent;

public interface StructureGrowEventInterface extends Listener {
    void onStructureGrowEvent(StructureGrowEvent event);
}
