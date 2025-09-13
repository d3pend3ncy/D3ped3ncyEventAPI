package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.EntityDamageEventInterface;
import org.bukkit.event.entity.EntityDamageEvent;

public class EntityDamageEventContainer extends ContainerEvent<EntityDamageEventInterface, EntityDamageEvent> {

    public EntityDamageEventContainer(EntityDamageEvent event) {
        super(event);
    }

    @Override
    protected void call(EntityDamageEventInterface listener, EntityDamageEvent event) {
        listener.onEntityDamageEvent(event);
    }

    @Override
    public Class<EntityDamageEventInterface> getListenerType() {
        return EntityDamageEventInterface.class;
    }
}
