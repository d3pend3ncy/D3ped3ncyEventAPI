package com.d3pend3ncy.api.event.containers.raid;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.raid.RaidTriggerEventInterface;
import org.bukkit.event.raid.RaidTriggerEvent;

public class RaidTriggerEventContainer extends ContainerEvent<RaidTriggerEventInterface, RaidTriggerEvent> {

    public RaidTriggerEventContainer(RaidTriggerEvent event) {
        super(event);
    }

    @Override
    protected void call(RaidTriggerEventInterface listener, RaidTriggerEvent event) {
        listener.onRaidTriggerEvent(event);
    }

    @Override
    public Class<RaidTriggerEventInterface> getListenerType() {
        return RaidTriggerEventInterface.class;
    }
}
