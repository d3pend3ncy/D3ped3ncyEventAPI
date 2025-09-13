package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.EntityRegainHealthEventInterface;
import org.bukkit.event.entity.EntityRegainHealthEvent;

public class EntityRegainHealthEventContainer extends ContainerEvent<EntityRegainHealthEventInterface, EntityRegainHealthEvent> {

    public EntityRegainHealthEventContainer(EntityRegainHealthEvent event) {
        super(event);
    }

    @Override
    protected void call(EntityRegainHealthEventInterface listener, EntityRegainHealthEvent event) {
        listener.onEntityRegainHealthEvent(event);
    }

    @Override
    public Class<EntityRegainHealthEventInterface> getListenerType() {
        return EntityRegainHealthEventInterface.class;
    }
}
