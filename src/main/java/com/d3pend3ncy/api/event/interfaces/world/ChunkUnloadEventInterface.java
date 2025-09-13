package com.d3pend3ncy.api.event.interfaces.world;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.world.ChunkUnloadEvent;

public interface ChunkUnloadEventInterface extends Listener {
    void onChunkUnloadEvent(ChunkUnloadEvent event);
}
