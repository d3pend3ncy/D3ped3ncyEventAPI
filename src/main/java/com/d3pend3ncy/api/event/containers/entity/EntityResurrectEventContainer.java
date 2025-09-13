package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.EntityResurrectEventInterface;
import org.bukkit.event.entity.EntityResurrectEvent;

public class EntityResurrectEventContainer extends ContainerEvent<EntityResurrectEventInterface, EntityResurrectEvent> {

    public EntityResurrectEventContainer(EntityResurrectEvent event) {
        super(event);
    }

    @Override
    protected void call(EntityResurrectEventInterface listener, EntityResurrectEvent event) {
        listener.onEntityResurrectEvent(event);
    }

    @Override
    public Class<EntityResurrectEventInterface> getListenerType() {
        return EntityResurrectEventInterface.class;
    }
}
