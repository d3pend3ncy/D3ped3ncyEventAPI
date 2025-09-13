package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.EntityCreatePortalEventInterface;
import org.bukkit.event.entity.EntityCreatePortalEvent;

public class EntityCreatePortalEventContainer extends ContainerEvent<EntityCreatePortalEventInterface, EntityCreatePortalEvent> {

    public EntityCreatePortalEventContainer(EntityCreatePortalEvent event) {
        super(event);
    }

    @Override
    protected void call(EntityCreatePortalEventInterface listener, EntityCreatePortalEvent event) {
        listener.onEntityCreatePortalEvent(event);
    }

    @Override
    public Class<EntityCreatePortalEventInterface> getListenerType() {
        return EntityCreatePortalEventInterface.class;
    }
}
