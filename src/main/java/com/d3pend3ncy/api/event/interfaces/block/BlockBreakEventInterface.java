package com.d3pend3ncy.api.event.interfaces.block;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public interface BlockBreakEventInterface extends Listener {
    void onBlockBreakEvent(BlockBreakEvent event);
}
