package com.d3pend3ncy.api.event.interfaces.block;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.block.SignChangeEvent;

public interface SignChangeEventInterface extends Listener {
    void onSignChangeEvent(SignChangeEvent event);
}
