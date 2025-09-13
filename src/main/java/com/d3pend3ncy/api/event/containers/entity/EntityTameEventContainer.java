package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.EntityTameEventInterface;
import org.bukkit.event.entity.EntityTameEvent;

public class EntityTameEventContainer extends ContainerEvent<EntityTameEventInterface, EntityTameEvent> {

    public EntityTameEventContainer(EntityTameEvent event) {
        super(event);
    }

    @Override
    protected void call(EntityTameEventInterface listener, EntityTameEvent event) {
        listener.onEntityTameEvent(event);
    }

    @Override
    public Class<EntityTameEventInterface> getListenerType() {
        return EntityTameEventInterface.class;
    }
}
