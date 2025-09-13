package com.d3pend3ncy.api.event.containers.enchantment;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.enchantment.PrepareItemEnchantEventInterface;
import org.bukkit.event.enchantment.PrepareItemEnchantEvent;

public class PrepareItemEnchantEventContainer extends ContainerEvent<PrepareItemEnchantEventInterface, PrepareItemEnchantEvent> {

    public PrepareItemEnchantEventContainer(PrepareItemEnchantEvent event) {
        super(event);
    }

    @Override
    protected void call(PrepareItemEnchantEventInterface listener, PrepareItemEnchantEvent event) {
        listener.onPrepareItemEnchantEvent(event);
    }

    @Override
    public Class<PrepareItemEnchantEventInterface> getListenerType() {
        return PrepareItemEnchantEventInterface.class;
    }
}
