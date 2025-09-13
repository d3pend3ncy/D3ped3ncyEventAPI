package com.d3pend3ncy.api.event.containers.block;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.block.BlockFormEventInterface;
import org.bukkit.event.block.BlockFormEvent;

public class BlockFormEventContainer extends ContainerEvent<BlockFormEventInterface, BlockFormEvent> {

    public BlockFormEventContainer(BlockFormEvent event) {
        super(event);
    }

    @Override
    protected void call(BlockFormEventInterface listener, BlockFormEvent event) {
        listener.onBlockFormEvent(event);
    }

    @Override
    public Class<BlockFormEventInterface> getListenerType() {
        return BlockFormEventInterface.class;
    }
}
