package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.EntityShootBowEventInterface;
import org.bukkit.event.entity.EntityShootBowEvent;

public class EntityShootBowEventContainer extends ContainerEvent<EntityShootBowEventInterface, EntityShootBowEvent> {

    public EntityShootBowEventContainer(EntityShootBowEvent event) {
        super(event);
    }

    @Override
    protected void call(EntityShootBowEventInterface listener, EntityShootBowEvent event) {
        listener.onEntityShootBowEvent(event);
    }

    @Override
    public Class<EntityShootBowEventInterface> getListenerType() {
        return EntityShootBowEventInterface.class;
    }
}
