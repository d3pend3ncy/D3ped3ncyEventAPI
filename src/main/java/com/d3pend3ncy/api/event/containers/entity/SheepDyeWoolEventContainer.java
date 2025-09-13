package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.SheepDyeWoolEventInterface;
import org.bukkit.event.entity.SheepDyeWoolEvent;

public class SheepDyeWoolEventContainer extends ContainerEvent<SheepDyeWoolEventInterface, SheepDyeWoolEvent> {

    public SheepDyeWoolEventContainer(SheepDyeWoolEvent event) {
        super(event);
    }

    @Override
    protected void call(SheepDyeWoolEventInterface listener, SheepDyeWoolEvent event) {
        listener.onSheepDyeWoolEvent(event);
    }

    @Override
    public Class<SheepDyeWoolEventInterface> getListenerType() {
        return SheepDyeWoolEventInterface.class;
    }
}
