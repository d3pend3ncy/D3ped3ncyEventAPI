package com.d3pend3ncy.api.event.interfaces.block;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.block.BlockDispenseEvent;

public interface BlockDispenseEventInterface extends Listener {
    void onBlockDispenseEvent(BlockDispenseEvent event);
}
