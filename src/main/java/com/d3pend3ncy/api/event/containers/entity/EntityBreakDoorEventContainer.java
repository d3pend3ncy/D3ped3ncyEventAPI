package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.EntityBreakDoorEventInterface;
import org.bukkit.event.entity.EntityBreakDoorEvent;

public class EntityBreakDoorEventContainer extends ContainerEvent<EntityBreakDoorEventInterface, EntityBreakDoorEvent> {

    public EntityBreakDoorEventContainer(EntityBreakDoorEvent event) {
        super(event);
    }

    @Override
    protected void call(EntityBreakDoorEventInterface listener, EntityBreakDoorEvent event) {
        listener.onEntityBreakDoorEvent(event);
    }

    @Override
    public Class<EntityBreakDoorEventInterface> getListenerType() {
        return EntityBreakDoorEventInterface.class;
    }
}
