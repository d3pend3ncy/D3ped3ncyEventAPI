package com.d3pend3ncy.api.event.interfaces.block;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.block.BlockRedstoneEvent;

public interface BlockRedstoneEventInterface extends Listener {
    void onBlockRedstoneEvent(BlockRedstoneEvent event);
}
