package com.d3pend3ncy.api.event.containers.world;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.world.StructureGrowEventInterface;
import org.bukkit.event.world.StructureGrowEvent;

public class StructureGrowEventContainer extends ContainerEvent<StructureGrowEventInterface, StructureGrowEvent> {

    public StructureGrowEventContainer(StructureGrowEvent event) {
        super(event);
    }

    @Override
    protected void call(StructureGrowEventInterface listener, StructureGrowEvent event) {
        listener.onStructureGrowEvent(event);
    }

    @Override
    public Class<StructureGrowEventInterface> getListenerType() {
        return StructureGrowEventInterface.class;
    }
}
