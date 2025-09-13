package com.d3pend3ncy.api.event.containers.raid;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.raid.RaidFinishEventInterface;
import org.bukkit.event.raid.RaidFinishEvent;

public class RaidFinishEventContainer extends ContainerEvent<RaidFinishEventInterface, RaidFinishEvent> {

    public RaidFinishEventContainer(RaidFinishEvent event) {
        super(event);
    }

    @Override
    protected void call(RaidFinishEventInterface listener, RaidFinishEvent event) {
        listener.onRaidFinishEvent(event);
    }

    @Override
    public Class<RaidFinishEventInterface> getListenerType() {
        return RaidFinishEventInterface.class;
    }
}
