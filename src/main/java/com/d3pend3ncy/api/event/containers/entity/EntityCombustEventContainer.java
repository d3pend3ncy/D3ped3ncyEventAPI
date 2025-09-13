package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.EntityCombustEventInterface;
import org.bukkit.event.entity.EntityCombustEvent;

public class EntityCombustEventContainer extends ContainerEvent<EntityCombustEventInterface, EntityCombustEvent> {

    public EntityCombustEventContainer(EntityCombustEvent event) {
        super(event);
    }

    @Override
    protected void call(EntityCombustEventInterface listener, EntityCombustEvent event) {
        listener.onEntityCombustEvent(event);
    }

    @Override
    public Class<EntityCombustEventInterface> getListenerType() {
        return EntityCombustEventInterface.class;
    }
}
