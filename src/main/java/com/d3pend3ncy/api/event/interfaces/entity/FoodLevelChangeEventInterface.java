package com.d3pend3ncy.api.event.interfaces.entity;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public interface FoodLevelChangeEventInterface extends Listener {
    void onFoodLevelChangeEvent(FoodLevelChangeEvent event);
}
