package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.EntityChangeBlockEventInterface;
import org.bukkit.event.entity.EntityChangeBlockEvent;

public class EntityChangeBlockEventContainer extends ContainerEvent<EntityChangeBlockEventInterface, EntityChangeBlockEvent> {

    public EntityChangeBlockEventContainer(EntityChangeBlockEvent event) {
        super(event);
    }

    @Override
    protected void call(EntityChangeBlockEventInterface listener, EntityChangeBlockEvent event) {
        listener.onEntityChangeBlockEvent(event);
    }

    @Override
    public Class<EntityChangeBlockEventInterface> getListenerType() {
        return EntityChangeBlockEventInterface.class;
    }
}
