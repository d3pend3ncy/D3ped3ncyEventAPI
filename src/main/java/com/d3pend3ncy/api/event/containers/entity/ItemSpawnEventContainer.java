package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.ItemSpawnEventInterface;
import org.bukkit.event.entity.ItemSpawnEvent;

public class ItemSpawnEventContainer extends ContainerEvent<ItemSpawnEventInterface, ItemSpawnEvent> {

    public ItemSpawnEventContainer(ItemSpawnEvent event) {
        super(event);
    }

    @Override
    protected void call(ItemSpawnEventInterface listener, ItemSpawnEvent event) {
        listener.onItemSpawnEvent(event);
    }

    @Override
    public Class<ItemSpawnEventInterface> getListenerType() {
        return ItemSpawnEventInterface.class;
    }
}
