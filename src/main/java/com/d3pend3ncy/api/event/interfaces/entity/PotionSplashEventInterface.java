package com.d3pend3ncy.api.event.interfaces.entity;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.entity.PotionSplashEvent;

public interface PotionSplashEventInterface extends Listener {
    void onPotionSplashEvent(PotionSplashEvent event);
}
