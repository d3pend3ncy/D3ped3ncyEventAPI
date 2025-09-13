package com.d3pend3ncy.api.event.containers.block;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.block.BlockPistonExtendEventInterface;
import org.bukkit.event.block.BlockPistonExtendEvent;

public class BlockPistonExtendEventContainer extends ContainerEvent<BlockPistonExtendEventInterface, BlockPistonExtendEvent> {

    public BlockPistonExtendEventContainer(BlockPistonExtendEvent event) {
        super(event);
    }

    @Override
    protected void call(BlockPistonExtendEventInterface listener, BlockPistonExtendEvent event) {
        listener.onBlockPistonExtendEvent(event);
    }

    @Override
    public Class<BlockPistonExtendEventInterface> getListenerType() {
        return BlockPistonExtendEventInterface.class;
    }
}
