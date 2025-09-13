package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.EntityTeleportEventInterface;
import org.bukkit.event.entity.EntityTeleportEvent;

public class EntityTeleportEventContainer extends ContainerEvent<EntityTeleportEventInterface, EntityTeleportEvent> {

    public EntityTeleportEventContainer(EntityTeleportEvent event) {
        super(event);
    }

    @Override
    protected void call(EntityTeleportEventInterface listener, EntityTeleportEvent event) {
        listener.onEntityTeleportEvent(event);
    }

    @Override
    public Class<EntityTeleportEventInterface> getListenerType() {
        return EntityTeleportEventInterface.class;
    }
}
