package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.SlimeSplitEventInterface;
import org.bukkit.event.entity.SlimeSplitEvent;

public class SlimeSplitEventContainer extends ContainerEvent<SlimeSplitEventInterface, SlimeSplitEvent> {

    public SlimeSplitEventContainer(SlimeSplitEvent event) {
        super(event);
    }

    @Override
    protected void call(SlimeSplitEventInterface listener, SlimeSplitEvent event) {
        listener.onSlimeSplitEvent(event);
    }

    @Override
    public Class<SlimeSplitEventInterface> getListenerType() {
        return SlimeSplitEventInterface.class;
    }
}
