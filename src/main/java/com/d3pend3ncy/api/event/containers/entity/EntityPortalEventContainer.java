package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.EntityPortalEventInterface;
import org.bukkit.event.entity.EntityPortalEvent;

public class EntityPortalEventContainer extends ContainerEvent<EntityPortalEventInterface, EntityPortalEvent> {

    public EntityPortalEventContainer(EntityPortalEvent event) {
        super(event);
    }

    @Override
    protected void call(EntityPortalEventInterface listener, EntityPortalEvent event) {
        listener.onEntityPortalEvent(event);
    }

    @Override
    public Class<EntityPortalEventInterface> getListenerType() {
        return EntityPortalEventInterface.class;
    }
}
