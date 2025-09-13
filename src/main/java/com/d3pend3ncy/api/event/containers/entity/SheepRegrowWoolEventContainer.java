package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.SheepRegrowWoolEventInterface;
import org.bukkit.event.entity.SheepRegrowWoolEvent;

public class SheepRegrowWoolEventContainer extends ContainerEvent<SheepRegrowWoolEventInterface, SheepRegrowWoolEvent> {

    public SheepRegrowWoolEventContainer(SheepRegrowWoolEvent event) {
        super(event);
    }

    @Override
    protected void call(SheepRegrowWoolEventInterface listener, SheepRegrowWoolEvent event) {
        listener.onSheepRegrowWoolEvent(event);
    }

    @Override
    public Class<SheepRegrowWoolEventInterface> getListenerType() {
        return SheepRegrowWoolEventInterface.class;
    }
}
