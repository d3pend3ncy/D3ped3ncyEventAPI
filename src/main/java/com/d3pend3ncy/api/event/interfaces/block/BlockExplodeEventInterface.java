package com.d3pend3ncy.api.event.interfaces.block;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.block.BlockExplodeEvent;

public interface BlockExplodeEventInterface extends Listener {
    void onBlockExplodeEvent(BlockExplodeEvent event);
}
