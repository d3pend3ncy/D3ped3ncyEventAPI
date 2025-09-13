package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.EntityCombustByBlockEventInterface;
import org.bukkit.event.entity.EntityCombustByBlockEvent;

public class EntityCombustByBlockEventContainer extends ContainerEvent<EntityCombustByBlockEventInterface, EntityCombustByBlockEvent> {

    public EntityCombustByBlockEventContainer(EntityCombustByBlockEvent event) {
        super(event);
    }

    @Override
    protected void call(EntityCombustByBlockEventInterface listener, EntityCombustByBlockEvent event) {
        listener.onEntityCombustByBlockEvent(event);
    }

    @Override
    public Class<EntityCombustByBlockEventInterface> getListenerType() {
        return EntityCombustByBlockEventInterface.class;
    }
}
