package com.d3pend3ncy.api.event.containers.block;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.block.BlockRedstoneEventInterface;
import org.bukkit.event.block.BlockRedstoneEvent;

public class BlockRedstoneEventContainer extends ContainerEvent<BlockRedstoneEventInterface, BlockRedstoneEvent> {

    public BlockRedstoneEventContainer(BlockRedstoneEvent event) {
        super(event);
    }

    @Override
    protected void call(BlockRedstoneEventInterface listener, BlockRedstoneEvent event) {
        listener.onBlockRedstoneEvent(event);
    }

    @Override
    public Class<BlockRedstoneEventInterface> getListenerType() {
        return BlockRedstoneEventInterface.class;
    }
}
