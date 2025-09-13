package com.d3pend3ncy.api.event.register;

import com.d3pend3ncy.api.event.core.eventManager;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.enchantment.*;
import com.d3pend3ncy.api.event.containers.enchantment.*;

public class RegisterEnchantment implements Listener {

    public RegisterEnchantment() {}

    @EventHandler
    public void onEnchantItemEvent(EnchantItemEvent event) {
        EnchantItemEventContainer container = new EnchantItemEventContainer(event);
        eventManager.fire(container);
    }
    @EventHandler
    public void onPrepareItemEnchantEvent(PrepareItemEnchantEvent event) {
        PrepareItemEnchantEventContainer container = new PrepareItemEnchantEventContainer(event);
        eventManager.fire(container);
    }

}
