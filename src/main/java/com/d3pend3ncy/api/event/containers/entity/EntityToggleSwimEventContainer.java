package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.EntityToggleSwimEventInterface;
import org.bukkit.event.entity.EntityToggleSwimEvent;

public class EntityToggleSwimEventContainer extends ContainerEvent<EntityToggleSwimEventInterface, EntityToggleSwimEvent> {

    public EntityToggleSwimEventContainer(EntityToggleSwimEvent event) {
        super(event);
    }

    @Override
    protected void call(EntityToggleSwimEventInterface listener, EntityToggleSwimEvent event) {
        listener.onEntityToggleSwimEvent(event);
    }

    @Override
    public Class<EntityToggleSwimEventInterface> getListenerType() {
        return EntityToggleSwimEventInterface.class;
    }
}
