package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.EntityBreedEventInterface;
import org.bukkit.event.entity.EntityBreedEvent;

public class EntityBreedEventContainer extends ContainerEvent<EntityBreedEventInterface, EntityBreedEvent> {

    public EntityBreedEventContainer(EntityBreedEvent event) {
        super(event);
    }

    @Override
    protected void call(EntityBreedEventInterface listener, EntityBreedEvent event) {
        listener.onEntityBreedEvent(event);
    }

    @Override
    public Class<EntityBreedEventInterface> getListenerType() {
        return EntityBreedEventInterface.class;
    }
}
