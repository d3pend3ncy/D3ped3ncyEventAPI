package com.d3pend3ncy.api.event.containers.block;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.block.BlockDispenseArmorEventInterface;
import org.bukkit.event.block.BlockDispenseArmorEvent;

public class BlockDispenseArmorEventContainer extends ContainerEvent<BlockDispenseArmorEventInterface, BlockDispenseArmorEvent> {

    public BlockDispenseArmorEventContainer(BlockDispenseArmorEvent event) {
        super(event);
    }

    @Override
    protected void call(BlockDispenseArmorEventInterface listener, BlockDispenseArmorEvent event) {
        listener.onBlockDispenseArmorEvent(event);
    }

    @Override
    public Class<BlockDispenseArmorEventInterface> getListenerType() {
        return BlockDispenseArmorEventInterface.class;
    }
}
