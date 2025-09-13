package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.EntityDeathEventInterface;
import org.bukkit.event.entity.EntityDeathEvent;

public class EntityDeathEventContainer extends ContainerEvent<EntityDeathEventInterface, EntityDeathEvent> {

    public EntityDeathEventContainer(EntityDeathEvent event) {
        super(event);
    }

    @Override
    protected void call(EntityDeathEventInterface listener, EntityDeathEvent event) {
        listener.onEntityDeathEvent(event);
    }

    @Override
    public Class<EntityDeathEventInterface> getListenerType() {
        return EntityDeathEventInterface.class;
    }
}
