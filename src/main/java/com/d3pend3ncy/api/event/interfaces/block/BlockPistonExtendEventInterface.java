package com.d3pend3ncy.api.event.interfaces.block;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.block.BlockPistonExtendEvent;

public interface BlockPistonExtendEventInterface extends Listener {
    void onBlockPistonExtendEvent(BlockPistonExtendEvent event);
}
