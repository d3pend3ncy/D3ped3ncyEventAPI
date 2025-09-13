package com.d3pend3ncy.api.event.containers.block;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.block.BlockSpreadEventInterface;
import org.bukkit.event.block.BlockSpreadEvent;

public class BlockSpreadEventContainer extends ContainerEvent<BlockSpreadEventInterface, BlockSpreadEvent> {

    public BlockSpreadEventContainer(BlockSpreadEvent event) {
        super(event);
    }

    @Override
    protected void call(BlockSpreadEventInterface listener, BlockSpreadEvent event) {
        listener.onBlockSpreadEvent(event);
    }

    @Override
    public Class<BlockSpreadEventInterface> getListenerType() {
        return BlockSpreadEventInterface.class;
    }
}
