package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.CreatureSpawnEventInterface;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class CreatureSpawnEventContainer extends ContainerEvent<CreatureSpawnEventInterface, CreatureSpawnEvent> {

    public CreatureSpawnEventContainer(CreatureSpawnEvent event) {
        super(event);
    }

    @Override
    protected void call(CreatureSpawnEventInterface listener, CreatureSpawnEvent event) {
        listener.onCreatureSpawnEvent(event);
    }

    @Override
    public Class<CreatureSpawnEventInterface> getListenerType() {
        return CreatureSpawnEventInterface.class;
    }
}
