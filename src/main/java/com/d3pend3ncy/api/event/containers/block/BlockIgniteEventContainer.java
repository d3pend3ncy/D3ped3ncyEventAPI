package com.d3pend3ncy.api.event.containers.block;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.block.BlockIgniteEventInterface;
import org.bukkit.event.block.BlockIgniteEvent;

public class BlockIgniteEventContainer extends ContainerEvent<BlockIgniteEventInterface, BlockIgniteEvent> {

    public BlockIgniteEventContainer(BlockIgniteEvent event) {
        super(event);
    }

    @Override
    protected void call(BlockIgniteEventInterface listener, BlockIgniteEvent event) {
        listener.onBlockIgniteEvent(event);
    }

    @Override
    public Class<BlockIgniteEventInterface> getListenerType() {
        return BlockIgniteEventInterface.class;
    }
}
