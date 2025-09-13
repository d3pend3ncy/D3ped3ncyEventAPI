package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.EntityPickupItemEventInterface;
import org.bukkit.event.entity.EntityPickupItemEvent;

public class EntityPickupItemEventContainer extends ContainerEvent<EntityPickupItemEventInterface, EntityPickupItemEvent> {

    public EntityPickupItemEventContainer(EntityPickupItemEvent event) {
        super(event);
    }

    @Override
    protected void call(EntityPickupItemEventInterface listener, EntityPickupItemEvent event) {
        listener.onEntityPickupItemEvent(event);
    }

    @Override
    public Class<EntityPickupItemEventInterface> getListenerType() {
        return EntityPickupItemEventInterface.class;
    }
}
