package com.d3pend3ncy.api.event.interfaces.block;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.block.BlockBurnEvent;

public interface BlockBurnEventInterface extends Listener {
    void onBlockBurnEvent(BlockBurnEvent event);
}
