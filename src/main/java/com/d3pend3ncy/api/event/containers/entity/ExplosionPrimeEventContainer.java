package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.ExplosionPrimeEventInterface;
import org.bukkit.event.entity.ExplosionPrimeEvent;

public class ExplosionPrimeEventContainer extends ContainerEvent<ExplosionPrimeEventInterface, ExplosionPrimeEvent> {

    public ExplosionPrimeEventContainer(ExplosionPrimeEvent event) {
        super(event);
    }

    @Override
    protected void call(ExplosionPrimeEventInterface listener, ExplosionPrimeEvent event) {
        listener.onExplosionPrimeEvent(event);
    }

    @Override
    public Class<ExplosionPrimeEventInterface> getListenerType() {
        return ExplosionPrimeEventInterface.class;
    }
}
