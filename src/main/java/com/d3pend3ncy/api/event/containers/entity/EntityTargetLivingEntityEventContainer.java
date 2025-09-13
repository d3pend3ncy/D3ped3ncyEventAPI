package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.EntityTargetLivingEntityEventInterface;
import org.bukkit.event.entity.EntityTargetLivingEntityEvent;

public class EntityTargetLivingEntityEventContainer extends ContainerEvent<EntityTargetLivingEntityEventInterface, EntityTargetLivingEntityEvent> {

    public EntityTargetLivingEntityEventContainer(EntityTargetLivingEntityEvent event) {
        super(event);
    }

    @Override
    protected void call(EntityTargetLivingEntityEventInterface listener, EntityTargetLivingEntityEvent event) {
        listener.onEntityTargetLivingEntityEvent(event);
    }

    @Override
    public Class<EntityTargetLivingEntityEventInterface> getListenerType() {
        return EntityTargetLivingEntityEventInterface.class;
    }
}
