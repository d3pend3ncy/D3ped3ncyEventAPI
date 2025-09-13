package com.d3pend3ncy.api.event.interfaces.block;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.block.BlockIgniteEvent;

public interface BlockIgniteEventInterface extends Listener {
    void onBlockIgniteEvent(BlockIgniteEvent event);
}
