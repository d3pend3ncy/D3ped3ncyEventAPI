package com.d3pend3ncy.api.event.containers.inventory;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.inventory.PrepareItemCraftEventInterface;
import org.bukkit.event.inventory.PrepareItemCraftEvent;

public class PrepareItemCraftEventContainer extends ContainerEvent<PrepareItemCraftEventInterface, PrepareItemCraftEvent> {

    public PrepareItemCraftEventContainer(PrepareItemCraftEvent event) {
        super(event);
    }

    @Override
    protected void call(PrepareItemCraftEventInterface listener, PrepareItemCraftEvent event) {
        listener.onPrepareItemCraftEvent(event);
    }

    @Override
    public Class<PrepareItemCraftEventInterface> getListenerType() {
        return PrepareItemCraftEventInterface.class;
    }
}
