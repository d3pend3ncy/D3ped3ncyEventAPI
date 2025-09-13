package com.d3pend3ncy.api.event.interfaces.block;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.block.BlockMultiPlaceEvent;

public interface BlockMultiPlaceEventInterface extends Listener {
    void onBlockMultiPlaceEvent(BlockMultiPlaceEvent event);
}
