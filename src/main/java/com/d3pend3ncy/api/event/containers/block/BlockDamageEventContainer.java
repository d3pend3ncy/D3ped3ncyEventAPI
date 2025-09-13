package com.d3pend3ncy.api.event.containers.block;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.block.BlockDamageEventInterface;
import org.bukkit.event.block.BlockDamageEvent;

public class BlockDamageEventContainer extends ContainerEvent<BlockDamageEventInterface, BlockDamageEvent> {

    public BlockDamageEventContainer(BlockDamageEvent event) {
        super(event);
    }

    @Override
    protected void call(BlockDamageEventInterface listener, BlockDamageEvent event) {
        listener.onBlockDamageEvent(event);
    }

    @Override
    public Class<BlockDamageEventInterface> getListenerType() {
        return BlockDamageEventInterface.class;
    }
}
