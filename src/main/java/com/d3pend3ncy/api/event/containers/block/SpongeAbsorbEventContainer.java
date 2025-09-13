package com.d3pend3ncy.api.event.containers.block;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.block.SpongeAbsorbEventInterface;
import org.bukkit.event.block.SpongeAbsorbEvent;

public class SpongeAbsorbEventContainer extends ContainerEvent<SpongeAbsorbEventInterface, SpongeAbsorbEvent> {

    public SpongeAbsorbEventContainer(SpongeAbsorbEvent event) {
        super(event);
    }

    @Override
    protected void call(SpongeAbsorbEventInterface listener, SpongeAbsorbEvent event) {
        listener.onSpongeAbsorbEvent(event);
    }

    @Override
    public Class<SpongeAbsorbEventInterface> getListenerType() {
        return SpongeAbsorbEventInterface.class;
    }
}
