package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.PotionSplashEventInterface;
import org.bukkit.event.entity.PotionSplashEvent;

public class PotionSplashEventContainer extends ContainerEvent<PotionSplashEventInterface, PotionSplashEvent> {

    public PotionSplashEventContainer(PotionSplashEvent event) {
        super(event);
    }

    @Override
    protected void call(PotionSplashEventInterface listener, PotionSplashEvent event) {
        listener.onPotionSplashEvent(event);
    }

    @Override
    public Class<PotionSplashEventInterface> getListenerType() {
        return PotionSplashEventInterface.class;
    }
}
