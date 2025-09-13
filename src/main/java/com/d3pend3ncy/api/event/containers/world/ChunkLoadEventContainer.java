package com.d3pend3ncy.api.event.containers.world;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.world.ChunkLoadEventInterface;
import org.bukkit.event.world.ChunkLoadEvent;

public class ChunkLoadEventContainer extends ContainerEvent<ChunkLoadEventInterface, ChunkLoadEvent> {

    public ChunkLoadEventContainer(ChunkLoadEvent event) {
        super(event);
    }

    @Override
    protected void call(ChunkLoadEventInterface listener, ChunkLoadEvent event) {
        listener.onChunkLoadEvent(event);
    }

    @Override
    public Class<ChunkLoadEventInterface> getListenerType() {
        return ChunkLoadEventInterface.class;
    }
}
