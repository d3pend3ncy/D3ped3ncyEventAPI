package com.d3pend3ncy.api.event.containers.block;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.block.BlockMultiPlaceEventInterface;
import org.bukkit.event.block.BlockMultiPlaceEvent;

public class BlockMultiPlaceEventContainer extends ContainerEvent<BlockMultiPlaceEventInterface, BlockMultiPlaceEvent> {

    public BlockMultiPlaceEventContainer(BlockMultiPlaceEvent event) {
        super(event);
    }

    @Override
    protected void call(BlockMultiPlaceEventInterface listener, BlockMultiPlaceEvent event) {
        listener.onBlockMultiPlaceEvent(event);
    }

    @Override
    public Class<BlockMultiPlaceEventInterface> getListenerType() {
        return BlockMultiPlaceEventInterface.class;
    }
}
