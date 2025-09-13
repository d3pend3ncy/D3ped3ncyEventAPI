package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.PigZombieAngerEventInterface;
import org.bukkit.event.entity.PigZombieAngerEvent;

public class PigZombieAngerEventContainer extends ContainerEvent<PigZombieAngerEventInterface, PigZombieAngerEvent> {

    public PigZombieAngerEventContainer(PigZombieAngerEvent event) {
        super(event);
    }

    @Override
    protected void call(PigZombieAngerEventInterface listener, PigZombieAngerEvent event) {
        listener.onPigZombieAngerEvent(event);
    }

    @Override
    public Class<PigZombieAngerEventInterface> getListenerType() {
        return PigZombieAngerEventInterface.class;
    }
}
