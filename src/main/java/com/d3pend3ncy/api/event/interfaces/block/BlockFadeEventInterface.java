package com.d3pend3ncy.api.event.interfaces.block;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.block.BlockFadeEvent;

public interface BlockFadeEventInterface extends Listener {
    void onBlockFadeEvent(BlockFadeEvent event);
}
