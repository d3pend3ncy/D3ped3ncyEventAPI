package com.d3pend3ncy.api.event.containers.block;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.block.BlockExplodeEventInterface;
import org.bukkit.event.block.BlockExplodeEvent;

public class BlockExplodeEventContainer extends ContainerEvent<BlockExplodeEventInterface, BlockExplodeEvent> {

    public BlockExplodeEventContainer(BlockExplodeEvent event) {
        super(event);
    }

    @Override
    protected void call(BlockExplodeEventInterface listener, BlockExplodeEvent event) {
        listener.onBlockExplodeEvent(event);
    }

    @Override
    public Class<BlockExplodeEventInterface> getListenerType() {
        return BlockExplodeEventInterface.class;
    }
}
