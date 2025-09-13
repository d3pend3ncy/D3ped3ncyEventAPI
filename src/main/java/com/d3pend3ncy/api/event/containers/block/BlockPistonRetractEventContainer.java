package com.d3pend3ncy.api.event.containers.block;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.block.BlockPistonRetractEventInterface;
import org.bukkit.event.block.BlockPistonRetractEvent;

public class BlockPistonRetractEventContainer extends ContainerEvent<BlockPistonRetractEventInterface, BlockPistonRetractEvent> {

    public BlockPistonRetractEventContainer(BlockPistonRetractEvent event) {
        super(event);
    }

    @Override
    protected void call(BlockPistonRetractEventInterface listener, BlockPistonRetractEvent event) {
        listener.onBlockPistonRetractEvent(event);
    }

    @Override
    public Class<BlockPistonRetractEventInterface> getListenerType() {
        return BlockPistonRetractEventInterface.class;
    }
}
