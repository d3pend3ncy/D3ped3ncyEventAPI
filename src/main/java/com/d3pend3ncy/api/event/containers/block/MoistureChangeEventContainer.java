package com.d3pend3ncy.api.event.containers.block;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.block.MoistureChangeEventInterface;
import org.bukkit.event.block.MoistureChangeEvent;

public class MoistureChangeEventContainer extends ContainerEvent<MoistureChangeEventInterface, MoistureChangeEvent> {

    public MoistureChangeEventContainer(MoistureChangeEvent event) {
        super(event);
    }

    @Override
    protected void call(MoistureChangeEventInterface listener, MoistureChangeEvent event) {
        listener.onMoistureChangeEvent(event);
    }

    @Override
    public Class<MoistureChangeEventInterface> getListenerType() {
        return MoistureChangeEventInterface.class;
    }
}
