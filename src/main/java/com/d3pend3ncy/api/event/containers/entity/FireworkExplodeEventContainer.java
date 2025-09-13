package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.FireworkExplodeEventInterface;
import org.bukkit.event.entity.FireworkExplodeEvent;

public class FireworkExplodeEventContainer extends ContainerEvent<FireworkExplodeEventInterface, FireworkExplodeEvent> {

    public FireworkExplodeEventContainer(FireworkExplodeEvent event) {
        super(event);
    }

    @Override
    protected void call(FireworkExplodeEventInterface listener, FireworkExplodeEvent event) {
        listener.onFireworkExplodeEvent(event);
    }

    @Override
    public Class<FireworkExplodeEventInterface> getListenerType() {
        return FireworkExplodeEventInterface.class;
    }
}
