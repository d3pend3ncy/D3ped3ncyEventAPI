package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.EntityPortalExitEventInterface;
import org.bukkit.event.entity.EntityPortalExitEvent;

public class EntityPortalExitEventContainer extends ContainerEvent<EntityPortalExitEventInterface, EntityPortalExitEvent> {

    public EntityPortalExitEventContainer(EntityPortalExitEvent event) {
        super(event);
    }

    @Override
    protected void call(EntityPortalExitEventInterface listener, EntityPortalExitEvent event) {
        listener.onEntityPortalExitEvent(event);
    }

    @Override
    public Class<EntityPortalExitEventInterface> getListenerType() {
        return EntityPortalExitEventInterface.class;
    }
}
