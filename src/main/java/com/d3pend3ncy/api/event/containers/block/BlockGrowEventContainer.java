package com.d3pend3ncy.api.event.containers.block;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.block.BlockGrowEventInterface;
import org.bukkit.event.block.BlockGrowEvent;

public class BlockGrowEventContainer extends ContainerEvent<BlockGrowEventInterface, BlockGrowEvent> {

    public BlockGrowEventContainer(BlockGrowEvent event) {
        super(event);
    }

    @Override
    protected void call(BlockGrowEventInterface listener, BlockGrowEvent event) {
        listener.onBlockGrowEvent(event);
    }

    @Override
    public Class<BlockGrowEventInterface> getListenerType() {
        return BlockGrowEventInterface.class;
    }
}
