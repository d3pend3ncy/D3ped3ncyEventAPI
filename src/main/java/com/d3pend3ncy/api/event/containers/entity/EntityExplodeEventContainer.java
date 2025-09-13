package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.EntityExplodeEventInterface;
import org.bukkit.event.entity.EntityExplodeEvent;

public class EntityExplodeEventContainer extends ContainerEvent<EntityExplodeEventInterface, EntityExplodeEvent> {

    public EntityExplodeEventContainer(EntityExplodeEvent event) {
        super(event);
    }

    @Override
    protected void call(EntityExplodeEventInterface listener, EntityExplodeEvent event) {
        listener.onEntityExplodeEvent(event);
    }

    @Override
    public Class<EntityExplodeEventInterface> getListenerType() {
        return EntityExplodeEventInterface.class;
    }
}
