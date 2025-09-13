package com.d3pend3ncy.api.event.interfaces.block;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.block.BlockDamageEvent;

public interface BlockDamageEventInterface extends Listener {
    void onBlockDamageEvent(BlockDamageEvent event);
}
