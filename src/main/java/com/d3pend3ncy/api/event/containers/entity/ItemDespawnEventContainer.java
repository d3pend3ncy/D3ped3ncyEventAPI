package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.ItemDespawnEventInterface;
import org.bukkit.event.entity.ItemDespawnEvent;

public class ItemDespawnEventContainer extends ContainerEvent<ItemDespawnEventInterface, ItemDespawnEvent> {

    public ItemDespawnEventContainer(ItemDespawnEvent event) {
        super(event);
    }

    @Override
    protected void call(ItemDespawnEventInterface listener, ItemDespawnEvent event) {
        listener.onItemDespawnEvent(event);
    }

    @Override
    public Class<ItemDespawnEventInterface> getListenerType() {
        return ItemDespawnEventInterface.class;
    }
}
