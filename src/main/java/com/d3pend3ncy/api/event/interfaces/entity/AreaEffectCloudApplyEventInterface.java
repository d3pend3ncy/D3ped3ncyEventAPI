package com.d3pend3ncy.api.event.interfaces.entity;

import com.d3pend3ncy.api.event.core.types.Listener;
import org.bukkit.event.entity.AreaEffectCloudApplyEvent;

public interface AreaEffectCloudApplyEventInterface extends Listener {
    void onAreaEffectCloudApplyEvent(AreaEffectCloudApplyEvent event);
}
