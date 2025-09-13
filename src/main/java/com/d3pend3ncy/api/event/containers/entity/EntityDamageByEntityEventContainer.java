package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.EntityDamageByEntityEventInterface;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class EntityDamageByEntityEventContainer extends ContainerEvent<EntityDamageByEntityEventInterface, EntityDamageByEntityEvent> {

    public EntityDamageByEntityEventContainer(EntityDamageByEntityEvent event) {
        super(event);
    }

    @Override
    protected void call(EntityDamageByEntityEventInterface listener, EntityDamageByEntityEvent event) {
        listener.onEntityDamageByEntityEvent(event);
    }

    @Override
    public Class<EntityDamageByEntityEventInterface> getListenerType() {
        return EntityDamageByEntityEventInterface.class;
    }
}
