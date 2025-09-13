package com.d3pend3ncy.api.event.interfaces.block;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.block.BlockPistonRetractEvent;

public interface BlockPistonRetractEventInterface extends Listener {
    void onBlockPistonRetractEvent(BlockPistonRetractEvent event);
}
