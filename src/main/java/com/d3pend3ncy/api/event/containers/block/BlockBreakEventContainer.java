package com.d3pend3ncy.api.event.containers.block;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.block.BlockBreakEventInterface;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreakEventContainer extends ContainerEvent<BlockBreakEventInterface, BlockBreakEvent> {

    public BlockBreakEventContainer(BlockBreakEvent event) {
        super(event);
    }

    @Override
    protected void call(BlockBreakEventInterface listener, BlockBreakEvent event) {
        listener.onBlockBreakEvent(event);
    }

    @Override
    public Class<BlockBreakEventInterface> getListenerType() {
        return BlockBreakEventInterface.class;
    }
}
