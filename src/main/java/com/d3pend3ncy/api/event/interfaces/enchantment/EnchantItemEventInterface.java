package com.d3pend3ncy.api.event.interfaces.enchantment;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.enchantment.EnchantItemEvent;

public interface EnchantItemEventInterface extends Listener {
    void onEnchantItemEvent(EnchantItemEvent event);
}
