package com.d3pend3ncy.api.event.containers.entity;

import com.d3pend3ncy.api.event.core.baseTypes.ContainerEvent;
import com.d3pend3ncy.api.event.interfaces.entity.AreaEffectCloudApplyEventInterface;
import org.bukkit.event.entity.AreaEffectCloudApplyEvent;

public class AreaEffectCloudApplyEventContainer extends ContainerEvent<AreaEffectCloudApplyEventInterface, AreaEffectCloudApplyEvent> {

    public AreaEffectCloudApplyEventContainer(AreaEffectCloudApplyEvent event) {
        super(event);
    }

    @Override
    protected void call(AreaEffectCloudApplyEventInterface listener, AreaEffectCloudApplyEvent event) {
        listener.onAreaEffectCloudApplyEvent(event);
    }

    @Override
    public Class<AreaEffectCloudApplyEventInterface> getListenerType() {
        return AreaEffectCloudApplyEventInterface.class;
    }
}
