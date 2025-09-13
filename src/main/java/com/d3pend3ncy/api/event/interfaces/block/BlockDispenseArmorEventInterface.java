package com.d3pend3ncy.api.event.interfaces.block;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.block.BlockDispenseArmorEvent;

public interface BlockDispenseArmorEventInterface extends Listener {
    void onBlockDispenseArmorEvent(BlockDispenseArmorEvent event);
}
