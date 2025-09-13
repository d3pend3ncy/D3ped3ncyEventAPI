package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.EntityDropItemEventInterface;
import org.bukkit.event.entity.EntityDropItemEvent;

public class EntityDropItemEventContainer extends ContainerEvent<EntityDropItemEventInterface, EntityDropItemEvent> {

    public EntityDropItemEventContainer(EntityDropItemEvent event) {
        super(event);
    }

    @Override
    protected void call(EntityDropItemEventInterface listener, EntityDropItemEvent event) {
        listener.onEntityDropItemEvent(event);
    }

    @Override
    public Class<EntityDropItemEventInterface> getListenerType() {
        return EntityDropItemEventInterface.class;
    }
}
