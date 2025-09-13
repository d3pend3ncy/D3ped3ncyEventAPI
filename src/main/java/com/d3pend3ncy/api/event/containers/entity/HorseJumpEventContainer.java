package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.HorseJumpEventInterface;
import org.bukkit.event.entity.HorseJumpEvent;

public class HorseJumpEventContainer extends ContainerEvent<HorseJumpEventInterface, HorseJumpEvent> {

    public HorseJumpEventContainer(HorseJumpEvent event) {
        super(event);
    }

    @Override
    protected void call(HorseJumpEventInterface listener, HorseJumpEvent event) {
        listener.onHorseJumpEvent(event);
    }

    @Override
    public Class<HorseJumpEventInterface> getListenerType() {
        return HorseJumpEventInterface.class;
    }
}
