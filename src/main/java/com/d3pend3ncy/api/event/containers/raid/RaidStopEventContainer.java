package com.d3pend3ncy.api.event.containers.raid;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.raid.RaidStopEventInterface;
import org.bukkit.event.raid.RaidStopEvent;

public class RaidStopEventContainer extends ContainerEvent<RaidStopEventInterface, RaidStopEvent> {

    public RaidStopEventContainer(RaidStopEvent event) {
        super(event);
    }

    @Override
    protected void call(RaidStopEventInterface listener, RaidStopEvent event) {
        listener.onRaidStopEvent(event);
    }

    @Override
    public Class<RaidStopEventInterface> getListenerType() {
        return RaidStopEventInterface.class;
    }
}
