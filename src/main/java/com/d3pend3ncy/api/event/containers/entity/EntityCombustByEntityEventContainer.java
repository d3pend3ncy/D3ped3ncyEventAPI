package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.EntityCombustByEntityEventInterface;
import org.bukkit.event.entity.EntityCombustByEntityEvent;

public class EntityCombustByEntityEventContainer extends ContainerEvent<EntityCombustByEntityEventInterface, EntityCombustByEntityEvent> {

    public EntityCombustByEntityEventContainer(EntityCombustByEntityEvent event) {
        super(event);
    }

    @Override
    protected void call(EntityCombustByEntityEventInterface listener, EntityCombustByEntityEvent event) {
        listener.onEntityCombustByEntityEvent(event);
    }

    @Override
    public Class<EntityCombustByEntityEventInterface> getListenerType() {
        return EntityCombustByEntityEventInterface.class;
    }
}
