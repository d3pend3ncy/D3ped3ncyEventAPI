package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.EntityTargetEventInterface;
import org.bukkit.event.entity.EntityTargetEvent;

public class EntityTargetEventContainer extends ContainerEvent<EntityTargetEventInterface, EntityTargetEvent> {

    public EntityTargetEventContainer(EntityTargetEvent event) {
        super(event);
    }

    @Override
    protected void call(EntityTargetEventInterface listener, EntityTargetEvent event) {
        listener.onEntityTargetEvent(event);
    }

    @Override
    public Class<EntityTargetEventInterface> getListenerType() {
        return EntityTargetEventInterface.class;
    }
}
