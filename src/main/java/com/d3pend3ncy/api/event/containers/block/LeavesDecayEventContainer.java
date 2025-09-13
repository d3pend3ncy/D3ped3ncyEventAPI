package com.d3pend3ncy.api.event.containers.block;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.block.LeavesDecayEventInterface;
import org.bukkit.event.block.LeavesDecayEvent;

public class LeavesDecayEventContainer extends ContainerEvent<LeavesDecayEventInterface, LeavesDecayEvent> {

    public LeavesDecayEventContainer(LeavesDecayEvent event) {
        super(event);
    }

    @Override
    protected void call(LeavesDecayEventInterface listener, LeavesDecayEvent event) {
        listener.onLeavesDecayEvent(event);
    }

    @Override
    public Class<LeavesDecayEventInterface> getListenerType() {
        return LeavesDecayEventInterface.class;
    }
}
