package com.d3pend3ncy.api.event.interfaces.block;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public interface BlockPlaceEventInterface extends Listener {
    void onBlockPlaceEvent(BlockPlaceEvent event);
}
