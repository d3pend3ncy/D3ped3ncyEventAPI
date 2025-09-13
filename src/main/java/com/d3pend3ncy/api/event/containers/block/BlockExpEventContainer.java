package com.d3pend3ncy.api.event.containers.block;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.block.BlockExpEventInterface;
import org.bukkit.event.block.BlockExpEvent;

public class BlockExpEventContainer extends ContainerEvent<BlockExpEventInterface, BlockExpEvent> {

    public BlockExpEventContainer(BlockExpEvent event) {
        super(event);
    }

    @Override
    protected void call(BlockExpEventInterface listener, BlockExpEvent event) {
        listener.onBlockExpEvent(event);
    }

    @Override
    public Class<BlockExpEventInterface> getListenerType() {
        return BlockExpEventInterface.class;
    }
}
