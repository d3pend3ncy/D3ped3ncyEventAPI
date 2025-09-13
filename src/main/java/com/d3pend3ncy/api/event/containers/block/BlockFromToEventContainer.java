package com.d3pend3ncy.api.event.containers.block;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.block.BlockFromToEventInterface;
import org.bukkit.event.block.BlockFromToEvent;

public class BlockFromToEventContainer extends ContainerEvent<BlockFromToEventInterface, BlockFromToEvent> {

    public BlockFromToEventContainer(BlockFromToEvent event) {
        super(event);
    }

    @Override
    protected void call(BlockFromToEventInterface listener, BlockFromToEvent event) {
        listener.onBlockFromToEvent(event);
    }

    @Override
    public Class<BlockFromToEventInterface> getListenerType() {
        return BlockFromToEventInterface.class;
    }
}
