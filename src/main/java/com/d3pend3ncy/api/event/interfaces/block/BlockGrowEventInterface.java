package com.d3pend3ncy.api.event.interfaces.block;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.block.BlockGrowEvent;

public interface BlockGrowEventInterface extends Listener {
    void onBlockGrowEvent(BlockGrowEvent event);
}
