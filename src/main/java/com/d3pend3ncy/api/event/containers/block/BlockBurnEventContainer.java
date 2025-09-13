package com.d3pend3ncy.api.event.containers.block;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.block.BlockBurnEventInterface;
import org.bukkit.event.block.BlockBurnEvent;

public class BlockBurnEventContainer extends ContainerEvent<BlockBurnEventInterface, BlockBurnEvent> {

    public BlockBurnEventContainer(BlockBurnEvent event) {
        super(event);
    }

    @Override
    protected void call(BlockBurnEventInterface listener, BlockBurnEvent event) {
        listener.onBlockBurnEvent(event);
    }

    @Override
    public Class<BlockBurnEventInterface> getListenerType() {
        return BlockBurnEventInterface.class;
    }
}
