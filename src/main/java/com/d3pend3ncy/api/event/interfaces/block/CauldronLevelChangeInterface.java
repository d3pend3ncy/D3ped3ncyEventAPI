package com.d3pend3ncy.api.event.interfaces.block;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.block.CauldronLevelChangeEvent;

public interface CauldronLevelChangeInterface extends Listener {
    void onCauldronLevelChange(CauldronLevelChangeEvent event);
}
