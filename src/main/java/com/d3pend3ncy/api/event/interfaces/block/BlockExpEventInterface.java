package com.d3pend3ncy.api.event.interfaces.block;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.block.BlockExpEvent;

public interface BlockExpEventInterface extends Listener {
    void onBlockExpEvent(BlockExpEvent event);
}
