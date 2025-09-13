package com.d3pend3ncy.api.event.containers.block;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.block.CauldronLevelChangeInterface;
import org.bukkit.event.block.CauldronLevelChangeEvent;

public class CauldronLevelChangeContainer extends ContainerEvent<CauldronLevelChangeInterface, CauldronLevelChangeEvent> {

    public CauldronLevelChangeContainer(CauldronLevelChangeEvent event) {
        super(event);
    }

    @Override
    protected void call(CauldronLevelChangeInterface listener, CauldronLevelChangeEvent event) {
        listener.onCauldronLevelChange(event);
    }

    @Override
    public Class<CauldronLevelChangeInterface> getListenerType() {
        return CauldronLevelChangeInterface.class;
    }
}
