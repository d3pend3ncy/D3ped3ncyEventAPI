package com.d3pend3ncy.api.event.containers.block;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.block.BlockFertilizeEventInterface;
import org.bukkit.event.block.BlockFertilizeEvent;

public class BlockFertilizeEventContainer extends ContainerEvent<BlockFertilizeEventInterface, BlockFertilizeEvent> {

    public BlockFertilizeEventContainer(BlockFertilizeEvent event) {
        super(event);
    }

    @Override
    protected void call(BlockFertilizeEventInterface listener, BlockFertilizeEvent event) {
        listener.onBlockFertilizeEvent(event);
    }

    @Override
    public Class<BlockFertilizeEventInterface> getListenerType() {
        return BlockFertilizeEventInterface.class;
    }
}
