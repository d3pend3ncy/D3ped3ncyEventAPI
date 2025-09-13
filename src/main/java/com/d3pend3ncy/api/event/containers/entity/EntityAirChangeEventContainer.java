package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.EntityAirChangeEventInterface;
import org.bukkit.event.entity.EntityAirChangeEvent;

public class EntityAirChangeEventContainer extends ContainerEvent<EntityAirChangeEventInterface, EntityAirChangeEvent> {

    public EntityAirChangeEventContainer(EntityAirChangeEvent event) {
        super(event);
    }

    @Override
    protected void call(EntityAirChangeEventInterface listener, EntityAirChangeEvent event) {
        listener.onEntityAirChangeEvent(event);
    }

    @Override
    public Class<EntityAirChangeEventInterface> getListenerType() {
        return EntityAirChangeEventInterface.class;
    }
}
