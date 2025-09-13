package com.d3pend3ncy.api.event.interfaces.world;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.world.ChunkLoadEvent;

public interface ChunkLoadEventInterface extends Listener {
    void onChunkLoadEvent(ChunkLoadEvent event);
}
