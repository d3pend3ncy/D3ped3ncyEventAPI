package com.d3pend3ncy.api.event.interfaces.block;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.block.BlockSpreadEvent;

public interface BlockSpreadEventInterface extends Listener {
    void onBlockSpreadEvent(BlockSpreadEvent event);
}
