package com.d3pend3ncy.api.event.containers.block;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.block.EntityBlockFormEventInterface;
import org.bukkit.event.block.EntityBlockFormEvent;

public class EntityBlockFormEventContainer extends ContainerEvent<EntityBlockFormEventInterface, EntityBlockFormEvent> {

    public EntityBlockFormEventContainer(EntityBlockFormEvent event) {
        super(event);
    }

    @Override
    protected void call(EntityBlockFormEventInterface listener, EntityBlockFormEvent event) {
        listener.onEntityBlockFormEvent(event);
    }

    @Override
    public Class<EntityBlockFormEventInterface> getListenerType() {
        return EntityBlockFormEventInterface.class;
    }
}
