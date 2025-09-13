package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.EntityInteractEventInterface;
import org.bukkit.event.entity.EntityInteractEvent;

public class EntityInteractEventContainer extends ContainerEvent<EntityInteractEventInterface, EntityInteractEvent> {

    public EntityInteractEventContainer(EntityInteractEvent event) {
        super(event);
    }

    @Override
    protected void call(EntityInteractEventInterface listener, EntityInteractEvent event) {
        listener.onEntityInteractEvent(event);
    }

    @Override
    public Class<EntityInteractEventInterface> getListenerType() {
        return EntityInteractEventInterface.class;
    }
}
