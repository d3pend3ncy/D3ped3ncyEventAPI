package com.d3pend3ncy.api.event.containers.block;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.block.BlockDispenseEventInterface;
import org.bukkit.event.block.BlockDispenseEvent;

public class BlockDispenseEventContainer extends ContainerEvent<BlockDispenseEventInterface, BlockDispenseEvent> {

    public BlockDispenseEventContainer(BlockDispenseEvent event) {
        super(event);
    }

    @Override
    protected void call(BlockDispenseEventInterface listener, BlockDispenseEvent event) {
        listener.onBlockDispenseEvent(event);
    }

    @Override
    public Class<BlockDispenseEventInterface> getListenerType() {
        return BlockDispenseEventInterface.class;
    }
}
