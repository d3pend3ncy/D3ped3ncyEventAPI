package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.ItemMergeEventInterface;
import org.bukkit.event.entity.ItemMergeEvent;

public class ItemMergeEventContainer extends ContainerEvent<ItemMergeEventInterface, ItemMergeEvent> {

    public ItemMergeEventContainer(ItemMergeEvent event) {
        super(event);
    }

    @Override
    protected void call(ItemMergeEventInterface listener, ItemMergeEvent event) {
        listener.onItemMergeEvent(event);
    }

    @Override
    public Class<ItemMergeEventInterface> getListenerType() {
        return ItemMergeEventInterface.class;
    }
}
