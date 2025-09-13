package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.EntityPortalEnterEventInterface;
import org.bukkit.event.entity.EntityPortalEnterEvent;

public class EntityPortalEnterEventContainer extends ContainerEvent<EntityPortalEnterEventInterface, EntityPortalEnterEvent> {

    public EntityPortalEnterEventContainer(EntityPortalEnterEvent event) {
        super(event);
    }

    @Override
    protected void call(EntityPortalEnterEventInterface listener, EntityPortalEnterEvent event) {
        listener.onEntityPortalEnterEvent(event);
    }

    @Override
    public Class<EntityPortalEnterEventInterface> getListenerType() {
        return EntityPortalEnterEventInterface.class;
    }
}
