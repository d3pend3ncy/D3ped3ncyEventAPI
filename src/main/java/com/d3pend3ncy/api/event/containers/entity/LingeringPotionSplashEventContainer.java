package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.LingeringPotionSplashEventInterface;
import org.bukkit.event.entity.LingeringPotionSplashEvent;

public class LingeringPotionSplashEventContainer extends ContainerEvent<LingeringPotionSplashEventInterface, LingeringPotionSplashEvent> {

    public LingeringPotionSplashEventContainer(LingeringPotionSplashEvent event) {
        super(event);
    }

    @Override
    protected void call(LingeringPotionSplashEventInterface listener, LingeringPotionSplashEvent event) {
        listener.onLingeringPotionSplashEvent(event);
    }

    @Override
    public Class<LingeringPotionSplashEventInterface> getListenerType() {
        return LingeringPotionSplashEventInterface.class;
    }
}
