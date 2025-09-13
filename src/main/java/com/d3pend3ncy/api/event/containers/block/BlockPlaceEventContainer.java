package com.d3pend3ncy.api.event.containers.block;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.block.BlockPlaceEventInterface;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockPlaceEventContainer extends ContainerEvent<BlockPlaceEventInterface, BlockPlaceEvent> {

    public BlockPlaceEventContainer(BlockPlaceEvent event) {
        super(event);
    }

    @Override
    protected void call(BlockPlaceEventInterface listener, BlockPlaceEvent event) {
        listener.onBlockPlaceEvent(event);
    }

    @Override
    public Class<BlockPlaceEventInterface> getListenerType() {
        return BlockPlaceEventInterface.class;
    }
}
