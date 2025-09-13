package com.d3pend3ncy.api.event.containers.world;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.world.WorldInitEventInterface;
import org.bukkit.event.world.WorldInitEvent;

public class WorldInitEventContainer extends ContainerEvent<WorldInitEventInterface, WorldInitEvent> {

    public WorldInitEventContainer(WorldInitEvent event) {
        super(event);
    }

    @Override
    protected void call(WorldInitEventInterface listener, WorldInitEvent event) {
        listener.onWorldInitEvent(event);
    }

    @Override
    public Class<WorldInitEventInterface> getListenerType() {
        return WorldInitEventInterface.class;
    }
}
