package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.FoodLevelChangeEventInterface;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public class FoodLevelChangeEventContainer extends ContainerEvent<FoodLevelChangeEventInterface, FoodLevelChangeEvent> {

    public FoodLevelChangeEventContainer(FoodLevelChangeEvent event) {
        super(event);
    }

    @Override
    protected void call(FoodLevelChangeEventInterface listener, FoodLevelChangeEvent event) {
        listener.onFoodLevelChangeEvent(event);
    }

    @Override
    public Class<FoodLevelChangeEventInterface> getListenerType() {
        return FoodLevelChangeEventInterface.class;
    }
}
