package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.EntityToggleGlideEventInterface;
import org.bukkit.event.entity.EntityToggleGlideEvent;

public class EntityToggleGlideEventContainer extends ContainerEvent<EntityToggleGlideEventInterface, EntityToggleGlideEvent> {

    public EntityToggleGlideEventContainer(EntityToggleGlideEvent event) {
        super(event);
    }

    @Override
    protected void call(EntityToggleGlideEventInterface listener, EntityToggleGlideEvent event) {
        listener.onEntityToggleGlideEvent(event);
    }

    @Override
    public Class<EntityToggleGlideEventInterface> getListenerType() {
        return EntityToggleGlideEventInterface.class;
    }
}
