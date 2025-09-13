package com.d3pend3ncy.api.event.containers.world;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.world.ChunkUnloadEventInterface;
import org.bukkit.event.world.ChunkUnloadEvent;

public class ChunkUnloadEventContainer extends ContainerEvent<ChunkUnloadEventInterface, ChunkUnloadEvent> {

    public ChunkUnloadEventContainer(ChunkUnloadEvent event) {
        super(event);
    }

    @Override
    protected void call(ChunkUnloadEventInterface listener, ChunkUnloadEvent event) {
        listener.onChunkUnloadEvent(event);
    }

    @Override
    public Class<ChunkUnloadEventInterface> getListenerType() {
        return ChunkUnloadEventInterface.class;
    }
}
