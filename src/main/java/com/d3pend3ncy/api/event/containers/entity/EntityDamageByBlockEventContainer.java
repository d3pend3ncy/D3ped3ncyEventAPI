package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.EntityDamageByBlockEventInterface;
import org.bukkit.event.entity.EntityDamageByBlockEvent;

public class EntityDamageByBlockEventContainer extends ContainerEvent<EntityDamageByBlockEventInterface, EntityDamageByBlockEvent> {

    public EntityDamageByBlockEventContainer(EntityDamageByBlockEvent event) {
        super(event);
    }

    @Override
    protected void call(EntityDamageByBlockEventInterface listener, EntityDamageByBlockEvent event) {
        listener.onEntityDamageByBlockEvent(event);
    }

    @Override
    public Class<EntityDamageByBlockEventInterface> getListenerType() {
        return EntityDamageByBlockEventInterface.class;
    }
}
