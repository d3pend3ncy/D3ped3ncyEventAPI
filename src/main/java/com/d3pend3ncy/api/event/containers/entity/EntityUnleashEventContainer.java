package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.EntityUnleashEventInterface;
import org.bukkit.event.entity.EntityUnleashEvent;

public class EntityUnleashEventContainer extends ContainerEvent<EntityUnleashEventInterface, EntityUnleashEvent> {

    public EntityUnleashEventContainer(EntityUnleashEvent event) {
        super(event);
    }

    @Override
    protected void call(EntityUnleashEventInterface listener, EntityUnleashEvent event) {
        listener.onEntityUnleashEvent(event);
    }

    @Override
    public Class<EntityUnleashEventInterface> getListenerType() {
        return EntityUnleashEventInterface.class;
    }
}
