package com.d3pend3ncy.api.event.interfaces.block;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.block.BlockFromToEvent;

public interface BlockFromToEventInterface extends Listener {
    void onBlockFromToEvent(BlockFromToEvent event);
}
