package com.d3pend3ncy.api.event.containers.block;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.block.BlockFadeEventInterface;
import org.bukkit.event.block.BlockFadeEvent;

public class BlockFadeEventContainer extends ContainerEvent<BlockFadeEventInterface, BlockFadeEvent> {

    public BlockFadeEventContainer(BlockFadeEvent event) {
        super(event);
    }

    @Override
    protected void call(BlockFadeEventInterface listener, BlockFadeEvent event) {
        listener.onBlockFadeEvent(event);
    }

    @Override
    public Class<BlockFadeEventInterface> getListenerType() {
        return BlockFadeEventInterface.class;
    }
}
