package com.d3pend3ncy.api.event.interfaces.enchantment;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.enchantment.PrepareItemEnchantEvent;

public interface PrepareItemEnchantEventInterface extends Listener {
    void onPrepareItemEnchantEvent(PrepareItemEnchantEvent event);
}
