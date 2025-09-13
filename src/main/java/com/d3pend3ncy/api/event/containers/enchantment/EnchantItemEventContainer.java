package com.d3pend3ncy.api.event.containers.enchantment;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.enchantment.EnchantItemEventInterface;
import org.bukkit.event.enchantment.EnchantItemEvent;

public class EnchantItemEventContainer extends ContainerEvent<EnchantItemEventInterface, EnchantItemEvent> {

    public EnchantItemEventContainer(EnchantItemEvent event) {
        super(event);
    }

    @Override
    protected void call(EnchantItemEventInterface listener, EnchantItemEvent event) {
        listener.onEnchantItemEvent(event);
    }

    @Override
    public Class<EnchantItemEventInterface> getListenerType() {
        return EnchantItemEventInterface.class;
    }
}
